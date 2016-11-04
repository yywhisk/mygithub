package com.whisk.loadfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoadFileTestApplication {

//    @Bean
//    public MultipartConfigElement multipartConfigElement() {
//        MultipartConfigFactory factory = new MultipartConfigFactory();
//        factory.setMaxFileSize("1024KB");
//        factory.setMaxRequestSize("1024KB");
//        return factory.createMultipartConfig();
//    }
    public static void main(String[] args) {
        SpringApplication.run(LoadFileTestApplication.class, args);
    }
}

