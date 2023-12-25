package data.psychologytheory.kitchengame.gameplay.lists;

import data.psychologytheory.kitchengame.gameplay.gameobjects.gui.AbstractGUIComponent;

public enum GUIList {
    TIME_OF_DAY();

    private int guiID;
    private AbstractGUIComponent guiComponent;

    public void setGUIComponent(AbstractGUIComponent guiComponent) {
        this.guiComponent = guiComponent;
        this.guiID = guiComponent.getObjID();
    }

    public int getGuiID() {
        return guiID;
    }

    public void setGuiID(int guiID) {
        this.guiID = guiID;
    }

    public AbstractGUIComponent getGuiComponent() {
        return guiComponent;
    }

    public void setGuiComponent(AbstractGUIComponent guiComponent) {
        this.guiComponent = guiComponent;
    }
}
