package data.psychologytheory.kitchengame.gameplay.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import data.psychologytheory.kitchengame.engine.animation.Animation;
import data.psychologytheory.kitchengame.engine.utils.AnimationUtil;
import data.psychologytheory.kitchengame.engine.utils.RenderUtil;
import data.psychologytheory.kitchengame.gameplay.dishes.AbstractDish;
import data.psychologytheory.kitchengame.gameplay.gameobjects.game.kitchen.AbstractKitchenGameObject;

public class LineCookEntity extends AbstractEntity {
    private final AbstractKitchenGameObject station;
    private final AbstractDish[] dishes;
    public LineCookEntity(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, Texture texture, TextureRegion[] partialTextures, int zIndex, float velocityX, float velocityY, Animation[] animations, AbstractKitchenGameObject assignedStation) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, texture, partialTextures, zIndex, velocityX, velocityY, animations);
        this.station = assignedStation;
        this.dishes = assignedStation.getDishes();
    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public void render() {
        RenderUtil.getInstance().renderPartialTexture(this.getPartialTextures()[AnimationUtil.getInstance().getCurrentFrame(getAnimations()[0])],
                (int) this.getObjPosX(), (int) this.getObjPosY());
    }
}
