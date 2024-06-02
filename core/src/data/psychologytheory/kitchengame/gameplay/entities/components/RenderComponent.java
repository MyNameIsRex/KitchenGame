package data.psychologytheory.kitchengame.gameplay.entities.components;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import data.psychologytheory.kitchengame.gameplay.entities.Entity;

public class RenderComponent extends Component
{
    public RenderComponent(Entity target)
    {
        super(target);
    }

    public void renderTarget(SpriteBatch spriteBatch)
    {
        spriteBatch.draw(this.target.getComponent(TextureComponent.class).getTexture(),
                this.target.getComponent(TransformationComponent.class).getPositionX(),
                this.target.getComponent(TransformationComponent.class).getPositionY(),
                this.target.getComponent(TransformationComponent.class).getWidth(),
                this.target.getComponent(TransformationComponent.class).getHeight());
    }
}
