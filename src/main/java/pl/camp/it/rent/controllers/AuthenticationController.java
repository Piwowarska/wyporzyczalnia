package pl.camp.it.rent.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthenticationController {
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String loginForm(){
        return "login";
    }
    @RequestMapping(value="login",method=RequestMethod.POST)
    public String login(@RequestParam String login,@RequestParam String password){
        return"main";

    }
}
