package data.psychologytheory.kitchengame.gameplay.gameobjects.gui.gameplay;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import data.psychologytheory.kitchengame.engine.utils.AssetUtil;
import data.psychologytheory.kitchengame.engine.utils.RenderUtil;
import data.psychologytheory.kitchengame.gameplay.gameobjects.gui.HUDGuiComponent;
import data.psychologytheory.kitchengame.gameplay.lists.AssetList;

public class InformationHUDGuiComponent extends HUDGuiComponent {
    public InformationHUDGuiComponent(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, int zIndex) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, zIndex);
        this.setDisplayColors(new Color[]{AssetList.GUI_YELLOW.getColor(), AssetList.GUI_LIGHT_YELLOW.getColor(), AssetList.GUI_CREAM.getColor()});
        this.setDisplayPartialTextures(new TextureRegion[]{AssetUtil.getInstance().createPartialTexture(AssetList.GUI_ICONS.getTexture(), 128, 0, 32, 32)});
        AssetList.ROBOTO_BLACK.setBitmapFont(new FreeTypeFontGenerator(Gdx.files.internal(AssetList.ROBOTO_BLACK.getAssetLocation())), 20, Color.BLACK);
        this.setFont(AssetList.ROBOTO_BLACK.getBitmapFont());
        this.setDisplayTexts(new String[]{"Info!"});
    }

    @Override
    public void render() {
        super.render();
        if (!this.isDisplayGUIComponent()) {
            return;
        }

        RenderUtil.getInstance().renderFilledShape((int) this.getObjPosX(), (int) this.getObjPosY(), 32, 32, this.getDisplayColors()[0]);
        RenderUtil.getInstance().renderFilledShape((int) this.getObjPosX() + 32, (int) this.getObjPosY(), 96, 32, this.getDisplayColors()[1]);
        RenderUtil.getInstance().renderPartialTexture(this.getDisplayPartialTextures()[0], (int) this.getObjPosX(), (int) this.getObjPosY());
        RenderUtil.getInstance().renderText(this.getDisplayTexts()[0], this.getFont(), (int) this.getObjPosX() + 48, (int) this.getObjPosY() + 23);
    }
}
