package data.psychologytheory.kitchengame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import data.psychologytheory.kitchengame.gameplay.scenes.SceneUtil;

public class KitchenGame extends ApplicationAdapter
{
	public static int currentWidth, currentHeight;
	public static final int WIDTH = 1280, HEIGHT = 720;
	private SpriteBatch spriteBatch;

	@Override
	public void create ()
	{
		currentWidth = WIDTH;
		currentHeight = HEIGHT;

		this.spriteBatch = new SpriteBatch();
		SceneUtil.createScenes();
	}

	@Override
	public void resize(int width, int height)
	{
		super.resize(width, height);
		currentWidth = width;
		currentHeight = height;
	}

	@Override
	public void render ()
	{
		SceneUtil.updateCurrentScene(Gdx.graphics.getDeltaTime());
		this.spriteBatch.begin();

		//Render here
		SceneUtil.renderCurrentScene(this.spriteBatch);
		this.spriteBatch.end();
	}

	@Override
	public void dispose ()
	{
		this.spriteBatch.dispose();
	}
}
