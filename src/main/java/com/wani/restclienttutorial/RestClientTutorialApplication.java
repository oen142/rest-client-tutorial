package com.wani.restclienttutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestClientTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestClientTutorialApplication.class, args);
    }

}
