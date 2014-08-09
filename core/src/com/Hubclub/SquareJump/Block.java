package com.Hubclub.SquareJump;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by alexandru on 09.08.2014.
 */
public class Block {

    public static final float SIZE = 1.0f;


    Rectangle bounds = new Rectangle();
    Vector2 position = new Vector2();

    public Block(Vector2 pos) {
        this.position = pos;
        this.bounds.width = SIZE;
        this.bounds.height = SIZE;
    }

    //getters and setters
    public Vector2 getPosition() {
        return position;
    }
    public Rectangle getBounds() {
        return bounds;
    }
}
