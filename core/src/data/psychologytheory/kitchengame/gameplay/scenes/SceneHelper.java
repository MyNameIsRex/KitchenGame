package data.psychologytheory.kitchengame.gameplay.scenes;

import data.psychologytheory.kitchengame.gameplay.init.SceneInit;

import java.util.Map;

public class SceneHelper {
    public static int currentSceneID = 0;
    private static SceneHelper instance;

    public void changeScene(int sceneID) {
        currentSceneID = sceneID;
    }

    public void updateScene(int sceneID) {
        SceneInit.SCENE_MAP.get(sceneID).update(SceneInit.SCENE_MAP.get(sceneID).getGameObjectList(), SceneInit.SCENE_MAP.get(sceneID).getGUIComponentList());
    }

    public void renderScene(int sceneID) {
        SceneInit.SCENE_MAP.get(sceneID).render(SceneInit.SCENE_MAP.get(sceneID).getGameObjectList(), SceneInit.SCENE_MAP.get(sceneID).getGUIComponentList());
    }

    public static SceneHelper getInstance() {
        if (instance == null) {
            instance = new SceneHelper();
        }
        return instance;
    }
}
