package data.psychologytheory.kitchengame.gameplay.characters.goals;

import data.psychologytheory.kitchengame.gameplay.characters.AbstractCharacter;

public abstract class AbstractCharacterGoals {
    private AbstractCharacter character;
    public AbstractCharacterGoals(AbstractCharacter character) {
        this.character = character;
    }

    public abstract void executeGoal();

    public abstract boolean isGoalSuccessful();

    public AbstractCharacter getCharacter() {
        return character;
    }

    public void setCharacter(AbstractCharacter character) {
        this.character = character;
    }
}
