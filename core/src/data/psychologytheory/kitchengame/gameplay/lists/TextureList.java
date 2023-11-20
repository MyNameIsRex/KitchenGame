package data.psychologytheory.kitchengame.gameplay.lists;

import com.badlogic.gdx.graphics.Texture;

public enum TextureList {
    KITCHEN_BACKGROUND(0, "textures/kitchen_background.png"),

    //Kitchen Table
    KITCHEN_TABLE_TOP(1, "textures/table_top.png"),
    KITCHEN_TABLE_TOP_LARGE(2, "textures/table_top_large.png"),

    //Fridge
    KITCHEN_FRIDGE_DOOR_CLOSED(3, "textures/fridge/fridge_door_closed.png"),
    KITCHEN_FRIDGE_DOOR_OPENED(4, "textures/fridge/fridge_door_opened.png"),
    KITCHEN_FRIDGE_EMPTY(5, "textures/fridge/fridge_empty.png"),
    KITCHEN_FRIDGE_FULL(6, "textures/fridge/fridge_full.png"),

    //Grill
    KITCHEN_GRILL_OFF(7, "textures/grill/grill_off.png"),
    KITCHEN_GRILL_ON(8, "textures/grill/grill_on.png"),

    //Hot Plate
    KITCHEN_HOT_PLATE(9, "textures/hot_plate/hot_plate.png"),

    //Oven
    KITCHEN_OVEN_DOOR_CLOSED(10, "textures/oven/oven_door_closed.png"),
    KITCHEN_OVEN_DOOR_OPENED(11, "textures/oven/oven_door_opened.png"),
    KITCHEN_OVEN_OFF(12, "textures/oven/oven_off.png"),
    KITCHEN_OVEN_ON(13, "textures/oven/oven_on.png"),

    //Sink
    KITCHEN_SINK_EMPTY(14, "textures/sink/sink_empty.png"),
    KITCHEN_SINK_FULL(15, "textures/sink/sink_full.png"),

    //Stove
    KITCHEN_STOVE_OFF(16, "textures/stove/stove_off.png"),
    KITCHEN_STOVE_ON(17, "textures/stove/stove_on.png"),

    //Characters
    KITCHEN_CHEF(18, "textures/characters/chef/chef.png"),
    KITCHEN_LINE_COOK(19, "textures/characters/line_cook/line_cook.png"),
    KITCHEN_SOUS_CHEF(20, "textures/characters/sous_chef/sous_chef.png");

    private int textureID;
    private String textureLocation;

    private Texture texture;

    TextureList(int textureID, String textureLocation) {
        this.textureID = textureID;
        this.textureLocation = textureLocation;
    }

    public int getTextureID() {
        return this.textureID;
    }

    public void setTextureID(int textureID) {
        this.textureID = textureID;
    }

    public String getTextureLocation() {
        return this.textureLocation;
    }

    public void setTextureLocation(String textureLocation) {
        this.textureLocation = textureLocation;
    }

    public Texture getTexture() {
        return this.texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }
}
