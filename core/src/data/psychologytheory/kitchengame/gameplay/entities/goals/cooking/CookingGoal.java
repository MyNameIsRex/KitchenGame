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
    }

    @Override
    public boolean isGoalSuccessful() {
        this.setInProgress(false);
        if (isCookingComplete(this.dish)) {
            this.cookingTimer = 0;
            return true;
        }
        return false;
    }

    @Override
    public void setGoalSuccessful(boolean isGoalSuccessful) {

    }

    @Override
    public void resetGoal() {

    }

    private void incrementCookingTimer(float deltaTime) {
        this.cookingTimer += deltaTime;
    }

    private boolean isCookingComplete(AbstractDish dish) {
        return this.cookingTimer > dish.getDishCookTime();
    }

    public float getCookingTimer() {
        return this.cookingTimer;
    }

    public AbstractDish getDish() {
        return this.dish;
    }
}
