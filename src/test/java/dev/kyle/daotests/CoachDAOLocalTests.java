package dev.kyle.daotests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

import dev.kyle.daos.CoachDAO;
import dev.kyle.daos.CoachDAOLocal;
import dev.kyle.entities.Coach;

class CoachDAOLocalTests {

	public static CoachDAO cdao =  (CoachDAO) CoachDAOLocal.getCoachDAO();
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	
	
	@Test
	
	void updateCoach() {
		Coach mon = cdao.getCoachById(1);
		mon.setName("Downtown Highschool");
		mon = cdao.updateCoach(mon); //saves the changes to that school
		Assertions.assertEquals("Downtown Highschool", mon.getName());
		
	}
	

}
