package com.example.controle;

import com.example.controle.dao.entities.Computer;
import com.example.controle.dao.repo.ComputerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ControleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ComputerRepo computerRepo){
        return args -> {
            List<Computer> computers = Arrays.asList(
            );
            ComputerRepo.saveAll(computers);
        };
    }

}
