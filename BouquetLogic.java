package by.select.stage3.logic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import by.select.stage3.bean.Bouquet;


public class BouquetLogic {
	FlowerGroupLogic flowerGroupLogic = new FlowerGroupLogic();

	public int getBouquetPrice(Bouquet bouquet) {
		
		int flowerPrice;
		int packagePrice;
		flowerPrice = flowerGroupLogic.flowerGroupPrice(bouquet.getFlowerGroup());
		packagePrice = bouquet.getPackageBouqet().getPrice();

		return flowerPrice + packagePrice;

	}
	public void stream(Bouquet bouquet) throws IOException {

		String str;
		str = bouquet.toString();
		char[] ch = str.toCharArray();
		OutputStream output = new FileOutputStream(
				"C:/Users/Aliaksandr_Dabarovic/OneDrive - EPAM/Documents/Java Basics/data.txt");

		for (int i = 0; i < ch.length; i++) {
			output.write(ch[i]);
		}
		output.close();
		InputStream input = new FileInputStream(
				"C:/Users/Aliaksandr_Dabarovic/OneDrive - EPAM/Documents/Java Basics/data.txt");
		int size = input.available();
		for (int j = 0; j < size; j++) {
			System.out.print((char) input.read());

		}
		input.close();

	}
}
