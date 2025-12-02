package br.com.fiap.coletas_residuo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColetaApplication {

	public static void main(String[] args) {
		System.out.println("Iniciando a aplicação...");
		SpringApplication.run(ColetaApplication.class, args);
	}

}
