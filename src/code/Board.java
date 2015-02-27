package code;

public class Board {
	
	
	Object [][] _board = new Object [20][20];
	
	
	public void printBoard(){
	
		for( int r = 0; r<=19; r++){
			System.out.print("[ ");
			for(int c = 0; c<=19; c++){	
				if(_board[r][c] != null)
				System.out.print(((Tile) _board[r][c]).getType()+" ,");	
				else
				System.out.print(" ,");
			}
			System.out.println("]");
			
		}
	
	
	}

	public void addPiece(int r, int c, Tile input){
		
		_board[r-1][c-1] = input;
		
		
	}


}

