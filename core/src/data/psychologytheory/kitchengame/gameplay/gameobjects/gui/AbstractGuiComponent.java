package data.psychologytheory.kitchengame.gameplay.gameobjects.gui;

import com.badlogic.gdx.Input;
import data.psychologytheory.kitchengame.engine.io.KeyboardInput;
import data.psychologytheory.kitchengame.gameplay.gameobjects.AbstractGameObject;

public class AbstractGuiComponent extends AbstractGameObject {
    private boolean displayGUIComponent = true;

    public AbstractGuiComponent(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, int zIndex) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, null, zIndex);
    }

    @Override
    public void update() {
        super.update();
        if (KeyboardInput.isKeyJustReleased(Input.Keys.G)) {
            this.displayGUIComponent = !this.displayGUIComponent;
        }
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
