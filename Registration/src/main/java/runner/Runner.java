package runner;

import configurations.RegistrationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
public class Runner {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(RegistrationConfiguration.class);

        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
    }
}
