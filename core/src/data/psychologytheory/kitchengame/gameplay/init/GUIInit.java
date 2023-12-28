package data.psychologytheory.kitchengame.gameplay.init;

import com.badlogic.gdx.graphics.Texture;
import data.psychologytheory.kitchengame.engine.interfaces.IContent;
import data.psychologytheory.kitchengame.gameplay.gameobjects.gui.*;
import data.psychologytheory.kitchengame.gameplay.lists.AssetList;
import data.psychologytheory.kitchengame.gameplay.lists.GUIList;
import data.psychologytheory.kitchengame.gameplay.scenes.SceneHelper;
import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.Map;

public class GUIInit implements IContent {
    public static final Map<Integer, AbstractGUIComponent> GUI_MAP = new HashMap<>();

    @Override
    public void createContents() {
        GUIList.TEST_TEXT.setGUIComponent(new TextGUIComponent(0, 100, 100, 300, 700, "test_text", 8, "GUI Test Scene", AssetList.PRESS_START_2P.getBitmapFont()));
        GUIList.TEST_IMAGE.setGUIComponent(new ImageGUIComponent(1, 64, 64, 100, 100, "test_image", 9, AssetList.KITCHEN_SINK_FULL.getTexture()));
        GUIList.TEST_BUTTON.setGUIComponent(new ImageButtonGUIComponent(2, 64, 64, 500, 300, "test_button", 9, new Texture[]{AssetList.KITCHEN_TABLE_TOP_LARGE.getTexture(), AssetList.KITCHEN_SINK_FULL.getTexture()},
                (runAction) -> {
                    if (runAction) {
                        SceneHelper.currentSceneID = 0;
                    }
        }));
        GUIList.TEST_COMPOUND_BUTTON.setGUIComponent(new CompoundButtonGUIComponent(3, 64, 64, 100, 600, "test_compound_button", 9, "Change Scene", AssetList.PRESS_START_2P.getBitmapFont(), new Texture[]{AssetList.KITCHEN_TABLE_TOP_LARGE.getTexture(), AssetList.KITCHEN_GRILL_ON.getTexture()},
                (runAction) -> {
                    if (runAction) {
                        SceneHelper.currentSceneID = 1;
                    }
                }));
    }

    @Override
    public void loadContents() {
        GUI_MAP.put(GUIList.TEST_TEXT.getGUIID(), GUIList.TEST_TEXT.getGUIComponent());
        GUI_MAP.put(GUIList.TEST_IMAGE.getGUIID(), GUIList.TEST_IMAGE.getGUIComponent());
        GUI_MAP.put(GUIList.TEST_BUTTON.getGUIID(), GUIList.TEST_BUTTON.getGUIComponent());
        GUI_MAP.put(GUIList.TEST_COMPOUND_BUTTON.getGUIID(), GUIList.TEST_COMPOUND_BUTTON.getGUIComponent());
    }

    @Override
    public void disposeContents() {

    }
}
