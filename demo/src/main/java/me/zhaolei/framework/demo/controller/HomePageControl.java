package me.zhaolei.framework.demo.controller;

import java.util.ArrayList;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomePageControl {
	@RequestMapping
	public ModelAndView home() {
		return new ModelAndView("/index");
	}

	@RequestMapping("/private/index")
	public ModelAndView list(Model model) {
		// 通过安全环境获取当前用户的信息。
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username;
		if (principal instanceof UserDetails) {
			username = ((UserDetails)principal).getUsername();
		} else {
			username = principal.toString();
		}
		model.addAttribute("title", "机密页面");
		model.addAttribute("username", username);

		ArrayList<String> messages = new ArrayList<String>();
		messages.add("11111111111");
		messages.add("22222222");
		messages.add("3333333333");
		model.addAttribute("messages", messages);
		return new ModelAndView("/private/index");
	}

	/**
	 * 登录页面。
	 * @return
	 */
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	/**
	 *  登录错误，添加错误标志后跳转回登录页面。
	 * @param model
	 * @return
	 */
	@RequestMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		return "login";
	}
}
