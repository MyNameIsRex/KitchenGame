package data.psychologytheory.kitchengame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

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
		this.spriteBatch.begin();
		//Render here

		this.spriteBatch.end();
	}

	@Override
	public void dispose ()
	{

	}
}
