package data.psychologytheory.kitchengame;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {

	public static final int WIDTH = 1280, HEIGHT = 720;
	public static final String VERSION = "v0.1.3.2_1";

	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setWindowedMode(WIDTH, HEIGHT);
		config.setTitle("Kitchen Game " + VERSION);
		config.setWindowIcon(Files.FileType.Internal, "textures/icon/icon.png");
		config.setResizable(true);
		new Lwjgl3Application(new KitchenGame(), config);
	}
}
