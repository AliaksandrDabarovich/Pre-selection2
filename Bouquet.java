package by.select.stage3.bean;

public class Bouquet {
	private FlowerGroup flowerGroup;
	private Package packageBouqet;
	public Bouquet(FlowerGroup flowerGroup, Package packageBouqet) {
		this.flowerGroup=flowerGroup;
		this.packageBouqet=packageBouqet;
	}
	
	public FlowerGroup getFlowerGroup() {
		return flowerGroup;
	}

	public void setFlowerGroup(FlowerGroup flowerGroup) {
		this.flowerGroup = flowerGroup;
	}

	public Package getPackageBouqet() {
		return packageBouqet;
	}

	public void setPackageBouqet(Package packageBouqet) {
		this.packageBouqet = packageBouqet;
	}

	@Override
	public String toString() {
		return "Bouquet [flowerGroup=" + flowerGroup + ", packageBouqet=" + packageBouqet + "]";
	}

	
	

	
	

	
	
	
}
