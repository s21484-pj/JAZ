package pl.pjatk.maclec.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.pjatk.maclec.SimpleClass;

@Configuration
public class ComponentConfig {

    @Bean
    public SimpleClass simpleClass() {
        return new SimpleClass("Hello from bean SimpleClass");
    }

    @Bean
    public SimpleClass secondSimpleClass() {
        return new SimpleClass("Hello from bean SecondSimpleClass");
    }
}
