package data.psychologytheory.kitchengame.gameplay.lists;

import data.psychologytheory.kitchengame.gameplay.gameobjects.AbstractGameObject;

public enum GameObjectList {
    KITCHEN_BACKGROUND();

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
