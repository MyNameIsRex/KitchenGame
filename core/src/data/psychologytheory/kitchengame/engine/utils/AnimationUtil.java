package data.psychologytheory.kitchengame.engine.utils;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import data.psychologytheory.kitchengame.engine.animation.Animation;

public class AnimationUtil {
    public static AnimationUtil instance;

    public Animation createAnimation(Texture[] textures, int frames, int speed) {
        return frames == textures.length ? new Animation(textures, frames, speed) : null;
    }

    public Animation createAnimation(TextureRegion[] partialTextures, int frames, int speed) {
        return frames == partialTextures.length ? new Animation(partialTextures, frames, speed) : null;
    }

    public Texture getAnimationFrame(Animation animation) {
        return animation.getCurrentFrameTexture();
    }

    public TextureRegion getAnimationPartialFrame(Animation animation) {
        return animation.getCurrentFramePartialTexture();
    }

    public void setCurrentFrame(Animation animation, int frame) {
        animation.setCurrentFrame(frame);
    }

    public void createBufferTime(Animation animation) {
        int counter = 0;
        while (counter < animation.getSpeed()) {
            counter++;
        }
    }

    public void changeFrame(Animation animation) {
        if (animation.getCurrentFrame() < animation.getFrames()) {
            animation.setCurrentFrame(animation.getCurrentFrame() + 1);
        } else {
            animation.setCurrentFrame(0);
        }
    }

    public void playAnimation(Animation animation, int startFrame) {
        AnimationUtil.getInstance().setCurrentFrame(animation, startFrame);
        AnimationUtil.getInstance().createBufferTime(animation);
        AnimationUtil.getInstance().changeFrame(animation);
    }

    public void playAnimation(Animation animation) {
        AnimationUtil.getInstance().createBufferTime(animation);
        AnimationUtil.getInstance().changeFrame(animation);
    }

    public static AnimationUtil getInstance() {
        if (instance == null) {
            instance = new AnimationUtil();
        }
        return instance;
    }
}
