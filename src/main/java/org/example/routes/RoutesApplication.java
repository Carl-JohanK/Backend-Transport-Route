package org.example.routes;

import org.example.routes.model.Route;
import org.example.routes.repository.RouteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RoutesApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoutesApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(RouteRepository repository) {
        return args -> {
            repository.save(new Route("olskroken", "nordstan", 11));
            repository.save(new Route("olskroken", "nordstan", 13));

            repository.save(new Route("olskroken", "olskroken bus", 2));
            repository.save(new Route("olskroken bus", "nordstan bus", 14));
            repository.save(new Route("nordstan bus", "nordstan", 3));

            repository.save(new Route("olskroken", "olskroken bus", 3));
            repository.save(new Route("olskroken bus", "nordstan bus", 10));
            repository.save(new Route("nordstan bus", "nordstan", 1));
            //olskroken -> mölndal
            repository.save(new Route("olskroken", "molndal", 11));

            repository.save(new Route("olskroken", "olskroken bus", 4));
            repository.save(new Route("olskroken bus", "molndal bus", 36));
            repository.save(new Route("molndal bus", "molndal", 1));

            repository.save(new Route("olskroken", "olskroken bus", 2));
            repository.save(new Route("olskroken bus", "molndal bus", 40));
            repository.save(new Route("molndal bus", "molndal", 3));
            //olskroken -> falkgatan
            repository.save(new Route("olskroken", "Falkgatan", 1));

            repository.save(new Route("olskroken", "Falkgatan", 5));
        };
    }

}
