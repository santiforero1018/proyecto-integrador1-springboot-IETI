package edu.eci.IETI.integrator.controller.health;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @RequestMapping("/health")
    public String checkAPI(){
        return "<h1> API is working Ok!<h1>";
    }

}
