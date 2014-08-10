package com.Hubclub.SquareJump;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

/**
 * Created by alexandru on 09.08.2014.
 */
public class GameScreen implements Screen, InputProcessor{

    private World world;
    private WorldRenderer renderer;
    private SquareController controller;

    @Override
    public void show() {

        world = new World();
        renderer = new WorldRenderer(world, true);
        controller = new SquareController(world);
        Gdx.input.setInputProcessor(this);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        controller.update(delta);
        renderer.render();
    }

    @Override
    public void resize(int width, int height) {
        //renderer.setSize(width, height);
        //this.width = width;
       // this.height = height;
    }

    //the actual input
    @Override
    public boolean touchDown(int x, int y, int pointer, int button) {
        controller.jumpPressed();

        return true;
    }


    @Override
    public void hide() {
        Gdx.input.setInputProcessor(null);
    }
    @Override
    public void pause() {
// TODO Auto-generated method stub
    }
    @Override
    public void resume() {
// TODO Auto-generated method stub
    }
    @Override
    public void dispose() {
        Gdx.input.setInputProcessor(null);
    }

    //TODO INPUT

    @Override
    public boolean touchDragged(int x, int y, int pointer) {
// TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
// TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean mouseMoved(int x, int y) {
        return false;
    }



    @Override
    public boolean touchUp(int x, int y, int pointer, int button) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }
    @Override
    public boolean keyTyped(char character) {
// TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean keyDown(int keycode) {
        return true;
    }

}
