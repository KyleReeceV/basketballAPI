package dev.kyle.daos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import dev.kyle.entities.Player;

public class PlayerDAOLocal implements PlayerDAO{
	
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
	

	private Map<Integer,Player> player_table = new HashMap<Integer,Player>();
	private int count = 1;
	public Player createPlayer(Player p) {
		// TODO Auto-generated method stub
		return null;
	}
	public Player getPlayerById(int id) {
		return player_table.get(id);
	}
	public Set<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return null;
	}
	public Player updatePlayer(Player p) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean deletePlayer(Player p) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
