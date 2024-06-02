package data.psychologytheory.kitchengame.gameplay.scenes;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import data.psychologytheory.kitchengame.gameplay.entities.Entity;

import java.util.HashMap;
import java.util.Map;

public abstract class Scene
{
    protected Map<Integer, Entity> entityCache = new HashMap<>();

    public abstract void createScene();

    public abstract void updateScene(float delta);

    public abstract void renderScene(SpriteBatch spriteBatch);

    public Map<Integer, Entity> getEntityCache()
    {
        return this.entityCache;
    }

    public void setEntityCache(Map<Integer, Entity> entityCache)
    {
        this.entityCache = entityCache;
    }
}
