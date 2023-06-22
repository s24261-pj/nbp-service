package com.example.demo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Currency rates REST API",
				description = "Application for currency rates",
				version = "1.0.0",
				contact = @Contact(name = "Mateusz Kopczyński", email = "s24261@pjwstk.edu.pl"),
				license = @License(name = "MIT License")
		)
)
public class NbpApplication {

	public static void main(String[] args) {
		SpringApplication.run(NbpApplication.class, args);
	}

}
