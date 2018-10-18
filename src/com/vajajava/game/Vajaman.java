package com.vajajava.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.vajajava.game.screen.GameScreen;

public class Vajaman extends Game{

	private GameScreen screen;
	@Override
	public void create() {
		this.screen = new GameScreen(this);
		
	}
	@Override
	public void render() {
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(255f/255f, 0f, 0f/255f, 0f); //rgba range of value is between [0, 1]
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		super.render();
	}
	
	

}
