package br.com.fiap.coletas_residuo.repository;
import br.com.fiap.coletas_residuo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository <User, Long>{

    UserDetails findByEmail(String email);

}
