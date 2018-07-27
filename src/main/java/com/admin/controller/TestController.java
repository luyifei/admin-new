package com.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.admin.entity.Person;

@Controller
public class TestController {

	@RequestMapping(value = "/testModelAndView")
	public ModelAndView testModelAndView(HttpServletRequest request, HttpServletResponse response, ModelAndView mav) {
		System.out.println(mav.getClass());
		Person person = new Person("testModelAndView", 21);
		mav.addObject("person", person);
		mav.setViewName("testModelAndView");
		return mav;
	}

	@RequestMapping(value = "/testModel")
	public String testModel(HttpServletRequest request, HttpServletResponse response, Model model) {
		System.out.println("Model " + model.getClass());
		Person person = new Person("testModel", 21);
		model.addAttribute("person", person);
		return "testModel";
	}
}