package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
    //using RedirectPrefix
//    @RequestMapping("/one")
//    public String one(){
//        System.out.println("this is one handler");
//        return "redirect:/two";
//    }
//    @RequestMapping("/two")
//    public String two(){
//        System.out.println("this is two handler");
//        return "";
//    }

    //Using RedirectView
    @RequestMapping("/one")
    public RedirectView one(){
        RedirectView redirectView=new RedirectView();
        redirectView.setUrl("two");
        System.out.println("we are inside method one");
        return redirectView;
    }
    @RequestMapping("/two")
    public String two(){
        System.out.println("we are inside method two");
        return "";
    }

}
