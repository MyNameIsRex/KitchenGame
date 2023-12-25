package data.psychologytheory.kitchengame.gameplay.gameobjects.gui;

import com.badlogic.gdx.graphics.Texture;
import data.psychologytheory.kitchengame.gameplay.gameobjects.AbstractGameObject;

public class AbstractGUIComponent extends AbstractGameObject {
    private boolean displayGUIComponent = false;

    public AbstractGUIComponent(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, int zIndex) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, null, zIndex);
    }

    @Override
    public void update() {

    }

    @Override
    public void render() {

    }

    public boolean isDisplayGUIComponent() {
        return displayGUIComponent;
    }

    public void setDisplayGUIComponent(boolean displayGUIComponent) {
        this.displayGUIComponent = displayGUIComponent;
    }
}
