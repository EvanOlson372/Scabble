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
	@Test
	public void addPieceTest2(){
	Board b= new Board() ;
	Tile t1 =new Tile ('H',5);
	b.addPiece(5,7, t1);
	b.getPiece(5, 7);
	Tile t2 = b.getPiece(5, 7);
	assertTrue(t1==t2);
}
	@Test
	public void addPieceTest3(){
	Board b= new Board() ;
	Tile t1 =new Tile ('Y',2);
	b.addPiece(7,8, t1);
	b.getPiece(7, 8);
	Tile t2 = b.getPiece(7, 8);
	assertTrue(t1==t2);
}
	@Test
	public void addPieceTest4(){
	Board b= new Board() ;
	Tile t1 =new Tile ('A',1);
	b.addPiece(12,13, t1);
	b.getPiece(12, 13);
	Tile t2 = b.getPiece(12, 13);
	assertTrue(t1==t2);
}
}