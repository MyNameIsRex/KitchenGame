package data.psychologytheory.kitchengame.gameplay.init;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import data.psychologytheory.kitchengame.gameplay.lists.TextureList;
import data.psychologytheory.kitchengame.engine.interfaces.IContent;

import java.util.HashMap;
import java.util.Map;

public class TextureInit implements IContent {
    public static final Map<Integer, Texture> TEXTURE_MAP = new HashMap<>();
    public static SpriteBatch spriteBatch;

    @Override
    public void createContents() {
        getSpriteBatch();
        TextureList.KITCHEN_BACKGROUND.setTexture(new Texture(Gdx.files.internal(TextureList.KITCHEN_BACKGROUND.getTextureLocation())));

        TextureList.KITCHEN_TABLE_TOP.setTexture(new Texture(Gdx.files.internal(TextureList.KITCHEN_TABLE_TOP.getTextureLocation())));
        TextureList.KITCHEN_TABLE_TOP_LARGE.setTexture(new Texture(Gdx.files.internal(TextureList.KITCHEN_TABLE_TOP_LARGE.getTextureLocation())));

        TextureList.KITCHEN_FRIDGE_DOOR_CLOSED.setTexture(new Texture(Gdx.files.internal(TextureList.KITCHEN_FRIDGE_DOOR_CLOSED.getTextureLocation())));
        TextureList.KITCHEN_FRIDGE_DOOR_OPENED.setTexture(new Texture(Gdx.files.internal(TextureList.KITCHEN_FRIDGE_DOOR_OPENED.getTextureLocation())));
        TextureList.KITCHEN_FRIDGE_EMPTY.setTexture(new Texture(Gdx.files.internal(TextureList.KITCHEN_FRIDGE_EMPTY.getTextureLocation())));
        TextureList.KITCHEN_FRIDGE_FULL.setTexture(new Texture(Gdx.files.internal(TextureList.KITCHEN_FRIDGE_FULL.getTextureLocation())));

        TextureList.KITCHEN_GRILL_OFF.setTexture(new Texture(Gdx.files.internal(TextureList.KITCHEN_GRILL_OFF.getTextureLocation())));
        TextureList.KITCHEN_GRILL_ON.setTexture(new Texture(Gdx.files.internal(TextureList.KITCHEN_GRILL_ON.getTextureLocation())));

        TextureList.KITCHEN_HOT_PLATE.setTexture(new Texture(Gdx.files.internal(TextureList.KITCHEN_HOT_PLATE.getTextureLocation())));

        TextureList.KITCHEN_OVEN_DOOR_CLOSED.setTexture(new Texture(Gdx.files.internal(TextureList.KITCHEN_OVEN_DOOR_CLOSED.getTextureLocation())));
        TextureList.KITCHEN_OVEN_DOOR_OPENED.setTexture(new Texture(Gdx.files.internal(TextureList.KITCHEN_OVEN_DOOR_OPENED.getTextureLocation())));
        TextureList.KITCHEN_OVEN_OFF.setTexture(new Texture(Gdx.files.internal(TextureList.KITCHEN_OVEN_OFF.getTextureLocation())));
        TextureList.KITCHEN_OVEN_ON.setTexture(new Texture(Gdx.files.internal(TextureList.KITCHEN_OVEN_ON.getTextureLocation())));

        TextureList.KITCHEN_SINK_EMPTY.setTexture(new Texture(Gdx.files.internal(TextureList.KITCHEN_SINK_EMPTY.getTextureLocation())));
        TextureList.KITCHEN_SINK_FULL.setTexture(new Texture(Gdx.files.internal(TextureList.KITCHEN_SINK_FULL.getTextureLocation())));

        TextureList.KITCHEN_STOVE_OFF.setTexture(new Texture(Gdx.files.internal(TextureList.KITCHEN_STOVE_OFF.getTextureLocation())));
        TextureList.KITCHEN_STOVE_ON.setTexture(new Texture(Gdx.files.internal(TextureList.KITCHEN_STOVE_ON.getTextureLocation())));

        TextureList.KITCHEN_CHEF.setTexture(new Texture(Gdx.files.internal(TextureList.KITCHEN_CHEF.getTextureLocation())));
        TextureList.KITCHEN_LINE_COOK.setTexture(new Texture(Gdx.files.internal(TextureList.KITCHEN_LINE_COOK.getTextureLocation())));
        TextureList.KITCHEN_SOUS_CHEF.setTexture(new Texture(Gdx.files.internal(TextureList.KITCHEN_SOUS_CHEF.getTextureLocation())));
    }

