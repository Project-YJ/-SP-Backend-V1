package com.example.spbackendv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class SpBackendV1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpBackendV1Application.class, args);
    }

}
