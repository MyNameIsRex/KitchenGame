package data.psychologytheory.kitchengame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.utils.ScreenUtils;
import data.psychologytheory.kitchengame.engine.io.KeyboardInput;
import data.psychologytheory.kitchengame.gameplay.init.GameObjectInit;
import data.psychologytheory.kitchengame.gameplay.lists.GameObjectList;
import data.psychologytheory.kitchengame.gameplay.init.GameContentInitializer;
import data.psychologytheory.kitchengame.engine.rendering.RenderHelper;

public class KitchenGame extends ApplicationAdapter {
	private GameContentInitializer gameContentInitializer;
	private GameObjectInit gameObjectInit;
	public static int currentWidth, currentHeight;
	public static final int WIDTH = 1280, HEIGHT = 768;

	@Override
	public void create () {
		currentWidth = WIDTH;
		currentHeight = HEIGHT;
		this.gameContentInitializer = new GameContentInitializer();
		this.gameObjectInit = new GameObjectInit();
		this.gameContentInitializer.createContents();
		this.gameContentInitializer.loadContents();
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
		currentWidth = width;
		currentHeight = height;
	}

	@Override
	public void render () {
		gameObjectInit.updateGameObjects();

		ScreenUtils.clear(0, 0, 0, 1);
		RenderHelper.getInstance().startRendering();
		RenderHelper.getInstance().renderTextures();
		RenderHelper.getInstance().endRendering();

		if (KeyboardInput.isKeyPressed(Input.Keys.ESCAPE)) {
			Gdx.app.exit();
		}
	}

	@Override
	public void dispose () {
		this.gameContentInitializer.disposeContents();
	}
}
