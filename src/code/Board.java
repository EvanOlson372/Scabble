package code;

public class Board {
	
	
	char [][] _board = new char [20][20];
	
	
	public void printBoard(){
	
		for( int r = 0; r<=19; r++){
			System.out.print("[ ");
			for(int c = 0; c<=19; c++){				
				System.out.print(_board[r][c]+" ,");	
			}
			System.out.println("]");
			
		}
	
	
	}

	public void addPiece(int r, int c, char input){
		
		_board[r-1][c-1] = input;
		
		
	}


}

