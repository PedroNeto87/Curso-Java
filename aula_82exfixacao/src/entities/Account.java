package entities;

public class Account {
	//Atributos
	private int number;
	private String holder;
	private double balance;
	
	//Metodos Contrutores
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	//Metodos Getters e Setters
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	//Metodos Especiais
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) {
		balance -= amount + 5.00;
	}

	@Override
	public String toString() {
		return "Account " 
	+ number 
	+ ", Holder: " 
	+ holder 
	+ ", Balance: $ " 
	+ String.format("%.2f", balance);
	}
	
	
}
