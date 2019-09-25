package com.kiran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kiran.bean.LoginBean;
import com.kiran.services.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String init(Model model) {
		model.addAttribute("msg", "Please Enter Your Login Details");
		return "login.jsp";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submit(Model model, @ModelAttribute("loginBean") LoginBean loginBean) {

		if (loginService.loginAuth(loginBean)) {

			model.addAttribute("msg", loginBean.getUserName());
			return "success.jsp";

		} else {
			model.addAttribute("error", "Please enter Details");
			return "login.jsp";
		}
	}
}
