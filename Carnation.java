package by.select.stage3.bean;

public class Carnation extends Flower {
	boolean hybrid;
	
	public Carnation(String sort, String country, String color, int length, int price, int quantity, boolean hybrid) {
		super(sort, country, color,  length, price, quantity);
		this.hybrid=hybrid;

	}

	public boolean isHybrid() {
		return hybrid;
	}

	public void setHybrid(boolean hybrid) {
		this.hybrid = hybrid;
	}

	@Override
	public String toString() {
		return "Carnation [hybrid=" + hybrid + "]";
	}

	

	

	
	
}
