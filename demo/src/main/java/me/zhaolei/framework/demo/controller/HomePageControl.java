package me.zhaolei.framework.demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomePageControl {
	@GetMapping
	public ModelAndView list() {
		ArrayList<String> messages = new ArrayList<String>();
		messages.add("11111111111");
		messages.add("22222222");
		messages.add("3333333333");
		return new ModelAndView("index", "messages", messages);
	}
}
