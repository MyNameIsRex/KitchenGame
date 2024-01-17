package data.psychologytheory.kitchengame.gameplay.characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import data.psychologytheory.kitchengame.engine.animation.Animation;
import data.psychologytheory.kitchengame.engine.utils.AnimationUtil;
import data.psychologytheory.kitchengame.engine.utils.RenderUtil;
import data.psychologytheory.kitchengame.gameplay.characters.goals.AbstractCharacterGoals;

public class ChefCharacter extends AbstractCharacter {
    public ChefCharacter(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, Texture texture, TextureRegion[] partialTextures, int zIndex, float velocityX, float velocityY, Animation[] animations) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, texture, partialTextures, zIndex, velocityX, velocityY, animations);
    }

    @Override
    public void update() {
        AnimationUtil.getInstance().playAnimation(getAnimations()[0], 12, 15);
    }

    @Override
    public void render() {
        RenderUtil.getInstance().renderPartialTexture(this.getPartialTextures()[AnimationUtil.getInstance().getCurrentFrame(getAnimations()[0])], 0, 0);
    }
}
