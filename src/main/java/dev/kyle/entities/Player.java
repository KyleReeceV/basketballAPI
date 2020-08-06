package dev.kyle.entities;

public class Player {

	private int id;
	private String name;
	private String position;
	
	public Player(int id, String name, String position) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
	}
	
	public Player() { super(); }

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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", position=" + position + "]";
	}	
}
