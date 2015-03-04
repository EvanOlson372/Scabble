package code;

import code.Tile;

public class Rack {
	
	Object[] _rack = new Object[12];
	String _player = "x";
	int _score = 0;
	
	public Rack(String player){
		_player = player;
	}
	
	
	public void printRack(){
		
		System.out.print(_player +": [ ");
		for (int r = 0; r <= 11; r++){ 
				if(_rack[r] != null)
			System.out.print(((Tile) _rack[r]).getType()+" |");
				else
			System.out.print("  |");
			
		}
		System.out.println(" ]");
	}
	
	public void addPiece(int i, Tile input){
		_rack[i-1] = input;
		
	}
	
	public Tile getPiece(int index){
		Tile t = (Tile) _rack[index-1];
		_rack[index - 1] = null;
		return t;
	
	}
	
	public void fillRack(TileBag tb){
		
		for(int i = 0; i<12; i++){
			if(_rack[i]==null)
				_rack[i] = tb.getTile();
		}
		
		
	}
	
	public int getScore(){
		return _score;
	}

}
