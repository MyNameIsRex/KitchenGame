package data.psychologytheory.kitchengame.gameplay.dishes.garnishes;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import data.psychologytheory.kitchengame.gameplay.dishes.AbstractDish;

public class AsparagusDish extends AbstractDish {
    public AsparagusDish(int dishID, String dishName, int dishCookTime, Texture dishPresentationTexture, TextureRegion[] dishPartialTextures) {
        super(dishID, dishName, dishCookTime, dishPresentationTexture, dishPartialTextures);
    }
}
