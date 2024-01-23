package data.psychologytheory.kitchengame.gameplay.init;

public class GameContentInitializer {
    private final AssetInit assetInit;
    private final DishInit dishInit;
    private final GameObjectInit gameObjectInit;
    private final EntityInit entityInit;
    private final GuiInit guiInit;
    private final SceneInit sceneInit;

    public GameContentInitializer() {
        this.assetInit = new AssetInit();
        this.dishInit = new DishInit();
        this.gameObjectInit = new GameObjectInit();
        this.entityInit = new EntityInit();
        this.guiInit = new GuiInit();
        this.sceneInit = new SceneInit();
    }

    public void createContents() {
        this.assetInit.createContents();
        this.dishInit.createContents();
        this.gameObjectInit.createContents();
        this.entityInit.createContents();
        this.guiInit.createContents();
        this.sceneInit.createContents();
    }

    public void loadContents() {
        this.assetInit.loadContents();
        this.dishInit.loadContents();
        this.gameObjectInit.loadContents();
        this.entityInit.loadContents();
        this.guiInit.loadContents();
        this.sceneInit.loadContents();
    }

    public void disposeContents() {
        this.assetInit.disposeContents();
    }

}
