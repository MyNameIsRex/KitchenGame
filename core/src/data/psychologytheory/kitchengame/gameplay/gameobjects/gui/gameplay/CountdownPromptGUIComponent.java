package data.psychologytheory.kitchengame.gameplay.gameobjects.gui.gameplay;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import data.psychologytheory.kitchengame.engine.io.KeyboardInput;
import data.psychologytheory.kitchengame.engine.rendering.RenderHelper;
import data.psychologytheory.kitchengame.gameplay.gameobjects.gui.CompoundGUIComponent;

public class CountdownPromptGUIComponent extends CompoundGUIComponent {
    public CountdownPromptGUIComponent(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, int zIndex, String guiText, BitmapFont guiFont, TextureRegion[] guiPartialTextures, int[][] guiPartialTexturesOffset, int textOffsetX, int textOffsetY) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, zIndex, guiText, guiFont, guiPartialTextures, guiPartialTexturesOffset, textOffsetX, textOffsetY);
    }

    @Override
    public void render() {
        if (this.isDisplayGUIComponent()) {
            RenderHelper.getInstance().renderPartialTexture(this.getGuiPartialTextures()[0], (int) this.getObjPosX() + this.getGuiPartialTexturesOffset()[0][0], (int) this.getObjPosY() + this.getGuiPartialTexturesOffset()[0][1]);
            RenderHelper.getInstance().renderPartialTexture(this.getGuiPartialTextures()[1], (int) this.getObjPosX() + this.getGuiPartialTexturesOffset()[1][0], (int) this.getObjPosY() + this.getGuiPartialTexturesOffset()[1][1]);
            RenderHelper.getInstance().renderText(this.getGuiText(), this.getGuiFont(), (int) this.getObjPosX() + this.getTextOffsetX(), (int) this.getObjPosY() + this.getTextOffsetY());
        }
    }
}
