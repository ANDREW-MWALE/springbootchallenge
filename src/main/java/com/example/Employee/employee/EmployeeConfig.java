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
            "Andrew",
            "mwaleandrew99@gmail.com",
            "0970956164",
            "Admin",
            LocalDate.of(2022,Month.SEPTEMBER,22)
    );
    Employee Paulo = new Employee(
            "Paulos",
            "paulos@gmail.com",
            "0988822344",
            "data Analist",
            LocalDate.of(2012, Month.APRIL, 20)
    );
    repository.saveAll(
            List.of(Andrew, Paulo)
    );
};
    }
}
