package com.wani.restclienttutorial;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import org.springframework.web.client.RestTemplate;

@Component
public class RestRunner implements ApplicationRunner {


    private final RestTemplateBuilder restTemplateBuilder;

    public RestRunner(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        callRestApis();
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }

    private void callRestApis() {

        RestTemplate restTemplate = restTemplateBuilder.build();
        //Todo /hello

        String HelloResult = restTemplate.getForObject("http://localhost:8080/hello", String.class);
        System.out.println(HelloResult);

        String worldResult = restTemplate.getForObject("http://localhost:8080/world", String.class);
        System.out.println(worldResult);


        // Todo /world
    }
}
