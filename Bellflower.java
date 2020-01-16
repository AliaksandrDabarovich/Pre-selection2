package by.select.stage3.bean;

public class Bellflower extends Flower {
	int bellQuantity;
	
	public Bellflower(String sort, String country, String color, int length, int price, int quantity, int bellQuantity) {
		super(sort, country, color,  length, price, quantity);
		this.bellQuantity=bellQuantity;

	}

	public int getBellQuantity() {
		return bellQuantity;
	}

	public void setBellQuantity(int bellQuantity) {
		this.bellQuantity = bellQuantity;
	}

	@Override
	public String toString() {
		return "Bellflower [bellQuantity=" + bellQuantity + "]";
	}

	

	
	
}
