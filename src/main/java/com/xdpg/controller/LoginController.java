package com.xdpg.controller;

import com.xdpg.pojo.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;


@Controller
public class LoginController {
    @RequestMapping("/login")
    public String Login(@RequestParam("userName") String userName, @RequestParam("passWord") String passWord, Model model, HttpSession session){

        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userName, passWord);
        try {
            subject.login(token);
            session.setAttribute("loginUser",userName);
            return "redirect:/main.html";
        }catch ( UnknownAccountException e){
            model.addAttribute("msg","用户名错误");
            return "login";
        }catch (IncorrectCredentialsException e)
        {
            model.addAttribute("msg","密码错误");
            return "login";
        }

        /*if(!StringUtils.isEmpty(userName) && "1".equals(passWord))
        {
            session.setAttribute("loginUser",userName);
            return "redirect:/main.html";//登录后重定向到index，避免url显示登录信息
        }else {
            model.addAttribute("msg","用户名或密码错误!");
            return "login";
        }*/
    }

    @RequestMapping("/logout")
    public String logout(){
        Subject subject = SecurityUtils.getSubject();
        Object principal = subject.getPrincipal();
        if (principal != null){
            subject.logout();
        }
        return "login";
    }
}
