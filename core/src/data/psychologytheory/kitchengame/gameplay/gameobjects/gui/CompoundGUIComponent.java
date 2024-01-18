package data.psychologytheory.kitchengame.gameplay.gameobjects.gui;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import data.psychologytheory.kitchengame.engine.utils.RenderUtil;

public class CompoundGUIComponent extends AbstractGUIComponent {
    private String guiText;
    private BitmapFont guiFont;
    private Texture[] guiTextures;
    private TextureRegion[] guiPartialTextures;
    private int[][] guiPartialTexturesOffset;
    private int textOffsetX, textOffsetY;

    public CompoundGUIComponent(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, int zIndex, String guiText, BitmapFont guiFont, Texture[] guiTextures, int textOffsetX, int textOffsetY) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, zIndex);
        this.guiText = guiText;
        this.guiFont = guiFont;
        this.guiTextures = guiTextures;
        this.textOffsetX = textOffsetX;
        this.textOffsetY = textOffsetY;
    }

    public CompoundGUIComponent(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, int zIndex, String guiText, BitmapFont guiFont, TextureRegion[] guiPartialTextures, int[][] guiPartialTexturesOffset, int textOffsetX, int textOffsetY) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, zIndex);
        this.guiText = guiText;
        this.guiFont = guiFont;
        this.guiPartialTextures = guiPartialTextures;
        this.guiPartialTexturesOffset = guiPartialTexturesOffset;
        this.textOffsetX = textOffsetX;
        this.textOffsetY = textOffsetY;
    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public void render() {
        super.render();
        if (!this.isDisplayGUIComponent()) {
            return;
        }

        if (this.guiTextures != null) {
            RenderUtil.getInstance().renderTexture(this.guiTextures[0], (int) this.getObjPosX(), (int) (this.getObjPosY()));
            RenderUtil.getInstance().renderText(this.guiText, this.guiFont, (int) this.getObjPosX() + textOffsetX, (int) (this.getObjPosY() + this.getObjHeight() / 2 + textOffsetY));
            return;
        }

        if (this.guiPartialTextures != null) {
            RenderUtil.getInstance().renderPartialTexture(this.guiPartialTextures[0], (int) this.getObjPosX(), (int) (this.getObjPosY()));
            RenderUtil.getInstance().renderText(this.guiText, this.guiFont, (int) this.getObjPosX() + textOffsetX, (int) (this.getObjPosY() + this.getObjHeight() / 2 + textOffsetY));
        }
    }

    public String getGuiText() {
        return guiText;
    }

    public void setGuiText(String guiText) {
        this.guiText = guiText;
    }

    public BitmapFont getGuiFont() {
        return guiFont;
    }

    public void setGuiFont(BitmapFont guiFont) {
        this.guiFont = guiFont;
    }

    public Texture[] getGuiTextures() {
        return guiTextures;
    }

    public void setGuiTextures(Texture[] guiTextures) {
        this.guiTextures = guiTextures;
    }

    public int getTextOffsetX() {
        return textOffsetX;
    }

    public void setTextOffsetX(int textOffsetX) {
        this.textOffsetX = textOffsetX;
    }

    public int getTextOffsetY() {
        return textOffsetY;
    }

    public void setTextOffsetY(int textOffsetY) {
        this.textOffsetY = textOffsetY;
    }

    public TextureRegion[] getGuiPartialTextures() {
        return guiPartialTextures;
    }

    public void setGuiPartialTextures(TextureRegion[] guiPartialTextures) {
        this.guiPartialTextures = guiPartialTextures;
    }

    public int[][] getGuiPartialTexturesOffset() {
        return guiPartialTexturesOffset;
    }

    public void setGuiPartialTexturesOffset(int[][] guiPartialTexturesOffset) {
        this.guiPartialTexturesOffset = guiPartialTexturesOffset;
    }
}
