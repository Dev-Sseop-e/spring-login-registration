package com.example.springpractice.controller;

import com.example.springpractice.dto.MemberDto;
import com.example.springpractice.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class MemberController {

    // Main page
    @GetMapping("/")
    public String index() {
        return "/index";
    }

    // Signup page
    @GetMapping("/user/signup")
    public String dispSignup() {
        return "/signup";
    }

    // Signup processing
    @PostMapping("/user/signup")
    public String execSignup(MemberDto memberDto) {
        memberService.joinUser(memberDto);
        return "redirect:/user/login";
    }

    // Login page
    @GetMapping("/user/login")
    public String dispLogin() {
        return "/login";
    }

    // Login result page
    @GetMapping("/user/login/result")
    public String dispLoginResult() {
        return "/loginSuccess";
    }

    // Logout result page
    @GetMapping("/user/logout/result")
    public String dispLogout() {
        return "/logout";
    }

    // Access denied page
    @GetMapping("/user/denied")
    public String dispDenied() {
        return "/denied";
    }

    // My info page
    @GetMapping("/user/info")
    public String dispMyInfo() {
        return "/myinfo";
    }

    // Admin page
    @GetMapping("/admin")
    public String dispAdmin() {
        return "/admin";
    }

}
