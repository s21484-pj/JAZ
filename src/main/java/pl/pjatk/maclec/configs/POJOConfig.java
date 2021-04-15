package pl.pjatk.maclec.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import pl.pjatk.maclec.POJO;

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

    @Bean
    @Profile({"homeWork"})
    public POJO anotherPojo() {
        return new POJO(2, "Hello from homework bean !");
    }
}
