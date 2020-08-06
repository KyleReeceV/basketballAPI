package dev.kyle.services;

import dev.kyle.daos.PlayerDAOLocal;
import dev.kyle.entities.Player;

public class PlayerServiceImpl {
	
	
	private static PlayerDAOLocal pdao = PlayerDAOLocal.getPlayerDAO();
	
	//update
	public Player updatePlayer(Player player) {
		return pdao.updatePlayer(player);
	}

}
