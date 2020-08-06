package dev.kyle.entities;

import java.util.HashSet;
import java.util.Set;

public class Coach {

	private int id;
	private String name;
	
	private Set<Player> players = new HashSet<Player>();

	public Coach(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Coach() { super(); }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Coach [id=" + id + ", name=" + name + ", players=" + players + "]";
	}
	
	
}
