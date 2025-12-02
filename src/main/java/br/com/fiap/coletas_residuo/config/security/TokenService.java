package br.com.fiap.coletas_residuo.config.security;

import br.com.fiap.coletas_residuo.dto.UserDTO;
import br.com.fiap.coletas_residuo.model.User;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class TokenService {

    public String generateToken(User user) {

        Algorithm algorithm = Algorithm.HMAC256("fiap");

        String token = JWT.create()
                .withIssuer("coletas")
                .withSubject(user.getEmail())
                .withExpiresAt(expirationTime())
                .sign(algorithm);

        return token;
    }

    public String validateToken(String token) {
        Algorithm algorithm = Algorithm.HMAC256("fiap");

        try{
            return JWT.require(algorithm)
                    .withIssuer("coletas")
                    .build()
                    .verify(token)
                    .getSubject();
        } catch (JWTVerificationException e) {
            return "";
        }
    }

    public Instant expirationTime(){
        return LocalDateTime.now().plusMinutes(15).toInstant(ZoneOffset.of("-03:00"));
    }

}
