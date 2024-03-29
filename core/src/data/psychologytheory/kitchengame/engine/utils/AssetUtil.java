package data.psychologytheory.kitchengame.engine.utils;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AssetUtil {
    public static AssetUtil instance;

    public TextureRegion createPartialTexture(Texture texture, int x, int y, int width, int height) {
        return new TextureRegion(texture, x, y, width, height);
    }

    public TextureRegion[] createUniformPartialTextures(Texture texture, int startX, int startY, int width, int height, int textureCount, int row, int column) {
        TextureRegion[] textureRegions = new TextureRegion[textureCount];
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                textureRegions[index] = AssetUtil.getInstance().createPartialTexture(texture, startX + width * j, startY + height * i, width, height);
                index++;
            }
        }
        return textureRegions;
    }

    public static AssetUtil getInstance() {
        if (instance == null) {
            instance = new AssetUtil();
        }
        return instance;
    }
}
