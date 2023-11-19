package data.psychologytheory.kitchengame.gameplay.gameobjects;

import com.badlogic.gdx.graphics.Texture;

public class StationaryGameObject extends AbstractGameObject {
    private final boolean canMove;
    private boolean canInteract;

    public StationaryGameObject(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, Texture texture, int zIndex, boolean canInteract) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, texture, zIndex);
        this.canMove = false;
    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public void render() {
        super.render();
    }

    public boolean canMove() {
        return canMove;
    }

    public boolean canInteract() {
        return canInteract;
    }

    public void setInteractability(boolean canInteract) {
        this.canInteract = canInteract;
    }
}
