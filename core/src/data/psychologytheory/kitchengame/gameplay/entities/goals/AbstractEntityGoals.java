package data.psychologytheory.kitchengame.gameplay.entities.goals;

import data.psychologytheory.kitchengame.gameplay.entities.AbstractEntity;

public abstract class AbstractEntityGoals {
    private AbstractEntity entity;
    private boolean inProgress = false;
    public AbstractEntityGoals(AbstractEntity entity) {
        this.entity = entity;
    }

    public abstract void executeGoal();

    public abstract boolean isGoalSuccessful();

    public AbstractEntity getEntity() {
        return entity;
    }

    public void setCharacter(AbstractEntity entity) {
        this.entity = entity;
    }

    public boolean isInProgress() {
        return inProgress;
    }

    public void setInProgress(boolean inProgress) {
        this.inProgress = inProgress;
    }
}
