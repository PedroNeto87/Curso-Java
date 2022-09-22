package entities;

public class OutsourcedEmployee extends Employee {

	private Double additionalCharge;

	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double addiotnalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = addiotnalCharge;
	}

	public Double getAddiotnalCharge() {
		return additionalCharge;
	}

	public void setAddiotnalCharge(Double addiotnalCharge) {
		this.additionalCharge = addiotnalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}
