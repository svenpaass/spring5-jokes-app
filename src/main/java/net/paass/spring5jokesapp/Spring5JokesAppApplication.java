package net.paass.spring5jokesapp;

import net.paass.spring5jokesapp.controllers.JokesController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "net.paass.spring5jokesapp", "guru.springframework"})
public class Spring5JokesAppApplication {

  public static void main(String[] args) {
    SpringApplication.run(Spring5JokesAppApplication.class, args);
  }

}
