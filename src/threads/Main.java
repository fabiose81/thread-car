package threads;

import patterners.ProductSingleton;
import pieces.*;
import products.Car;

public class Main {

	public static void main(String[] args) {
		try {
			new Thread(new Runnable() {			
				@Override
				public void run() {
					while (true) {
						Builder buiderMotor = new Builder(new Motor());
						new Thread(buiderMotor).start();

						Builder builderTire = new Builder(new Tire());
						new Thread(builderTire).start();

						Builder builderDoor = new Builder(new Door());
						new Thread(builderDoor).start();
						
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							System.out.println("Error sleep thread [".concat(e.getMessage()).concat("]"));
						}
					}
				}
			}).start();
			
			new Thread(new Runnable() {			
				@Override
				public void run() {
					while (true) {					
						try {
							Thread.sleep(10000);
						} catch (InterruptedException e) {
							System.out.println("Error sleep thread [".concat(e.getMessage()).concat("]"));
						}
						
						new Thread(new Assembler(new Main())).start();
												
					}
				}
			}).start();
			
			new Thread(new Runnable() {			
				@Override
				public void run() {
					while (true) {					
						try {
							Thread.sleep(20000);
						} catch (InterruptedException e) {
							System.out.println("Error sleep thread [".concat(e.getMessage()).concat("]"));
						}
						
						Main.report();
												
					}
				}
			}).start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void finish(Car car) {
		ProductSingleton.getInstance().getStock().getListCar().add(car);
		System.out.println("finish assembler car serie [".concat(car.getSerie()).concat("]"));
	}
	
	private static void report() {
		System.out.println("=======================================");
		System.out.println("        	         REPORT");
		System.out.println("=======================================");
		System.out.println("Tires [".concat(String.valueOf(ProductSingleton.getInstance().getStock().getListTire().size()).concat("]")));
		System.out.println("Motors [".concat(String.valueOf(ProductSingleton.getInstance().getStock().getListMotor().size()).concat("]")));
		System.out.println("Doors [".concat(String.valueOf(ProductSingleton.getInstance().getStock().getListDoor().size()).concat("]")));
		System.out.println("Cars [".concat(String.valueOf(ProductSingleton.getInstance().getStock().getListCar().size()).concat("]")));
		System.out.println("================================");
	}

}
