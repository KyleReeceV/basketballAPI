package dev.kyle.services;

import java.util.Set;

import dev.kyle.daos.PlayerDAO;
import dev.kyle.daos.PlayerDAOLocal;
import dev.kyle.entities.Player;

public class PlayerServiceImpl implements PlayerService {

	private static PlayerDAO pdao = PlayerDAOLocal.getPlayerDAO();
	
  public Player createPlayer(Player p) {
		return pdao.createPlayer(p);
	}
	public Player getPlayerById(int id) {
		return pdao.getPlayerById(id);
	}

	public Set<Player> getAllPlayers() {
		return pdao.getAllPlayers();
	}

	public Player getPlayerByName(String name) {		
		for (Player p : pdao.getAllPlayers()) {
			if(p.getName().equals(name)) {
				return p;
			}
		}
		return null;
	}

	public Player updatePlayer(Player player) {
		return pdao.updatePlayer(player);
	}
	public boolean deletePlayer(Player p) {
		return pdao.deletePlayer(p);
	}

	public boolean deletePlayerById(int id) {
		return pdao.deletePlayer(pdao.getPlayerById(id));
	}
}