package data.psychologytheory.kitchengame.gameplay.gameobjects.game;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import data.psychologytheory.kitchengame.engine.io.MouseInput;
import data.psychologytheory.kitchengame.engine.rendering.RenderHelper;
import data.psychologytheory.kitchengame.gameplay.gameobjects.InteractableGameObject;
import data.psychologytheory.kitchengame.gameplay.lists.TextureList;

public class FridgeGameObject extends InteractableGameObject {
    private boolean isFridgeFull = false;
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
        this.isFridgeDoorOpen = MouseInput.getMousePosX() >= this.getObjPosX() && MouseInput.getMousePosX() <= this.getObjPosX() + this.getObjWidth() &&
                MouseInput.getMousePosY() <= this.getObjPosY() - 48 && MouseInput.getMousePosY() >= this.getObjPosY() - this.getObjHeight() - 16;

        if (this.isFridgeDoorOpen) {
            if (MouseInput.isMouseButtonPressed(Input.Buttons.LEFT)) {
                isFridgeFull = !isFridgeFull;
            }
        }
    }
}
