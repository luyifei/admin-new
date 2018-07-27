package com.admin.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * 对应监控request内置对象的创建和销毁。
 * 
 * @author sunny
 *
 */
@WebListener
public class MyServletRequestListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("request销毁...");

	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("request请求初始化...");

	}

}
