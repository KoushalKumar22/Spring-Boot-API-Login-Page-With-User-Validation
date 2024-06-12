package com.SpringAPI.Login_page.Controller;
import com.SpringAPI.Login_page.Service.LoginPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginPageController {

    @Autowired
    LoginPageService lservice;

    @GetMapping("/login")
    public String showLoginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model){
        boolean isValidUser=lservice.validateUser(username, password);
        if (isValidUser) {
            model.addAttribute("message", "Login successful!");
            return "welcome";
        }else {
            model.addAttribute("message","Invalid Username Or Password");
            return "login";
        }
    }
/*for testing
    @GetMapping("/welcome")
    public String showWelcomePage(){
        return "welcome";
    }*/
}