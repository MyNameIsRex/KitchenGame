package data.psychologytheory.kitchengame.gameplay.gameobjects.gui;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import data.psychologytheory.kitchengame.engine.rendering.RenderHelper;

public class TextGUIComponent extends AbstractGUIComponent {
    private CharSequence guiText;
    private BitmapFont guiFont;
    public TextGUIComponent(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, int zIndex, String guiText, BitmapFont guiFont) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, zIndex);
        this.guiText = guiText;
        this.guiFont = guiFont;
    }

    @Override
    public void render() {
        if (this.isDisplayGUIComponent()) {
            RenderHelper.getInstance().renderText(guiText, guiFont, (int) this.getObjPosX(), (int) this.getObjPosY());
        }
    }

    public CharSequence getText() {
        return this.guiText;
    }

    public void setText(String text) {
        this.guiText = text;
    }

    public BitmapFont getGuiFont() {
        return guiFont;
    }

    public void setGuiFont(BitmapFont guiFont) {
        this.guiFont = guiFont;
    }
}