    @Override
    public void loadContents() {
        TEXTURE_MAP.put(TextureList.KITCHEN_BACKGROUND.getTextureID(), TextureList.KITCHEN_BACKGROUND.getTexture());

        TEXTURE_MAP.put(TextureList.KITCHEN_TABLE_TOP.getTextureID(), TextureList.KITCHEN_TABLE_TOP.getTexture());
        TEXTURE_MAP.put(TextureList.KITCHEN_TABLE_TOP_LARGE.getTextureID(), TextureList.KITCHEN_TABLE_TOP_LARGE.getTexture());

        TEXTURE_MAP.put(TextureList.KITCHEN_FRIDGE_DOOR_CLOSED.getTextureID(), TextureList.KITCHEN_FRIDGE_DOOR_CLOSED.getTexture());
        TEXTURE_MAP.put(TextureList.KITCHEN_FRIDGE_DOOR_OPENED.getTextureID(), TextureList.KITCHEN_FRIDGE_DOOR_OPENED.getTexture());
        TEXTURE_MAP.put(TextureList.KITCHEN_FRIDGE_EMPTY.getTextureID(), TextureList.KITCHEN_FRIDGE_EMPTY.getTexture());
        TEXTURE_MAP.put(TextureList.KITCHEN_FRIDGE_FULL.getTextureID(), TextureList.KITCHEN_FRIDGE_FULL.getTexture());

        TEXTURE_MAP.put(TextureList.KITCHEN_GRILL_OFF.getTextureID(), TextureList.KITCHEN_GRILL_OFF.getTexture());
        TEXTURE_MAP.put(TextureList.KITCHEN_GRILL_ON.getTextureID(), TextureList.KITCHEN_GRILL_ON.getTexture());

        TEXTURE_MAP.put(TextureList.KITCHEN_HOT_PLATE.getTextureID(), TextureList.KITCHEN_HOT_PLATE.getTexture());

        TEXTURE_MAP.put(TextureList.KITCHEN_OVEN_DOOR_CLOSED.getTextureID(), TextureList.KITCHEN_OVEN_DOOR_CLOSED.getTexture());
        TEXTURE_MAP.put(TextureList.KITCHEN_OVEN_DOOR_OPENED.getTextureID(), TextureList.KITCHEN_OVEN_DOOR_OPENED.getTexture());
        TEXTURE_MAP.put(TextureList.KITCHEN_OVEN_OFF.getTextureID(), TextureList.KITCHEN_OVEN_OFF.getTexture());
        TEXTURE_MAP.put(TextureList.KITCHEN_OVEN_ON.getTextureID(), TextureList.KITCHEN_OVEN_ON.getTexture());

        TEXTURE_MAP.put(TextureList.KITCHEN_SINK_EMPTY.getTextureID(), TextureList.KITCHEN_SINK_EMPTY.getTexture());
        TEXTURE_MAP.put(TextureList.KITCHEN_SINK_FULL.getTextureID(), TextureList.KITCHEN_SINK_FULL.getTexture());

        TEXTURE_MAP.put(TextureList.KITCHEN_STOVE_OFF.getTextureID(), TextureList.KITCHEN_STOVE_OFF.getTexture());
        TEXTURE_MAP.put(TextureList.KITCHEN_STOVE_ON.getTextureID(), TextureList.KITCHEN_STOVE_ON.getTexture());

        TEXTURE_MAP.put(TextureList.KITCHEN_CHEF.getTextureID(), TextureList.KITCHEN_CHEF.getTexture());
        TEXTURE_MAP.put(TextureList.KITCHEN_LINE_COOK.getTextureID(), TextureList.KITCHEN_LINE_COOK.getTexture());
        TEXTURE_MAP.put(TextureList.KITCHEN_SOUS_CHEF.getTextureID(), TextureList.KITCHEN_SOUS_CHEF.getTexture());
    }
    @Override
    public void disposeContents() {
        for (Texture texture : TEXTURE_MAP.values()) {
            texture.dispose();
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
