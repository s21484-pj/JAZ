package pl.pjatk.maclec.components;

import org.springframework.stereotype.Component;
import pl.pjatk.maclec.model.POJO;
import pl.pjatk.maclec.model.SimpleClass;

import java.util.List;

@Component
public class ThirdComponent {

    public ThirdComponent(FirstComponent firstComponent,
                          SecondComponent secondComponent,
                          SimpleClass simpleClass,
                          SimpleClass secondSimpleClass,
                          POJO pojo,
                          List<String> defaultData,
                          POJO anotherPojo) {
        secondComponent.helloFromMethod();
        System.out.println("---------");
        System.out.println("Hello from ThirdComponent");
        System.out.println(simpleClass.getName());
        System.out.println(secondSimpleClass.getName());
        pojo.printOutMe();
        System.out.println(defaultData);
        //System.out.println(anotherPojo.getAnyString());
    }
}
