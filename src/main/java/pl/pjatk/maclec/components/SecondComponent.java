package pl.pjatk.maclec.components;

import org.springframework.stereotype.Component;
import pl.pjatk.maclec.components.FirstComponent;

@Component
public class SecondComponent {

    public SecondComponent(FirstComponent firstComponent) {
        System.out.println("Hello from SecondComponent");
    }

    public void helloFromMethod() {
        System.out.println("Hello from method");
    }
}
