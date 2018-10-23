package com.vajajava.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.vajajava.screen.GameScreen;

public class Vaja extends Game{
	
	public static final int V_WIDTH = 400;
	public static final int V_HEIGHT = 320;
	public static final int V_SCALE = 6;
	
	

	private GameScreen screen;
	@Override
	public void create() {
		this.screen = new GameScreen(this);
		
		this.setScreen(screen);
		
	}
	@Override
	public void render() {
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(0f, 0f, 0f, 0f); //rgba range of value is between [0, 1]
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		super.render();
	}
	
	

}