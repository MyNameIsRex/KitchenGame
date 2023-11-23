package data.psychologytheory.kitchengame.engine.rendering;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import data.psychologytheory.kitchengame.gameplay.gameobjects.AbstractGameObject;
import data.psychologytheory.kitchengame.gameplay.init.GameObjectInit;
import data.psychologytheory.kitchengame.gameplay.init.TextureInit;
import data.psychologytheory.kitchengame.gameplay.lists.GameObjectList;

public class RenderHelper {
    public static RenderHelper instance;
    public void startRendering() {
        TextureInit.getSpriteBatch().begin();
    }

    public void renderTexture(AbstractGameObject gameObject) {
        TextureInit.getSpriteBatch().draw(gameObject.getTexture(), gameObject.getObjPosX(), gameObject.getObjPosY());
    }

    public void renderTextures() {
        //0 ~ 7 Objects, 8 ~ 10 GUI
        for (int i = 0; i <= 10; i++) {
            int currentZIndex = i;
            GameObjectInit.GAME_OBJECT_MAP.forEach((key, value) -> {
                if (value.getZIndex() == currentZIndex) {
                    value.render();
                }
            });
        }
    }

    public void renderTexture(Texture texture, int x, int y) {
        TextureInit.getSpriteBatch().draw(texture, x, y);
    }

    public void endRendering() {
        TextureInit.getSpriteBatch().end();
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
