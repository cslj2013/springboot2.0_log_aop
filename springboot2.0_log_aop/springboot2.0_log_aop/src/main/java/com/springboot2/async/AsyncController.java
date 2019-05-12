package com.springboot2.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot2.WebLogAspect;

/**
 * springboot异步调用
 * @author admin
 *
 */
@RestController
public class AsyncController {
	private final static Logger logger=LoggerFactory.getLogger(WebLogAspect.class);
	@Autowired
	private AsyncService asyncService;
	
	@RequestMapping("/testAsync")
	public String testAsync() {
		logger.info("1");
		String result=asyncService.asynTest();
		logger.info("4");
		return result;
	}
}
