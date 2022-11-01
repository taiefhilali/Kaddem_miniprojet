package tn.esprit.spring.tp1jpaentity3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = {"tn.esprit.spring.tp1jpaentity3.entity"})
@ComponentScan(basePackages = {"tn.esprit.spring.tp1jpaentity3.controllers","tn.esprit.spring.tp1jpaentity3.services"})
@EnableJpaRepositories(basePackages = {"tn.esprit.spring.tp1jpaentity3.repositories"})
@Slf4j
public class Tp1jpaentity3Application {

    public static void main(String[] args) {
        SpringApplication.run(Tp1jpaentity3Application.class, args);
        log.info("hello nnormalement t5dm");

    }
}
