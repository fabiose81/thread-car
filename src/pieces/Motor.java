package pieces;

import threads.Builder;;

public class Motor extends Piece{
	
	public Motor() {
		super();
	}
	
	@Override
	public void build(Builder builder) throws Exception{
		System.out.println("building motor");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			throw new Exception();
		}

		builder.finish(this);		
	}
	
}
