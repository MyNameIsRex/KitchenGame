package data.psychologytheory.kitchengame.gameplay.init;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import data.psychologytheory.kitchengame.engine.interfaces.IContent;
import data.psychologytheory.kitchengame.gameplay.lists.AssetList;

import java.util.HashMap;
import java.util.Map;

public class AssetInit implements IContent {
    public static final Map<Integer, Texture> TEXTURE_MAP = new HashMap<>();
    public static final Map<Integer, BitmapFont> FONT_MAP = new HashMap<>();
    public static SpriteBatch globalSpriteBatch;
    public static ShapeRenderer globalShapeRenderer;

    @Override
    public void createContents() {
        getGlobalSpriteBatch();

        //Gameplay
        AssetList.KITCHEN_BACKGROUND.setTexture(new Texture(Gdx.files.internal(AssetList.KITCHEN_BACKGROUND.getAssetLocation())));

        AssetList.KITCHEN_TABLE_TOP.setTexture(new Texture(Gdx.files.internal(AssetList.KITCHEN_TABLE_TOP.getAssetLocation())));
        AssetList.KITCHEN_TABLE_TOP_LARGE.setTexture(new Texture(Gdx.files.internal(AssetList.KITCHEN_TABLE_TOP_LARGE.getAssetLocation())));

        AssetList.KITCHEN_FRIDGE_DOOR_CLOSED.setTexture(new Texture(Gdx.files.internal(AssetList.KITCHEN_FRIDGE_DOOR_CLOSED.getAssetLocation())));
        AssetList.KITCHEN_FRIDGE_DOOR_OPENED.setTexture(new Texture(Gdx.files.internal(AssetList.KITCHEN_FRIDGE_DOOR_OPENED.getAssetLocation())));
        AssetList.KITCHEN_FRIDGE_EMPTY.setTexture(new Texture(Gdx.files.internal(AssetList.KITCHEN_FRIDGE_EMPTY.getAssetLocation())));
        AssetList.KITCHEN_FRIDGE_FULL.setTexture(new Texture(Gdx.files.internal(AssetList.KITCHEN_FRIDGE_FULL.getAssetLocation())));

        AssetList.KITCHEN_GRILL_OFF.setTexture(new Texture(Gdx.files.internal(AssetList.KITCHEN_GRILL_OFF.getAssetLocation())));
        AssetList.KITCHEN_GRILL_ON.setTexture(new Texture(Gdx.files.internal(AssetList.KITCHEN_GRILL_ON.getAssetLocation())));

        AssetList.KITCHEN_HOT_PLATE.setTexture(new Texture(Gdx.files.internal(AssetList.KITCHEN_HOT_PLATE.getAssetLocation())));

        AssetList.KITCHEN_OVEN_DOOR_CLOSED.setTexture(new Texture(Gdx.files.internal(AssetList.KITCHEN_OVEN_DOOR_CLOSED.getAssetLocation())));
        AssetList.KITCHEN_OVEN_DOOR_OPENED.setTexture(new Texture(Gdx.files.internal(AssetList.KITCHEN_OVEN_DOOR_OPENED.getAssetLocation())));
        AssetList.KITCHEN_OVEN_OFF.setTexture(new Texture(Gdx.files.internal(AssetList.KITCHEN_OVEN_OFF.getAssetLocation())));
        AssetList.KITCHEN_OVEN_ON.setTexture(new Texture(Gdx.files.internal(AssetList.KITCHEN_OVEN_ON.getAssetLocation())));

        AssetList.KITCHEN_SINK_EMPTY.setTexture(new Texture(Gdx.files.internal(AssetList.KITCHEN_SINK_EMPTY.getAssetLocation())));
        AssetList.KITCHEN_SINK_FULL.setTexture(new Texture(Gdx.files.internal(AssetList.KITCHEN_SINK_FULL.getAssetLocation())));

        AssetList.KITCHEN_STOVE_OFF.setTexture(new Texture(Gdx.files.internal(AssetList.KITCHEN_STOVE_OFF.getAssetLocation())));
        AssetList.KITCHEN_STOVE_ON.setTexture(new Texture(Gdx.files.internal(AssetList.KITCHEN_STOVE_ON.getAssetLocation())));

        AssetList.KITCHEN_CHEF.setTexture(new Texture(Gdx.files.internal(AssetList.KITCHEN_CHEF.getAssetLocation())));
        AssetList.KITCHEN_LINE_COOK.setTexture(new Texture(Gdx.files.internal(AssetList.KITCHEN_LINE_COOK.getAssetLocation())));
        AssetList.KITCHEN_SOUS_CHEF.setTexture(new Texture(Gdx.files.internal(AssetList.KITCHEN_SOUS_CHEF.getAssetLocation())));

        AssetList.TORTELLINI.setTexture(new Texture(Gdx.files.internal(AssetList.TORTELLINI.getAssetLocation())));
        AssetList.FRIES.setTexture(new Texture(Gdx.files.internal(AssetList.FRIES.getAssetLocation())));
        AssetList.STEAK.setTexture(new Texture(Gdx.files.internal(AssetList.STEAK.getAssetLocation())));
        AssetList.FISH.setTexture(new Texture(Gdx.files.internal(AssetList.FISH.getAssetLocation())));
        AssetList.ASPARAGUS.setTexture(new Texture(Gdx.files.internal(AssetList.ASPARAGUS.getAssetLocation())));
        AssetList.SPINACH.setTexture(new Texture(Gdx.files.internal(AssetList.SPINACH.getAssetLocation())));
        AssetList.SAUCE.setTexture(new Texture(Gdx.files.internal(AssetList.SAUCE.getAssetLocation())));
        AssetList.CARAMEL_PUDDING.setTexture(new Texture(Gdx.files.internal(AssetList.CARAMEL_PUDDING.getAssetLocation())));
        AssetList.ICE_CREAM.setTexture(new Texture(Gdx.files.internal(AssetList.ICE_CREAM.getAssetLocation())));

        //GUI
        AssetList.GUI_ICONS.setTexture(new Texture(Gdx.files.internal(AssetList.GUI_ICONS.getAssetLocation())));

        //Font
        AssetList.PRESS_START_2P.setBitmapFont(new FreeTypeFontGenerator(Gdx.files.internal(AssetList.PRESS_START_2P.getAssetLocation())),
                18, Color.WHITE);
        AssetList.ROBOTO_BLACK.setBitmapFont(new FreeTypeFontGenerator(Gdx.files.internal(AssetList.ROBOTO_BLACK.getAssetLocation())),
                36, Color.BLACK);
    }

