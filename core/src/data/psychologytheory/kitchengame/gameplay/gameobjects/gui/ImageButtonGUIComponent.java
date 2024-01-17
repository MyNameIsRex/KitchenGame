package data.psychologytheory.kitchengame.gameplay.gameobjects.gui;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import data.psychologytheory.kitchengame.KitchenGame;
import data.psychologytheory.kitchengame.engine.interfaces.IClickListener;
import data.psychologytheory.kitchengame.engine.io.MouseInput;
import data.psychologytheory.kitchengame.engine.utils.RenderUtil;

public class ImageButtonGUIComponent extends AbstractGUIComponent {
    private IClickListener clickListener;
    private Texture[] buttonTextures;
    private TextureRegion[] buttonPartialTextures;
    private int[][] buttonPartialTexturesOffset;
    private boolean isHoveredOver = false;
    private boolean isPressed = false;

    public ImageButtonGUIComponent(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, int zIndex, Texture[] buttonTextures, IClickListener clickListener) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, zIndex);
        this.buttonTextures = buttonTextures;
        this.clickListener = clickListener;
    }

    public ImageButtonGUIComponent(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, int zIndex, TextureRegion[] buttonPartialTextures, int[][] buttonPartialTexturesOffset, IClickListener clickListener) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, zIndex);
        this.buttonPartialTextures = buttonPartialTextures;
        this.buttonPartialTexturesOffset = buttonPartialTexturesOffset;
        this.clickListener = clickListener;
    }

    @Override
    public void update() {
        super.update();
        if (this.isDisplayGUIComponent()) {
            this.isHoveredOver = MouseInput.getMousePosX() >= this.getObjPosX() * KitchenGame.currentRatioX && MouseInput.getMousePosX() <= (this.getObjPosX() + this.getObjWidth()) * KitchenGame.currentRatioX &&
                    MouseInput.getMousePosY() >= this.getObjPosY() * KitchenGame.currentRatioY && MouseInput.getMousePosY() <= (this.getObjPosY() + this.getObjHeight()) * KitchenGame.currentRatioY;

            if (isHoveredOver && MouseInput.isMouseButtonPressed(Input.Buttons.LEFT)) {
                this.isPressed = true;
                this.clickListener.executeAction();
            } else {
                this.isPressed = false;
            }
        }
    }

    @Override
    public void render() {
        if (this.isDisplayGUIComponent()) {
            if (!this.isHoveredOver) {
                if (!(this.buttonTextures == null)) {
                    RenderUtil.getInstance().renderTexture(this.buttonTextures[0], (int) this.getObjPosX(), (int) this.getObjPosY());
                } else {
                    RenderUtil.getInstance().renderPartialTexture(this.buttonPartialTextures[0], (int) this.getObjPosX(), (int) this.getObjPosY());
                }
            } else {
                if (!this.isPressed) {
                    if (!(this.buttonTextures == null)) {
                        RenderUtil.getInstance().renderTexture(this.buttonTextures[1], (int) this.getObjPosX(), (int) this.getObjPosY());
                    } else {
                        RenderUtil.getInstance().renderPartialTexture(this.buttonPartialTextures[1], (int) this.getObjPosX(), (int) this.getObjPosY());
                    }
                } else {
                    if (!(this.buttonTextures == null)) {
                        RenderUtil.getInstance().renderTexture(this.buttonTextures[0], (int) this.getObjPosX(), (int) this.getObjPosY());
                    } else {
                        RenderUtil.getInstance().renderPartialTexture(this.buttonPartialTextures[0], (int) this.getObjPosX(), (int) this.getObjPosY());
                    }
                }
            }
        }
    }

    public Texture[] getButtonTextures() {
        return buttonTextures;
    }

    public void setButtonTextures(Texture[] buttonTextures) {
        this.buttonTextures = buttonTextures;
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

    public TextureRegion[] getButtonPartialTextures() {
        return buttonPartialTextures;
    }

    public void setButtonPartialTextures(TextureRegion[] buttonPartialTextures) {
        this.buttonPartialTextures = buttonPartialTextures;
    }

    public IClickListener getClickListener() {
        return clickListener;
    }

    public void setClickListener(IClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public int[][] getButtonPartialTexturesOffset() {
        return buttonPartialTexturesOffset;
    }

    public void setButtonPartialTexturesOffset(int[][] buttonPartialTexturesOffset) {
        this.buttonPartialTexturesOffset = buttonPartialTexturesOffset;
    }
}
