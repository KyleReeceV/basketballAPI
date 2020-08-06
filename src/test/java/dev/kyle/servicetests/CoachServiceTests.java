package dev.kyle.servicetests;

import java.util.Set;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;


import dev.kyle.entities.Coach;
import dev.kyle.services.CoachService;
import dev.kyle.services.CoachServiceImpl;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CoachServiceTests {

	private static CoachService cserv = new CoachServiceImpl();
	
  @Test
	@Order(1)
	void createCoach() {
		Coach c = new Coach(0, "Adam");
		c = cserv.createCoach(c);
		Assertions.assertNotEquals(0, c.getId());
  }
	@Test
	@Order(2)
	void testGetCoachById() {
		Coach c = cserv.getCoachById(1);
		Assertions.assertEquals(1, c.getId());

	}
	@Test
	@Order(3)
	void testGetAllCoaches() {
		Set<Coach> coaches = cserv.getAllCoachs();
		Assertions.assertNotEquals(0, coaches);
	}
	
	@Test
	@Order(4)
	void testGetCoachByName() {
		Coach adam = cserv.getCoachByName("Adam");
		Assertions.assertEquals("Adam", adam.getName());
	}
	
	@Test
	@Order(3)
	void updateCoach() {
		Coach brier = cserv.getCoachById(1);
		brier.setName("Wickerfield");
		cserv.updateCoach(brier);
		Assertions.assertEquals("Wickerfield",brier.getName());
	}

}
