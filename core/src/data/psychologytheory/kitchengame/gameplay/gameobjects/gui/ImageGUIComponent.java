package data.psychologytheory.kitchengame.gameplay.gameobjects.gui;

import com.badlogic.gdx.graphics.Texture;
import data.psychologytheory.kitchengame.engine.rendering.RenderHelper;

public class ImageGUIComponent extends AbstractGUIComponent {
    private Texture imageTexture;
    public ImageGUIComponent(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, int zIndex, Texture imageTexture) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, zIndex);
        this.imageTexture = imageTexture;
    }

    public Texture getImageTexture() {
        return imageTexture;
    }

    public void setImageTexture(Texture imageTexture) {
        this.imageTexture = imageTexture;
    }

    @Override
    public void render() {
        if (this.isDisplayGUIComponent()) {
            RenderHelper.getInstance().renderTexture(imageTexture, (int) this.getObjPosX(), (int) this.getObjPosY());
        }
    }
}
