package com.notebook.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.notebook.entity.user;
import com.notebook.service.UserService;

@Controller
public class LoginController {
	private static final Logger LOGGER = Logger.getLogger(LoginController.class);
	
	 @Autowired
	 private UserService userservice;
    
    @RequestMapping("/login")
    @ResponseBody
    public String login(HttpServletRequest request,HttpServletResponse response,  ModelMap model){
    	
    	String userName= request.getParameter("userName");
    	System.out.println(userName);
    	LOGGER.info("test"+userName);
    	user user =new user();
    	user.setAge(21);
    	user.setName("zhangqi");
    	Map<String,String> map = new HashMap<String ,String>();
        if ("admol".equals(userName)) {
        	
        	
        long info =	userservice.savaUser();
        String a = String.valueOf(info);
        map.put("info",a);

        }else{
        	map.put("info", "0");
        }
        
        
        JSONObject myJson = JSONObject.fromObject(user);
        
        return myJson.toString();
    	
    }  
    
}
