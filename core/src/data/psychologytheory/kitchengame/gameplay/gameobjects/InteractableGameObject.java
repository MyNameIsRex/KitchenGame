package data.psychologytheory.kitchengame.gameplay.gameobjects;

import com.badlogic.gdx.graphics.Texture;

public class InteractableGameObject extends MultiTextureGameObject {
    public InteractableGameObject(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, Texture[] textures, int zIndex, boolean canMove, boolean canInteract) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, textures, zIndex, canMove, canInteract);
    }

    public void runInteraction() {

    }

    @Override
    public void update() {
        this.runInteraction();
        super.update();
    }
}
