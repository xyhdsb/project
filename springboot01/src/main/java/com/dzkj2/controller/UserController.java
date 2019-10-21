package com.dzkj2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dzkj2.entity.User;

@Controller
public class UserController {
	
	@RequestMapping("show")
	public String show(Model model) {
		
		User u1=new User("天空芝麻糊","3333");
		User u2=new User("尼玛","555");
		User u3=new User("hhhh","666");
		List<User> lu=new ArrayList<User>();
		lu.add(u1);
		lu.add(u2);
		lu.add(u3);
		model.addAttribute("lu", lu);
		return "list";
	}
	
	@RequestMapping("login")
	public String login(String username,String pwd) {
		if(username.equals("天空芝麻糊")&&pwd.equals("3333")) {
			return "forward:show";
		}
		return "redirect:login.jsp";
	}
	
	@RequestMapping("show2")
	public String show2(Model model) {
		String h="hello";
		model.addAttribute("h", h);
		return "index";
	}
	
	@RequestMapping("sou")
	public String sou() {
		return "top";
	}

}
