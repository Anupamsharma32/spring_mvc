package springmvc.controller;

import model.springmvc.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ComponentScan("springmvc.controller")
@RequestMapping("/enter")
public class HomeController {
    @RequestMapping("/home")
   public String name(Model model){
        model.addAttribute("name","Anupam Sharma");
        System.out.println("this is home url");
       return "index";
   }
   @RequestMapping("/help")
   public ModelAndView help(){
        //creating modelandview obj
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("name","rohit");
        modelAndView.setViewName("help");

        return modelAndView;

   }
//   @RequestParam

//   @RequestMapping(path = "/processForm",method = RequestMethod.POST)
//    public String handleForm(@RequestParam("email")String userEmail, @RequestParam("username") String username,Model model){
//       User user=new User();
//       user.setUser_email(userEmail);
//       user.setUser_name(username);
//       model.addAttribute("user",user);
//       System.out.println("every thing that we are getting");
//       return "";
//   }

    @RequestMapping(path = "/processForm",method = RequestMethod.POST)
    public String handleForm(@ModelAttribute User user,Model model){
//       User user=new User();
//       user.setUser_email(userEmail);
//       user.setUser_name(username);
       model.addAttribute("user",user);
       System.out.println("every thing that we are getting");
       return "";
   }

    //@ModelAttribute

}
