package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import repository.dentist.DentistRe;

@Controller
@RequestMapping("/bt3form")
public class DentistController {
    @Autowired
    private DentistRe dentistRe;
    public String form(Model model) {
        model.addAttribute("dentist", dentistRe.findAll());
        return "bt3form";
    }


}
