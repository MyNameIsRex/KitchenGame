package data.psychologytheory.kitchengame.gameplay.dishes.appetizers;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import data.psychologytheory.kitchengame.gameplay.dishes.AbstractDish;

public class TortelliniDish extends AbstractDish {
    public TortelliniDish(int dishID, String dishName, int dishCookTime, Texture dishPresentationTexture, TextureRegion[] dishPartialTextures) {
        super(dishID, dishName, dishCookTime, dishPresentationTexture, dishPartialTextures);
    }
}
