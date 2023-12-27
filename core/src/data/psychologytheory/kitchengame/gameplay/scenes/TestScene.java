package data.psychologytheory.kitchengame.gameplay.scenes;

import data.psychologytheory.kitchengame.gameplay.gameobjects.AbstractGameObject;
import data.psychologytheory.kitchengame.gameplay.gameobjects.gui.AbstractGUIComponent;
import data.psychologytheory.kitchengame.gameplay.init.GUIInit;
import data.psychologytheory.kitchengame.gameplay.lists.GUIList;

import java.util.ArrayList;
import java.util.List;

public class TestScene extends AbstractScene {
    public static final List<AbstractGUIComponent> GUI_COMPONENT_LIST = new ArrayList<>();
    @Override
    public void addGameObjects() {

    }

    @Override
    public void addGUIComponents() {
        GUI_COMPONENT_LIST.add(GUIInit.GUI_MAP.get(GUIList.TEST_TEXT.getGUIID()));
        GUI_COMPONENT_LIST.add(GUIInit.GUI_MAP.get(GUIList.TEST_IMAGE.getGUIID()));
        GUI_COMPONENT_LIST.add(GUIInit.GUI_MAP.get(GUIList.TEST_BUTTON.getGUIID()));
    }

    @Override
    public List<AbstractGUIComponent> getGUIComponentList() {
        return GUI_COMPONENT_LIST;
    }
}
