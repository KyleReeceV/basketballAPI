package dev.kyle.daotests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import dev.kyle.daos.PlayerDAO;
import dev.kyle.daos.PlayerDAOLocal;
import dev.kyle.entities.Player;

@TestMethodOrder(OrderAnnotation.class)
class PlayerDAOLocalTests {

	private PlayerDAO pDao = PlayerDAOLocal.getPlayerDAO();

	@Test
	@Order(1)
	void createPlayer() {
		Player p = new Player(0, "Adam Ranieri", "shooting guard");
		p = pDao.createPlayer(p);
		Assertions.assertNotEquals(0, p.getId());
	}

}
