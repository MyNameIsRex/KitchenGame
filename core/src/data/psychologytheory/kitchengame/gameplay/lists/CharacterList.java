package data.psychologytheory.kitchengame.gameplay.lists;

import data.psychologytheory.kitchengame.gameplay.gameobjects.game.characters.AbstractCharacter;

public enum CharacterList {
    CHEF(),
    SOUS_CHEF(),
    LINE_COOK_APPETIZER(),
    LINE_COOK_GARNISH(),
    LINE_COOK_FISH(),
    LINE_COOK_MEAT(),
    LINE_COOK_DESSERT();

    private int characterID;
    private AbstractCharacter characterInstance;

    public void setCharacterInstance(AbstractCharacter characterInstance) {
        this.characterInstance = characterInstance;
        this.characterID = this.characterInstance.getObjID();
    }

    public AbstractCharacter getCharacterInstance() {
        return this.characterInstance;
    }

    public int getCharacterID() {
        return this.characterID;
    }
}
