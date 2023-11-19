package data.psychologytheory.kitchengame.gameplay.lists;

import com.badlogic.gdx.graphics.Texture;

public enum TextureList {
    KITCHEN_BACKGROUND(0, "textures/kitchen_background.png");

    private int textureID;
    private String textureLocation;

    private Texture texture;

    TextureList(int textureID, String textureLocation) {
        this.textureID = textureID;
        this.textureLocation = textureLocation;
    }

    public int getTextureID() {
        return this.textureID;
    }

    public void setTextureID(int textureID) {
        this.textureID = textureID;
    }

    public String getTextureLocation() {
        return this.textureLocation;
    }

    public void setTextureLocation(String textureLocation) {
        this.textureLocation = textureLocation;
    }

    public Texture getTexture() {
        return this.texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }
}
