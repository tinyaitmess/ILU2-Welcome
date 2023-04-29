package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class WelcomeTest {
	private Welcome testeur;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

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
		assertEquals("Hello, Amy, Bob",testeur.welcome("amy,bob"));
		assertEquals ("Hello, Amy, Bob",testeur.welcome("Amy,Bob"));

	}
	
	@Test
	void exigence_5() {
		assertEquals ("Hello, Amy, Bob, Jerry",testeur.welcome("Amy, bob,jerry"));
		assertEquals ("Hello, Manu, Brigitte, Tonton, Tata, Brie", testeur.welcome("manu,  brigitte,tonton,Tata, brie"));
	}
	
	@Test
	void exigence_6() {
		assertEquals("Hello, Amy, Jerry. AND HELLO, BOB !",testeur.welcome("Amy, BOB, Jerry"));
		assertEquals ("Hello, Manu, Brigitte, Tonton, Tata. AND HELLO, BRIE !", testeur.welcome("manu,  brigitte,tonton,Tata, BRIE"));
	}

}
