package advancedprogramming.latihan.controller;

import advancedprogramming.latihan.model.Staff;
import advancedprogramming.latihan.service.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {

    @Autowired
    private Register registration;

    @GetMapping(value = "/")
    public String home (Model model){
        model.addAttribute("lst",registration.displayStaff());
        return "home";
    }

    @GetMapping(value = "/add")
    public String addForm(Model model){
        model.addAttribute("staff", new Staff());
        return "formadd";
    }

    @PostMapping(value = "/add-person")
    public String addPerson(@ModelAttribute("staff") Staff staff){
            registration.Regis(staff);
            return "home";
    }


}
