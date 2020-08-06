package dev.kyle.daotests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import dev.kyle.daos.PlayerDAOLocal;
import dev.kyle.entities.Player;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PlayerDAOLocalTests {
	PlayerDAOLocal pdao = PlayerDAOLocal.getPlayerDAO();
	
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

}
