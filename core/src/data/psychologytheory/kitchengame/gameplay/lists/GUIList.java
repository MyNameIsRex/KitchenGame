package data.psychologytheory.kitchengame.gameplay.lists;

import data.psychologytheory.kitchengame.gameplay.gameobjects.gui.AbstractGUIComponent;

public enum GUIList {
    //Gameplay Scene
    CURRENT_ORDER_PROMPT(),
    COUNTDOWN_PROMPT(),
    INFORMATION_PROMPT(),
    CURRENT_TIME_PROMPT(),
    PAUSE_MENU_BUTTON(),
    ACHIEVEMENT_MENU_BUTTON();
    //Main Menu Scene
    //Options Scene

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
