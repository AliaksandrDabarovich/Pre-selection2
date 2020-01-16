package by.select.stage3.bean;

public abstract class Flower {
	private String sort;
	private String country;
	private String color;
	private int length;
	private int price;
	private int quantity;
	
	public Flower(String sort, String country, String color, int length,int price, int quantity) {
		this.sort=sort;
		this.country=country;
		this.color = color;
		this.length = length;
		this.price=price;
		this.quantity=quantity;
		
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Flower [sort=" + sort + ", country=" + country + ", color=" + color + ", length=" + length + ", price="
				+ price + ", quantity=" + quantity + "]";
	}
	
	
	
	
	
}
