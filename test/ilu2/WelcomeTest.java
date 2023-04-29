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
	void test() {
		assertEquals("Hello, Bob", testeur.welcome("bob"));
		assertEquals("Hello, Bob", testeur.welcome("Bob"));
	}

}
