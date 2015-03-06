package testCode;

import org.junit.Test;

import code.Board;
import code.Rack;
import code.Tile;

public class BoardTests {
	public void addPieceTest(){
	Board b= new Board() ;
	Object[][] b1 = b.getBoard();
	b.addPiece(1,2, Tile ('D', 2));
		
	
	}
}
