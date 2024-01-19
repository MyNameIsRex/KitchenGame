package data.psychologytheory.kitchengame.gameplay.entities.goals.cooking;

import com.badlogic.gdx.Gdx;
import data.psychologytheory.kitchengame.gameplay.entities.AbstractEntity;
import data.psychologytheory.kitchengame.gameplay.entities.goals.AbstractEntityGoals;
import data.psychologytheory.kitchengame.gameplay.dishes.AbstractDish;

public class CookingGoal extends AbstractEntityGoals {
    private final AbstractDish dish;
    private float cookingTimer;

    public CookingGoal(AbstractEntity character, AbstractDish dish) {
        super(character);
        this.dish = dish;
        this.cookingTimer = 0;
    }

    @Override
    public void executeGoal() {
        this.setInProgress(true);
        this.incrementCookingTimer(Gdx.graphics.getDeltaTime());
        System.out.println("Current cooking timer: " + this.cookingTimer);
    }

    @Override
    public boolean isGoalSuccessful() {
        this.setInProgress(false);
        if (isCookingComplete(this.dish)) {
            System.out.println("Cooking Complete!");
            this.cookingTimer = 0;
            return true;
        }
        return false;
    }

    private void incrementCookingTimer(float deltaTime) {
        this.cookingTimer += deltaTime;
    }

    private boolean isCookingComplete(AbstractDish dish) {
        return this.cookingTimer > dish.getDishCookTime();
    }
}
