package data.psychologytheory.kitchengame.gameplay.lists;

import data.psychologytheory.kitchengame.gameplay.scenes.AbstractScene;

public enum SceneList {
    GAMEPLAY_SCENE(0, "gameplay");

    SceneList(int sceneID, String name) {
        this.sceneID = sceneID;
        this.name = name;
    }

    private int sceneID;
    private String name;
    private AbstractScene scene;

    public void setScene(AbstractScene scene) {
        this.scene = scene;
    }

    public AbstractScene getScene() {
        return this.scene;
    }

    public int getSceneID() {
        return sceneID;
    }

    public void setSceneID(int sceneID) {
        this.sceneID = sceneID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
