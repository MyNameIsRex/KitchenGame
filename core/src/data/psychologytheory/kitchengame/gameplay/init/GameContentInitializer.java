package data.psychologytheory.kitchengame.gameplay.init;

public class GameContentInitializer {
    private final AssetInit textureInit;
    private final GameObjectInit gameObjectInit;
    private final CharacterInit characterInit;
    private final SceneInit sceneInit;

    public GameContentInitializer() {
        this.textureInit = new AssetInit();
        this.gameObjectInit = new GameObjectInit();
        this.characterInit = new CharacterInit();
        this.sceneInit = new SceneInit();
    }

    public void createContents() {
        this.textureInit.createContents();
        this.gameObjectInit.createContents();
        this.characterInit.createContents();
        this.sceneInit.createContents();
    }

    public void loadContents() {
        this.textureInit.loadContents();
        this.gameObjectInit.loadContents();
        this.characterInit.loadContents();
        this.sceneInit.loadContents();
    }

    public void disposeContents() {
        this.textureInit.disposeContents();
    }

}
