package data.psychologytheory.kitchengame.gameplay.gameobjects.gui;

import com.badlogic.gdx.Input;
import data.psychologytheory.kitchengame.KitchenGame;
import data.psychologytheory.kitchengame.engine.interfaces.IClickListener;
import data.psychologytheory.kitchengame.engine.io.MouseInput;

public class ButtonGuiComponent extends HUDGuiComponent {
    private IClickListener clickListener;
    private boolean isHoveredOver = false;
    private boolean isPressed = false;

    public ButtonGuiComponent(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, int zIndex) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, zIndex);
    }

    @Override
    public void update() {
        super.update();

        if (!this.isDisplayGUIComponent()) {
            return;
        }

        this.isHoveredOver = MouseInput.getMousePosX() >= this.getObjPosX() * KitchenGame.currentRatioX &&
                MouseInput.getMousePosX() <= (this.getObjPosX() + this.getObjWidth()) * KitchenGame.currentRatioX &&
                MouseInput.getMousePosY() >= this.getObjPosY() * KitchenGame.currentRatioY &&
                MouseInput.getMousePosY() <= (this.getObjPosY() + this.getObjHeight()) * KitchenGame.currentRatioY;

        this.isPressed = MouseInput.isMouseButtonPressed(Input.Buttons.LEFT);

        if (!this.isHoveredOver || !this.isPressed) {
            return;
        }

        this.clickListener.executeAction();
    }

    public IClickListener getClickListener() {
        return clickListener;
    }

    public void setClickListener(IClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public boolean isHoveredOver() {
        return isHoveredOver;
    }

    public void setHoveredOver(boolean hoveredOver) {
        isHoveredOver = hoveredOver;
    }

    public boolean isPressed() {
        return isPressed;
    }

    public void setPressed(boolean pressed) {
        isPressed = pressed;
    }
}
