package code;

import java.util.ArrayList;
import java.util.Collections;

import code.*;


public class TileBag {
	
	String _S1 = "AEIOU";
	String _S2 = "BCDFGHJKLMNPQRSTVWXZ";
	ArrayList<Tile> _tileBag = new ArrayList<Tile>();
	int _index = 0;
	
	public TileBag(){
		
		
		for(int i = 0; i<_S1.length(); i++){
			for(int c = 0; c<29; c++){
				_tileBag.add(new Tile(_S1.charAt(i), 1));
				_index++;
			}
		}
		
		for(int i = 0; i<_S2.length(); i++){
			for(int c = 0; c<12; c++){
				_tileBag.add(new Tile(_S2.charAt(i), 5));
				_index++;
			}
		}
		
		for(int c = 0; c<15; c++){
			_tileBag.add(new Tile('Y', 2));
			_index++;
		}
	
		Collections.shuffle(_tileBag);
		
	}
	
	

	public Tile getTile(){
		Tile t = _tileBag.remove(0);
		return t;
	}
	public Tile checkTile(int i){
		Tile t = _tileBag.get(i);
		return t;
	}
	
	public void printBag(){
		
		for(int i =0; i<_tileBag.size(); i++){
			Tile t = _tileBag.get(i);
			System.out.print(t.getType());
			
		}
		
		System.out.print("\n");
		
		for(int i =0; i<_tileBag.size(); i++){
			Tile t = _tileBag.get(i);
			System.out.print(t.getValue());
			
		}
		
		System.out.println("\n" + _tileBag.size());
		
		
		
	}
	
	public ArrayList<Tile> getBag(){
		return _tileBag;
	}
	
	public int size(){
		return _tileBag.size();
	}
	
	
	
	
}
