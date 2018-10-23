package com.vajajava.screen;

import com.badlogic.gdx.Screen;
import com.vajajava.game.Vaja;

public abstract class AbstractScreen implements Screen{

	private Vaja app;
	
	public AbstractScreen(Vaja app) {
		this.app = app;
	}
	
	
	@Override
	public abstract void dispose();

	@Override
	public abstract void hide();

	@Override
	public abstract void pause();

	@Override
	public abstract void render(float arg0);

	@Override
	public abstract void resize(int arg0, int arg1);

	@Override
	public abstract void resume();

	@Override
	public abstract void show();

}
