package data.psychologytheory.kitchengame.engine.io;

import com.badlogic.gdx.Gdx;
import data.psychologytheory.kitchengame.KitchenGame;

public class MouseInput {
    public static boolean isMouseButtonPressed(int button) {
        return Gdx.input.isButtonJustPressed(button);
    }

    public static boolean isMouseButtonHolding(int button) {
        return Gdx.input.isButtonPressed(button);
    }

    public static int getMousePosX() {
        return Gdx.input.getX();
    }

    public static int getMousePosY() {
        return KitchenGame.currentHeight - Gdx.input.getY();
    }
}
