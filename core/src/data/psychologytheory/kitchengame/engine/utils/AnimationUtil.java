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
        while (counter < animation.getSpeed() * 1000000000) {
            counter++;
        }
    }

    public void changeFrame(Animation animation) {
        if (animation.getCurrentFrame() < animation.getFrames()) {
            animation.setCurrentFrame(animation.getCurrentFrame() + 1);
        } else {
            animation.setCurrentFrame(0);
        }
        AnimationUtil.getInstance().setCurrentFramePartialTexture(animation, animation.getCurrentFrame());
    }

    public void setCurrentFramePartialTexture(Animation animation, int currentFrame) {
        animation.setCurrentFramePartialTexture(animation.getPartialTextures()[currentFrame]);
    }

    public void playAnimation(Animation animation, int startFrame, int frameLength) {
        AnimationUtil.getInstance().setCurrentFrame(animation, startFrame);
        AnimationUtil.getInstance().setCurrentFramePartialTexture(animation, startFrame);
        for (int i = 0; i < frameLength; i++) {
            AnimationUtil.getInstance().createBufferTime(animation);
            AnimationUtil.getInstance().changeFrame(animation);
            System.out.println("Animation: " + animation + " just increased a frame to frame " + animation.getCurrentFrame());
        }
    }

    public void playAnimation(Animation animation, int frameLength) {
        AnimationUtil.getInstance().setCurrentFrame(animation, 0);
        AnimationUtil.getInstance().setCurrentFramePartialTexture(animation, 0);
        for (int i = 0; i < frameLength; i++) {
            AnimationUtil.getInstance().createBufferTime(animation);
            AnimationUtil.getInstance().changeFrame(animation);
            System.out.println("Animation: " + animation + " just increased a frame to frame " + animation.getCurrentFrame());
        }
    }

    public static AnimationUtil getInstance() {
        if (instance == null) {
            instance = new AnimationUtil();
        }
        return instance;
    }
}
