package data.psychologytheory.kitchengame.engine.animation;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Animation {
    private final int frames;
    private final int speed;
    private int currentFrame;
    private Texture currentFrameTexture;
    private TextureRegion currentFramePartialTexture;
    private Texture[] textures;
    private TextureRegion[] partialTextures;

    public Animation(Texture[] textures, int frames, int speed) {
        this.textures = textures;
        this.frames = frames;
        this.speed = speed;
    }

    public Animation(TextureRegion[] partialTextures, int frames, int speed) {
        this.partialTextures = partialTextures;
        this.frames = frames;
        this.speed = speed;
    }

    public int getFrames() {
        return frames;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCurrentFrame() {
        return currentFrame;
    }

    public void setCurrentFrame(int currentFrame) {
        this.currentFrame = currentFrame;
    }

    public Texture getCurrentFrameTexture() {
        return currentFrameTexture;
    }

    public void setCurrentFrameTexture(Texture currentFrameTexture) {
        this.currentFrameTexture = currentFrameTexture;
    }

    public TextureRegion getCurrentFramePartialTexture() {
        return currentFramePartialTexture;
    }

    public void setCurrentFramePartialTexture(TextureRegion currentFramePartialTexture) {
        this.currentFramePartialTexture = currentFramePartialTexture;
    }

    public Texture[] getTextures() {
        return textures;
    }

    public void setTextures(Texture[] textures) {
        this.textures = textures;
    }

    public TextureRegion[] getPartialTextures() {
        return partialTextures;
    }

    public void setPartialTextures(TextureRegion[] partialTextures) {
        this.partialTextures = partialTextures;
    }
}
