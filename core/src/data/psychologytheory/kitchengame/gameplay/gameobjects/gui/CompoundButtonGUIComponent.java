package data.psychologytheory.kitchengame.gameplay.gameobjects.gui;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import data.psychologytheory.kitchengame.KitchenGame;
import data.psychologytheory.kitchengame.engine.io.MouseInput;
import data.psychologytheory.kitchengame.engine.rendering.RenderHelper;

import java.util.function.Consumer;

public class CompoundButtonGUIComponent extends AbstractGUIComponent {
    private Consumer<Boolean> buttonAction;
    private Texture[] buttonBackgrounds;
    private TextureRegion[] buttonPartialBackgrounds;
    private int[][] buttonPartialBackgroundOffsets;
    private String buttonText;
    private BitmapFont buttonFont;
    private boolean isHoveredOver = false;
    private boolean isPressed = false;

    public CompoundButtonGUIComponent(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, int zIndex, String buttonText, BitmapFont buttonFont, Texture[] buttonBackgrounds, Consumer<Boolean> buttonAction) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, zIndex);
        this.buttonText = buttonText;
        this.buttonFont = buttonFont;
        this.buttonBackgrounds = buttonBackgrounds;
        this.buttonAction = buttonAction;
    }

    public CompoundButtonGUIComponent(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, int zIndex, String buttonText, BitmapFont buttonFont, TextureRegion[] buttonBackgrounds, int[][] buttonPartialBackgroundOffsets, Consumer<Boolean> buttonAction) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, zIndex);
        this.buttonText = buttonText;
        this.buttonFont = buttonFont;
        this.buttonPartialBackgrounds = buttonBackgrounds;
        this.buttonPartialBackgroundOffsets = buttonPartialBackgroundOffsets;
        this.buttonAction = buttonAction;
    }

    @Override
    public void update() {
        super.update();
        if (this.isDisplayGUIComponent()) {
            this.isHoveredOver = MouseInput.getMousePosX() >= this.getObjPosX() * KitchenGame.currentRatio && MouseInput.getMousePosX() <= (this.getObjPosX() + this.getObjWidth()) * KitchenGame.currentRatio &&
                    MouseInput.getMousePosY() >= this.getObjPosY() * KitchenGame.currentRatio && MouseInput.getMousePosY() <= (this.getObjPosY() + this.getObjHeight()) * KitchenGame.currentRatio;

            if (isHoveredOver && MouseInput.isMouseButtonPressed(Input.Buttons.LEFT)) {
                this.isPressed = true;
                this.buttonAction.accept(true);
            } else {
                this.isPressed = false;
            }
        }
    }

    @Override
    public void render() {
        super.render();
        if (this.isDisplayGUIComponent()) {
            if (!this.isHoveredOver) {
                if (!(this.buttonBackgrounds == null)) {
                    RenderHelper.getInstance().renderTexture(this.buttonBackgrounds[0], (int) this.getObjPosX(), (int) this.getObjPosY());
                } else {
                    RenderHelper.getInstance().renderPartialTexture(this.buttonPartialBackgrounds[0], (int) this.getObjPosX(), (int) this.getObjPosY());
                }
            } else {
                if (!this.isPressed) {
                    if (!(this.buttonBackgrounds == null)) {
                        RenderHelper.getInstance().renderTexture(this.buttonBackgrounds[1], (int) this.getObjPosX(), (int) this.getObjPosY());
                    } else {
                        RenderHelper.getInstance().renderPartialTexture(this.buttonPartialBackgrounds[1], (int) this.getObjPosX(), (int) this.getObjPosY());
                    }
                } else {
                    if (!(this.buttonBackgrounds == null)) {
                        RenderHelper.getInstance().renderTexture(this.buttonBackgrounds[0], (int) this.getObjPosX(), (int) this.getObjPosY());
                    } else {
                        RenderHelper.getInstance().renderPartialTexture(this.buttonPartialBackgrounds[0], (int) this.getObjPosX(), (int) this.getObjPosY());
                    }
                }
            }
            RenderHelper.getInstance().renderText(this.buttonText, this.buttonFont, (int) this.getObjPosX() + 18, (int) (this.getObjPosY() + this.getObjHeight() / 2 + 9));
        }
    }

    public Consumer<Boolean> getButtonAction() {
        return buttonAction;
    }

    public void setButtonAction(Consumer<Boolean> buttonAction) {
        this.buttonAction = buttonAction;
    }

    public Texture[] getButtonBackgrounds() {
        return buttonBackgrounds;
    }

    public void setButtonBackgrounds(Texture[] buttonBackgrounds) {
        this.buttonBackgrounds = buttonBackgrounds;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public BitmapFont getButtonFont() {
        return buttonFont;
    }

    public void setButtonFont(BitmapFont buttonFont) {
        this.buttonFont = buttonFont;
    }

    public TextureRegion[] getButtonPartialBackgrounds() {
        return buttonPartialBackgrounds;
    }

    public void setButtonPartialBackgrounds(TextureRegion[] buttonPartialBackgrounds) {
        this.buttonPartialBackgrounds = buttonPartialBackgrounds;
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

    public int[][] getButtonPartialBackgroundOffsets() {
        return buttonPartialBackgroundOffsets;
    }

    public void setButtonPartialBackgroundOffsets(int[][] buttonPartialBackgroundOffsets) {
        this.buttonPartialBackgroundOffsets = buttonPartialBackgroundOffsets;
    }
}
