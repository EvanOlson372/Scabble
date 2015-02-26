package code;

import code.Board;
import code.Rack;

public class Scabble {

	
	public Scabble(){
		
		Board board = new Board();
		Rack p1 = new Rack("Player 1");
		Rack p2 = new Rack("Player 2");
		
		board.addPiece(1, 4, 'c');
		board.addPiece(2, 4, 'a');
		board.addPiece(3, 4, 't');
		board.addPiece(3, 5, 'a');
		board.addPiece(3, 6, 'g');
		board.printBoard();
		
		p1.addPiece(1, 'z');
		p2.addPiece(5, 'x');
		
		p1.printRack();
		p2.printRack();
		
		// hi
	}
	
}
