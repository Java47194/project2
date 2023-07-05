package project.project.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import project.project.login.Login;
import project.project.service.LoginService;
import project.project.service.LoginServiceImpl;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;

    @GetMapping("login")
    public String loginPage() {
        return "login";
    }


    @PostMapping("login-form")

    public void login(Login login) {

        System.out.println("login.toString() = " + login.toString());
        loginService.find(login);



    }
}