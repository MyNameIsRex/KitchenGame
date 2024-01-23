package data.psychologytheory.kitchengame.gameplay.gameobjects.gui.gameplay;

import com.badlogic.gdx.graphics.Color;
import data.psychologytheory.kitchengame.engine.utils.RenderUtil;
import data.psychologytheory.kitchengame.gameplay.gameobjects.gui.HUDGuiComponent;
import data.psychologytheory.kitchengame.gameplay.lists.AssetList;

public class MenuBarHUDGuiComponent extends HUDGuiComponent {
    public MenuBarHUDGuiComponent(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, int zIndex) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, zIndex);
        this.setDisplayColors(new Color[]{AssetList.GUI_GRAY.getColor(), AssetList.GUI_LIGHT_GRAY.getColor()});
    }

    @Override
    public void render() {
        super.render();
        if (!this.isDisplayGUIComponent()) {
            return;
        }

        RenderUtil.getInstance().renderFilledShape((int) this.getObjPosX(), (int) this.getObjPosY() + 32, (int) this.getObjWidth(), 16, this.getDisplayColors()[0]);
        RenderUtil.getInstance().renderFilledShape((int) this.getObjPosX(), (int) this.getObjPosY(), 16, 32, this.getDisplayColors()[1]);
    }
}
