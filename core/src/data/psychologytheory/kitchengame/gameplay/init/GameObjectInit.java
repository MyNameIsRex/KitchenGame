package data.psychologytheory.kitchengame.gameplay.init;

import com.badlogic.gdx.graphics.Texture;
import data.psychologytheory.kitchengame.KitchenGame;
import data.psychologytheory.kitchengame.engine.rendering.RenderHelper;
import data.psychologytheory.kitchengame.gameplay.gameobjects.game.FridgeGameObject;
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
        GameObjectList.FRIDGE.setGameObjectInstance(new FridgeGameObject(1, 64, 128,
                RenderHelper.moveToCenter(KitchenGame.currentWidth, 64) - 96,
                RenderHelper.moveToCenter(KitchenGame.currentHeight, 128) + 80, "kitchen_fridge",
                new Texture[]{TextureList.KITCHEN_FRIDGE_DOOR_CLOSED.getTexture(), TextureList.KITCHEN_FRIDGE_DOOR_OPENED.getTexture(),
                TextureList.KITCHEN_FRIDGE_EMPTY.getTexture(), TextureList.KITCHEN_FRIDGE_FULL.getTexture()},
                1, false, true));
    }

    @Override
    public void loadContents() {
        GAME_OBJECT_MAP.put(GameObjectList.KITCHEN_BACKGROUND.getGameObjectID(),
                GameObjectList.KITCHEN_BACKGROUND.getGameObjectInstance());
        GAME_OBJECT_MAP.put(GameObjectList.FRIDGE.getGameObjectID(),
                GameObjectList.FRIDGE.getGameObjectInstance());
    }

    public void updateGameObjects() {
        GAME_OBJECT_MAP.forEach((key, value) -> value.update());
    }

    @Override
    public void disposeContents() {

    }
}
