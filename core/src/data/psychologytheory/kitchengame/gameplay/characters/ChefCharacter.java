package data.psychologytheory.kitchengame.gameplay.characters;

import com.badlogic.gdx.graphics.Texture;
import data.psychologytheory.kitchengame.engine.animation.Animation;
import data.psychologytheory.kitchengame.engine.utils.AnimationUtil;
import data.psychologytheory.kitchengame.engine.utils.RenderUtil;
import data.psychologytheory.kitchengame.gameplay.characters.goals.AbstractCharacterGoals;

public class ChefCharacter extends AbstractCharacter {
    private boolean runAnimation = true;
    public ChefCharacter(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, Texture texture, int zIndex, float velocityX, float velocityY, Animation[] animations, AbstractCharacterGoals[] characterGoals) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, texture, zIndex, velocityX, velocityY, animations, characterGoals);
    }

    @Override
    public void update() {
        AnimationUtil.getInstance().playAnimation(getAnimations()[0], 4);
    }

    @Override
    public void render() {
        RenderUtil.getInstance().renderPartialTexture(AnimationUtil.getInstance().getAnimationPartialFrame(getAnimations()[0]), 0, 0);
    }
}
