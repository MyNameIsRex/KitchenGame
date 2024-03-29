package data.psychologytheory.kitchengame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.utils.ScreenUtils;
import data.psychologytheory.kitchengame.engine.io.KeyboardInput;
import data.psychologytheory.kitchengame.gameplay.entities.goals.movetotarget.WaypointHelper;
import data.psychologytheory.kitchengame.gameplay.init.GameContentInitializer;
import data.psychologytheory.kitchengame.engine.utils.RenderUtil;
import data.psychologytheory.kitchengame.gameplay.scenes.SceneHelper;

public class KitchenGame extends ApplicationAdapter {
	private GameContentInitializer gameContentInitializer;
	public static int currentWidth, currentHeight;
	public static final int WIDTH = 1280, HEIGHT = 720;
	public static float currentRatioX = (float) currentWidth / WIDTH;
	public static float currentRatioY = (float) currentHeight / HEIGHT;
	private Graphics.DisplayMode currentDisplayMode;

	@Override
	public void create () {
		this.currentDisplayMode = Gdx.graphics.getDisplayMode();
		currentWidth = WIDTH;
		currentHeight = HEIGHT;
		this.gameContentInitializer = new GameContentInitializer();
		this.gameContentInitializer.createContents();
		this.gameContentInitializer.loadContents();
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
		currentWidth = width;
		currentHeight = height;
		currentRatioX = (float) currentWidth / WIDTH;
		currentRatioY = (float) currentHeight / HEIGHT;
		this.updateConstants();
	}

	@Override
	public void render () {
		float delta = Gdx.graphics.getDeltaTime();
		this.currentDisplayMode = Gdx.graphics.getDisplayMode();
		SceneHelper.getInstance().updateScene(SceneHelper.currentSceneID);
		ScreenUtils.clear(0, 0, 0, 1);
		SceneHelper.getInstance().renderScene(SceneHelper.currentSceneID);

		if (KeyboardInput.isKeyPressed(Input.Keys.ESCAPE)) {
			Gdx.app.exit();
		}

		if (KeyboardInput.isKeyJustReleased(Input.Keys.F11)) {
			if (Gdx.graphics.isFullscreen()) {
				Gdx.graphics.setWindowedMode(WIDTH, HEIGHT);
			} else {
				Gdx.graphics.setFullscreenMode(this.currentDisplayMode);
			}
		}
	}

	@Override
	public void dispose () {
		if (Gdx.graphics.isFullscreen()) {
			Gdx.graphics.setWindowedMode(WIDTH, HEIGHT);
		}
		this.gameContentInitializer.disposeContents();
	}

	private void updateConstants() {
		WaypointHelper.leftMostX = 448F * currentRatioX;
		WaypointHelper.rightMostX = 864F * currentRatioX;
		WaypointHelper.topMostY = 344F * currentRatioY;
		WaypointHelper.centerY = 232F * currentRatioY;
		WaypointHelper.bottomMostY = 200F * currentRatioY;
	}
}
