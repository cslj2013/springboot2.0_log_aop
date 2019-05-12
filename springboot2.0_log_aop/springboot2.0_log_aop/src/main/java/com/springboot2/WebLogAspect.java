package com.springboot2;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * 
 * @author admin
 *
 */
@Aspect
@Component
public class WebLogAspect {

	private final static Logger logger=LoggerFactory.getLogger(WebLogAspect.class);
	
	@Pointcut("execution(public * com.springboot2..*.*(..))")
	public void weblog() {
	}
	
//	@Before("weblog()")
	public void doBefore(JoinPoint joinPoint) {
		//接收到请求，记录请求内容
		ServletRequestAttributes attributes=(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request=attributes.getRequest();
		//记录下请求内容
		logger.info("URL:"+ request.getRequestURI().toLowerCase());
		logger.info("HTTP_METHOD:"+request.getMethod());
		logger.info("IP:"+request.getRemoteAddr());
		Enumeration<String> enu=request.getParameterNames();
		while (enu.hasMoreElements()) {
			String name=(String)enu.nextElement();
			logger.info("name:{},value:{}",name,request.getParameter(name));
		}
	}
	
	@AfterReturning(returning="obj" ,pointcut="weblog()")
	public void deAfter(Object obj) {
		logger.info("Response:"+obj);
	}
}
