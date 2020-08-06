package dev.kyle.daotests;

import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import dev.kyle.daos.PlayerDAO;
import dev.kyle.daos.PlayerDAOLocal;
import dev.kyle.entities.Player;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PlayerDAOLocalTests {
	PlayerDAO pdao = PlayerDAOLocal.getPlayerDAO();
	
  @Test
	@Order(1)
	void createPlayer() {
		Player p = new Player(0, "Adam Ranieri", "shooting guard");
		p = pdao.createPlayer(p);
		Assertions.assertNotEquals(0, p.getId());
  }
  
	@Test
	@Order(2)
	void testGetPlayerById() {
		Player p = pdao.getPlayerById(1);
		Assertions.assertEquals(1, p.getId());
	}
	
	@Test
	@Order(3)
	void testGetAllPlayers() {
		Set<Player> players = pdao.getAllPlayers();
		Assertions.assertNotEquals(0, players);
	}
	
	@Test
	@Order(4)
	void updatePlayer() {
		Player mon = pdao.getPlayerById(1);
		mon.setName("Downtown Highschool");
		mon = pdao.updatePlayer(mon); //saves the changes to that school
		Assertions.assertEquals("Downtown Highschool", mon.getName());
		
	}
	
	@Test
	@Order(5)
	void deletePlayerTest() {
		boolean result = pdao.deletePlayer(pdao.getPlayerById(1));
		Assertions.assertEquals(true,result);
	}

}
