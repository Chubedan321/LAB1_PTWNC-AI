package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    private void addSharedAttributes(Model model) {
        model.addAttribute("appName", "Product Portal");
        model.addAttribute("subject", "SOF3022 - Spring Boot MVC");
        model.addAttribute("semester", "Summer 2026");
        model.addAttribute("message", "Chào mừng bạn đến với hệ thống quản lý sản phẩm");
    }

    @GetMapping("/about123")
    public String about123(Model model) {
        addSharedAttributes(model);
        return "home/about";
    }

    @GetMapping("/help")
    public String help(Model model) {
        addSharedAttributes(model);
        return "home/help";
    }

    @GetMapping("/index")
    public String index(Model model) {
        addSharedAttributes(model);
        return "home/index";
    }

}