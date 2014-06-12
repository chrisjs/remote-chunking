package io.spring.master;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 * Runs the master node.
 * </p>
 *
 * @author Chris Schaefer
 */
public class Master {
	private static final String CONFIG = "/META-INF/spring/config/processing-job-master-context.xml";

	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(CONFIG);

		Job job = applicationContext.getBean(Job.class);
		JobLauncher jobLauncher = applicationContext.getBean(JobLauncher.class);

		jobLauncher.run(job, new JobParameters());
	}
}
