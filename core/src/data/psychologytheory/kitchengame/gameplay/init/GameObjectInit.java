package data.psychologytheory.kitchengame.gameplay.init;

import data.psychologytheory.kitchengame.KitchenGame;
import data.psychologytheory.kitchengame.engine.rendering.RenderHelper;
import data.psychologytheory.kitchengame.gameplay.lists.GameObjectList;
import data.psychologytheory.kitchengame.gameplay.lists.TextureList;
import data.psychologytheory.kitchengame.gameplay.gameobjects.AbstractGameObject;
import data.psychologytheory.kitchengame.gameplay.gameobjects.StationaryGameObject;
import data.psychologytheory.kitchengame.engine.interfaces.IContent;

import java.util.HashMap;
import java.util.Map;

public class GameObjectInit implements IContent {
    public static final Map<Integer, AbstractGameObject> GAME_OBJECT_MAP = new HashMap<>();

    @Override
    public void createContents() {
        GameObjectList.KITCHEN_BACKGROUND.setGameObjectInstance(new StationaryGameObject(0, 640, 384,
                RenderHelper.moveToCenter(KitchenGame.currentWidth, 640),
                RenderHelper.moveToCenter(KitchenGame.currentHeight, 384), "kitchen_background",
                TextureList.KITCHEN_BACKGROUND.getTexture(), 0, false));
    }

    @Override
    public void loadContents() {
        GAME_OBJECT_MAP.put(GameObjectList.KITCHEN_BACKGROUND.getGameObjectID(),
                GameObjectList.KITCHEN_BACKGROUND.getGameObjectInstance());
    }

    @Override
    public void disposeContents() {

    }
}
