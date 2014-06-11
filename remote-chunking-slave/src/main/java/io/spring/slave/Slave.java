package io.spring.slave;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Slave {
	private static final String CONFIG = "/remote-chunking-slave/resources/META-INF/spring/config/slave.xml";

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext(CONFIG);
	}
}
