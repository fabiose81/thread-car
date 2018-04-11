package threads;

import patterners.ProductSingleton;
import pieces.*;
import products.Car;

public class Assembler implements Runnable {

	private Main main;

	public Assembler(Main main) {
		this.main = main;
	}

	@Override
	public void run() {

		System.out.println("assembling car...");
		int numPieceMotor = ProductSingleton.getInstance().getStock().getListMotor().size();
		Motor motor = (Motor) ProductSingleton.getInstance().getStock().getListMotor().get(numPieceMotor - 1);
		ProductSingleton.getInstance().getStock().getListMotor().remove(numPieceMotor - 1);

		Car car = new Car();
		
		System.out.println("adding doors ...");
		car.setSerie(String.valueOf(System.currentTimeMillis()));
		car.setMotor(motor);
		
		System.out.println("adding tires ...");
		int numPieceTire = ProductSingleton.getInstance().getStock().getListTire().size();
		
		for (int i = 0; i < 4; i++) {
			Tire tire = (Tire) ProductSingleton.getInstance().getStock().getListTire().get(numPieceTire - 1);
			car.getTire().add(tire);
			System.out.println("adding tire ".concat(String.valueOf(i+1)));
		}

		System.out.println("adding doors ...");
		int numPieceDoor = ProductSingleton.getInstance().getStock().getListDoor().size();
		for (int i = 0; i < 2; i++) {
			Door door = (Door) ProductSingleton.getInstance().getStock().getListDoor().get(numPieceDoor - 1);
			car.getDoor().add(door);
			System.out.println("adding door ".concat(String.valueOf(i+1)));
		}	
		
		main.finish(car);	

	}

}
