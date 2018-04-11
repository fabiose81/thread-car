package threads;

import patterners.ProductSingleton;
import pieces.*;

public class Builder implements Runnable{
	
	private Piece piece;
	
	public Builder(Piece piece) {
		this.piece = piece;
	}

	@Override
	public void run() throws RuntimeException{
		try {
			this.piece.build(this);
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
	public void finish(Piece piece) {			
		if (piece instanceof Motor) {
			System.out.println("finish build motor");
			ProductSingleton.getInstance().getStock().getListMotor().add(piece);
		}else if (piece instanceof Tire){
			System.out.println("finish build tire");
			ProductSingleton.getInstance().getStock().getListTire().add(piece);
		}else if (piece instanceof Door){
			System.out.println("finish build door");
			ProductSingleton.getInstance().getStock().getListDoor().add(piece);
		}		
	}

}
