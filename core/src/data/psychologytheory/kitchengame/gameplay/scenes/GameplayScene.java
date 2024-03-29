package data.psychologytheory.kitchengame.gameplay.scenes;

import data.psychologytheory.kitchengame.gameplay.gameobjects.AbstractGameObject;
import data.psychologytheory.kitchengame.gameplay.gameobjects.gui.AbstractGuiComponent;
import data.psychologytheory.kitchengame.gameplay.init.EntityInit;
import data.psychologytheory.kitchengame.gameplay.init.GameObjectInit;
import data.psychologytheory.kitchengame.gameplay.init.GuiInit;
import data.psychologytheory.kitchengame.gameplay.lists.EntityList;
import data.psychologytheory.kitchengame.gameplay.lists.GameObjectList;
import data.psychologytheory.kitchengame.gameplay.lists.GuiList;

import java.util.ArrayList;
import java.util.List;

public class GameplayScene extends AbstractScene {
    public static final List<AbstractGameObject> GAME_OBJECT_LIST = new ArrayList<>();
    public static final List<AbstractGuiComponent> GUI_COMPONENT_LIST = new ArrayList<>();
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

        GAME_OBJECT_LIST.add(EntityInit.ENTITY_MAP.get(EntityList.CHEF.getCharacterID()));
        GAME_OBJECT_LIST.add(EntityInit.ENTITY_MAP.get(EntityList.LINE_COOK_MEAT.getCharacterID()));
    }

    @Override
    public void addGuiComponents() {
        GUI_COMPONENT_LIST.add(GuiInit.GUI_MAP.get(GuiList.GAMEPLAY_MENU_BAR.getGuiID()));
        GUI_COMPONENT_LIST.add(GuiInit.GUI_MAP.get(GuiList.CURRENT_ORDER_PROMPT.getGuiID()));
    }

    @Override
    public List<AbstractGameObject> getGameObjectList() {
        return GAME_OBJECT_LIST;
    }

    @Override
    public List<AbstractGuiComponent> getGuiComponentList() {
        return GUI_COMPONENT_LIST;
    }
}
