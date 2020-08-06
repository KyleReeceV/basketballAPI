package dev.kyle.daos;

import java.util.HashMap;
import java.util.Map;

import dev.kyle.entities.Coach;
import dev.kyle.entities.Player;

public class PlayerDAOLocal {

	private Map<Integer,Player> player_table = new HashMap<Integer,Player>();
	private int count = 1;
	
private static PlayerDAOLocal dao = null;
	
	private PlayerDAOLocal() {};
	
	public static PlayerDAOLocal getPlayerDAO() {
		if(dao == null) {
			dao = new PlayerDAOLocal();
			return dao;
		} else {
			return dao;
		}
	}
	
	//update
	public Player updatePlayer(Player player) {
		player_table.put(player.getId(), player);
		return player;
	}
	
}
