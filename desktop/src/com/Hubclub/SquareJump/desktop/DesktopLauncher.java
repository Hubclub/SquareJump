package com.Hubclub.SquareJump.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.Hubclub.SquareJump.SquareJumpGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "SquareJump";
        config.height = 800;
        config.width = 400;
		new LwjglApplication(new SquareJumpGame(), config);
	}
}
