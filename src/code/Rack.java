package code;

public class Rack {
	
	int[] _rack = new int[12];
	String _player = "x";
	
	public Rack(String player){
		_player = player;
	}
	
	
	public void printRack(){
		
		System.out.print(_player +": [ ");
		for (int r = 0; r <= 11; r++){
			System.out.print((char)_rack[r]+" |");
		}
		System.out.println(" ]");
	}
	
	public void addPiece(int i, char input){
		_rack[i-1] = input;
		
	}

}
