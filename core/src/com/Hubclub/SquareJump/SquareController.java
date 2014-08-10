package com.Hubclub.SquareJump;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by alexandru on 09.08.2014.
 */
public class SquareController {

    //constants
    public static final float GRAVITY = -20f;
    public static final float ACCELERATION = 20f;
    public static final float MAX_JUMP_SPEED   = 7f;

    World world;
    Square square;

    public SquareController(World world) {

        this.world = world;
        this.square = world.getSquare();
    }

    public void update(float delta) {
        square.update(delta);
    }

    //Todo INPUT
    public void jumpPressed() {
        square.position.add(new Vector2(0f, square.getPosition().y + 0.5f));
    }
}
