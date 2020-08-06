package dev.kyle.servicetests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import dev.kyle.entities.Coach;
import dev.kyle.services.CoachService;
import dev.kyle.services.CoachServiceImpl;

@TestMethodOrder(OrderAnnotation.class)
class CoachServiceTests {

	CoachService cServ = new CoachServiceImpl();
	
	@Test
	@Order(1)
	void createCoach() {
		Coach c = new Coach(0, "Adam Ranieri");
		c = cServ.createCoach(c);
		Assertions.assertNotEquals(0, c.getId());
	}

}
