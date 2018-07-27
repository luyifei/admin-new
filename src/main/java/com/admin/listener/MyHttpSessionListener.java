package com.admin.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 对应监控session内置对象的创建和销毁。
 * 
 * @author sunny
 *
 */
@WebListener
public class MyHttpSessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("session初始化...");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("session销毁...");

	}

}
