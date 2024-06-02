package data.psychologytheory.kitchengame.gameplay.entities.components;

public class TransformationComponent extends Component
{
    private float positionX, positionY, width, height;

    public TransformationComponent(float positionX, float positionY, float width, float height)
    {
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = width;
        this.height = height;
    }

    public float getPositionX()
    {
        return this.positionX;
    }

    public void setPositionX(float positionX)
    {
        this.positionX = positionX;
    }

    public float getPositionY()
    {
        return this.positionY;
    }

    public void setPositionY(float positionY)
    {
        this.positionY = positionY;
    }

    public float getWidth()
    {
        return this.width;
    }

    public void setWidth(float width)
    {
        this.width = width;
    }

    public float getHeight()
    {
        return this.height;
    }

    public void setHeight(float height)
    {
        this.height = height;
    }
}
