package dev.kyle.daotests;

import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import dev.kyle.daos.CoachDAOLocal;
import dev.kyle.entities.Coach;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CoachDAOLocalTests {
	
	CoachDAOLocal cdao = CoachDAOLocal.getCoachDAO();
	
	
	@Test
	@Order(2)
	void testGetCoachById() {
		Coach c = cdao.getCoachById(1);
		Assertions.assertEquals(1, c.getId());
	}
	
	@Test
	@Order(3)
	void testGetAllCoaches() {
		Set<Coach> coaches = cdao.getAllCoachs();
		Assertions.assertNotEquals(0, coaches);
	}

}
