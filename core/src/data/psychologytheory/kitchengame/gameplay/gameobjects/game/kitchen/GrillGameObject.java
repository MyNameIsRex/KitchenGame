package data.psychologytheory.kitchengame.gameplay.gameobjects.game.kitchen;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.shaders.DefaultShader;
import data.psychologytheory.kitchengame.KitchenGame;
import data.psychologytheory.kitchengame.engine.io.MouseInput;
import data.psychologytheory.kitchengame.engine.utils.RenderUtil;

import java.util.Objects;

public class GrillGameObject extends AbstractKitchenGameObject {
    private boolean isGrillOn = false;

    public GrillGameObject(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, Texture[] textures, int zIndex, boolean canMove, boolean canInteract) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, textures, zIndex, canMove, canInteract);
    }

    @Override
    public void render() {
        if (isGrillOn) {
            RenderUtil.getInstance().renderTexture(this.getTextures()[1], (int) this.getObjPosX(), (int) this.getObjPosY());
        } else {
            RenderUtil.getInstance().renderTexture(this.getTextures()[0], (int) this.getObjPosX(), (int) this.getObjPosY());
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
