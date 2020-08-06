package dev.kyle.servicetests;

import java.util.Set;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;

import dev.kyle.entities.Player;
import dev.kyle.services.PlayerService;
import dev.kyle.services.PlayerServiceImpl;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PlayerServiceTests {

	private static PlayerService pserv = new PlayerServiceImpl();
	
  @Test
	@Order(1)
	void createPlayer() {
		Player p = new Player(0, "Adam", "shooting guard");
		p = pserv.createPlayer(p);
		Assertions.assertNotEquals(0, p.getId());
  }
	@Order(2)
	void testGetPlayerById() {
		Player p = pserv.getPlayerById(1);
		Assertions.assertEquals(1, p.getId());
	}
  
	@Test
	@Order(3)
	void testGetAllPlayeres() {
		Set<Player> players = pserv.getAllPlayers();
		Assertions.assertNotEquals(0, players);
	}
	
	@Test
	@Order(4)
	void testGetPlayerByName() {
		Player adam = pserv.getPlayerByName("Adam");
		Assertions.assertEquals("Adam", adam.getName());
	}
  
  @Test
  @Order(5)
	void updatePlayer() {
		Player brier = pserv.getPlayerById(1);
		pserv.updatePlayer(brier, "Wickerfield");
		Assertions.assertEquals("Wickerfield",brier.getName());
	}
}
