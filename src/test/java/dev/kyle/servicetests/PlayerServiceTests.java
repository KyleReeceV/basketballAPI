package dev.kyle.servicetests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import dev.kyle.entities.Player;
import dev.kyle.services.PlayerService;
import dev.kyle.services.PlayerServiceImpl;

@TestMethodOrder(OrderAnnotation.class)
class PlayerServiceTests {

	private PlayerService pServ = new PlayerServiceImpl();

	@Test
	@Order(1)
	void createPlayer() {
		Player p = new Player(0, "Adam Ranieri", "shooting guard");
		p = pServ.createPlayer(p);
		Assertions.assertNotEquals(0, p.getId());
	}

}
