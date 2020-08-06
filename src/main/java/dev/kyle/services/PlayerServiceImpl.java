package dev.kyle.services;

import dev.kyle.daos.PlayerDAO;
import dev.kyle.daos.PlayerDAOLocal;
import dev.kyle.entities.Player;

public class PlayerServiceImpl implements PlayerService{

	private PlayerDAO pDao = PlayerDAOLocal.getPlayerDAO();
	
	public Player createPlayer(Player p) {
		return pDao.createPlayer(p);
	}

}
