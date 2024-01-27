package data.psychologytheory.kitchengame.gameplay.gameobjects.game.kitchen;

import com.badlogic.gdx.graphics.Texture;
import data.psychologytheory.kitchengame.gameplay.dishes.AbstractDish;
import data.psychologytheory.kitchengame.gameplay.gameobjects.StationaryGameObject;

import java.util.ArrayList;
import java.util.List;

public class HotplateGameObject extends StationaryGameObject {
    private static final List<AbstractDish> DISHES = new ArrayList<>();
    public HotplateGameObject(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, Texture texture, int zIndex, boolean canInteract) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, texture, zIndex, canInteract);
    }

    @Override
    public void update() {
        super.update();

        //TODO: Add or remove Dishes Here
    }

    @Override
    public void render() {
        super.render();

        //TODO: Render Dish Texture Based on List Here
    }

    private void addDishToList(AbstractDish dish) {
        DISHES.add(dish);
    }

    private void removeDishFromList(AbstractDish dish) {
        DISHES.remove(dish);
    }
}
