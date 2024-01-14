package org.example.guigu.config;

import org.example.guigu.bean.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public Pet pet01() {
        return new Pet("piggy", 2);
    }
}
