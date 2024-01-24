package data.psychologytheory.kitchengame.gameplay.lists;

import data.psychologytheory.kitchengame.gameplay.gameobjects.gui.AbstractGuiComponent;

public enum GuiList {
    //Gameplay Scene
    GAMEPLAY_MENU_BAR(),
    CURRENT_ORDER_PROMPT(),
    WALLET_PROMPT(),
    INFORMATION_PROMPT(),
    CURRENT_TIME_PROMPT(),
    OPTIONS_MENU_BUTTON(),
    ACHIEVEMENTS_MENU_BUTTON();

    //Main Menu Scene
    //Options Scene

    private int guiID;
    private AbstractGuiComponent guiComponent;

    public void setGuiComponent(AbstractGuiComponent guiComponent) {
        this.guiComponent = guiComponent;
        this.guiID = guiComponent.getObjID();
    }

    public int getGuiID() {
        return guiID;
    }

    public void setGuiID(int guiID) {
        this.guiID = guiID;
    }

    public AbstractGuiComponent getGuiComponent() {
        return guiComponent;
    }
}
