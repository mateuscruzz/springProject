package com.springProject.course.entities.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value: OrderStatus.values()) { // percorre todos valores do order status e 
			if (value.getCode() == code) {				// retorna o que for igual ao do parametro do metodo
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid Order Status code");
	}
}
