package br.com.nadilson.api;

import br.com.nadilson.api.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);

		User user = new User(1, "Nadilson", "email@email.com", "123");
	}

}
