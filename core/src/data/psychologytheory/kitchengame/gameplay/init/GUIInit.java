package data.psychologytheory.kitchengame.gameplay.init;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import data.psychologytheory.kitchengame.engine.interfaces.IContent;
import data.psychologytheory.kitchengame.engine.utils.AssetUtil;
import data.psychologytheory.kitchengame.gameplay.gameobjects.gui.*;
import data.psychologytheory.kitchengame.gameplay.gameobjects.gui.gameplay.*;
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

        //Main Menu Scene
        //Options Scene
    }

    @Override
    public void loadContents() {

    }
}
