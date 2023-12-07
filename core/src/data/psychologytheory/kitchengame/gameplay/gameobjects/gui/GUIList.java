package data.psychologytheory.kitchengame.gameplay.gameobjects.gui;

public enum GUIList {
    TEST_TEXT_FIELD(),
    TEST_IMAGE(),
    TEST_BUTTON();

    private int guiID = 0;
    private AbstractGUIComponent guiComponent = null;

    public void setGUIComponent(AbstractGUIComponent guiComponent) {
        this.guiComponent = guiComponent;
        this.guiID = this.guiComponent.getGUIID();
    }

    public AbstractGUIComponent getGuiComponent() {
        return this.guiComponent;
    }

    public int getGUIID() {
        return this.guiID;
    }
}
