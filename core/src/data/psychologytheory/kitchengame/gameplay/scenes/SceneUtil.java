package data.psychologytheory.kitchengame.gameplay.scenes;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.HashMap;
import java.util.Map;

public class SceneUtil
{
    private static Map<Integer, Scene> scenes = new HashMap<>();
    private static int currentScene;

    public static Scene gameplay;

    public static void createScenes()
    {
        //Setup all scenes here
        gameplay = new GameplayScene();
        gameplay.createScene();
        scenes.put(0, gameplay);

        currentScene = 0;
    }

    public static void updateCurrentScene(float delta)
    {
        scenes.get(currentScene).updateScene(delta);
    }

    public static void renderCurrentScene(SpriteBatch spriteBatch)
    {
        scenes.get(currentScene).renderScene(spriteBatch);
    }

    public static int getCurrentScene()
    {
        return currentScene;
    }

    public static void setCurrentScene(int scene)
    {
        currentScene = scene;
    }
}
