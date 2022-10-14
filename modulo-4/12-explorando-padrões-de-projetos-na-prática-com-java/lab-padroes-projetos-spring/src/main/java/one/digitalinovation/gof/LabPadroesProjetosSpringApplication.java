package one.digitalinovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Projeto Spring Boot gerado via Spring Initializer.
 * Os seguntes módulos foram selecionados:
 *  - Spring Data JPA
 *  - Spring Web
 *  - H2 Database
 *  - OpenFeing**
 *
 * @author Mr.Kuro
 **/

@EnableFeignClients
@SpringBootApplication
@ComponentScan(basePackages = "com.netsurfingzone.*")
@EntityScan("com.netsurfingzone.*")
@EnableJpaRepositories(basePackages = "com.netsurfingzone.repository")
public class LabPadroesProjetosSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetosSpringApplication.class, args);
	}

}
