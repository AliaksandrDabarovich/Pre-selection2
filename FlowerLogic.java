package by.select.stage3.logic;

import by.select.stage3.bean.Flower;

public class FlowerLogic implements Logic<Flower> {
	@Override
	public int getPrice(Flower flower) {
		if (flower == null) {
			throw new IllegalArgumentException("Flower should be defined");
		}
		int result;
		result = 0;

		result = flower.getQuantity() * flower.getPrice();

		return result;
	}

	@Override
	public void stream(Flower t) {
		throw new UnsupportedOperationException("This operation is not supported for the flowers");

	}
}