    @Override
    public void loadContents() {
        //Gameplay
        TEXTURE_MAP.put(AssetList.KITCHEN_BACKGROUND.getAssetID(), AssetList.KITCHEN_BACKGROUND.getTexture());

        TEXTURE_MAP.put(AssetList.KITCHEN_TABLE_TOP.getAssetID(), AssetList.KITCHEN_TABLE_TOP.getTexture());
        TEXTURE_MAP.put(AssetList.KITCHEN_TABLE_TOP_LARGE.getAssetID(), AssetList.KITCHEN_TABLE_TOP_LARGE.getTexture());

        TEXTURE_MAP.put(AssetList.KITCHEN_FRIDGE_DOOR_CLOSED.getAssetID(), AssetList.KITCHEN_FRIDGE_DOOR_CLOSED.getTexture());
        TEXTURE_MAP.put(AssetList.KITCHEN_FRIDGE_DOOR_OPENED.getAssetID(), AssetList.KITCHEN_FRIDGE_DOOR_OPENED.getTexture());
        TEXTURE_MAP.put(AssetList.KITCHEN_FRIDGE_EMPTY.getAssetID(), AssetList.KITCHEN_FRIDGE_EMPTY.getTexture());
        TEXTURE_MAP.put(AssetList.KITCHEN_FRIDGE_FULL.getAssetID(), AssetList.KITCHEN_FRIDGE_FULL.getTexture());

        TEXTURE_MAP.put(AssetList.KITCHEN_GRILL_OFF.getAssetID(), AssetList.KITCHEN_GRILL_OFF.getTexture());
        TEXTURE_MAP.put(AssetList.KITCHEN_GRILL_ON.getAssetID(), AssetList.KITCHEN_GRILL_ON.getTexture());

        TEXTURE_MAP.put(AssetList.KITCHEN_HOT_PLATE.getAssetID(), AssetList.KITCHEN_HOT_PLATE.getTexture());

        TEXTURE_MAP.put(AssetList.KITCHEN_OVEN_DOOR_CLOSED.getAssetID(), AssetList.KITCHEN_OVEN_DOOR_CLOSED.getTexture());
        TEXTURE_MAP.put(AssetList.KITCHEN_OVEN_DOOR_OPENED.getAssetID(), AssetList.KITCHEN_OVEN_DOOR_OPENED.getTexture());
        TEXTURE_MAP.put(AssetList.KITCHEN_OVEN_OFF.getAssetID(), AssetList.KITCHEN_OVEN_OFF.getTexture());
        TEXTURE_MAP.put(AssetList.KITCHEN_OVEN_ON.getAssetID(), AssetList.KITCHEN_OVEN_ON.getTexture());

        TEXTURE_MAP.put(AssetList.KITCHEN_SINK_EMPTY.getAssetID(), AssetList.KITCHEN_SINK_EMPTY.getTexture());
        TEXTURE_MAP.put(AssetList.KITCHEN_SINK_FULL.getAssetID(), AssetList.KITCHEN_SINK_FULL.getTexture());

        TEXTURE_MAP.put(AssetList.KITCHEN_STOVE_OFF.getAssetID(), AssetList.KITCHEN_STOVE_OFF.getTexture());
        TEXTURE_MAP.put(AssetList.KITCHEN_STOVE_ON.getAssetID(), AssetList.KITCHEN_STOVE_ON.getTexture());

        TEXTURE_MAP.put(AssetList.KITCHEN_CHEF.getAssetID(), AssetList.KITCHEN_CHEF.getTexture());
        TEXTURE_MAP.put(AssetList.KITCHEN_LINE_COOK.getAssetID(), AssetList.KITCHEN_LINE_COOK.getTexture());
        TEXTURE_MAP.put(AssetList.KITCHEN_SOUS_CHEF.getAssetID(), AssetList.KITCHEN_SOUS_CHEF.getTexture());

        TEXTURE_MAP.put(AssetList.TORTELLINI.getAssetID(), AssetList.TORTELLINI.getTexture());
        TEXTURE_MAP.put(AssetList.FRIES.getAssetID(), AssetList.FRIES.getTexture());
        TEXTURE_MAP.put(AssetList.STEAK.getAssetID(), AssetList.STEAK.getTexture());
        TEXTURE_MAP.put(AssetList.FISH.getAssetID(), AssetList.FISH.getTexture());
        TEXTURE_MAP.put(AssetList.ASPARAGUS.getAssetID(), AssetList.ASPARAGUS.getTexture());
        TEXTURE_MAP.put(AssetList.SPINACH.getAssetID(), AssetList.SPINACH.getTexture());
        TEXTURE_MAP.put(AssetList.SAUCE.getAssetID(), AssetList.SAUCE.getTexture());
        TEXTURE_MAP.put(AssetList.CARAMEL_PUDDING.getAssetID(), AssetList.CARAMEL_PUDDING.getTexture());
        TEXTURE_MAP.put(AssetList.ICE_CREAM.getAssetID(), AssetList.ICE_CREAM.getTexture());

        //GUI
        TEXTURE_MAP.put(AssetList.GUI_ICONS.getAssetID(), AssetList.GUI_ICONS.getTexture());

        //Font
        FONT_MAP.put(AssetList.PRESS_START_2P.getAssetID(), AssetList.PRESS_START_2P.getBitmapFont());
        FONT_MAP.put(AssetList.ROBOTO_BLACK.getAssetID(), AssetList.ROBOTO_BLACK.getBitmapFont());
    }

    public void disposeContents() {
        for (Texture texture : TEXTURE_MAP.values()) {
            texture.dispose();
        }
        
        for (BitmapFont font : FONT_MAP.values()) {
            font.dispose();
        }

        getGlobalSpriteBatch().dispose();
    }

    public static SpriteBatch getGlobalSpriteBatch() {
        if (globalSpriteBatch == null) {
            globalSpriteBatch = new SpriteBatch();
        }
        return globalSpriteBatch;
    }

    public static ShapeRenderer getGlobalShapeRenderer() {
        if (globalShapeRenderer == null) {
            globalShapeRenderer = new ShapeRenderer();
        }
        return globalShapeRenderer;
    }
}
