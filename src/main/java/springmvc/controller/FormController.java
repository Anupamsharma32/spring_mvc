package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    @RequestMapping("/complex")
    public String showForm(){
        return "complexform";
    }
    @RequestMapping(path = "/handleform",method = RequestMethod.POST)
    public String formHandler(ModelAttribute("student") Student student){

        return "yes";
    }

}
