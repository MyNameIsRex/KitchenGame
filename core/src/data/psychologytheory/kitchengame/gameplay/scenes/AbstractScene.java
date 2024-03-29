package data.psychologytheory.kitchengame.gameplay.scenes;

import data.psychologytheory.kitchengame.engine.utils.RenderUtil;
import data.psychologytheory.kitchengame.gameplay.gameobjects.AbstractGameObject;
import data.psychologytheory.kitchengame.gameplay.gameobjects.gui.AbstractGuiComponent;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractScene {
    public abstract void addGameObjects();
    public abstract void addGuiComponents();

    public void update(List<AbstractGameObject> gameObjectList, List<AbstractGuiComponent> guiComponentList) {
        if (!gameObjectList.isEmpty()) {
            for (AbstractGameObject gameObject : gameObjectList) {
                gameObject.update();
            }
        }

        if (!guiComponentList.isEmpty()) {
            for (AbstractGuiComponent guiComponent : guiComponentList) {
                guiComponent.update();
            }
        }
    }
    public void render(List<AbstractGameObject> gameObjectList, List<AbstractGuiComponent> guiComponentList) {
        if (!gameObjectList.isEmpty()) {
            for (int i = 0; i < 8; i++) {
                int currentZIndex = i;
                gameObjectList.forEach((gameObject) -> {
                    if (gameObject.getZIndex() == currentZIndex) {
                        gameObject.render();
                    }
                });
            }
        }

        if (!guiComponentList.isEmpty()) {
            for (int i = 8; i <= 10; i++) {
                int currentZIndex = i;
                guiComponentList.forEach((guiComponent) -> {
                    if (guiComponent.getZIndex() == currentZIndex) {
                        guiComponent.render();
                    }
                });
            }
        }
    }

    public List<AbstractGameObject> getGameObjectList() {
        return new ArrayList<>();
    }

    public List<AbstractGuiComponent> getGuiComponentList() {
        return new ArrayList<>();
    }
}
