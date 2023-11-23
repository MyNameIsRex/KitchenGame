package data.psychologytheory.kitchengame.gameplay.gameobjects.game;

import com.badlogic.gdx.graphics.Texture;
import data.psychologytheory.kitchengame.gameplay.gameobjects.InteractableGameObject;

public class FridgeGameObject extends InteractableGameObject {
    public FridgeGameObject(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, Texture[] textures, int zIndex, boolean canMove, boolean canInteract) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, textures, zIndex, canMove, canInteract);
    }

    @Override
    public void runInteraction() {
        super.runInteraction();
    }
}
