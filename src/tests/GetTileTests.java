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
			if(tb.size()==399){
				_tr= true;
			}

			else{
				_tr = false;
			}
		}
		Boolean actual =_tr;
		assertTrue("I expected "+expected+", but I got "+actual,actual==expected);
	}

}
