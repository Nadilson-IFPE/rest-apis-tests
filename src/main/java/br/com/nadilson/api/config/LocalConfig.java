package br.com.nadilson.api.config;

import br.com.nadilson.api.domain.User;
import br.com.nadilson.api.repositories.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

   // @Bean
    // Annotation retornando erro: org.springframework.beans.factory.parsing.BeanDefinitionParsingException: Configuration problem: @Bean method 'startDB' must not be declared as void; change the method's return type or its annotation.
    // Deve-se usar agora:
    @PostConstruct
    public void startDB() {
        User user1 = new User(null, "Nadilson", "email@email.com", "123");
        User user2 = new User(null, "Ana Cristina", "ana@anamail.com", "123");

        repository.saveAll(List.of(user1, user2));
    }
}
