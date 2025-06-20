package services;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class Fetch{

/*
    This above method will execute  when any method of this class will triggered
*/
    @ModelAttribute
    public String validate(){
        System.out.println("Validator of Fetch");
        return "success";
    }

}
