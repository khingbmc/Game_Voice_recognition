package com.vajajava.entity;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public abstract class Entity {
	protected String id; //id of player
	
	protected boolean dead = false; //player die?
	protected int hp, maxHp;
	
	protected int prevHp;//for remem hp between attacking
	
	protected int damage = 0, heal = 0;//track for event in dialog
	
	protected int minDamage, maxDamage; //range of damage
	
	protected int level; //information of level player
	
	protected int prevMove = -1, move = -1;//move type (-1, 0, 1, 2, 3)
	
	protected Vector2 position;//postion in map (tile * tilesize) this obj
	//is encapsulate vector value
	//constructor
	public Entity(String id) {
		this.id = id;
		
		position = new Vector2();
	}
	
	public Entity(String id, Vector2 position) {
		this(id);
		this.position = position;
	}
	
	public void update(float dt) {
		if(this.hp > this.maxHp) this.hp = this.maxHp;
		if(this.hp <= 0) {
			this.hp = 0;
		}
	}
	
	public void render(SpriteBatch batch, boolean loop) {
		//batch.draw(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

}
