package data.psychologytheory.kitchengame.gameplay.init;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import data.psychologytheory.kitchengame.engine.interfaces.IContent;
import data.psychologytheory.kitchengame.gameplay.lists.AssetList;

import java.util.HashMap;
import java.util.Map;

public class AssetInit implements IContent {
    public static final Map<Integer, Texture> TEXTURE_MAP = new HashMap<>();
    public static final Map<Integer, BitmapFont> FONT_MAP = new HashMap<>();
    public static SpriteBatch spriteBatch;

    @Override
    public void createContents() {
        getSpriteBatch();
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
    }

    @Override
    public void loadContents() {
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
    }
    @Override
    public void disposeContents() {
        for (Texture texture : TEXTURE_MAP.values()) {
            texture.dispose();
        }
        
        for (BitmapFont font : FONT_MAP.values()) {
            font.dispose();
        }

        getSpriteBatch().dispose();
    }

    public static SpriteBatch getSpriteBatch() {
        if (spriteBatch == null) {
            spriteBatch = new SpriteBatch();
        }
        return spriteBatch;
    }
}
