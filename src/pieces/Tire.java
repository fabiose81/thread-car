package pieces;

import threads.Builder;;

public class Tire extends Piece{
	
	public Tire() {
		super();
	}
	
	@Override
	public void build(Builder builder) throws Exception{
		System.out.println("building tire");
		try {			
			Thread.sleep(1500);
		} catch (Exception e) {
			throw new Exception();
		}
		
		builder.finish(this);
	}
	
}
