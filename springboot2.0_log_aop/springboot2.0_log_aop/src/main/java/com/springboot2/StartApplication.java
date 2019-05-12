package com.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * ������
 */
//@EnableAutoConfiguration //�Զ����ã�����pom�ļ������������Ϣ���Զ����ö�Ӧ�������Ĭ��ֻɨ�豾��
//@ComponentScan(basePackages= {"com.springboot2.first","com.springboot2.second"}) //ָ��ɨ�跶Χ
@SpringBootApplication
@EnableAsync //开启异步调用
public class StartApplication {

//	������� SpringApplication.run �൱��java���봴������tomcat������springmvcע������
	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}

}
