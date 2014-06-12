package io.spring.slave;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 * Sample slave node.
 * </p>
 *
 * @author Chris Schaefer
 */
public class Slave {
	private static final String CONFIG = "/META-INF/spring/config/processing-job-slave-context.xml";

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext(CONFIG);
	}
}
