package data.psychologytheory.kitchengame.gameplay.dishes;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public abstract class AbstractDish {
    private int dishID;
    private String dishName;
    private int dishCookTime;
    private Texture dishPresentationTexture;
    private TextureRegion[] dishPartialTextures;

    public AbstractDish(int dishID, String dishName, int dishCookTime, Texture dishPresentationTexture, TextureRegion[] dishPartialTextures) {
        this.dishID = dishID;
        this.dishName = dishName;
        this.dishCookTime = dishCookTime;
        this.dishPresentationTexture = dishPresentationTexture;
        this.dishPartialTextures = dishPartialTextures;
    }

    public int getDishID() {
        return dishID;
    }

    public void setDishID(int dishID) {
        this.dishID = dishID;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getDishCookTime() {
        return dishCookTime;
    }

    public void setDishCookTime(int dishCookTime) {
        this.dishCookTime = dishCookTime;
    }

    public Texture getDishPresentationTexture() {
        return dishPresentationTexture;
    }

    public void setDishPresentationTexture(Texture dishPresentationTexture) {
        this.dishPresentationTexture = dishPresentationTexture;
    }

    public TextureRegion[] getDishPartialTextures() {
        return dishPartialTextures;
    }

    public void setDishPartialTextures(TextureRegion[] dishPartialTextures) {
        this.dishPartialTextures = dishPartialTextures;
    }
}
