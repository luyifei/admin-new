package com.admin.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 对应监控application内置对象的创建和销毁。
 * @author sunny
 *
 */
@WebListener
public class MyServletContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("web容器初始化...");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("web容器销毁...");
	}

}
