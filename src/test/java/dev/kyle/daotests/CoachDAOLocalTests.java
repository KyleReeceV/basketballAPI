package dev.kyle.daotests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Order;


import dev.kyle.daos.CoachDAO;
import dev.kyle.daos.CoachDAOLocal;
import dev.kyle.entities.Coach;

import java.util.Set;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CoachDAOLocalTests {
	
	CoachDAO cdao = CoachDAOLocal.getCoachDAO();

	@Test
	@Order(1)
	void createCoach() {
		Coach c = new Coach(0, "Adam Ranieri");
		c = cdao.createCoach(c);
		Assertions.assertNotEquals(0, c.getId());
  }
	
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
  
	@Test
	@Order(4)
	void updateCoach() {
		Coach mon = cdao.getCoachById(1);
		mon.setName("Downtown Highschool");
		mon = cdao.updateCoach(mon); //saves the changes to that school
		Assertions.assertEquals("Downtown Highschool", mon.getName());
		
	}
}
