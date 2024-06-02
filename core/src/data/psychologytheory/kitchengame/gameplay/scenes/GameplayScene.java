package data.psychologytheory.kitchengame.gameplay.scenes;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import data.psychologytheory.kitchengame.KitchenGame;
import data.psychologytheory.kitchengame.engine.logger.Logger;
import data.psychologytheory.kitchengame.gameplay.entities.Entity;
import data.psychologytheory.kitchengame.gameplay.entities.components.RenderComponent;
import data.psychologytheory.kitchengame.gameplay.entities.components.TextureComponent;
import data.psychologytheory.kitchengame.gameplay.entities.components.TransformationComponent;

public class GameplayScene extends Scene
{
    public Entity kitchenBackground;

    @Override
    public void createScene()
    {
        this.kitchenBackground = new Entity("kitchen_background");
        this.kitchenBackground.addComponent(new TransformationComponent((float) (KitchenGame.WIDTH / 2 - 360),
                (float) ((KitchenGame.HEIGHT / 2) - 160), 720, 320));
        this.kitchenBackground.addComponent(new TextureComponent("textures/gameplay/kitchen_background.png"));
        this.kitchenBackground.addComponent(new RenderComponent(this.kitchenBackground));
    }

    @Override
    public void updateScene(float delta)
    {

    }

    @Override
    public void renderScene(SpriteBatch spriteBatch)
    {
        this.kitchenBackground.getComponent(RenderComponent.class).renderTarget(spriteBatch);
    }
}
