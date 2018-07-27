package com.admin.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.admin.listener.MyServletRequestListener;

//@Configuration
public class ServletConfigurer {

	@Bean
	public FilterRegistrationBean<AccessLogFilter> filterRegistration() {
		FilterRegistrationBean<AccessLogFilter> registration = new FilterRegistrationBean<AccessLogFilter>();
		registration.setFilter(new AccessLogFilter());
		registration.addUrlPatterns("/*");
		registration.addInitParameter("paramName", "paramValue");
		registration.setName("AccessLogFilter");
		registration.setOrder(1);
		return registration;
	}

	@Bean
	public ServletListenerRegistrationBean<MyServletRequestListener> servletListenerRegistrationBean() {
		ServletListenerRegistrationBean<MyServletRequestListener> servletListenerRegistrationBean = new ServletListenerRegistrationBean<MyServletRequestListener>();
		servletListenerRegistrationBean.setListener(new MyServletRequestListener());
		return servletListenerRegistrationBean;
	}

}