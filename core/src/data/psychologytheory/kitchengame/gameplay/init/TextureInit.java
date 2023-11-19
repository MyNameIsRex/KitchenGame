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
    }

    @Override
    public void loadContents() {
        TEXTURE_MAP.put(TextureList.KITCHEN_BACKGROUND.getTextureID(), TextureList.KITCHEN_BACKGROUND.getTexture());
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
