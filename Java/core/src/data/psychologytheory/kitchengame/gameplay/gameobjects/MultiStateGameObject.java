package data.psychologytheory.kitchengame.gameplay.gameobjects;

import com.badlogic.gdx.graphics.Texture;

public class MultiStateGameObject extends AbstractGameObject {
    private Texture currentTexture;
    private Texture[] textures;
    private boolean canMove;
    private boolean canInteract;

    public MultiStateGameObject(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, Texture[] textures, int zIndex, boolean canMove, boolean canInteract) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, textures[0], zIndex);
        this.currentTexture = textures[0];
        this.textures = textures;
        this.canMove = canMove;
        this.canInteract = canInteract;
    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public void render() {
        super.render();
    }

    public Texture getCurrentTexture() {
        return currentTexture;
    }

    public void setCurrentTexture(Texture initialTexture) {
        this.currentTexture = initialTexture;
    }

    public Texture[] getTextures() {
        return textures;
    }

    public void setTextures(Texture[] textures) {
        this.textures = textures;
    }

    public Texture getTextureFromIndex(int index) {
        return this.textures[index];
    }

    public void setTextureOnIndex(Texture textures, int index) {
        this.textures[index] = textures;
    }

    public boolean canMove() {
        return canMove;
    }

    public void setMobility(boolean canMove) {
        this.canMove = canMove;
    }

    public boolean canInteract() {
        return canInteract;
    }

    public void setInteractability(boolean canInteract) {
        this.canInteract = canInteract;
    }
}
