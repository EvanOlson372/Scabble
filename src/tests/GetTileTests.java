package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Tile;
import code.TileBag;

public class GetTileTests {
	Boolean _tr;
	
	@Test
	
	public void getTiletest01(){
		int counter = 0;
		Boolean expected = true;
		TileBag tb = new TileBag();
		Tile t= tb.getTile();
		for(int i= 0; i<tb.size(); i++){
			Tile t1 = tb.getTile();
			if (t == t1){
				counter++;
			}
			if (counter == (29-1)|| counter == (15-1)||counter == (12-1)){
				_tr =true;
			}
		}
		Boolean actual =_tr;
		assertTrue("I expected "+expected+", but I got "+actual,actual==expected);
	}

}
