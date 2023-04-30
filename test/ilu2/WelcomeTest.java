package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class WelcomeTest {
	private Welcome testeur;


	@Test
	void exigence_1() {
		assertEquals("Hello, Bob", testeur.welcome("bob"));
		assertEquals("Hello, Bob", testeur.welcome("Bob"));
	}
	
	@Test 
	void exigence_2(){
		assertEquals("Hello, my friend",testeur.welcome("    "));
		assertEquals("Hello, my friend",testeur.welcome(null));
		assertEquals("Hello, my friend",testeur.welcome(""));
	}
	
	@Test
	void exigence_3() {
		assertEquals("HELLO, JERRY !", testeur.welcome("JERRY"));
		assertEquals("HELLO, THOMAS EDDISSON !", testeur.welcome("THOMAS EDDISSON"));
	}
	
	@Test
	void exigence_4() {
		assertEquals("Hello, Amy and Bob",testeur.welcome("amy,bob"));
		assertEquals ("Hello, AmybeTh and Bob",testeur.welcome("amybeTh,Bob"));

	}
	
	@Test
	void exigence_5() {
		assertEquals ("Hello, Amy, BOb and Jerry",testeur.welcome("Amy, BOb,jerry"));
		assertEquals ("Hello, Manu, Brigitte, Tonton, Tata and Brie", testeur.welcome("manu,  brigitte,tonton,Tata, brie"));
	}
	
	@Test
	void exigence_6() {
		assertEquals("Hello, Amy and Jerry. AND HELLO, BOB !",testeur.welcome("Amy, BOB, Jerry"));
		assertEquals ("Hello, Manu, Brigitte and Tonton. AND HELLO, TATA AND BRIE !", testeur.welcome("manu, TATA, brigitte,tonton, BRIE"));
	}
	
	@Test
	void exigence_7() {
		assertEquals("Hello, Amy and Jerry. AND HELLO, BOB !",testeur.welcome("amy, BOB,Jerry"));
		assertEquals ("Hello, Manu, Brigitte and Tonton. AND HELLO, TATA AND BRIE !", testeur.welcome("manu, TATA, brigitte,tonton, BRIE"));
	}
	
	@Test
	void exigence_8() {
		assertEquals("Hello, Amy and Bob",testeur.welcome("amy        , bob"));
		assertEquals("Hello, Amy and Jerry. AND HELLO, BOB !",testeur.welcome("   Amy, BOB,  Jerry  "));
	}
	
	@Test
	void exigence_9() {
		assertEquals ("Hello, Bob (*3)",testeur.welcome("bob  ,Bob,  bob"));
		//assertEquals ("")
		assertEquals("Hello, Bob (*3) and Amy. AND HELLO, JERRY (*2) !",testeur.welcome("bob, JERRY, amy, bob, JERRY, bob"));
	}
	

}
