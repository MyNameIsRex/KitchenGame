package data.psychologytheory.kitchengame.gameplay.entities.components;

import data.psychologytheory.kitchengame.gameplay.entities.Entity;

public class Component
{
    protected Entity target;

    public Component() {}

    public Component(Entity target)
    {
        this.target = target;
    }

    protected void updateComponent() {}

    public Entity getTarget()
    {
        return this.target;
    }

    public void setTarget(Entity target)
    {
        this.target = target;
    }
}
