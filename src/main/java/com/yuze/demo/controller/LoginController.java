package com.yuze.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author:yuze
 * @description:登录
 * @data:2021/9/1
 */
@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    private HttpSession httpSession;

    @RequestMapping
    public String toLogin(){
        return "login";
    }

    @RequestMapping("toLogin")
    public String Login(String username,String password){
        if("admin".equals(username) && "111".equals(password)){
            httpSession.setAttribute("user","admin");
            return "demo";
        }
        return "login";
    }

    @RequestMapping("logout")
    public String logout(){
        httpSession.removeAttribute("user");
        return "login";
    }
}
