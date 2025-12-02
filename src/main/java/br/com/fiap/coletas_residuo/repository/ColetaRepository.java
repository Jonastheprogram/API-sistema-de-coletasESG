package br.com.fiap.coletas_residuo.repository;



import br.com.fiap.coletas_residuo.model.Coleta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColetaRepository extends JpaRepository<Coleta, Long> {
}
