package pieces;

import threads.Builder;

public class Door extends Piece{
	
	public Door() {
		super();
	}
	
	@Override
	public void build(Builder builder) throws Exception{
		System.out.println("building door");
		try {
			Thread.sleep(2300);
		} catch (InterruptedException e) {
			throw new Exception();
		}
		
		builder.finish(this);		
	}

}
