package com.vajajava.entity;

import com.vajajava.map.TileMap;

public class Player {
	private int x;
	private int y;
	private TileMap map;
	
	public Player(TileMap map, int x, int y) {
		this.map = map;
		this.x = x;
		this.y = y;
		map.getTile(x, y).setPlayer(this);
	}
	
	public boolean move(int x, int y) {
		if(this.x+x >= map.getWidth() || this.y+y >= map.getHeight() || this.x+x < 0 || this.y+y < 0) {
			return false; //check this player cannot go outside the map
		}
		
		
		if(map.getTile(this.x+x, this.y+y).getPlayer() != null) {
			return false; //check player is in position
		}
		map.getTile(this.x, this.y).setPlayer(null); // before move
		this.x += x;
		this.y += y;
		map.getTile(this.x, this.y).setPlayer(this); //after move
		
		return true; //false is non move out the screen margin
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
