package dev.kyle.services;

import java.util.Set;
import dev.kyle.entities.Player;

public interface PlayerService {
	Player createPlayer(Player p);
	
	Player getPlayerById(int id);
	Set<Player> getAllPlayers();
	Player getPlayerByName(String name);
	
	Player updatePlayer(Player player);
}
