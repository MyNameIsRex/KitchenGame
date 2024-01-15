package data.psychologytheory.kitchengame.gameplay.init;

import com.badlogic.gdx.graphics.Texture;
import data.psychologytheory.kitchengame.KitchenGame;
import data.psychologytheory.kitchengame.engine.utils.RenderUtil;
import data.psychologytheory.kitchengame.gameplay.dishes.AbstractDish;
import data.psychologytheory.kitchengame.gameplay.gameobjects.game.kitchen.*;
import data.psychologytheory.kitchengame.gameplay.lists.DishList;
import data.psychologytheory.kitchengame.gameplay.lists.GameObjectList;
import data.psychologytheory.kitchengame.gameplay.lists.AssetList;
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
                RenderUtil.moveToCenter(KitchenGame.currentWidth, 640),
                RenderUtil.moveToCenter(KitchenGame.currentHeight, 384), "kitchen_background",
                AssetList.KITCHEN_BACKGROUND.getTexture(), 0, false));

        GameObjectList.FRIDGE.setGameObjectInstance(new FridgeGameObject(1, 64, 128,
                RenderUtil.moveToCenter(KitchenGame.currentWidth, 64) - 96,
                RenderUtil.moveToCenter(KitchenGame.currentHeight, 128) + 80, "kitchen_fridge",
                new Texture[] {AssetList.KITCHEN_FRIDGE_DOOR_CLOSED.getTexture(), AssetList.KITCHEN_FRIDGE_DOOR_OPENED.getTexture(),
                AssetList.KITCHEN_FRIDGE_EMPTY.getTexture(), AssetList.KITCHEN_FRIDGE_FULL.getTexture()},
                1, false, true));
        GameObjectList.SINK_LEFT.setGameObjectInstance(new SinkGameObject(2, 64, 64,
                RenderUtil.moveToCenter(KitchenGame.currentWidth, 64) - 32,
                RenderUtil.moveToCenter(KitchenGame.currentHeight, 64) + 48, "kitchen_sink_left",
                new Texture[] {AssetList.KITCHEN_SINK_EMPTY.getTexture(), AssetList.KITCHEN_SINK_FULL.getTexture()},
                1, false, true));
        GameObjectList.STOVE_FISH.setGameObjectInstance(new StoveGameObject(3, 64, 64,
                RenderUtil.moveToCenter(KitchenGame.currentWidth, 64) + 32,
                RenderUtil.moveToCenter(KitchenGame.currentHeight, 64) + 64, "kitchen_stove_fish",
                new Texture[] {AssetList.KITCHEN_STOVE_OFF.getTexture(), AssetList.KITCHEN_STOVE_ON.getTexture()},
                1, false, true));
        //new AbstractDish[]{DishList.FISH.getDish()}
        GameObjectList.TABLE_TOP_CENTER.setGameObjectInstance(new StationaryGameObject(4, 32, 64,
                RenderUtil.moveToCenter(KitchenGame.currentWidth, 64) + 96,
                RenderUtil.moveToCenter(KitchenGame.currentHeight, 64) + 64, "kitchen_table_top_center",
                AssetList.KITCHEN_TABLE_TOP.getTexture(), 1, false));
        GameObjectList.GRILL.setGameObjectInstance(new GrillGameObject(5, 64, 64,
                RenderUtil.moveToCenter(KitchenGame.currentWidth, 64) + 128,
                RenderUtil.moveToCenter(KitchenGame.currentHeight, 64) + 64, "kitchen_grill",
                new Texture[] {AssetList.KITCHEN_GRILL_OFF.getTexture(), AssetList.KITCHEN_GRILL_ON.getTexture()},
                1, false, true));
        GameObjectList.TABLE_TOP_RIGHT.setGameObjectInstance(new StationaryGameObject(6, 64, 64,
                RenderUtil.moveToCenter(KitchenGame.currentWidth, 64) + 192,
                RenderUtil.moveToCenter(KitchenGame.currentHeight, 64) + 64, "kitchen_table_top_right",
                AssetList.KITCHEN_TABLE_TOP_LARGE.getTexture(), 1, false));
        GameObjectList.OVEN.setGameObjectInstance(new OvenGameObject(7, 64, 64,
                RenderUtil.moveToCenter(KitchenGame.currentWidth, 64) + 256,
                RenderUtil.moveToCenter(KitchenGame.currentHeight, 64) + 64, "kitchen_oven",
                new Texture[] {AssetList.KITCHEN_OVEN_DOOR_CLOSED.getTexture(), AssetList.KITCHEN_OVEN_DOOR_OPENED.getTexture(),
                AssetList.KITCHEN_OVEN_OFF.getTexture(), AssetList.KITCHEN_OVEN_ON.getTexture()},
                1, false, true));

        GameObjectList.TABLE_TOP_LEFT.setGameObjectInstance(new StationaryGameObject(8, 64, 64,
                RenderUtil.moveToCenter(KitchenGame.currentWidth, 64) - 96,
                RenderUtil.moveToCenter(KitchenGame.currentHeight, 64) - 64, "kitchen_table_top_left",
                AssetList.KITCHEN_TABLE_TOP_LARGE.getTexture(), 4, false));
        GameObjectList.STOVE_GARNISH.setGameObjectInstance(new StoveGameObject(9, 64, 64,
                RenderUtil.moveToCenter(KitchenGame.currentWidth, 64) - 32,
                RenderUtil.moveToCenter(KitchenGame.currentHeight, 64) - 64, "kitchen_stove_garnish",
                new Texture[] {AssetList.KITCHEN_STOVE_OFF.getTexture(), AssetList.KITCHEN_STOVE_ON.getTexture()},
                1, false, true));
        //new AbstractDish[]{DishList.ASPARAGUS.getDish(), DishList.SPINACH.getDish(), DishList.SAUCE.getDish()}
        GameObjectList.STOVE_APPETIZER.setGameObjectInstance(new StoveGameObject(10, 64, 64,
                RenderUtil.moveToCenter(KitchenGame.currentWidth, 64) + 32,
                RenderUtil.moveToCenter(KitchenGame.currentHeight, 64) - 64, "kitchen_stove_appetizer",
                new Texture[] {AssetList.KITCHEN_STOVE_OFF.getTexture(), AssetList.KITCHEN_STOVE_ON.getTexture()},
                1, false, true));
        GameObjectList.TABLE_TOP_CENTER_CENTER.setGameObjectInstance(new StationaryGameObject(11, 32, 64,
                RenderUtil.moveToCenter(KitchenGame.currentWidth, 64) + 96,
                RenderUtil.moveToCenter(KitchenGame.currentHeight, 64) - 64, "kitchen_table_top_center_center",
                AssetList.KITCHEN_TABLE_TOP.getTexture(), 4, false));
        GameObjectList.SINK_CENTER.setGameObjectInstance(new SinkGameObject(12, 64, 64,
                RenderUtil.moveToCenter(KitchenGame.currentWidth, 64) + 128,
                RenderUtil.moveToCenter(KitchenGame.currentHeight, 64) - 80, "kitchen_sink_center",
                new Texture[] {AssetList.KITCHEN_SINK_EMPTY.getTexture(), AssetList.KITCHEN_SINK_FULL.getTexture()},
                1, false, true));
        GameObjectList.TABLE_TOP_DESSERT.setGameObjectInstance(new StationaryGameObject(13, 64, 64,
                RenderUtil.moveToCenter(KitchenGame.currentWidth, 64) + 192,
                RenderUtil.moveToCenter(KitchenGame.currentHeight, 64) - 64, "kitchen_table_top_dessert",
                AssetList.KITCHEN_TABLE_TOP_LARGE.getTexture(), 4, false));

        GameObjectList.HOTPLATE.setGameObjectInstance(new StationaryGameObject(14, 416, 32,
                RenderUtil.moveToCenter(KitchenGame.currentWidth, 416) + 80,
                RenderUtil.moveToCenter(KitchenGame.currentHeight, 32) - 176, "kitchen_hot_plate",
                AssetList.KITCHEN_HOT_PLATE.getTexture(), 7, false));
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
        GAME_OBJECT_MAP.put(GameObjectList.TABLE_TOP_LEFT.getGameObjectID(),
                GameObjectList.TABLE_TOP_LEFT.getGameObjectInstance());
        GAME_OBJECT_MAP.put(GameObjectList.STOVE_GARNISH.getGameObjectID(),
                GameObjectList.STOVE_GARNISH.getGameObjectInstance());
        GAME_OBJECT_MAP.put(GameObjectList.STOVE_APPETIZER.getGameObjectID(),
                GameObjectList.STOVE_APPETIZER.getGameObjectInstance());
        GAME_OBJECT_MAP.put(GameObjectList.TABLE_TOP_CENTER_CENTER.getGameObjectID(),
                GameObjectList.TABLE_TOP_CENTER_CENTER.getGameObjectInstance());
        GAME_OBJECT_MAP.put(GameObjectList.SINK_CENTER.getGameObjectID(),
                GameObjectList.SINK_CENTER.getGameObjectInstance());
        GAME_OBJECT_MAP.put(GameObjectList.TABLE_TOP_DESSERT.getGameObjectID(),
                GameObjectList.TABLE_TOP_DESSERT.getGameObjectInstance());
        GAME_OBJECT_MAP.put(GameObjectList.HOTPLATE.getGameObjectID(),
                GameObjectList.HOTPLATE.getGameObjectInstance());

        for (AbstractGameObject gameObject : GAME_OBJECT_MAP.values()) {
            if (gameObject instanceof AbstractKitchenGameObject) {
                switch(gameObject.getObjName()) {
                    case "kitchen_stove_appetizer":
                        ((AbstractKitchenGameObject) gameObject).setDishes(new AbstractDish[]{DishList.TORTELLINI.getDish(), DishList.FRIES.getDish()});
                        break;
                    case "kitchen_grill":
                        ((AbstractKitchenGameObject) gameObject).setDishes(new AbstractDish[]{DishList.STEAK.getDish()});
                        break;
                    case "kitchen_stove_fish":
                        ((AbstractKitchenGameObject) gameObject).setDishes(new AbstractDish[]{DishList.FISH.getDish()});
                        break;
                }
            }
        }
    }

    @Override
    public void disposeContents() {

    }
}
