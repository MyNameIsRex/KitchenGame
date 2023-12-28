package data.psychologytheory.kitchengame.gameplay.lists;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

public enum AssetList {
    KITCHEN_BACKGROUND(0, "textures/gameplay/kitchen_background.png"),

    //Kitchen Table
    KITCHEN_TABLE_TOP(1, "textures/gameplay/table_top.png"),
    KITCHEN_TABLE_TOP_LARGE(2, "textures/gameplay/table_top_large.png"),

    //Fridge
    KITCHEN_FRIDGE_DOOR_CLOSED(3, "textures/gameplay/fridge/fridge_door_closed.png"),
    KITCHEN_FRIDGE_DOOR_OPENED(4, "textures/gameplay/fridge/fridge_door_opened.png"),
    KITCHEN_FRIDGE_EMPTY(5, "textures/gameplay/fridge/fridge_empty.png"),
    KITCHEN_FRIDGE_FULL(6, "textures/gameplay/fridge/fridge_full.png"),

    //Grill
    KITCHEN_GRILL_OFF(7, "textures/gameplay/grill/grill_off.png"),
    KITCHEN_GRILL_ON(8, "textures/gameplay/grill/grill_on.png"),

    //Hot Plate
    KITCHEN_HOT_PLATE(9, "textures/gameplay/hot_plate/hot_plate.png"),

    //Oven
    KITCHEN_OVEN_DOOR_CLOSED(10, "textures/gameplay/oven/oven_door_closed.png"),
    KITCHEN_OVEN_DOOR_OPENED(11, "textures/gameplay/oven/oven_door_opened.png"),
    KITCHEN_OVEN_OFF(12, "textures/gameplay/oven/oven_off.png"),
    KITCHEN_OVEN_ON(13, "textures/gameplay/oven/oven_on.png"),

    //Sink
    KITCHEN_SINK_EMPTY(14, "textures/gameplay/sink/sink_empty.png"),
    KITCHEN_SINK_FULL(15, "textures/gameplay/sink/sink_full.png"),

    //Stove
    KITCHEN_STOVE_OFF(16, "textures/gameplay/stove/stove_off.png"),
    KITCHEN_STOVE_ON(17, "textures/gameplay/stove/stove_on.png"),

    //Characters
    KITCHEN_CHEF(18, "textures/gameplay/characters/chef/chef.png"),
    KITCHEN_LINE_COOK(19, "textures/gameplay/characters/line_cook/line_cook.png"),
    KITCHEN_SOUS_CHEF(20, "textures/gameplay/characters/sous_chef/sous_chef.png"),

    //Fonts
    PRESS_START_2P(50, "textures/gui/fonts/press_start_2p/press_start_2p.ttf");

    //Sound

    private int assetID;
    private String assetLocation;

    private Texture texture;
    private BitmapFont bitmapFont;

    AssetList(int assetID, String assetLocation) {
        this.assetID = assetID;
        this.assetLocation = assetLocation;
    }

    public int getAssetID() {
        return this.assetID;
    }

    public void setAssetID(int assetID) {
        this.assetID = assetID;
    }

    public String getAssetLocation() {
        return this.assetLocation;
    }

    public void setAssetLocation(String assetLocation) {
        this.assetLocation = assetLocation;
    }

    public Texture getTexture() {
        return this.texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public BitmapFont getBitmapFont() {
        return this.bitmapFont;
    }

    public void setBitmapFont(FreeTypeFontGenerator fontGenerator, int fontSize, Color color) {
        FreeTypeFontGenerator.FreeTypeFontParameter fontParameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        fontParameter.size = fontSize;
        fontParameter.color = color;
        fontParameter.magFilter = Texture.TextureFilter.Nearest;
        fontParameter.minFilter = Texture.TextureFilter.Nearest;
        this.bitmapFont = fontGenerator.generateFont(fontParameter);
    }
}
