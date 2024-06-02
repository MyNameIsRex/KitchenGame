package data.psychologytheory.kitchengame.gameplay.entities.components;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import data.psychologytheory.kitchengame.gameplay.entities.Entity;

public class TextureComponent extends Component
{
    private Texture texture;

    public TextureComponent(String texturePath)
    {
        this.texture = new Texture(Gdx.files.internal(texturePath));
    }

    public Texture getTexture()
    {
        return this.texture;
    }

    public void setTexture(String texturePath)
    {
        this.texture = new Texture(Gdx.files.internal(texturePath));
    }
}
