package data.psychologytheory.kitchengame.gameplay.init;

import data.psychologytheory.kitchengame.KitchenGame;
import data.psychologytheory.kitchengame.engine.interfaces.IContent;
import data.psychologytheory.kitchengame.engine.rendering.RenderHelper;
import data.psychologytheory.kitchengame.gameplay.gameobjects.AbstractGameObject;
import data.psychologytheory.kitchengame.gameplay.gameobjects.gui.AbstractGUIComponent;
import data.psychologytheory.kitchengame.gameplay.gameobjects.gui.TextGUIComponent;
import data.psychologytheory.kitchengame.gameplay.lists.AssetList;
import data.psychologytheory.kitchengame.gameplay.lists.GUIList;

import java.util.HashMap;
import java.util.Map;

public class GUIInit implements IContent {
    public static final Map<Integer, AbstractGUIComponent> GUI_MAP = new HashMap<>();

    @Override
    public void createContents() {
        GUIList.TEST_TEXT.setGUIComponent(new TextGUIComponent(0, 10, 10, 640 - 172, 360 + 36, "test_text", 8, "Hello World!", AssetList.GUI_TEXT_72_BLACK.getBitmapFont()));
    }

    @Override
    public void loadContents() {
        GUI_MAP.put(GUIList.TEST_TEXT.getGUIID(), GUIList.TEST_TEXT.getGUIComponent());
    }

    @Override
    public void disposeContents() {

    }
}
