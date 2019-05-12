package com.springboot2.ftlcontroller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 整合freemarker
 * 	注意：需要使用@controller而不是@restcontroller(没有视图层)
 * @author admin
 *
 */
@Controller
public class FtlController {
	
	@RequestMapping("/ftlIndex")
	public String ftlIndex(Map<String, Object> map) {
		map.put("name", "test");//相当于request.setName()
		map.put("age", "2");
		return "ftlIndex";//自动查找对应的页面
	}

}
