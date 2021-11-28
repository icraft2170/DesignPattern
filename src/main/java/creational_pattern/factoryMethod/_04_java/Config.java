package creational_pattern.factoryMethod._04_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public String hello(){
        return "hello~ hyeon ho!";
    }
}
