package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Welcome my friend to my Spring Boot Web API! I am happy to see you here, my name is Bia and I am studying Java";
    }
}
