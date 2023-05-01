package com.jenkins.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.ResponseEntity.ok;

@SpringBootApplication
@RestController
@RequestMapping(path = "/api/jenkins")
public class JenkinsCicdApplication {

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<?> sayHello() {
        return ok("Welcome to Jenkins CI/CD");
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinsCicdApplication.class, args);
    }

}
