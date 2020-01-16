package by.select.stage3.bean;

public abstract class Package {
	private int price;
	private String material;

	public Package(int price, String material) {
		this.price = price;
		this.material = material;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
