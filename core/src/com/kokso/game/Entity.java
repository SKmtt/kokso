package com.kokso.game;

import com.badlogic.gdx.graphics.Texture;

public class Entity{

    private Texture image;
    private int height;
    private int width;
    private float x, y;

    public Entity(Texture image){
        this.image = image;
        this.height = image.getHeight();
        this.width = image.getWidth();
    }

    public Entity(Texture image, float x, float y){
        this.image = image;
        this.height = image.getHeight();
        this.width = image.getWidth();
        this.x = x;
        this.y = y;
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

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
