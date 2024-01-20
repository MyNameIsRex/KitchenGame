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
import data.psychologytheory.kitchengame.gameplay.entities.goals.movetotarget.MoveToTargetGoal;
import data.psychologytheory.kitchengame.gameplay.gameobjects.AbstractGameObject;
import data.psychologytheory.kitchengame.gameplay.gameobjects.game.kitchen.AbstractKitchenGameObject;
import data.psychologytheory.kitchengame.gameplay.init.GameObjectInit;
import data.psychologytheory.kitchengame.gameplay.lists.GameObjectList;

public class LineCookEntity extends AbstractEntity {
    private final AbstractKitchenGameObject station;
    private final AbstractDish[] dishes;

    private boolean canMoveToFridge = false;
    private boolean moveToFridge = false;
    private boolean canMoveToStation = false;
    private boolean moveToStation = false;
    private boolean canStartCooking = false;
    private boolean cooking = false;
    private boolean shouldFlip = false;
    private boolean canMoveToHotplate = false;
    private boolean moveToHotplate = false;
    private int globalTime = 0;

    public LineCookEntity(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, Texture texture, TextureRegion[] partialTextures, int zIndex, float velocityX, float velocityY, Animation[] animations, AbstractKitchenGameObject assignedStation) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, texture, partialTextures, zIndex, velocityX, velocityY, animations);
        this.station = assignedStation;
        this.dishes = assignedStation.getDishes();
    }

    @Override
    public void update() {
        Notification outboundNotification;
        Notification inboundNotification;

        if (KeyboardInput.isKeyPressed(Input.Keys.C)) {
            this.setupTarget(GameObjectInit.GAME_OBJECT_MAP.get(GameObjectList.FRIDGE.getGameObjectID()));
            this.moveToFridge = true;
        }

        if (moveToFridge) {
            this.moveToFridge();
        }

        if (canMoveToStation) {
            this.setupTarget(this.station);
            this.moveToStation = true;
            this.canMoveToStation = false;
        }

        if (this.moveToStation) {
            this.moveToStation();
        }

        if (canMoveToHotplate) {
            this.setupTarget(GameObjectInit.GAME_OBJECT_MAP.get(GameObjectList.HOTPLATE.getGameObjectID()));
            this.moveToHotplate = true;
            this.canMoveToHotplate = false;
        }

        if (moveToHotplate) {
            this.moveToHotplate();
        }
    }

    @Override
    public void render() {
        RenderUtil.getInstance().renderPartialTexture(this.getPartialTextures()[AnimationUtil.getInstance().getCurrentFrame(getAnimations()[0])],
                (int) this.getObjPosX(), (int) this.getObjPosY());
    }

    private void setupTarget(AbstractGameObject target) {
        if (this.getCharacterGoals()[0] instanceof MoveToTargetGoal) {
            ((MoveToTargetGoal) this.getCharacterGoals()[0]).setupGoal(target);
        }
    }

    private void moveToFridge() {
        if (this.getCharacterGoals()[0].isGoalSuccessful()) {
            this.moveToFridge = false;
            this.canMoveToStation = true;
            this.getCharacterGoals()[0].resetGoal();
            return;
        }
        this.getCharacterGoals()[0].executeGoal();
    }

    private void moveToStation() {
        if (this.getCharacterGoals()[0].isGoalSuccessful()) {
            this.moveToStation = false;
            this.canMoveToHotplate = true;
            this.getCharacterGoals()[0].resetGoal();
            return;
        }
        this.getCharacterGoals()[0].executeGoal();
    }

    private void moveToHotplate() {
        if (this.getCharacterGoals()[0].isGoalSuccessful()) {
            this.moveToHotplate = false;
            this.getCharacterGoals()[0].resetGoal();
            return;
        }
        this.getCharacterGoals()[0].executeGoal();
    }
}
