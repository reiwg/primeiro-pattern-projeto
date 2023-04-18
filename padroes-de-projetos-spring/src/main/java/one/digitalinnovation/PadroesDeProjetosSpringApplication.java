package one.digitalinnovation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//  * Projeto Spring Boot gerado via Spring Initializr.
//  * Os seguintes módulos foram selecionados:
//  * - Spring Data JPA
//  * - Spring Web
//  * - H2 Database
//  * - OpenFeign

@SpringBootApplication 
@EnableFeignClients // habilita o client do feing
public class PadroesDeProjetosSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(PadroesDeProjetosSpringApplication.class, args);
	}

}
