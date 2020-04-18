package co.edu.udea.microserviciosudearegistration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HomeController {
    @GetMapping(value="/hola")
    public  String holaMundo() {
        return ("Hola mundo desde Spring Boot");
    }
}
