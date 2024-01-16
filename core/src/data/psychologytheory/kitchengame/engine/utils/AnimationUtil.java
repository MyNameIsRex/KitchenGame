package data.psychologytheory.kitchengame.engine.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import data.psychologytheory.kitchengame.engine.animation.Animation;

public class AnimationUtil {
    public static AnimationUtil instance;

    public Animation createAnimation(int frames, int speed) {
        return new Animation(frames, speed);
    }

    public float addDeltaToBufferTime(float time) {
        time += Gdx.graphics.getDeltaTime();
        return time;
    }

    public void initialFrame(Animation animation, int startingFrame) {
        animation.setCurrentFrame(startingFrame);
    }

    public void nextFrame(Animation animation, int startingFrame, int endingFrame) {
        if (startingFrame <= animation.getCurrentFrame() && animation.getCurrentFrame() < endingFrame) {
            animation.setCurrentFrame(animation.getCurrentFrame() + 1);
        } else {
            animation.setCurrentFrame(startingFrame);
        }
    }

    public void playAnimation(Animation animation, int startingFrame, int endingFrame) {
        if (animation.getTimer() == 0) {
            AnimationUtil.getInstance().initialFrame(animation, startingFrame);
        }
        animation.setTimer(animation.getTimer() + addDeltaToBufferTime(animation.getTimer()));
        if (animation.getTimer() > animation.getSpeed() + 1) {
            nextFrame(animation, startingFrame, endingFrame);
            animation.setTimer(1);
        }
    }

    public void nextFrame(Animation animation) {
        AnimationUtil.getInstance().nextFrame(animation, 0, animation.getFrames() - 1);
    }

    public int getCurrentFrame(Animation animation) {
        return animation.getCurrentFrame();
    }

    public static AnimationUtil getInstance() {
        if (instance == null) {
            instance = new AnimationUtil();
        }
        return instance;
    }
}
