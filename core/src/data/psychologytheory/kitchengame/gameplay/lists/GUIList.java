package data.psychologytheory.kitchengame.gameplay.lists;

import data.psychologytheory.kitchengame.gameplay.gameobjects.gui.AbstractGUIComponent;

public enum GUIList {
    TEST_TEXT(),
    TEST_IMAGE();
    private int guiID;
    private AbstractGUIComponent guiComponent;

    public void setGUIComponent(AbstractGUIComponent guiComponent) {
        this.guiComponent = guiComponent;
        this.guiID = guiComponent.getObjID();
    }

    public int getGUIID() {
        return guiID;
    }

    public void setGUIID(int guiID) {
        this.guiID = guiID;
    }

    public AbstractGUIComponent getGUIComponent() {
        return guiComponent;
    }
}
