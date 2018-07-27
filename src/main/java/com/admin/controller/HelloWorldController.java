package com.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.properties.ApplicationProperties;

@RestController
public class HelloWorldController {
	Logger log = LoggerFactory.getLogger(HelloWorldController.class);
	@Autowired
	ApplicationProperties applicationProperties;

	@RequestMapping("/hello")
	public String index(Model model) {
		log.info(applicationProperties.getSystemName());
		return applicationProperties.getSystemName();
	}
}