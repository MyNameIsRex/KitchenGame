package data.psychologytheory.kitchengame.gameplay.characters;

import com.badlogic.gdx.graphics.Texture;
import data.psychologytheory.kitchengame.engine.animation.Animation;
import data.psychologytheory.kitchengame.gameplay.characters.goals.AbstractCharacterGoals;
import data.psychologytheory.kitchengame.gameplay.gameobjects.AbstractGameObject;

public class AbstractCharacter extends AbstractGameObject {
    private float velocityX, velocityY;
    private Animation[] animations;
    private AbstractCharacterGoals[] characterGoals;

    public AbstractCharacter(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName,
                             Texture texture, int zIndex, float velocityX, float velocityY, Animation[] animations,
                             AbstractCharacterGoals[] characterGoals) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, texture, zIndex);
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.animations = animations;
        this.characterGoals = characterGoals;
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

    public AbstractCharacterGoals[] getCharacterGoals() {
        return characterGoals;
    }

    public void setCharacterGoals(AbstractCharacterGoals[] characterGoals) {
        this.characterGoals = characterGoals;
    }
}
