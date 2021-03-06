package com.gamedev.dotdev;

import com.esotericsoftware.minlog.Log;
import com.gamedev.dotdev.gui.GuiMainMenu;
import com.remote.remote2d.engine.Remote2D;
import com.remote.remote2d.engine.Remote2DGame;
import com.remote.remote2d.engine.art.Fonts;

public class DotDev extends Remote2DGame {
	
	public static void main(String args[])
	{
		Log.DEBUG();
		Remote2D.startRemote2D(new DotDev());
	}

	@Override
	public void initGame() {
		Fonts.add("Courier New", "res/fonts/courier.ttf", true);
		Remote2D.guiList.push(new GuiMainMenu());
	}
	
}
