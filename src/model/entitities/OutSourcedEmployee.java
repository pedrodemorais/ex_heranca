package model.entitities;

public final class  OutSourcedEmployee extends Employee{
	
	private double additionalCharge;

	public OutSourcedEmployee() {
		super();
	}
	
	public OutSourcedEmployee(String name, Integer hours, Double valuerPerHour, double additionalCharge) {
		super(name, hours, valuerPerHour);
		this.additionalCharge = additionalCharge;
	}

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		
		return super.payment() + additionalCharge *1.1;
	}

	
	
	
	
	
	

}
