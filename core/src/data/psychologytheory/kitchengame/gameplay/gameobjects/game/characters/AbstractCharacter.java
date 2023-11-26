package data.psychologytheory.kitchengame.gameplay.gameobjects.game.characters;

import com.badlogic.gdx.graphics.Texture;
import data.psychologytheory.kitchengame.gameplay.gameobjects.AbstractGameObject;

public class AbstractCharacter extends AbstractGameObject {
    private int textureCount;
    private int currentTexture = 0;
    public AbstractCharacter(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, Texture texture, int textureCount, int zIndex) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, texture, zIndex);
        this.textureCount = textureCount;
    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public void render() {
        super.render();
    }

    public int getTextureCount() {
        return textureCount;
    }

    public void setTextureCount(int textureCount) {
        this.textureCount = textureCount;
    }

    public int getCurrentTexture() {
        return currentTexture;
    }

    public void setCurrentTexture(int currentTexture) {
        this.currentTexture = currentTexture;
    }
}
