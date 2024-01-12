package data.psychologytheory.kitchengame.gameplay.init;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import data.psychologytheory.kitchengame.engine.interfaces.IContent;
import data.psychologytheory.kitchengame.engine.rendering.RenderHelper;
import data.psychologytheory.kitchengame.gameplay.gameobjects.gui.*;
import data.psychologytheory.kitchengame.gameplay.gameobjects.gui.gameplay.CountdownPromptGUIComponent;
import data.psychologytheory.kitchengame.gameplay.gameobjects.gui.gameplay.CurrentOrderPromptGUIComponent;
import data.psychologytheory.kitchengame.gameplay.gameobjects.gui.gameplay.CurrentTimePromptGUIComponent;
import data.psychologytheory.kitchengame.gameplay.gameobjects.gui.gameplay.InformationPromptGUIComponent;
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
        //Gameplay Scene
        GUIList.CURRENT_ORDER_PROMPT.setGUIComponent(new CurrentOrderPromptGUIComponent(0, 256, 256, 15, 448, "current_order_prompt",
                8, "Order 1", AssetList.ROBOTO_BLACK.getBitmapFont(),
                new TextureRegion[]{RenderHelper.getInstance().createPartialTexture(AssetList.CURRENT_ORDER_PROMPT.getTexture(), 0, 0, 256, 67),
                RenderHelper.getInstance().createPartialTexture(AssetList.CURRENT_ORDER_PROMPT.getTexture(), 0, 68, 256, 188)},
                new int[][]{{0, 188},{0, 0}},
                80, 235));
        GUIList.COUNTDOWN_PROMPT.setGUIComponent(new CountdownPromptGUIComponent(1, 256, 100, 512, 604, "countdown_prompt",
                8, "Keep Going!", AssetList.ROBOTO_BLACK.getBitmapFont(),
                new TextureRegion[]{RenderHelper.getInstance().createPartialTexture(AssetList.COUNTDOWN_PROMPT.getTexture(), 0, 0, 256, 67),
                RenderHelper.getInstance().createPartialTexture(AssetList.COUNTDOWN_PROMPT.getTexture(), 0, 68, 256, 32)},
                new int[][]{{0, 32}, {0, 0}},
                54, 80));
        GUIList.INFORMATION_PROMPT.setGUIComponent(new InformationPromptGUIComponent(2, 256, 196, 1008, 508, "information_prompt",
                8, "New Info!", AssetList.ROBOTO_BLACK.getBitmapFont(),
                new TextureRegion[]{RenderHelper.getInstance().createPartialTexture(AssetList.INFORMATION_PROMPT.getTexture(), 0, 0, 256, 67),
                RenderHelper.getInstance().createPartialTexture(AssetList.INFORMATION_PROMPT.getTexture(), 0, 68, 256, 128)},
                new int[][]{{0, 128}, {0, 0}},
                68, 175));
        //Change Back Later
        GUIList.CURRENT_TIME_PROMPT.setGUIComponent(new CurrentTimePromptGUIComponent(3, 256, 64, 512, 16, "current_time_prompt",
                8, "12 : 30 PM", AssetList.ROBOTO_BLACK.getBitmapFont(),
                new TextureRegion[]{RenderHelper.getInstance().createPartialTexture(AssetList.CURRENT_TIME_PROMPT.getTexture(), 0, 0, 256, 67)},
                new int[][]{{0, 0}},
                60, 48));
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
