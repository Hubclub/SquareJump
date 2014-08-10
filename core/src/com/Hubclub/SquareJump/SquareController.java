package com.Hubclub.SquareJump;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by alexandru on 09.08.2014.
 */
public class SquareController {

    //constants
    public static final float GRAVITY = -0.1f;
    public static final float ACCELERATION = 20f;
    public static final float MAX_JUMP_SPEED   = 7f;

    private Square.State state = Square.State.GROUNDED;

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

        if(state == Square.State.GROUNDED) { //lets say that first jump is to left
            square.position.add(new Vector2(-1f, 0f)); // left side force
            square.facingLeft = false;
            state = Square.State.JUMPING;
        } else {
            //the state must be jumping
            if (square.facingLeft == true) {
                square.position.add(new Vector2(-2f, 0f)); // left side force
                square.facingLeft = false;
            } else {
                square.position.add(new Vector2(2f, 0f));
                square.facingLeft = true;
            }
        }
        //square.state = Square.State.JUMPING;
        square.position.add(new Vector2(0f, 3f)); //jump vertically
    }
}
