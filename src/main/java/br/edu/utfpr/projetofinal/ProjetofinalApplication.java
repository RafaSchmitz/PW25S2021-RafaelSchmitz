package br.edu.utfpr.projetofinal;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class ProjetofinalApplication {


	public static void main(String[] args) {
		SpringApplication.run(ProjetofinalApplication.class, args);

	}

	@Bean
	public LayoutDialect layoutDialect() {
		return new LayoutDialect();
	}


}
