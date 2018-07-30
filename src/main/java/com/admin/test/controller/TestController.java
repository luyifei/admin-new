package com.admin.test.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        mav.setViewName("testSpringMVC/testModelAndView");
        return mav;
    }

    @RequestMapping(value = "/testModel")
    public String testModel(HttpServletRequest request, HttpServletResponse response, Model model) {
        System.out.println("Model " + model.getClass());
        Person person = new Person("testModel", 21);
        model.addAttribute("person", person);
        return "testSpringMVC/testModel";
    }

    @RequestMapping(value = "/testThLabel")
    public ModelAndView testThLabel(HttpServletRequest request, HttpServletResponse response, ModelAndView mav) {
        System.out.println(request.getParameter("name")+":"+request.getParameter("age"));
        mav.addObject("id", "thid");
        mav.addObject("text", "<h1>text</h1>");
        mav.addObject("utext", "<h1>utext</h1>");
        Person person = new Person("张三", 21);
        mav.addObject("object", person);
        mav.addObject("with", person);
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            personList.add(new Person("张三" + i, 20 + i));
        }
        mav.addObject("personList", personList);
        Map<String,String> maps = new HashMap<>();
        maps.put("key1", "value2");
        maps.put("key2", "value2");
        mav.addObject("maps", maps);
        mav.setViewName("testThymeleaf/testThLabel");
        return mav;
    }
}