package springmvc.controller;


import ch.qos.logback.core.joran.spi.HttpUtil;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FileUploadController {
    @RequestMapping("/fileForm")
    public String showUploadForm(){
        return "fileForm";
    }
    @RequestMapping(path="/uploadimage", method = RequestMethod.POST)
    public String fileupload(@RequestParam("file") CommonsMultipartResolver commonsMultipartResolver){
        System.out.println("file upload handler");
        return "filesucess";
    }

// handling exception in our spring mvc
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({NullPointerException.class, NumberFormatException.class})
    public String exceptionHandler(){
        return  "view_name";
    }
}
