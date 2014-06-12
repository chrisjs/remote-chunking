package io.spring.slave.processor;

import org.springframework.batch.item.ItemProcessor;

/**
 * <p>
 * Sample slave processor.
 * </p>
 *
 * @author Chris Schaefer
 */
public class Processor implements ItemProcessor<String, String> {
	@Override
	public String process(String item) throws Exception {
		System.out.println("SLAVE PROCESSING ITEM: " + item);

		return item;
	}
}
