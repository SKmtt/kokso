package com.kokso.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.Color;
import com.kokso.game.Game;

import java.awt.*;
import java.util.Properties;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		config.width = (int)screensize.getWidth();
		config.height = (int)screensize.getHeight();
		config.fullscreen = true;
		new LwjglApplication(new Game(screensize), config);
	}
}
