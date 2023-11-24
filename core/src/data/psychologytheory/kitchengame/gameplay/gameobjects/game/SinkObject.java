package data.psychologytheory.kitchengame.gameplay.gameobjects.game;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import data.psychologytheory.kitchengame.engine.io.MouseInput;
import data.psychologytheory.kitchengame.engine.rendering.RenderHelper;
import data.psychologytheory.kitchengame.gameplay.gameobjects.InteractableGameObject;

public class SinkObject extends InteractableGameObject {
    private boolean isSinkFull = false;

    public SinkObject(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, Texture[] textures, int zIndex, boolean canMove, boolean canInteract) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, textures, zIndex, canMove, canInteract);
    }

    @Override
    public void render() {
        if (isSinkFull) {
            RenderHelper.getInstance().renderTexture(getTextures()[1], (int)this.getObjPosX(), (int)this.getObjPosY());
        } else {
            RenderHelper.getInstance().renderTexture(getTextures()[0], (int)this.getObjPosX(), (int)this.getObjPosY());
        }
    }

    @Override
    public void runInteraction() {
        if (MouseInput.getMousePosX() >= this.getObjPosX() && MouseInput.getMousePosX() <= this.getObjPosX() + this.getObjWidth() &&
            MouseInput.getMousePosY() >= this.getObjPosY() && MouseInput.getMousePosY() <= this.getObjPosY()) {
            if (MouseInput.isMouseButtonPressed(Input.Buttons.LEFT)) {
                this.isSinkFull = !this.isSinkFull;
            }
        } else {
            System.out.println("Mouse Y: " + MouseInput.getMousePosY());
        }
    }
}
