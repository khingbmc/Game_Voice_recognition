package com.vajajava.player;

public class Player {
	private int x, y;

	public Player(int x, int y) {
		
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void move(int x, int y) {
		this.x += x;
		this.y += y;
		
		//this method is change position of player when input move
	}
}
