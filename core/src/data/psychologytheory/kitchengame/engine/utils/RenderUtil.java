package data.psychologytheory.kitchengame.engine.utils;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import data.psychologytheory.kitchengame.gameplay.gameobjects.AbstractGameObject;
import data.psychologytheory.kitchengame.gameplay.init.AssetInit;

public class RenderUtil {
    public static RenderUtil instance;

    public void renderTexture(AbstractGameObject gameObject) {
        AssetInit.getGlobalSpriteBatch().begin();
        AssetInit.getGlobalSpriteBatch().draw(gameObject.getTexture(), gameObject.getObjPosX(), gameObject.getObjPosY());
        AssetInit.getGlobalSpriteBatch().end();
    }

    public void renderTexture(Texture texture, int x, int y) {
        AssetInit.getGlobalSpriteBatch().begin();
        AssetInit.getGlobalSpriteBatch().draw(texture, x, y);
        AssetInit.getGlobalSpriteBatch().end();
    }

    public void renderTexture(Texture texture, int x, int y, int width, int height) {
        AssetInit.getGlobalSpriteBatch().begin();
        AssetInit.getGlobalSpriteBatch().draw(texture, x, y, width, height);
        AssetInit.getGlobalSpriteBatch().end();
    }

    public void renderPartialTexture(TextureRegion textureRegion, int x, int y) {
        AssetInit.getGlobalSpriteBatch().begin();
        AssetInit.getGlobalSpriteBatch().draw(textureRegion, x, y);
        AssetInit.getGlobalSpriteBatch().end();
    }

    public void renderPartialTexture(TextureRegion textureRegion, int x, int y, int width, int height) {
        AssetInit.getGlobalSpriteBatch().begin();
        AssetInit.getGlobalSpriteBatch().draw(textureRegion, x, y, width, height);
        AssetInit.getGlobalSpriteBatch().end();
    }

    public void renderText(CharSequence text, BitmapFont font, int x, int y) {
        AssetInit.getGlobalSpriteBatch().begin();
        font.draw(AssetInit.getGlobalSpriteBatch(), text, x, y);
        AssetInit.getGlobalSpriteBatch().end();
    }

    public void renderBorderedShape(int x, int y, int width, int height, Color color) {
        AssetInit.getGlobalShapeRenderer().begin(ShapeRenderer.ShapeType.Line);
        AssetInit.getGlobalShapeRenderer().setColor(color);
        AssetInit.getGlobalShapeRenderer().rect(x, y, width, height);
        AssetInit.getGlobalShapeRenderer().end();
    }

    public void renderFilledShape(int x, int y, int width, int height, Color color) {
        AssetInit.getGlobalShapeRenderer().begin(ShapeRenderer.ShapeType.Filled);
        AssetInit.getGlobalShapeRenderer().setColor(color);
        AssetInit.getGlobalShapeRenderer().rect(x, y, width, height);
        AssetInit.getGlobalShapeRenderer().end();
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
