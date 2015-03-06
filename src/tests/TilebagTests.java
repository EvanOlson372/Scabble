package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import code.TileBag;
import code.*;

public class TilebagTests<Tile> {
	
	@Test public void test01() { letterstest('A', 29); }
	@Test public void test02(){valuetest(5, 240);}
	@Test public void test02(){valuetest(2, 15);}
	@Test public void test02(){valuetest(1, 145);}
	
	
	
	
	
	

	@Test
	public void tbsizetest() {
		TileBag tb= new TileBag();
		int expected = 400;
		int actual = tb.size();
		assertTrue("I expected "+ expected+", but I got "+actual, actual==expected);
	}

	
	public void letterstest(char c, int in){
		int counter = 0;
		TileBag  tb= new TileBag();
		int expected = in;
		for(int i= 0; i<tb.size();i++){
			Tile t = (Tile) tb.getTile();
			if( ((code.Tile) t).getType() == c){
		        counter ++;
				}
		}
		int actual = counter;
		assertTrue("I expected "+expected+", but I got "+actual, actual==expected);

	}
	
	public void valuetest(int v, int in){
		int counter = 0;
		TileBag  tb= new TileBag();
		int expected = in;
		for(int i= 0; i<tb.size();i++){
			Tile t = (Tile) tb.getTile();
			if( ((code.Tile) t).getValue() == v){
		        counter ++;
				}
		}
		int actual = counter;
		assertTrue("I expected "+expected+", but I got "+actual, actual==expected);

	}
 }
