package data.psychologytheory.kitchengame.gameplay.init;

import data.psychologytheory.kitchengame.engine.interfaces.IContent;
import data.psychologytheory.kitchengame.gameplay.lists.SceneList;
import data.psychologytheory.kitchengame.gameplay.scenes.AbstractScene;
import data.psychologytheory.kitchengame.gameplay.scenes.GameplayScene;

import java.util.HashMap;
import java.util.Map;

public class SceneInit implements IContent {
    public static final Map<Integer, AbstractScene> SCENE_MAP = new HashMap<>();

    @Override
    public void createContents() {
        SceneList.GAMEPLAY_SCENE.setScene(new GameplayScene());
    }

    @Override
    public void loadContents() {
        SCENE_MAP.put(SceneList.GAMEPLAY_SCENE.getSceneID(), SceneList.GAMEPLAY_SCENE.getScene());
        SCENE_MAP.get(SceneList.GAMEPLAY_SCENE.getSceneID()).addGameObjects();
        SCENE_MAP.get(SceneList.GAMEPLAY_SCENE.getSceneID()).addGUIComponents();
    }

    @Override
    public void disposeContents() {

    }
}
