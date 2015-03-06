package code;

import code.Board;
import code.Rack;

public class Scabble {

	
	public Scabble(){
		
		Board board = new Board();
		Rack p1 = new Rack("Player 1");
		Rack p2 = new Rack("Player 2");
		TileBag tb = new TileBag();
	
		board.printBoard();
		p1.printRack();
		p2.printRack();
		p1.fillRack(tb);
		p2.fillRack(tb);
		p1.printRack();
		p2.printRack();
		
		tb.printBag();
		
		System.out.print("\n"+tb.checkTile()+ "\n");
		
		
		
		p1.addPiece(1, tb.getTile());
		p1.printRack();
		p1.addPiece(2, tb.getTile());
		p1.printRack();
		
		board.addPiece(1, 1, p1.getPiece(1));
		
		board.printBoard();
		
		p1.printRack();


	}
}
