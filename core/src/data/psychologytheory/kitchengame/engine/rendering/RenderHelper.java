package data.psychologytheory.kitchengame.engine.rendering;

import data.psychologytheory.kitchengame.gameplay.gameobjects.AbstractGameObject;
import data.psychologytheory.kitchengame.gameplay.init.TextureInit;

public class RenderHelper {
    public void startRendering() {
        TextureInit.getSpriteBatch().begin();
    }

    public void renderTexture(AbstractGameObject gameObject) {
        TextureInit.getSpriteBatch().draw(gameObject.getTexture(), gameObject.getObjPosX(), gameObject.getObjPosY());
    }

    public void endRendering() {
        TextureInit.getSpriteBatch().end();
    }
}
