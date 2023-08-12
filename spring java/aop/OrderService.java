package aop;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
	public void placeOrder() {
		System.out.println("Placing order!");
		// code
		// throw new IllegalArgumentException("Invalid details");
	}

	public String getOrderStatus(int orderId) {
		if (orderId > 100) {
			System.out.println("Getting order status  for " + orderId);
			return String.valueOf(orderId);
		} else
			throw new RuntimeException("Error in getting status");
	}

	public void cancelOrder(int orderId) {
		System.out.println("Cancelling order!" + orderId);
		throw new RuntimeException("Error in Canceling Order!");
	}
}
