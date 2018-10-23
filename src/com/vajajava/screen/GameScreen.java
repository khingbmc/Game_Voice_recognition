package com.vajajava.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.vajajava.contoller.PlayerController;
import com.vajajava.entity.Player;
import com.vajajava.game.Setting;
import com.vajajava.game.Vaja;
import com.vajajava.map.TERRAIN;
import com.vajajava.map.TileMap;

public class GameScreen extends AbstractScreen{
	
	private Texture texturePlayer;
	
	private SpriteBatch batch; // this obj is use to render the screen
	
	private Player player;
	
	private Texture grass1, grass2;
	
	private PlayerController controller;
	private TileMap map;
	public GameScreen(Vaja app) {
		super(app);
		
		texturePlayer = new Texture("res/test.png");
		grass1 = new Texture("res/rock1.jpg");
		grass2 = new Texture("res/rock2.jpg");
		batch = new SpriteBatch();
		map = new TileMap(10, 10);
		player = new Player(map, 1, 1);
		controller = new PlayerController(this.player);
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		batch.begin();
		
		for(int x = 0;x < map.getWidth();x++) {
			for(int y = 0;y< map.getHeight();y++) {
				Texture grass = null;
				if(map.getTile(x, y).getTerrain() == TERRAIN.GRASS1) {
					grass = grass1;
				}
				if(map.getTile(x, y).getTerrain() == TERRAIN.GRASS2) {
					grass = grass2;
				}
				
				
				batch.draw(grass,
						x*Setting.SCALE_TILE,
						y*Setting.SCALE_TILE,
						Setting.SCALE_TILE
					,Setting.SCALE_TILE);
			}
		}
		
		batch.draw(texturePlayer, player.getX()*Setting.SCALE_TILE, 
				player.getY()*Setting.SCALE_TILE, 
				Setting.SCALE_TILE, 
				1.5f*Setting.SCALE_TILE);
		//multiply 16 because is one movement of texture is move 16 pixel animation
		
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		Gdx.input.setInputProcessor(this.controller);
		
	}

	
	
}
