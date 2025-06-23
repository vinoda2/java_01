package configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan()
public class RegistrationConfiguration {


    public RegistrationConfiguration(){
        System.out.println("RegistrationConfiguration created");
    }
}
