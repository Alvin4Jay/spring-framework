package aop.service.impl;

import aop.model.Order;
import aop.service.OrderService;

/**
 * @author xuanjian
 */
public class OrderServiceImpl implements OrderService {

	@Override
	public Order createOrder(String username, String product) {
		Order order = new Order();
		order.setUsername(username);
		order.setProduct(product);
		return order;
	}

	@Override
	public Order queryOrder(String username) {
		Order order = new Order();
		order.setUsername("test");
		order.setProduct("test");
		return order;
	}
}
