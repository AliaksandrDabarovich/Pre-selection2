package by.select.stage3.logic;

import java.util.List;

import by.select.stage3.bean.Flower;
import by.select.stage3.bean.FlowerGroup;

public class FlowerGroupLogic  {
	FlowerLogic flowerLogic = new FlowerLogic();

	public int flowerGroupPrice(FlowerGroup flowerGroup) {
		int value;
		int zero;
		int out;
		value =5;
		zero=2;
		out=value/zero;		
		
		if (flowerGroup == null) {
			throw new  IllegalArgumentException("FlowerGroup should be defined");
		}
		List<Flower> flowerList = flowerGroup.getFlowerGroup();
		int flowerGroupPrice;
		flowerGroupPrice = 0;
		for (int i = 0; i < flowerList.size(); i++) {
			flowerGroupPrice += flowerLogic.getPrice(flowerList.get(i));
		}
		
		return flowerGroupPrice;

	}

}
