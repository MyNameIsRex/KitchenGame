package data.psychologytheory.kitchengame.engine.io;

import com.badlogic.gdx.Gdx;

public class KeyboardInput {
    public static boolean isKeyPressed(int key) {
        return Gdx.input.isKeyPressed(key);
    }

    public static boolean isKeyJustReleased(int key) {
        return Gdx.input.isKeyJustPressed(key);
    }
}
