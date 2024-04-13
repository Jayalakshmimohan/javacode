package java_collection_and_sorting;

import java.time.LocalDate;
import java.util.List;


public class Order {
	private long id;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private List<Product> products;
	private String Status;
	private long customerId;

	public Order() {
		super();
	}
	public Order(long id, LocalDate orderDate, LocalDate deliveryDate, String status, long customer) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		Status = status;
		this.customerId = customer;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate + ", Status=" + Status
				+ ", customerId=" + customerId + "]";
	}
	
	
	
	
}