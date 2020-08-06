package dev.kyle.services;

import java.util.Set;

import dev.kyle.entities.Player;

public interface PlayerService {

	
	Player getPlayerById(int id);
	Set<Player> getAllPlayers();
	Player getPlayerByName(String name);
}
