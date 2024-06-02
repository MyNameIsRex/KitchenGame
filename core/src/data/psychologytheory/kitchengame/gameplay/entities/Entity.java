package data.psychologytheory.kitchengame.gameplay.entities;

import data.psychologytheory.kitchengame.engine.logger.Logger;
import data.psychologytheory.kitchengame.gameplay.entities.components.Component;

import java.util.ArrayList;
import java.util.List;

public class Entity
{
    private String name;
    private float positionX, positionY, width, height;
    private List<Component> componentList;

    public Entity(String name)
    {
        this.name = name;
        this.componentList = new ArrayList<>();
    }

    public <T extends Component> void addComponent(T component)
    {
        this.componentList.add(component);
    }

    public <T extends Component> T getComponent(Class<T> clazz)
    {
        for (Component c : this.componentList)
        {
            if (clazz.isAssignableFrom(c.getClass()))
            {
                try
                {
                    return clazz.cast(c);
                } catch (ClassCastException e)
                {
                    Logger.logError("Could not cast the component!");
                }
            }
        }

        return null;
    }

    public <T extends Component> void removeComponent(Class<T> clazz)
    {
        Component c;
        for (int i = 0; i < this.componentList.size(); i++)
        {
            c = this.componentList.get(i);
            if (clazz.isAssignableFrom(c.getClass()))
            {
                this.componentList.remove(c);
                return;
            }
        }
    }
}
