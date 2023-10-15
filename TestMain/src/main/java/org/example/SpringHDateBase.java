package org.example;

import java.util.List;
import org.example.repository.TutorialRepository;
import org.example.model.Tutorial;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SpringHDateBase implements CommandLineRunner {

    @Autowired
    TutorialRepository tutorialRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringHDateBase.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Брух");
    }

    private void show(List<Tutorial> tutorials) {
        tutorials.forEach(System.out::println);
    }
}