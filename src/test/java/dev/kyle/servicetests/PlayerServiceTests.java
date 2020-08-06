package dev.kyle.servicetests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerServiceTests {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	
	void updatePlayer() {
		Player brier = pserv.getPlayerById(1);
		pserv.updatePlayer(brier, "Wickerfield");
		Assertions.assertEquals("Wickerfield",brier.getName());
	}

}
