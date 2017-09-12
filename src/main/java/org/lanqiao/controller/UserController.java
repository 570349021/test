package org.lanqiao.controller;

import javax.servlet.http.HttpSession;

import org.lanqiao.entity.User;
import org.lanqiao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("login")
	public String login() {
		return "login";
	}

	@RequestMapping("CheckUser")
	public String Check(User user, Model model, HttpSession session) {
		User retUser = userService.CheckUser(user);
		if (retUser != null) {
			session.setAttribute("userbean", user);
			return "redirect:index";
		} else {

			model.addAttribute("error", "账号或密码错误");
			return "login";
		}

	}

	@RequestMapping("index")
	public String index() {
		return "index";
	}

}
