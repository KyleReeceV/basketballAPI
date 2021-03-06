package dev.kyle.daos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import dev.kyle.entities.Coach;
import dev.kyle.entities.Player;

public class PlayerDAOLocal implements PlayerDAO{	
	private static PlayerDAO dao = null;

	private PlayerDAOLocal() {};

	public static PlayerDAO getPlayerDAO() {
		if(dao == null) {
			dao = new PlayerDAOLocal();
			return dao;
		} else {
			return dao;
		}
	}

	private Map<Integer,Player> player_table = new HashMap<Integer,Player>();
	private int count = 1;

	public Player createPlayer(Player p) {
		p.setId(count);
		count++;
		player_table.put(p.getId(), p);
		return p;
	}
	public Player getPlayerById(int id) {
		return player_table.get(id);
	}
	public Set<Player> getAllPlayers() {
		player_table.values();
		Set<Player> players = new HashSet<Player>(player_table.values());
		return players;
	}

	//update
	public Player updatePlayer(Player player) {
		player_table.put(player.getId(), player);
		return player;
	}

	public boolean deletePlayer(Player p) {
		if(player_table.get(p.getId())==null){
			return false;
		}else{
			Player player = player_table.remove(p.getId());
			if(player_table.get(p.getId()) == null) {
				return true;
			}
		}

		return false;
	}


}
