package data.psychologytheory.kitchengame.gameplay.characters;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import data.psychologytheory.kitchengame.engine.animation.Animation;
import data.psychologytheory.kitchengame.engine.io.KeyboardInput;
import data.psychologytheory.kitchengame.engine.utils.AnimationUtil;
import data.psychologytheory.kitchengame.engine.utils.RenderUtil;
import data.psychologytheory.kitchengame.gameplay.characters.goals.AbstractCharacterGoals;
import data.psychologytheory.kitchengame.gameplay.characters.goals.movetotarget.MoveToTargetGoal;
import data.psychologytheory.kitchengame.gameplay.init.GameObjectInit;
import data.psychologytheory.kitchengame.gameplay.lists.GameObjectList;

public class ChefCharacter extends AbstractCharacter {
    public ChefCharacter(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, Texture texture, TextureRegion[] partialTextures, int zIndex, float velocityX, float velocityY, Animation[] animations) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, texture, partialTextures, zIndex, velocityX, velocityY, animations);
    }

    @Override
    public void update() {
        if (this.getCharacterGoals()[0] instanceof MoveToTargetGoal && !this.getCharacterGoals()[0].isInProgress()) {
            ((MoveToTargetGoal) this.getCharacterGoals()[0]).setTarget(GameObjectInit.GAME_OBJECT_MAP.get(GameObjectList.STOVE_APPETIZER.getGameObjectID()));
        }
        if (!this.getCharacterGoals()[0].isGoalSuccessful())
            this.getCharacterGoals()[0].executeGoal();
    }

    @Override
    public void render() {
        RenderUtil.getInstance().renderPartialTexture(this.getPartialTextures()[AnimationUtil.getInstance().getCurrentFrame(getAnimations()[0])],
                (int) this.getObjPosX(), (int) this.getObjPosY());
    }
}
