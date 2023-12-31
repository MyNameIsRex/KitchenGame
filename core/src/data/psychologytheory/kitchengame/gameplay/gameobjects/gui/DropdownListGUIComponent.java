package data.psychologytheory.kitchengame.gameplay.gameobjects.gui;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class DropdownListGUIComponent extends AbstractGUIComponent {
    private String[] dropdownItemList;
    private BitmapFont dropdownItemFont;
    private int dropdownItemSize = 0;
    private int currentSelection = 0;
    private Texture[] dropdownListBackgrounds;
    private TextureRegion[] dropdownListPartialBackgrounds;
    private int[][] dropdownListPartialBackgroundsOffset;

    public DropdownListGUIComponent(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, int zIndex, String[] dropdownItemList, BitmapFont dropdownItemFont, Texture[] dropdownListBackgrounds) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, zIndex);
        this.dropdownItemList = dropdownItemList;
        this.dropdownItemFont = dropdownItemFont;
        this.dropdownItemSize = this.dropdownItemList.length;
        this.dropdownListBackgrounds = dropdownListBackgrounds;
    }

    public DropdownListGUIComponent(int objID, float objWidth, float objHeight, float objPosX, float objPosY, String objName, int zIndex, String[] dropdownItemList, BitmapFont dropdownItemFont, TextureRegion[] dropdownListPartialBackgrounds, int[][] dropdownListPartialBackgroundsOffset) {
        super(objID, objWidth, objHeight, objPosX, objPosY, objName, zIndex);
        this.dropdownItemList = dropdownItemList;
        this.dropdownItemFont = dropdownItemFont;
        this.dropdownItemSize = this.dropdownItemList.length;
        this.dropdownListPartialBackgrounds = dropdownListPartialBackgrounds;
        this.dropdownListPartialBackgroundsOffset = dropdownListPartialBackgroundsOffset;
    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public void render() {
        super.render();
    }

    public String[] getDropdownItemList() {
        return dropdownItemList;
    }

    public void setDropdownItemList(String[] dropdownItemList) {
        this.dropdownItemList = dropdownItemList;
    }

    public BitmapFont getDropdownItemFont() {
        return dropdownItemFont;
    }

    public void setDropdownItemFont(BitmapFont dropdownItemFont) {
        this.dropdownItemFont = dropdownItemFont;
    }

    public int getDropdownItemSize() {
        return dropdownItemSize;
    }

    public void setDropdownItemSize(int dropdownItemSize) {
        this.dropdownItemSize = dropdownItemSize;
    }

    public int getCurrentSelection() {
        return currentSelection;
    }

    public void setCurrentSelection(int currentSelection) {
        this.currentSelection = currentSelection;
    }

    public Texture[] getDropdownListBackgrounds() {
        return dropdownListBackgrounds;
    }

    public void setDropdownListBackgrounds(Texture[] dropdownListBackgrounds) {
        this.dropdownListBackgrounds = dropdownListBackgrounds;
    }

    public TextureRegion[] getDropdownListPartialBackgrounds() {
        return dropdownListPartialBackgrounds;
    }

    public void setDropdownListPartialBackgrounds(TextureRegion[] dropdownListPartialBackgrounds) {
        this.dropdownListPartialBackgrounds = dropdownListPartialBackgrounds;
    }

    public int[][] getDropdownListPartialBackgroundsOffset() {
        return dropdownListPartialBackgroundsOffset;
    }

    public void setDropdownListPartialBackgroundsOffset(int[][] dropdownListPartialBackgroundsOffset) {
        this.dropdownListPartialBackgroundsOffset = dropdownListPartialBackgroundsOffset;
    }
}
