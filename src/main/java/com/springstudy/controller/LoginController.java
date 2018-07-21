package com.springstudy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    
    @RequestMapping("/login")
    public String login(HttpServletRequest request,HttpServletResponse response,  ModelMap model){
    	String b=(String) model.get("userName");
    	
    	System.out.println(b);
    	String userName= request.getParameter("userName");
        if ("admol".equals(userName)) {
            System.out.println(userName +" 登录成功");
            return "sucess";//逻辑视图名       跳转页面默认为转发

        }
        return "fail";
    }    
}
