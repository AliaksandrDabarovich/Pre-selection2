package by.select.stage3.bean;

public class PlasticPackage extends Package {
	private String color;

	public PlasticPackage(int price, String material, String color) {
		super(price, material);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "PlasticPackage [color=" + color + "]";
	}

}
