package com.vajajava.game;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String args[]) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "VajaMan";
		cfg.width = 480;
		cfg.height = 320;
		
		cfg.vSyncEnabled = true;
		
		new LwjglApplication(new Vaja(), cfg);
	}
}
