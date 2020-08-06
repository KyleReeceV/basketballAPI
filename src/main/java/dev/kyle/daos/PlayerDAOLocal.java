package dev.kyle.daos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import dev.kyle.entities.Player;

public class PlayerDAOLocal implements PlayerDAO{

	private Map<Integer,Player> player_table = new HashMap<Integer,Player>();
	private int count = 1;
	
	private static PlayerDAO pDao = null;
	private PlayerDAOLocal() {}
	public static PlayerDAO getPlayerDAO() {
		if(pDao == null) {
			pDao = new PlayerDAOLocal();
		}
		return pDao;
	}
	
	
	
	public Player createPlayer(Player p) {
		p.setId(count);
		count++;
		player_table.put(p.getId(), p);
		return p;
	}
	public Player getPlayerById(int id) {
		// TODO Auto-generated method stub
		return null;
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
