package data.psychologytheory.kitchengame.gameplay.gameobjects.gui;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class HUDGuiComponent extends AbstractGuiComponent {
    private BitmapFont font;
    private String[] displayTexts;
    private Texture[] displayTextures;
    private TextureRegion[] displayPartialTextures;
    private Color[] displayColors;

    public HUDGuiComponent(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, int zIndex) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, zIndex);
    }

    @Override
    public void update() {
        super.update();
    }

    public BitmapFont getFont() {
        return font;
    }

    public void setFont(BitmapFont font) {
        this.font = font;
    }

    public String[] getDisplayTexts() {
        return displayTexts;
    }

    public void setDisplayTexts(String[] displayTexts) {
        this.displayTexts = displayTexts;
    }

    public Texture[] getDisplayTextures() {
        return displayTextures;
    }

    public void setDisplayTextures(Texture[] displayTextures) {
        this.displayTextures = displayTextures;
    }

    public TextureRegion[] getDisplayPartialTextures() {
        return displayPartialTextures;
    }

    public void setDisplayPartialTextures(TextureRegion[] displayPartialTextures) {
        this.displayPartialTextures = displayPartialTextures;
    }

    public Color[] getDisplayColors() {
        return displayColors;
    }

    public void setDisplayColors(Color[] displayColors) {
        this.displayColors = displayColors;
    }
}
