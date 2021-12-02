package pl.camp.it.rent.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.camp.it.rent.database.TaleDatabase;

@Controller
public class CommonController {

    @Autowired
    TaleDatabase taleDatabase;

    @RequestMapping(value = "/",method =RequestMethod.GET)
    public String main(){
        return "redirect:/main";
    }

    @RequestMapping(value="/main",method = RequestMethod.GET)
    public String main(Model model){
        model.addAttribute("tales",this.taleDatabase.getTales());
        return"main";
    }
    @RequestMapping(value = "/contact",method =RequestMethod.GET)
    public String contact(){
        return"contact";
    }
}
