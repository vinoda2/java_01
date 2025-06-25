package configuration;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@Controller
public class Pocket_Fm{

    public Pocket_Fm(){
        System.out.println("controller");
    }

    @PostMapping("/map")
    public String accept(){
        return "success.jsp";
    }
}
