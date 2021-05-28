package com.example.springdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringdockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringdockerApplication.class, args);
    }

    @RestController
    class GreetingController{

        @RequestMapping("/")
        public String greeting(){
            return "Välkommen till Axels springboot-sida för ALM-kursen";
        }
    }


}
