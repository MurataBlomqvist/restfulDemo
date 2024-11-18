package com.example.demo.v2_restService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    
    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "Burglar")));
            log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "Thief")));
            log.info("Preloading " + repository.save(new Employee("Gandalf Baggins", "Wizard")));
            log.info("Preloading " + repository.save(new Employee("Legolas baggins", "Archer")));
        };
    }
    

}
