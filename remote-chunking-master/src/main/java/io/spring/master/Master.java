package io.spring.master;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Master {
	private static final String CONFIG = "/remote-chunking-master/resources/META-INF/config/processing-job-context.xml";

	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(CONFIG);

		Job job = applicationContext.getBean(Job.class);
		JobLauncher jobLauncher = applicationContext.getBean(JobLauncher.class);

		jobLauncher.run(job, new JobParametersBuilder()
				.addDate("date", new Date())
				.toJobParameters());
	}
}
