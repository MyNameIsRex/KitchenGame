package data.psychologytheory.kitchengame.gameplay.gameobjects.gui.gameplay;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import data.psychologytheory.kitchengame.engine.interfaces.IClickListener;
import data.psychologytheory.kitchengame.engine.utils.RenderUtil;
import data.psychologytheory.kitchengame.gameplay.gameobjects.gui.CompoundButtonGUIComponent;

public class OptionsMenuButtonGUIComponent extends CompoundButtonGUIComponent {
    public OptionsMenuButtonGUIComponent(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, int zIndex, String buttonText, BitmapFont buttonFont, Texture[] buttonBackgrounds, int buttonTextOffsetX, int buttonTextOffsetY, IClickListener clickListener) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, zIndex, buttonText, buttonFont, buttonBackgrounds, buttonTextOffsetX, buttonTextOffsetY, clickListener);
    }

    @Override
    public void render() {
        if (this.isDisplayGUIComponent()) {
            RenderUtil.getInstance().renderTexture(this.getButtonBackgrounds()[0], (int) this.getObjPosX(), (int) this.getObjPosY());
            RenderUtil.getInstance().renderText(this.getButtonText(), this.getButtonFont(), (int) this.getObjPosX() + this.getButtonTextOffsetX(), (int) this.getObjPosY() + this.getButtonTextOffsetY());
        }
    }
}
