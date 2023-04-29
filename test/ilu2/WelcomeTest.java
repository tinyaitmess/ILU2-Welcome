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
		assertEquals("Hello, JERRY !", testeur.welcome("JERRY"));
		assertEquals("Hello, THOMAS EDDISSON !", testeur.welcome("THOMAS EDDISSON"));
	}

}
