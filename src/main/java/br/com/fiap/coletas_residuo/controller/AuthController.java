package br.com.fiap.coletas_residuo.controller;

import br.com.fiap.coletas_residuo.config.security.TokenService;
import br.com.fiap.coletas_residuo.dto.TokenDTO;
import br.com.fiap.coletas_residuo.dto.UserDTO;
import br.com.fiap.coletas_residuo.model.User;
import br.com.fiap.coletas_residuo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController  {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody UserDTO userDTO){

        UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(userDTO.email(), userDTO.password());

        Authentication authentication = authenticationManager.authenticate(auth);

        String token = tokenService.generateToken((User) authentication.getPrincipal());

        return ResponseEntity.ok().body(new TokenDTO(token));


    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody User user){
        String cryptoPass = new BCryptPasswordEncoder().encode(user.getPassword());
        user.setPassword(cryptoPass);
        User newUser = userRepository.save(user);
        return ResponseEntity.created(null).body(newUser);
    }

}
