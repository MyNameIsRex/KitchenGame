package data.psychologytheory.kitchengame.gameplay.lists;

import data.psychologytheory.kitchengame.gameplay.gameobjects.AbstractGameObject;

public enum GameObjectList {
    KITCHEN_BACKGROUND(),
    FRIDGE(),
    TABLE_TOP_LEFT(),
    TABLE_TOP_RIGHT(),
    TABLE_TOP_CENTER(),
    TABLE_TOP_DESSERT(),
    SINK_LEFT(),
    SINK_CENTER(),
    SINK_RIGHT(),
    GRILL(),
    OVEN(),
    STOVE_FISH(),
    STOVE_APPETIZER(),
    STOVE_GARNISH(),
    HOTPLATE();

    private int gameObjectID;
    private AbstractGameObject gameObjectInstance;

    public void setGameObjectInstance(AbstractGameObject gameObjectInstance) {
        this.gameObjectInstance = gameObjectInstance;
        this.gameObjectID = this.gameObjectInstance.getObjID();
    }

    public AbstractGameObject getGameObjectInstance() {
        return this.gameObjectInstance;
    }
    public int getGameObjectID() {
        return gameObjectID;
    }
}
