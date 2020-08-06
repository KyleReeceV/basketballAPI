package dev.kyle.daotests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerDAOLocalTests {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	
	void updatePlayer() {
		Player mon = pdao.getPlayerById(1);
		mon.setName("Downtown Highschool");
		mon = pdao.updatePlayer(mon); //saves the changes to that school
		Assertions.assertEquals("Downtown Highschool", mon.getName());
		
	}

}
