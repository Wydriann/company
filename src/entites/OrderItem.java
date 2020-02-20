package entites;

public class OrderItem {
	
	private Double price;
	private Integer quantity;
	
	private Product product;
	
	public OrderItem(Integer quantity, Double price, Product product) {
		this.price = price;
		this.quantity = quantity;
		this.product = product;
	}
	
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Double totalPrice() {
		return quantity * price;
	}

	@Override
	public String toString() {
		return product.getName()
				+ ", $"
				+ String.format("%.2f, price")
				+ ", Quantity: "
	}
	
}
