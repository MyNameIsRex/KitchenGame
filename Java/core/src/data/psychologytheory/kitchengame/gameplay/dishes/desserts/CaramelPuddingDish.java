package data.psychologytheory.kitchengame.gameplay.dishes.desserts;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import data.psychologytheory.kitchengame.gameplay.dishes.AbstractDish;

public class CaramelPuddingDish extends AbstractDish {
    public CaramelPuddingDish(int dishID, String dishName, int dishCookTime, Texture dishPresentationTexture, TextureRegion[] dishPartialTextures) {
        super(dishID, dishName, dishCookTime, dishPresentationTexture, dishPartialTextures);
    }
}
