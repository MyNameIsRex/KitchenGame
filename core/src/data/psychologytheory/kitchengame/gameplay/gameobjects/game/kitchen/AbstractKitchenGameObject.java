package data.psychologytheory.kitchengame.gameplay.gameobjects.game.kitchen;

import com.badlogic.gdx.graphics.Texture;
import data.psychologytheory.kitchengame.gameplay.dishes.AbstractDish;
import data.psychologytheory.kitchengame.gameplay.gameobjects.InteractableGameObject;

public class AbstractKitchenGameObject extends InteractableGameObject {
    private AbstractDish[] dishes;
    public AbstractKitchenGameObject(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, Texture[] textures, int zIndex, boolean canMove, boolean canInteract, AbstractDish[] dishes) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, textures, zIndex, canMove, canInteract);
        this.dishes = dishes;
    }

    public AbstractDish[] getDishes() {
        return dishes;
    }

    public void setDishes(AbstractDish[] dishes) {
        this.dishes = dishes;
    }
}
