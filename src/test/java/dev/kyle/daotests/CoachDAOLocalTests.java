package dev.kyle.daotests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import dev.kyle.daos.CoachDAO;
import dev.kyle.daos.CoachDAOLocal;
import dev.kyle.entities.Coach;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
class CoachDAOLocalTests {

	CoachDAO cDao = CoachDAOLocal.getCoachDAO();
	
	@Test
	@Order(1)
	void createCoach() {
		Coach c = new Coach(0, "Adam Ranieri");
		c = cDao.createCoach(c);
		Assertions.assertNotEquals(0, c.getId());
	}

}
