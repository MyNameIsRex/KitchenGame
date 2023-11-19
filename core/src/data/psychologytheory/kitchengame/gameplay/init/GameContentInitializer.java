package data.psychologytheory.kitchengame.gameplay.init;

public class GameContentInitializer {
    private final TextureInit textureInit;
    private final GameObjectInit gameObjectInit;

    public GameContentInitializer() {
        this.textureInit = new TextureInit();
        this.gameObjectInit = new GameObjectInit();
    }

    public void createContents() {
        this.textureInit.createContents();
        this.gameObjectInit.createContents();
    }

    public void loadContents() {
        this.textureInit.loadContents();
        this.gameObjectInit.loadContents();
    }

    public void disposeContents() {
        this.textureInit.disposeContents();
    }

}
