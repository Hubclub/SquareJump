package com.Hubclub.SquareJump;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by alexandru on 09.08.2014.
 */
public class WorldRenderer {

    private static final float CAMERA_WIDTH = 5f;
    private static final float CAMERA_HEIGHT = 8f;

    private World world;
    private OrthographicCamera camera;

    private boolean debug = false;

    //for debugging
    ShapeRenderer debugRenderer = new ShapeRenderer();


    public WorldRenderer(World world, boolean debug) {
        this.world = world;
        this.camera = new OrthographicCamera(CAMERA_WIDTH, CAMERA_HEIGHT);
        this.camera.position.set(CAMERA_WIDTH / 2f, CAMERA_HEIGHT / 2f, 0);
        this.camera.update();
        this.debug = debug;
        //TODO: Load textures and stuff
        //spriteBatch = new SpriteBatch();
        //loadTextures();
    }

    public void render() {
        drawDebug();
    }

    public void drawDebug() {
        debugRenderer.setProjectionMatrix(camera.combined);
        debugRenderer.begin(ShapeRenderer.ShapeType.Line);

        //draw blocks
        for (Block block : world.getBlocks()) {
            Rectangle rect = block.getBounds();
            float x1 = block.getPosition().x + rect.x;
            float y1 = block.getPosition().y + rect.y;
            debugRenderer.setColor(new Color(1, 0, 0, 1));
            debugRenderer.rect(x1, y1, rect.width, rect.height);
        }

        //draw square
        Square square = world.getSquare();
        Rectangle rect = square.getBounds();
        float x1 = square.getPosition().x + rect.x;
        float y1 = square.getPosition().y + rect.y;
        debugRenderer.setColor(new Color(0, 1, 0, 1));
        debugRenderer.rect(x1, y1, rect.width, rect.height);
        debugRenderer.end();
    }
}
