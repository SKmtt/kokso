package com.kokso.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.*;

public class Game extends ApplicationAdapter {
	SpriteBatch batch;
	Entity background;
	Entity clouds;
	Entity castle;
	Entity trees;
	Entity bigAssTrees;
	Entity road;
	Entity tower;
	Dimension screensize;
	int screenHeight, screenWidth; int i = 0;

	public Game(Dimension screensize){
		this.screensize = screensize;
		screenHeight = (int)(screensize.getHeight());
		screenWidth = (int)(screensize.getWidth());
	}
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		background = new Entity(new Texture("assets/test/1.png"));
		clouds = new Entity(new Texture("assets/test/2.png"), 50, 0);
		tower = new Entity(new Texture("assets/test/7.png"), 0, 0);
		castle = new Entity(new Texture("assets/test/6.png"), 0, 0);
		road = new Entity(new Texture("assets/test/5.png"), 0, 0);
		trees = new Entity(new Texture("assets/test/4.png"), 0, 0);
		bigAssTrees = new Entity(new Texture("assets/test/3.png"), 0, 0);

	}

	@Override
	public void render () {
		this.update();
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(background.getImage(), 690,180);
		batch.draw(clouds.getImage(), 690+clouds.getX(),180);
		batch.draw(tower.getImage(), 690,180);
		batch.draw(castle.getImage(), 690,180);
		batch.draw(trees.getImage(), 690,180);
		batch.draw(road.getImage(), 690,180);
		batch.draw(bigAssTrees.getImage(), 690-bigAssTrees.getX(),180-bigAssTrees.getY(), bigAssTrees.width()+ (bigAssTrees.getX()*2), bigAssTrees.height()+(bigAssTrees.getY()*2) );
		batch.end();
	}


	private void update(){
		clouds.setX(clouds.getX()-0.2f);
		bigAssTrees.setX(bigAssTrees.getX()+1);
		bigAssTrees.setY(bigAssTrees.getY()+1f);
	}

	@Override
	public void dispose () {
		batch.dispose();
		background.dispose();
	}
}
