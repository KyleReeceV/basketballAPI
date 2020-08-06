package dev.kyle.servicetests;

import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import dev.kyle.entities.Player;
import dev.kyle.services.PlayerService;
import dev.kyle.services.PlayerServiceImpl;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PlayerServiceTests {

	private static PlayerService cserv = new PlayerServiceImpl();
	
	@Test
	@Order(2)
	void testGetPlayerById() {
		Player p = cserv.getPlayerById(1);
		Assertions.assertEquals(1, p.getId());

	}
	@Test
	@Order(3)
	void testGetAllPlayeres() {
		Set<Player> players = cserv.getAllPlayers();
		Assertions.assertNotEquals(0, players);
	}
	
	@Test
	@Order(4)
	void testGetPlayerByName() {
		Player adam = cserv.getPlayerByName("Adam");
		Assertions.assertEquals("Adam", adam);
	}


}
