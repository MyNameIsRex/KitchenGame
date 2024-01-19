package data.psychologytheory.kitchengame.gameplay.entities;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import data.psychologytheory.kitchengame.engine.animation.Animation;
import data.psychologytheory.kitchengame.engine.io.KeyboardInput;
import data.psychologytheory.kitchengame.engine.utils.AnimationUtil;
import data.psychologytheory.kitchengame.engine.utils.RenderUtil;
import data.psychologytheory.kitchengame.gameplay.entities.goals.cooking.CookingGoal;

public class ChefEntity extends AbstractEntity {
    private int currentGoal = 0;
    public ChefEntity(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, Texture texture, TextureRegion[] partialTextures, int zIndex, float velocityX, float velocityY, Animation[] animations) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, texture, partialTextures, zIndex, velocityX, velocityY, animations);
    }

    @Override
    public void update() {
        if (KeyboardInput.isKeyPressed(Input.Keys.R)) {

        }
    }

    @Override
    public void render() {
        RenderUtil.getInstance().renderPartialTexture(this.getPartialTextures()[AnimationUtil.getInstance().getCurrentFrame(getAnimations()[0])],
                (int) this.getObjPosX(), (int) this.getObjPosY());
    }
}
