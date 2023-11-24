package data.psychologytheory.kitchengame.gameplay.init;

import com.badlogic.gdx.graphics.Texture;
import data.psychologytheory.kitchengame.KitchenGame;
import data.psychologytheory.kitchengame.engine.rendering.RenderHelper;
import data.psychologytheory.kitchengame.gameplay.gameobjects.game.kitchen.*;
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
                new Texture[] {TextureList.KITCHEN_FRIDGE_DOOR_CLOSED.getTexture(), TextureList.KITCHEN_FRIDGE_DOOR_OPENED.getTexture(),
                TextureList.KITCHEN_FRIDGE_EMPTY.getTexture(), TextureList.KITCHEN_FRIDGE_FULL.getTexture()},
                1, false, true));
        GameObjectList.SINK_LEFT.setGameObjectInstance(new SinkGameObject(2, 64, 64,
                RenderHelper.moveToCenter(KitchenGame.currentWidth, 64) - 32,
                RenderHelper.moveToCenter(KitchenGame.currentHeight, 64) + 48, "kitchen_sink_left",
                new Texture[] {TextureList.KITCHEN_SINK_EMPTY.getTexture(), TextureList.KITCHEN_SINK_FULL.getTexture()},
                1, false, true));
        GameObjectList.STOVE_FISH.setGameObjectInstance(new StoveGameObject(3, 64, 64,
                RenderHelper.moveToCenter(KitchenGame.currentWidth, 64) + 32,
                RenderHelper.moveToCenter(KitchenGame.currentHeight, 64) + 64, "kitchen_stove_fish",
                new Texture[] {TextureList.KITCHEN_STOVE_OFF.getTexture(), TextureList.KITCHEN_STOVE_ON.getTexture()},
                1, false, true));
        GameObjectList.TABLE_TOP_CENTER.setGameObjectInstance(new StationaryGameObject(4, 32, 64,
                RenderHelper.moveToCenter(KitchenGame.currentWidth, 64) + 96,
                RenderHelper.moveToCenter(KitchenGame.currentHeight, 64) + 64, "kitchen_table_top_center",
                TextureList.KITCHEN_TABLE_TOP.getTexture(), 1, false));
        GameObjectList.GRILL.setGameObjectInstance(new GrillGameObject(5, 64, 64,
                RenderHelper.moveToCenter(KitchenGame.currentWidth, 64) + 128,
                RenderHelper.moveToCenter(KitchenGame.currentHeight, 64) + 64, "kitchen_grill",
                new Texture[] {TextureList.KITCHEN_GRILL_OFF.getTexture(), TextureList.KITCHEN_GRILL_ON.getTexture()},
                1, false, true));
        GameObjectList.TABLE_TOP_RIGHT.setGameObjectInstance(new StationaryGameObject(6, 64, 64,
                RenderHelper.moveToCenter(KitchenGame.currentWidth, 64) + 192,
                RenderHelper.moveToCenter(KitchenGame.currentHeight, 64) + 64, "kitchen_table_top_right",
                TextureList.KITCHEN_TABLE_TOP_LARGE.getTexture(), 1, false));
        GameObjectList.OVEN.setGameObjectInstance(new OvenGameObject(7, 64, 64,
                RenderHelper.moveToCenter(KitchenGame.currentWidth, 64) + 256,
                RenderHelper.moveToCenter(KitchenGame.currentHeight, 64) + 64, "kitchen_oven",
                new Texture[] {TextureList.KITCHEN_OVEN_DOOR_CLOSED.getTexture(), TextureList.KITCHEN_OVEN_DOOR_OPENED.getTexture(),
                TextureList.KITCHEN_OVEN_OFF.getTexture(), TextureList.KITCHEN_OVEN_ON.getTexture()},
                1, false, true));
    }

    @Override
    public void loadContents() {
        GAME_OBJECT_MAP.put(GameObjectList.KITCHEN_BACKGROUND.getGameObjectID(),
                GameObjectList.KITCHEN_BACKGROUND.getGameObjectInstance());
        GAME_OBJECT_MAP.put(GameObjectList.FRIDGE.getGameObjectID(),
                GameObjectList.FRIDGE.getGameObjectInstance());
        GAME_OBJECT_MAP.put(GameObjectList.SINK_LEFT.getGameObjectID(),
                GameObjectList.SINK_LEFT.getGameObjectInstance());
        GAME_OBJECT_MAP.put(GameObjectList.STOVE_FISH.getGameObjectID(),
                GameObjectList.STOVE_FISH.getGameObjectInstance());
        GAME_OBJECT_MAP.put(GameObjectList.TABLE_TOP_CENTER.getGameObjectID(),
                GameObjectList.TABLE_TOP_CENTER.getGameObjectInstance());
        GAME_OBJECT_MAP.put(GameObjectList.GRILL.getGameObjectID(),
                GameObjectList.GRILL.getGameObjectInstance());
        GAME_OBJECT_MAP.put(GameObjectList.TABLE_TOP_RIGHT.getGameObjectID(),
                GameObjectList.TABLE_TOP_RIGHT.getGameObjectInstance());
        GAME_OBJECT_MAP.put(GameObjectList.OVEN.getGameObjectID(),
                GameObjectList.OVEN.getGameObjectInstance());
    }

    public void updateGameObjects() {
        GAME_OBJECT_MAP.forEach((key, value) -> value.update());
    }

    @Override
    public void disposeContents() {

    }
}
