package data.psychologytheory.kitchengame.gameplay.gameobjects.game.kitchen;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import data.psychologytheory.kitchengame.KitchenGame;
import data.psychologytheory.kitchengame.engine.io.MouseInput;
import data.psychologytheory.kitchengame.engine.rendering.RenderHelper;
import data.psychologytheory.kitchengame.gameplay.dishes.AbstractDish;
import data.psychologytheory.kitchengame.gameplay.gameobjects.InteractableGameObject;

public class OvenGameObject extends AbstractKitchenGameObject {
    private boolean isOvenOn = false;
    private boolean isOvenDoorOpen = false;

    public OvenGameObject(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, Texture[] textures, int zIndex, boolean canMove, boolean canInteract) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, textures, zIndex, canMove, canInteract);
    }

    @Override
    public void render() {
        if (isOvenOn) {
            RenderHelper.getInstance().renderTexture(this.getTextures()[3], (int) this.getObjPosX(), (int) this.getObjPosY());
        } else {
            RenderHelper.getInstance().renderTexture(this.getTextures()[2], (int) this.getObjPosX(), (int) this.getObjPosY());
        }

        if (isOvenDoorOpen) {
            RenderHelper.getInstance().renderTexture(this.getTextures()[1], (int) this.getObjPosX() - 8, (int) this.getObjPosY() + 18);
        } else {
            RenderHelper.getInstance().renderTexture(this.getTextures()[0], (int) this.getObjPosX(), (int) this.getObjPosY() + 18);
        }
    }

    @Override
    public void runInteraction() {
        this.isOvenDoorOpen = MouseInput.getMousePosX() >= this.getObjPosX() * KitchenGame.currentRatio && MouseInput.getMousePosX() <= (this.getObjPosX() + this.getObjWidth()) * KitchenGame.currentRatio &&
                MouseInput.getMousePosY() <= (this.getObjPosY() + this.getObjHeight() + 32) * KitchenGame.currentRatio && MouseInput.getMousePosY() >= this.getObjPosY() * KitchenGame.currentRatio;

        if (this.isOvenDoorOpen) {
            if (MouseInput.isMouseButtonPressed(Input.Buttons.LEFT)) {
                isOvenOn = !isOvenOn;
            }
        }
    }
}
