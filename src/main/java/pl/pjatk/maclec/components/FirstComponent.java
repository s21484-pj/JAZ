package pl.pjatk.maclec.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FirstComponent {

    public FirstComponent(@Value("${my.custom.property}") String stringFromProperties,
                          @Value("${my.custom.random:default_value}") String stringFromRandom) {
        System.out.println("Hello from FirstComponent");
        System.out.println(stringFromProperties);
        System.out.println(stringFromRandom);
        System.out.println("---------");
    }
}
