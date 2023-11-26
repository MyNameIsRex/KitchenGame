package data.psychologytheory.kitchengame.gameplay.init;

public class GameContentInitializer {
    private final TextureInit textureInit;
    private final GameObjectInit gameObjectInit;
    private final CharacterInit characterInit;

    public GameContentInitializer() {
        this.textureInit = new TextureInit();
        this.gameObjectInit = new GameObjectInit();
        this.characterInit = new CharacterInit();
    }

    public void createContents() {
        this.textureInit.createContents();
        this.gameObjectInit.createContents();
        this.characterInit.createContents();
    }

    public void loadContents() {
        this.textureInit.loadContents();
        this.gameObjectInit.loadContents();
        this.characterInit.loadContents();
    }

    public void disposeContents() {
        this.textureInit.disposeContents();
    }

}
