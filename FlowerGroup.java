package by.select.stage3.bean;

import java.util.ArrayList;
import java.util.List;

public class FlowerGroup {
	private List<Flower> flowerGroup;

	public FlowerGroup() {
		flowerGroup = new ArrayList<Flower>();

	}

	public FlowerGroup(List<Flower> flowerGroup) {
		this.flowerGroup = flowerGroup;

	}

	public List<Flower> getFlowerGroup() {
		return flowerGroup;
	}

	public void setFlowerGroup(List<Flower> flowerGroup) {
		this.flowerGroup = flowerGroup;
	}

	@Override
	public String toString() {
		return "FlowerGroup [flowerGroup=" + flowerGroup + "]";
	}

	
	
	

}
