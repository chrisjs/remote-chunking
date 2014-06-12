package io.spring.slave.writer;

import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * <p>
 * Sample slave writer.
 * </p>
 *
 * @author Chris Schaefer
 */
public class Writer implements ItemWriter<String> {
	@Override
	public void write(List<? extends String> items) throws Exception {
		for (String item : items) {
			System.out.println("SLAVE WRITING ITEM: " + item);
		}
	}
}
