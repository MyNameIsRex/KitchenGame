package data.psychologytheory.kitchengame.gameplay.gameobjects.game.kitchen;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import data.psychologytheory.kitchengame.KitchenGame;
import data.psychologytheory.kitchengame.engine.io.MouseInput;
import data.psychologytheory.kitchengame.engine.notification.Notification;
import data.psychologytheory.kitchengame.engine.utils.NotificationUtil;
import data.psychologytheory.kitchengame.engine.utils.RenderUtil;
import data.psychologytheory.kitchengame.gameplay.entities.LineCookEntity;

import java.util.Objects;

public class GrillGameObject extends AbstractKitchenGameObject {
    private boolean isGrillOn = false;
    private boolean renderSteak = false;
    private boolean shouldFlip = false;
    private LineCookEntity lineCookEntity;

    public GrillGameObject(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, Texture[] textures, int zIndex, boolean canMove, boolean canInteract) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, textures, zIndex, canMove, canInteract);
    }

    @Override
    public void update() {
        Notification outboundNotification;
        Notification inboundNotification;

        if (!this.isAttemptToReceiveNotification()) {
            return;
        }

        inboundNotification = NotificationUtil.getInstance().receiveNotification(this.getReceivedToken());
        if (Objects.equals(inboundNotification, null)) {
            return;
        }

        if (NotificationUtil.getInstance().isNotificationReceived(inboundNotification)) {
            if (!this.isGrillOn) {
                this.isGrillOn = true;
                this.renderSteak = true;
            } else if (this.renderSteak && !this.shouldFlip) {
                this.shouldFlip = true;
            } else {
                this.isGrillOn = false;
                this.renderSteak = false;
                this.shouldFlip = false;
            }
        }

        this.setAttemptToReceiveNotification(false);
    }

    @Override
    public void render() {
        if (!this.isGrillOn) {
            RenderUtil.getInstance().renderTexture(this.getTextures()[0], (int) this.getObjPosX(), (int) this.getObjPosY());
        } else {
            RenderUtil.getInstance().renderTexture(this.getTextures()[1], (int) this.getObjPosX(), (int) this.getObjPosY());
        }

        if (this.renderSteak) {
            if (this.shouldFlip) {
                RenderUtil.getInstance().renderPartialTexture(this.getDishes()[0].getDishPartialTextures()[1], (int) this.getObjPosX(), (int) this.getObjPosY() + 36);
                return;
            }
            RenderUtil.getInstance().renderPartialTexture(this.getDishes()[0].getDishPartialTextures()[0], (int) this.getObjPosX(), (int) this.getObjPosY() + 36);
        }
    }

    @Override
    public void runInteraction() {
        if ((MouseInput.getMousePosX() >= this.getObjPosX() * KitchenGame.currentRatioX &&
                MouseInput.getMousePosX() <= (this.getObjPosX() + this.getObjWidth()) * KitchenGame.currentRatioX &&
                MouseInput.getMousePosY() >= this.getObjPosY() * KitchenGame.currentRatioY &&
                MouseInput.getMousePosY() <= (this.getObjPosY() + this.getObjHeight()) * KitchenGame.currentRatioY) &&
                MouseInput.isMouseButtonPressed(Input.Buttons.LEFT)) {
            this.isGrillOn = !this.isGrillOn;
        }
    }
}
