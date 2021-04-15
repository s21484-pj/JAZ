package pl.pjatk.maclec.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FirstComponent {

    public FirstComponent(@Value("${my.custom.property}") String stringFromProperties,
                          @Value("${my.custom.random:default_value}") String stringFromRandom,
                          @Value("${my.custom.homework:default_value}") String homework) {
        System.out.println("Hello from FirstComponent");
        System.out.println(stringFromProperties);
        System.out.println(stringFromRandom);
        System.out.println(homework);
        System.out.println("---------");
    }
}
