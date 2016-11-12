package com.kokso.game;

import com.badlogic.gdx.graphics.Texture;

public class Entity{

    private Texture image;
    private int height;
    private int width;

    public Entity(Texture image){
        this.image = image;
        this.height = image.getHeight();
        this.width = image.getWidth();
    }

    public void dispose(){
        image.dispose();
    }

    public Texture getImage() {
        return image;
    }

    public int width(){
        return this.width;
    }

    public int height(){
        return this.height;
    }
}
