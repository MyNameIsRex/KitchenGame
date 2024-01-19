package data.psychologytheory.kitchengame.gameplay.entities;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import data.psychologytheory.kitchengame.engine.animation.Animation;
import data.psychologytheory.kitchengame.engine.io.KeyboardInput;
import data.psychologytheory.kitchengame.engine.notification.Notification;
import data.psychologytheory.kitchengame.engine.utils.AnimationUtil;
import data.psychologytheory.kitchengame.engine.utils.NotificationUtil;
import data.psychologytheory.kitchengame.engine.utils.RenderUtil;
import data.psychologytheory.kitchengame.gameplay.dishes.AbstractDish;
import data.psychologytheory.kitchengame.gameplay.entities.goals.cooking.CookingGoal;
import data.psychologytheory.kitchengame.gameplay.gameobjects.game.kitchen.AbstractKitchenGameObject;

public class LineCookEntity extends AbstractEntity {
    private final AbstractKitchenGameObject station;
    private boolean startCooking = false;
    private final AbstractDish[] dishes;
    public LineCookEntity(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, Texture texture, TextureRegion[] partialTextures, int zIndex, float velocityX, float velocityY, Animation[] animations, AbstractKitchenGameObject assignedStation) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, texture, partialTextures, zIndex, velocityX, velocityY, animations);
        this.station = assignedStation;
        this.dishes = assignedStation.getDishes();
    }

    @Override
    public void update() {
        if (KeyboardInput.isKeyJustReleased(Input.Keys.C) && !this.getCharacterGoals()[1].isInProgress()) {
            Notification startCookingNotification = NotificationUtil.getInstance().createNotification(this.station);
            NotificationUtil.getInstance().sendNotification(startCookingNotification);
            NotificationUtil.getInstance().deliverToken(startCookingNotification, this.station.getObjName());
            this.startCooking = true;
        }

        if (!this.getCharacterGoals()[1].isGoalSuccessful() && this.startCooking) {
            this.getCharacterGoals()[1].executeGoal();
        }

        if (this.getCharacterGoals()[1].isGoalSuccessful()) {
            Notification stopCookingNotification = NotificationUtil.getInstance().createNotification(this.station);
            NotificationUtil.getInstance().sendNotification(stopCookingNotification);
            NotificationUtil.getInstance().deliverToken(stopCookingNotification, this.station.getObjName());
            this.startCooking = false;
        }
    }

    @Override
    public void render() {
        RenderUtil.getInstance().renderPartialTexture(this.getPartialTextures()[AnimationUtil.getInstance().getCurrentFrame(getAnimations()[0])],
                (int) this.getObjPosX(), (int) this.getObjPosY());
    }
}
