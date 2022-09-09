package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProduts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProduts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name + ", $" + String.format("%.2f", price) + " un, " + quantity + " units, Total: $"
				+ String.format("%.2f",totalValueInStock()) + ".";
	}
}
