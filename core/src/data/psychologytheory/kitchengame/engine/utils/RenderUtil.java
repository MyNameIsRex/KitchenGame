package data.psychologytheory.kitchengame.engine.utils;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import data.psychologytheory.kitchengame.gameplay.gameobjects.AbstractGameObject;
import data.psychologytheory.kitchengame.gameplay.init.AssetInit;

public class RenderUtil {
    public static RenderUtil instance;
    public void startRendering() {
        AssetInit.getSpriteBatch().begin();
    }

    public void renderTexture(AbstractGameObject gameObject) {
        AssetInit.getSpriteBatch().draw(gameObject.getTexture(), gameObject.getObjPosX(), gameObject.getObjPosY());
    }

    public void renderTexture(Texture texture, int x, int y) {
        AssetInit.getSpriteBatch().draw(texture, x, y);
    }

    public void renderTexture(Texture texture, int x, int y, int width, int height) {
        AssetInit.getSpriteBatch().draw(texture, x, y, width, height);
    }

    public void renderPartialTexture(TextureRegion textureRegion, int x, int y) {
        AssetInit.getSpriteBatch().draw(textureRegion, x, y);
    }

    public void renderPartialTexture(TextureRegion textureRegion, int x, int y, int width, int height) {
        AssetInit.getSpriteBatch().draw(textureRegion, x, y, width, height);
    }

    public void renderText(CharSequence text, BitmapFont font, int x, int y) {
        font.draw(AssetInit.getSpriteBatch(), text, x, y);
    }

    public void endRendering() {
        AssetInit.getSpriteBatch().end();
    }

    public static float moveToCenter(int windowSize, int objSize) {
        return (float)windowSize / 2 - (float)objSize / 2;
    }

    public static RenderUtil getInstance() {
        if (instance == null) {
           instance = new RenderUtil();
        }
        return instance;
    }
}
