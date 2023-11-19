package data.psychologytheory.kitchengame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.utils.ScreenUtils;
import data.psychologytheory.kitchengame.gameplay.lists.GameObjectList;
import data.psychologytheory.kitchengame.gameplay.init.GameContentInitializer;
import data.psychologytheory.kitchengame.engine.rendering.RenderHelper;

public class KitchenGame extends ApplicationAdapter {
	private GameContentInitializer gameContentInitializer;
	private RenderHelper renderHelper;
	
	@Override
	public void create () {
		this.gameContentInitializer = new GameContentInitializer();
		this.renderHelper = new RenderHelper();
		this.gameContentInitializer.createContents();
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		this.renderHelper.startRendering();
		this.renderHelper.renderTexture(GameObjectList.KITCHEN_BACKGROUND.getGameObjectInstance());
		this.renderHelper.endRendering();
	}
	
	@Override
	public void dispose () {
		this.gameContentInitializer.disposeContents();
	}
}
