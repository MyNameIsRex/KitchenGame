package data.psychologytheory.kitchengame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.utils.ScreenUtils;
import data.psychologytheory.kitchengame.gameplay.lists.GameObjectList;
import data.psychologytheory.kitchengame.gameplay.init.GameContentInitializer;
import data.psychologytheory.kitchengame.engine.rendering.RenderHelper;

public class KitchenGame extends ApplicationAdapter {
	private GameContentInitializer gameContentInitializer;
	
	@Override
	public void create () {
		this.gameContentInitializer = new GameContentInitializer();
		this.gameContentInitializer.createContents();
		this.gameContentInitializer.loadContents();
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		RenderHelper.getInstance().startRendering();
		RenderHelper.getInstance().renderTextures();
		RenderHelper.getInstance().endRendering();
	}
	
	@Override
	public void dispose () {
		this.gameContentInitializer.disposeContents();
	}
}
