package data.psychologytheory.kitchengame.gameplay.init;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
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
        AssetList.PRESS_START_2P.setBitmapFont(new FreeTypeFontGenerator(Gdx.files.internal(AssetList.PRESS_START_2P.getAssetLocation())), 18, Color.BLACK);
        //Gameplay Scene
        GUIList.CURRENT_ORDER_PROMPT.setGUIComponent(new CompoundGUIComponent(0, 256, 256, 15, 448, "current_order_prompt",
                8, "Order 1", AssetList.PRESS_START_2P.getBitmapFont(), new Texture[]{AssetList.CURRENT_ORDER_PROMPT.getTexture()},
                80, 102));
        GUIList.COUNTDOWN_PROMPT.setGUIComponent(new CompoundGUIComponent(1, 256, 100, 512, 604, "countdown_prompt",
                8, "Keep Going!", AssetList.PRESS_START_2P.getBitmapFont(), new Texture[]{AssetList.COUNTDOWN_PROMPT.getTexture()},
                54, 26));
        GUIList.INFORMATION_PROMPT.setGUIComponent(new CompoundGUIComponent(2, 256, 196, 1008, 508, "information_prompt",
                8, "New Info!", AssetList.PRESS_START_2P.getBitmapFont(), new Texture[]{AssetList.INFORMATION_PROMPT.getTexture()},
                68, 72));
        GUIList.CURRENT_TIME_PROMPT.setGUIComponent(new CompoundGUIComponent(3, 256, 64, 512, 16, "current_time_prompt",
                8, "12 : 30 PM", AssetList.PRESS_START_2P.getBitmapFont(), new Texture[]{AssetList.CURRENT_TIME_PROMPT.getTexture()},
                60, 6));
        //Main Menu Scene
        //Options Scene
    }

    @Override
    public void loadContents() {
        GUI_MAP.put(GUIList.CURRENT_ORDER_PROMPT.getGUIID(), GUIList.CURRENT_ORDER_PROMPT.getGUIComponent());
        GUI_MAP.put(GUIList.COUNTDOWN_PROMPT.getGUIID(), GUIList.COUNTDOWN_PROMPT.getGUIComponent());
        GUI_MAP.put(GUIList.INFORMATION_PROMPT.getGUIID(), GUIList.INFORMATION_PROMPT.getGUIComponent());
        GUI_MAP.put(GUIList.CURRENT_TIME_PROMPT.getGUIID(), GUIList.CURRENT_TIME_PROMPT.getGUIComponent());
    }

    @Override
    public void disposeContents() {

    }
}
