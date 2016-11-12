package com.kokso.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.*;

public class Game extends ApplicationAdapter {
	SpriteBatch batch;
	Entity testLayer;
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
		testLayer = new Entity(new Texture("assets/badlogic.jpg"));

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(testLayer.getImage(), screenWidth-testLayer.width()-i++, screenHeight - testLayer.height());
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		testLayer.dispose();
	}
}
