package data.psychologytheory.kitchengame.engine.utils;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import data.psychologytheory.kitchengame.engine.animation.Animation;

public class AnimationUtil {
    public static AnimationUtil instance;

    public Animation createAnimation(Texture[] textures, int frames, int speed) {
        return new Animation(textures, frames, speed);
    }

    public Animation createAnimation(TextureRegion[] partialTextures, int frames, int speed) {
        return new Animation(partialTextures, frames, speed);
    }

    public void setStartingFrame(Animation animation, int startingFrame) {
        animation.setStartingFrame(startingFrame);
    }

    public void setEndingFrame(Animation animation, int endingFrame) {
        animation.setEndingFrame(endingFrame);
    }

    public void nextFrame(Animation animation) {
        animation.setCurrentFrame(animation.getCurrentFrame() + 1);
    }

    public void updateAnimationTexture(Animation animation) {
        animation.setCurrentFrameTexture(animation.getTextures()[animation.getCurrentFrame() - 1]);
    }

    public void updateAnimationPartialTexture(Animation animation) {
        animation.setCurrentFramePartialTexture(animation.getPartialTextures()[animation.getCurrentFrame() - 1]);
    }

    public Texture getCurrentAnimationTexture(Animation animation) {
        return animation.getCurrentFrameTexture();
    }

    public TextureRegion getCurrentAnimationPartialTexture(Animation animation) {
        return animation.getCurrentFramePartialTexture();
    }

    public static AnimationUtil getInstance() {
        if (instance == null) {
            instance = new AnimationUtil();
        }
        return instance;
    }
}
