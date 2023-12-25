package data.psychologytheory.kitchengame.engine.rendering;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import data.psychologytheory.kitchengame.gameplay.gameobjects.AbstractGameObject;
import data.psychologytheory.kitchengame.gameplay.init.GameObjectInit;
import data.psychologytheory.kitchengame.gameplay.init.AssetInit;

public class RenderHelper {
    public static RenderHelper instance;
    public void startRendering() {
        AssetInit.getSpriteBatch().begin();
    }

    public void renderTexture(AbstractGameObject gameObject) {
        AssetInit.getSpriteBatch().draw(gameObject.getTexture(), gameObject.getObjPosX(), gameObject.getObjPosY());
    }

    public void renderText(CharSequence text, BitmapFont font, int x, int y) {
        font.draw(AssetInit.getSpriteBatch(), text, x, y);
    }

    public void renderLayers() {
        //0 ~ 7 Objects, 8 ~ 10 GUI
        for (int i = 0; i <= 10; i++) {
            int currentZIndex = i;
            if (currentZIndex < 8) {
                GameObjectInit.GAME_OBJECT_MAP.forEach((key, value) -> {
                    if (value.getZIndex() == currentZIndex) {
                        value.render();
                    }
                });
            }
            else {

            }
        }
    }

    public void renderTexture(Texture texture, int x, int y) {
        AssetInit.getSpriteBatch().draw(texture, x, y);
    }

    public void endRendering() {
        AssetInit.getSpriteBatch().end();
    }

    public static float moveToCenter(int windowSize, int objSize) {
        return (float)windowSize / 2 - (float)objSize / 2;
    }

    public static RenderHelper getInstance() {
        if (instance == null) {
           instance = new RenderHelper();
        }
        return instance;
    }
}
