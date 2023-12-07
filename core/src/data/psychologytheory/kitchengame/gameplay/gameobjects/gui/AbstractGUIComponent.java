package data.psychologytheory.kitchengame.gameplay.gameobjects.gui;

import data.psychologytheory.kitchengame.gameplay.gameobjects.AbstractGameObject;

public class AbstractGUIComponent extends AbstractGameObject {
    private int guiID;

    public AbstractGUIComponent(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, int zIndex, int guiID) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, null, zIndex);
        this.guiID = guiID;
    }

    @Override
    public void render() {

    }

    public int getGUIID() {
        return this.guiID;
    }

    public void setGUIID(int guiID) {
        this.guiID = guiID;
    }
}
