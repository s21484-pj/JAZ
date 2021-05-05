package pl.pjatk.maclec.configs;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.pjatk.maclec.model.POJO;

import java.util.List;

@Configuration
public class POJOConfig {

    @Bean
    public POJO pojo() {
        return new POJO(1, "Hello from bean POJO");
    }

    @Bean
    public List<String> defaultData() {
        return List.of("firstString", "secondString", "thirdString", "fourthString", "fifthString");
    }

//    @Bean
//    @ConditionalOnProperty(name = "my.custom.homework", havingValue = "true")
//    public POJO anotherPojo() {
//        return new POJO(2, "Hello from homework bean !");
//    }

    @Bean
    @ConditionalOnProperty(name = "my.custom.homework", havingValue = "true")
    public void homework() {
        System.out.println("Hello from homework bean ! Active profile is homeWork");
    }
}
