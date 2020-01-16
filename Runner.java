package by.select.stage3.main;

import java.io.IOException;
import java.util.Scanner;
import by.select.stage3.bean.*;
import by.select.stage3.bean.Package;
import by.select.stage3.exception.FlowerException;
import by.select.stage3.exception.PackageException;
import by.select.stage3.exception.QuantityFlowerException;
import by.select.stage3.logic.*;

public class Runner {

	public static void main(String[] args) {
		try {
			int numberMessage;
			FlowerGroup flowerGroup = new FlowerGroup();
			numberMessage = 1;
			Package packageFlower = getInfoPackage();
			while (numberMessage == 1) {
				Runner.getInfoFlower(flowerGroup);
				numberMessage = Runner.repeatQuestion();
			}

			Bouquet bouquet = new Bouquet(flowerGroup, packageFlower);
			System.out.println(bouquet);
			BouquetLogic bouquetLogic = new BouquetLogic();
			System.out.println(bouquetLogic.getBouquetPrice(bouquet));
			bouquetLogic.stream(bouquet);// Write and read from file

			Class.forName("by.select.stage3.InvisibleClass");
			

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (UnsupportedOperationException e) {
			System.out.println(e.getMessage());
		}  catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException");
		}

	}

	public static void getInfoFlower(FlowerGroup flowerGroup) {

		int numberFlower;
		int quantity;

		quantity = 0;

		String messageFlower;

		String messageQuantityFlower;

		messageFlower = "Catalog of flowers:" + "\n" + "\n" + "1. Red Rose" + "\n" + "2. Ritz Rose" + "\n"
				+ "3. Persicifolia Bellflower" + "\n" + "4. Cervicaria Bellflower" + "\n" + "5. Cyprius Carnation"
				+ "\n" + "6. Chinensis Carnation" + "\n" +

				"Choose number of flower from catalog >";

		messageQuantityFlower = "Choose quantity of flowers >";

		numberFlower = Runner.scan(messageFlower);
		try {
			quantity = Runner.scan(messageQuantityFlower);

			if (quantity > 100 || quantity < 1) {
				throw new QuantityFlowerException(
						"Such quantity is not applicable. Please choose quantity from 1 to 100.");
			}

		} catch (QuantityFlowerException e) {
			System.out.println(e.getMessage());
		}
		Flower flower = null;
		try {
			switch (numberFlower) {

			case 1:
				flower = new Rose("Red", "Hungary", "Red", 40, 2, quantity, "Average");
				break;
			case 2:
				flower = new Rose("Ritz", "Spain", "White", 30, 3, quantity, "High");
				break;
			case 3:
				flower = new Bellflower("Persicifolia", "Italy", "Violet", 25, 4, quantity, 9);
				break;
			case 4:
				flower = new Bellflower("Cervicaria", "Spain", "White", 30, 4, quantity, 8);
				break;
			case 5:
				flower = new Carnation("Cyprius", "Cyprius", "Red", 35, 4, quantity, true);
				break;
			case 6:
				flower = new Carnation("Chinensis", "China", "white", 35, 4, quantity, false);
				break;
			default:
				/* flower = new Rose ("","","",0,0,quantity,""); */
				throw new FlowerException("Flower with such number doesn't exist");
			}

		} catch (FlowerException e) {
			System.out.println(e.getMessage());
		}

		flowerGroup.getFlowerGroup().add(flower);

	}

	public static Package getInfoPackage() {
		Package packageFlower = null;
		int numberPackage;
		String messagePackage;
		messagePackage = "Package catalog:" + "\n" + "\n" + "1. Paper package" + "\n" + "2. Plastic package" + "\n"
				+ "Choose number of package from catalog >";
		numberPackage = Runner.scan(messagePackage);

		try {
			switch (numberPackage) {

			case 1:
				packageFlower = new PaperPackage(5, "Paper", "Average");
				break;
			case 2:
				packageFlower = new PlasticPackage(7, "Plastic", "Green");
				break;

			default:
				packageFlower = new PaperPackage(0, "", "");
				throw new PackageException(
						"Package with such number doesn't exist. Package is not chosen if you proceed.");

			}
		} catch (PackageException e) {
			System.out.println(e.getMessage());
		}

		return packageFlower;

	}

	public static int repeatQuestion() {
		int numberMessage;
		String message;
		message = "Do you want to choose one more flower? Insert number." + "\n" + "\n" + "1. Yes" + "\n" + "2. No";
		numberMessage = Runner.scan(message);
		return numberMessage;

	}

	public static int scan(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		while (sc.hasNextInt() == false) {
			sc.next();
			System.out.println(message);
		}
		return sc.nextInt();
	}

}
