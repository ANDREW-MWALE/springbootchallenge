package com.example.Employee.employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class EmployeeConfig {
    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository repository){
return args -> {
    Employee Andrew = new Employee(
            1L,
            "Andrew",
            "mwaleandrew99@gmail.com",
            "0970956164",
            "Admin",
            LocalDate.of(20,Month.SEPTEMBER,2022)
    );
    Employee Paulo = new Employee(
            1L,
            "Paulos",
            "paulos@gmail.com",
            "0988822344",
            "data Analist",
            LocalDate.of(20, Month.APRIL, 2024)
    );
    repository.saveAll(
            List.of(Andrew, Paulo)
    );
};

    }
}
