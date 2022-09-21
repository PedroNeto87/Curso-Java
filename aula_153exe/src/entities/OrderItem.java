package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;
	
	private Product produtct; //Cria uma composição com a classe Product

	public OrderItem() {
	}

	public OrderItem(Integer quantity, Double price, Product produtct) {
		this.quantity = quantity;
		this.price = price;
		this.produtct = produtct;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProdutct() {
		return produtct;
	}

	public void setProdutct(Product produtct) {
		this.produtct = produtct;
	}
	
	public double subTotal() {
		return price * quantity;
	}
	
	@Override
	public String toString() {
		return getProdutct().getName()
				+ ", $"
				+ String.format("%.2f", price)
				+ ", Quantity: "
				+ quantity
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
}
