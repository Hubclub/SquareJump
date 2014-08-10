package com.Hubclub.SquareJump;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

/**
 * Created by alexandru on 09.08.2014.
 */
public class World {

    Array<Block> blocks = new Array<Block>();
    Square square;

    public Array<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(Array<Block> blocks) {
        this.blocks = blocks;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    public World() {
        createWorld();
    }

    private void createWorld() {

        //square
        square = new Square(new Vector2(2f,1f));

        //floor's blocks
        for(int i = 0; i < WorldRenderer.CAMERA_WIDTH; i++)
            blocks.add(new Block(new Vector2(i,0)));

        //wall's blocks
        for(int i = 1; i < WorldRenderer.CAMERA_HEIGHT; i++) {
            blocks.add(new Block(new Vector2(0,i))); //left wall
            blocks.add(new Block(new Vector2(WorldRenderer.CAMERA_WIDTH - 1, i))); //right wall
        }


    }
}
