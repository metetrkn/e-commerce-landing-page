package se.systementor.supershoppen1.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import se.systementor.supershoppen1.shop.model.UserAccount;

@Controller
public class LoginController {
    @RequestMapping("/login")
        public String showLogin() {
            return "login";
        }
}