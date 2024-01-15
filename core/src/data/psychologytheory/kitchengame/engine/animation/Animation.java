package data.psychologytheory.kitchengame.engine.animation;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Animation {
    private final int frames;
    private int startingFrame;
    private int endingFrame;
    private final int speed;
    private int currentFrame;

    public Animation(int frames, int speed) {
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

    public int getStartingFrame() {
        return startingFrame;
    }

    public void setStartingFrame(int startingFrame) {
        this.startingFrame = startingFrame;
    }

    public int getEndingFrame() {
        return endingFrame;
    }

    public void setEndingFrame(int endingFrame) {
        this.endingFrame = endingFrame;
    }
}
