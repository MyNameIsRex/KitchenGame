package data.psychologytheory.kitchengame.gameplay.entities.goals.cooking;

import com.badlogic.gdx.Gdx;
import data.psychologytheory.kitchengame.gameplay.entities.AbstractEntity;
import data.psychologytheory.kitchengame.gameplay.entities.goals.AbstractEntityGoals;
import data.psychologytheory.kitchengame.gameplay.dishes.AbstractDish;

public class CookingGoal extends AbstractEntityGoals {
    private final AbstractDish dish;
    private int cookingTimer;

    public CookingGoal(AbstractEntity character, AbstractDish dish) {
        super(character);
        this.dish = dish;
        this.cookingTimer = 0;
    }

    @Override
    public void executeGoal() {
        float lastTime = Gdx.graphics.getDeltaTime();
        float deltaTime;
        float currentTime = Gdx.graphics.getDeltaTime();
        deltaTime = currentTime - lastTime;

        this.incrementCookingTimer(deltaTime);
    }

    @Override
    public boolean isGoalSuccessful() {
        return isCookingComplete(this.dish);
    }

    private void incrementCookingTimer(float deltaTime) {
        this.cookingTimer += (int) deltaTime;
    }

    private boolean isCookingComplete(AbstractDish dish) {
        return this.cookingTimer == dish.getDishCookTime() * 1000;
    }
}
