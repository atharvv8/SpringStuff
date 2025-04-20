package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.Configuration;

@Configuration
public class appConfig {


    @Bean
    public Alien alien(@Autowired Computer com){
        Alien obj = new Alien();
        obj.setAge(22);
        obj.setCom(com);
        return obj;
    }
//    @Bean(name = {"com2","d","desktop1"})
    @Bean(name = "desktop1")
//    @Scope(value = "prototype")
    public Desktop desktop()
    {
        return new Desktop();
    }

    @Bean
    @Primary
    public Laptop lap()
    {
        return new Laptop();
    }
}
