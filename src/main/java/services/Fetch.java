package services;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @RequestMapping("{userId}/doLogin")
    public String doAuth(){
        System.out.println("doAuth");
        return "success";
    }
    @RequestMapping("/logout")
    public String  doLogout(){
        System.out.println("doLogout");
        return "success";

    }
}
