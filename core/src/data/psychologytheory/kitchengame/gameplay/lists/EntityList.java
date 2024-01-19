package data.psychologytheory.kitchengame.gameplay.lists;

import data.psychologytheory.kitchengame.gameplay.entities.AbstractEntity;

public enum EntityList {
    CHEF(),
    SOUS_CHEF(),
    LINE_COOK_APPETIZER(),
    LINE_COOK_GARNISH(),
    LINE_COOK_FISH(),
    LINE_COOK_MEAT(),
    LINE_COOK_DESSERT();

    private int characterID;
    private AbstractEntity characterInstance;

    public void setCharacterInstance(AbstractEntity characterInstance) {
        this.characterInstance = characterInstance;
        this.characterID = this.characterInstance.getObjID();
    }

    public AbstractEntity getCharacterInstance() {
        return this.characterInstance;
    }

    public int getCharacterID() {
        return this.characterID;
    }
}
