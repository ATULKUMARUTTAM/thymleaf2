package com.atuluttam.thymleaf2.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class homeController {
    @GetMapping("/")
    public String homemethod(Model model)
    {
        model.addAttribute("msg", "Welcome!!!!");
        return "home";
    }
}
