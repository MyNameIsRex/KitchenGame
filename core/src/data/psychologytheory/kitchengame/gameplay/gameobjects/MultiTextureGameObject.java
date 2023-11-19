package data.psychologytheory.kitchengame.gameplay.gameobjects;

import com.badlogic.gdx.graphics.Texture;

public class MultiTextureGameObject extends AbstractGameObject{
    public MultiTextureGameObject(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, Texture texture) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, texture);
    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public void render() {
        super.render();
    }
}
