package controller;

import model.Property;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bt1form")
public class HomeController {
    @RequestMapping
    public String home(Model model) {
        model.addAttribute("property", new Property("Vietnamese", "5", "active", "mai xuan sang"));
        return "bt1form";
    }

    @RequestMapping("/bt1update")
    public String formupdate(@ModelAttribute("property") Property property, Model model) {
        model.addAttribute("showproperty", property);
        return "bt1update";
    }

    @RequestMapping("/doUPDATE")
    public String formupdate1(@ModelAttribute("property") Property property, Model model) {
        model.addAttribute("property", property);
        return "bt1form";
    }


//    @PostMapping("/doADD")
//    public String handleAdd(@ModelAttribute("person") Person person, Model model) {
//        model.addAttribute("obj", person);
//        return "person";
//
//    }

    ;
}
