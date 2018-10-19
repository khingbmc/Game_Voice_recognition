package com.vajajava.game.screen;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.vajajava.game.Vajaman;
import com.vajajava.player.Player;

public class GameScreen extends AbstractScreen{
	
	private Player player;
	
	private Texture character_texture;
	
	private SpriteBatch batch;
	
	
	public GameScreen(Vajaman app) {
		super(app);
		character_texture = new Texture("res/test.png");
		batch = new SpriteBatch();
		
		player = new Player(0, 0);
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
		batch.begin(); //before render anything is must begin the batch
		
		
		batch.draw(this.character_texture, player.getX()*16, player.getY()*16, 20, 27); //(texture, x, y, width, height)
		//one movement position is 16 pixel so we mutiply 16 to player position (x, y) 
		
		
		batch.end(); //render finish is must end the batch
		
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
		// TODO Auto-generated method stub
		
	}

}
