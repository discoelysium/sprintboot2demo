package org.example.guigu;

import org.example.guigu.bean.Pet;
import org.example.guigu.config.MyConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class MySpringBootApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MySpringBootApplication.class, args);

//        for (String beanDefinitionName : run.getBeanDefinitionNames()) {
//            System.out.println(beanDefinitionName);
//        }

        MyConfiguration beanConifg = context.getBean(MyConfiguration.class);
        Pet pet01 = beanConifg.pet01();
        Pet pet02 = context.getBean(Pet.class);

        System.out.println(pet01 == pet02);
    }
}