package engineTester;

import org.lwjgl.opengl.Display;

import renderEngine.DisplayManager;

public class MainGameLoop {

	public static void main(String[] args) {
		
		DisplayManager.createDisplay();
		
		while(!Display.isCloseRequested()) {
			//Game Logic
			//Render
			DisplayManager.updateDisplay();
		}
		
		DisplayManager.closeDisplay();
	}

}
