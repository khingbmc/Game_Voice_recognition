package com.vajajava.map;

import com.vajajava.entity.Player;

public class Tile {
	private TERRAIN terrain;
	private Player player;
	
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Tile(TERRAIN terrain) {
		this.terrain = terrain;
	}
	
	public TERRAIN getTerrain() {
		return this.terrain;
	}
}
