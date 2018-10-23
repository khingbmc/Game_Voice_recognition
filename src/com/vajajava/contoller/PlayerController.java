package com.vajajava.contoller;

import com.badlogic.gdx.InputAdapter;
import com.vajajava.entity.Player;
import com.badlogic.gdx.Input.Keys;

public class PlayerController extends InputAdapter{
	
	private Player player;
	
	public PlayerController(Player p) {
		this.player = p;
	}
	
	
	@Override
	public boolean keyDown(int keycode) {
		if (keycode == Keys.DOWN) {
			this.player.move(0, -1);
		}
		if (keycode == Keys.UP) {
			this.player.move(0, 1);
		}
		if (keycode == Keys.RIGHT) {
			this.player.move(1, 0);
		}
		if (keycode == Keys.LEFT) {
			this.player.move(-1, 0);
		}
		
		return false;
	}
	
}
