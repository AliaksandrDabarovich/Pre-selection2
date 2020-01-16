package by.select.stage3.bean;

public class Rose extends Flower {
	String pricklyness;
	
	public Rose(String sort, String country, String color, int length, int price, int quantity, String pricklyness) {
		super(sort, country, color,  length, price, quantity);
		this.pricklyness=pricklyness;

	}

	public String getPricklyness() {
		return pricklyness;
	}

	public void setPricklyness(String pricklyness) {
		this.pricklyness = pricklyness;
	}

	@Override
	public String toString() {
		return "Rose [pricklyness=" + pricklyness + "]";
	}

	
	
}
