package io.spring.broker;

import org.apache.activemq.broker.BrokerService;

/**
 * <p>
 * Convenience class to launch an embedded ActiveMQ broker.
 * </p>
 */
public class ActiveMQBroker {
	private static final String BROKER_URL = "tcp://localhost:61616";

	public static void main(String[] args) throws Exception {
		BrokerService brokerService = new BrokerService();
		brokerService.addConnector(BROKER_URL);
		brokerService.start();
	}
}
