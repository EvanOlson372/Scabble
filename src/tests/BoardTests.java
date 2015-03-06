package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Board;
import code.Tile;

public class BoardTests {
	@Test
	public void addPieceTest(){
	Board b= new Board() ;
	Tile t1 =new Tile ('D',5);
	b.addPiece(1,2, t1);
	b.getPiece(1, 2);
	Tile t2 = b.getPiece(1, 2);
	assertTrue(t1==t2);
	
	}
}
