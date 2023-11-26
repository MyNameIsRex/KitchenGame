package data.psychologytheory.kitchengame.gameplay.gameobjects.game.characters.goals;

import data.psychologytheory.kitchengame.gameplay.gameobjects.game.characters.AbstractCharacter;

public abstract class AbstractCharacterGoals {
    private AbstractCharacter targetCharacter;
    private int goalPriority;
    private AbstractCharacterGoals[] goals;
    public AbstractCharacterGoals(AbstractCharacter targetCharacter, int goalPriority) {
        this.targetCharacter = targetCharacter;
        this.goalPriority = goalPriority;
        this.goals = new AbstractCharacterGoals[]{};
    }

    public abstract void runGoal();

    public AbstractCharacter getTargetCharacter() {
        return targetCharacter;
    }

    public void setTargetCharacter(AbstractCharacter targetCharacter) {
        this.targetCharacter = targetCharacter;
    }

    public int getGoalPriority() {
        return goalPriority;
    }

    public void setGoalPriority(int goalPriority) {
        this.goalPriority = goalPriority;
    }

    public AbstractCharacterGoals[] getGoals() {
        return goals;
    }

    public void setGoals(AbstractCharacterGoals[] goals) {
        this.goals = goals;
    }
}
