package data.psychologytheory.kitchengame.gameplay.init;

public class GameContentInitializer {
    private final AssetInit assetInit;
    private final GameObjectInit gameObjectInit;
    private final CharacterInit characterInit;
    private final GUIInit guiInit;
    private final SceneInit sceneInit;

    public GameContentInitializer() {
        this.assetInit = new AssetInit();
        this.gameObjectInit = new GameObjectInit();
        this.characterInit = new CharacterInit();
        this.guiInit = new GUIInit();
        this.sceneInit = new SceneInit();
    }

    public void createContents() {
        this.assetInit.createContents();
        this.gameObjectInit.createContents();
        this.characterInit.createContents();
        this.guiInit.createContents();
        this.sceneInit.createContents();
    }

    public void loadContents() {
        this.assetInit.loadContents();
        this.gameObjectInit.loadContents();
        this.characterInit.loadContents();
        this.guiInit.loadContents();
        this.sceneInit.loadContents();
    }

    public void disposeContents() {
        this.assetInit.disposeContents();
    }

}
