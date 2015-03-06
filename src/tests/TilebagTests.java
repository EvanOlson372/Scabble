package tests;

import static org.junit.Assert.*;


import org.junit.Test;
import code.TileBag;
import code.Tile;

public class TilebagTests {
	
	@Test public void test01() { letterstest('A', 29); }
	@Test public void test02(){valuetest(5, 240);}
	@Test public void test03(){valuetest(2, 15);}
	@Test public void test04(){valuetest(1, 145);}
	@Test public void test05() { letterstest('B', 12); }
	@Test public void test06() { letterstest('C', 12); }
	@Test public void test07() { letterstest('D', 12); }
	@Test public void test08() { letterstest('E', 29); }
	@Test public void test09() { letterstest('F', 12); }
	@Test public void test10() { letterstest('G', 12); }
	@Test public void test11() { letterstest('H', 12); }
	@Test public void test12() { letterstest('I', 29); }
	@Test public void test13() { letterstest('J', 12); }
	@Test public void test14() { letterstest('K', 12); }
	@Test public void test15() { letterstest('L', 12); }
	@Test public void test16() { letterstest('M', 12); }
	@Test public void test17() { letterstest('M', 12); }

	
	
	
	
	

	@Test
	public void tbsizetest() {
		TileBag tb= new TileBag();
		int expected = 400;
		int actual = tb.size();
		assertTrue("I expected "+ expected+", but I got "+actual, actual==expected);
	}

	
	public void letterstest(char c, int in){
		int counter = 0;
		TileBag  tb = new TileBag();
		int expected = in;
		for(int i= 0; i<tb.size();i++){
			Tile t = tb.checkTile(i);
			if(t.getType() == c){
		        counter++;
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
			Tile t = tb.checkTile(i);
			if( t.getValue() == v){
		        counter= counter+1;
				}
		}
		int actual = counter;
		assertTrue("I expected "+expected+", but I got "+actual, actual==expected);

	}
 }
