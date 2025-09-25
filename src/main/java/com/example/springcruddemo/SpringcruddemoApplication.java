package com.example.springcruddemo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringcruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcruddemoApplication.class, args);
    }


    // Optional: insert sample data at startup
    @Bean
    CommandLineRunner initData(BookRepository repo) {
        return args -> {
            repo.save(new Book("Clean Code", "Robert C. Martin"));
            repo.save(new Book("Effective Java", "Joshua Bloch"));
        };
    }
}

