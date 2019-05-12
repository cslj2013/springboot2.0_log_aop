package com.springboot2.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.springboot2.WebLogAspect;

@Service
public class AsyncService {
	private final static Logger logger=LoggerFactory.getLogger(WebLogAspect.class);
	
	@Async  //相当于重新开辟单独线程执行该方法
	public String asynTest() {
		logger.info("2");
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			
		}
		logger.info("3");
		return "success";
	}
}
