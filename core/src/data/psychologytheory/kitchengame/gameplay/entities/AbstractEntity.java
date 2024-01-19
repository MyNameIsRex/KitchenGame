package data.psychologytheory.kitchengame.gameplay.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import data.psychologytheory.kitchengame.engine.animation.Animation;
import data.psychologytheory.kitchengame.gameplay.entities.goals.AbstractEntityGoals;
import data.psychologytheory.kitchengame.gameplay.gameobjects.AbstractGameObject;

public class AbstractEntity extends AbstractGameObject {
    private TextureRegion[] partialTextures;

    private float velocityX, velocityY;
    private Animation[] animations;
    private AbstractEntityGoals[] characterGoals;

    public AbstractEntity(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName,
                          Texture texture, TextureRegion[] partialTextures, int zIndex, float velocityX, float velocityY, Animation[] animations) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, texture, zIndex);
        this.partialTextures = partialTextures;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.animations = animations;
    }

    public float getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(float velocityX) {
        this.velocityX = velocityX;
    }

    public float getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(float velocityY) {
        this.velocityY = velocityY;
    }

    public Animation[] getAnimations() {
        return animations;
    }

    public void setAnimations(Animation[] animations) {
        this.animations = animations;
    }

    public AbstractEntityGoals[] getCharacterGoals() {
        return characterGoals;
    }

    public void setCharacterGoals(AbstractEntityGoals[] characterGoals) {
        this.characterGoals = characterGoals;
    }

    public TextureRegion[] getPartialTextures() {
        return partialTextures;
    }

    public void setPartialTextures(TextureRegion[] partialTextures) {
        this.partialTextures = partialTextures;
    }
}
