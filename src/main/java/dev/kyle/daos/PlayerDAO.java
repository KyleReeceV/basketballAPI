package dev.kyle.daos;

import java.util.Set;

import dev.kyle.entities.Player;

public interface PlayerDAO {

	Player createPlayer(Player p);
	
	Player getPlayerById(int id);
	Set<Player> getAllPlayers();
	
	Player updatePlayer(Player p);
	
	boolean deletePlayer(Player p);
	
}
