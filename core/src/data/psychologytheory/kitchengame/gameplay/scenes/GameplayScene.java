package data.psychologytheory.kitchengame.gameplay.scenes;

import data.psychologytheory.kitchengame.gameplay.gameobjects.AbstractGameObject;
import data.psychologytheory.kitchengame.gameplay.gameobjects.gui.AbstractGUIComponent;
import data.psychologytheory.kitchengame.gameplay.init.GUIInit;
import data.psychologytheory.kitchengame.gameplay.init.GameObjectInit;
import data.psychologytheory.kitchengame.gameplay.lists.GUIList;
import data.psychologytheory.kitchengame.gameplay.lists.GameObjectList;

import java.util.ArrayList;
import java.util.List;

public class GameplayScene extends AbstractScene {
    public static final List<AbstractGameObject> GAME_OBJECT_LIST = new ArrayList<>();
    public static final List<AbstractGUIComponent> GUI_COMPONENT_LIST = new ArrayList<>();
    @Override
    public void addGameObjects() {
        GAME_OBJECT_LIST.add(GameObjectInit.GAME_OBJECT_MAP.get(GameObjectList.KITCHEN_BACKGROUND.getGameObjectID()));

        GAME_OBJECT_LIST.add(GameObjectInit.GAME_OBJECT_MAP.get(GameObjectList.FRIDGE.getGameObjectID()));
        GAME_OBJECT_LIST.add(GameObjectInit.GAME_OBJECT_MAP.get(GameObjectList.SINK_LEFT.getGameObjectID()));

        GAME_OBJECT_LIST.add(GameObjectInit.GAME_OBJECT_MAP.get(GameObjectList.STOVE_FISH.getGameObjectID()));
        GAME_OBJECT_LIST.add(GameObjectInit.GAME_OBJECT_MAP.get(GameObjectList.TABLE_TOP_CENTER.getGameObjectID()));
        GAME_OBJECT_LIST.add(GameObjectInit.GAME_OBJECT_MAP.get(GameObjectList.GRILL.getGameObjectID()));
        GAME_OBJECT_LIST.add(GameObjectInit.GAME_OBJECT_MAP.get(GameObjectList.TABLE_TOP_RIGHT.getGameObjectID()));
        GAME_OBJECT_LIST.add(GameObjectInit.GAME_OBJECT_MAP.get(GameObjectList.OVEN.getGameObjectID()));

        GAME_OBJECT_LIST.add(GameObjectInit.GAME_OBJECT_MAP.get(GameObjectList.TABLE_TOP_LEFT.getGameObjectID()));
        GAME_OBJECT_LIST.add(GameObjectInit.GAME_OBJECT_MAP.get(GameObjectList.STOVE_GARNISH.getGameObjectID()));
        GAME_OBJECT_LIST.add(GameObjectInit.GAME_OBJECT_MAP.get(GameObjectList.STOVE_APPETIZER.getGameObjectID()));
        GAME_OBJECT_LIST.add(GameObjectInit.GAME_OBJECT_MAP.get(GameObjectList.TABLE_TOP_CENTER_CENTER.getGameObjectID()));
        GAME_OBJECT_LIST.add(GameObjectInit.GAME_OBJECT_MAP.get(GameObjectList.SINK_CENTER.getGameObjectID()));
        GAME_OBJECT_LIST.add(GameObjectInit.GAME_OBJECT_MAP.get(GameObjectList.TABLE_TOP_DESSERT.getGameObjectID()));

        GAME_OBJECT_LIST.add(GameObjectInit.GAME_OBJECT_MAP.get(GameObjectList.HOTPLATE.getGameObjectID()));
    }

    @Override
    public void addGUIComponents() {
        GUI_COMPONENT_LIST.add(GUIInit.GUI_MAP.get(GUIList.CURRENT_ORDER_PROMPT.getGUIID()));
        GUI_COMPONENT_LIST.add(GUIInit.GUI_MAP.get(GUIList.COUNTDOWN_PROMPT.getGUIID()));
        GUI_COMPONENT_LIST.add(GUIInit.GUI_MAP.get(GUIList.INFORMATION_PROMPT.getGUIID()));
        GUI_COMPONENT_LIST.add(GUIInit.GUI_MAP.get(GUIList.CURRENT_TIME_PROMPT.getGUIID()));
        //GUI_COMPONENT_LIST.add(GUIInit.GUI_MAP.get(GUIList.PAUSE_MENU_BUTTON.getGUIID()));
        //GUI_COMPONENT_LIST.add(GUIInit.GUI_MAP.get(GUIList.ACHIEVEMENT_MENU_BUTTON.getGUIID()));
    }

    @Override
    public List<AbstractGameObject> getGameObjectList() {
        return GAME_OBJECT_LIST;
    }

    @Override
    public List<AbstractGUIComponent> getGUIComponentList() {
        return GUI_COMPONENT_LIST;
    }
}
