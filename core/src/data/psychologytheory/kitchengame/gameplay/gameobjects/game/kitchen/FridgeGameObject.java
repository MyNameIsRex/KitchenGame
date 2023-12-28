package data.psychologytheory.kitchengame.gameplay.gameobjects.game.kitchen;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import data.psychologytheory.kitchengame.KitchenGame;
import data.psychologytheory.kitchengame.engine.io.MouseInput;
import data.psychologytheory.kitchengame.engine.rendering.RenderHelper;
import data.psychologytheory.kitchengame.gameplay.gameobjects.InteractableGameObject;

public class FridgeGameObject extends InteractableGameObject {
    private boolean isFridgeFull = true;
    private boolean isFridgeDoorOpen = false;

    public FridgeGameObject(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, Texture[] textures, int zIndex, boolean canMove, boolean canInteract) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, textures, zIndex, canMove, canInteract);
    }

    @Override
    public void render() {
        if (isFridgeFull) {
            RenderHelper.getInstance().renderTexture(this.getTextures()[3], (int) this.getObjPosX(), (int) this.getObjPosY() + 16);
        } else {
            RenderHelper.getInstance().renderTexture(this.getTextures()[2], (int) this.getObjPosX(), (int) this.getObjPosY() + 16);
        }

        if (isFridgeDoorOpen) {
            RenderHelper.getInstance().renderTexture(this.getTextures()[1], (int) this.getObjPosX() - 6, (int) this.getObjPosY() + 2);
        } else {
            RenderHelper.getInstance().renderTexture(this.getTextures()[0], (int) this.getObjPosX(), (int) this.getObjPosY() + 2);
        }
    }

    @Override
    public void runInteraction() {
        this.isFridgeDoorOpen = MouseInput.getMousePosX() >= this.getObjPosX() * KitchenGame.currentRatio && MouseInput.getMousePosX() <= (this.getObjPosX() + this.getObjWidth())  * KitchenGame.currentRatio &&
                MouseInput.getMousePosY() <= (this.getObjPosY() + this.getObjHeight() - 16) * KitchenGame.currentRatio && MouseInput.getMousePosY() >= (this.getObjPosY() + 16) * KitchenGame.currentRatio;

        if (this.isFridgeDoorOpen) {
            if (MouseInput.isMouseButtonPressed(Input.Buttons.LEFT)) {
                isFridgeFull = !isFridgeFull;
            }

        }
    }
}
