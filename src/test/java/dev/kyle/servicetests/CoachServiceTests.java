package dev.kyle.servicetests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CoachServiceTests {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	@Order(3)
	void updateCoach() {
		Coach brier = cserv.getCoachById(1);
		cserv.updateCoach(brier, "Wickerfield");
		Assertions.assertEquals("Wickerfield",brier.getName());
	}

}
