package by.select.stage3.bean;

public class PaperPackage extends Package {
	private String thicknessPaper;

	public PaperPackage(int price, String material, String thicknessPaper) {
		super(price, material);
		this.thicknessPaper = thicknessPaper;
	}

	public String getThicknessPaper() {
		return thicknessPaper;
	}

	public void setThicknessPaper(String thicknessPaper) {
		this.thicknessPaper = thicknessPaper;
	}

	@Override
	public String toString() {
		return "PaperPackage [thicknessPaper=" + thicknessPaper + "]";
	}

}
