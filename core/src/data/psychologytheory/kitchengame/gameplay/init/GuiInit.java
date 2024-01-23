package data.psychologytheory.kitchengame.gameplay.init;

import data.psychologytheory.kitchengame.engine.interfaces.IContent;
import data.psychologytheory.kitchengame.engine.notification.Notification;
import data.psychologytheory.kitchengame.engine.utils.NotificationUtil;
import data.psychologytheory.kitchengame.gameplay.gameobjects.gui.*;
import data.psychologytheory.kitchengame.gameplay.gameobjects.gui.gameplay.CurrentOrderDropdownGuiComponent;
import data.psychologytheory.kitchengame.gameplay.gameobjects.gui.gameplay.MenuBarHUDGuiComponent;
import data.psychologytheory.kitchengame.gameplay.lists.GuiList;

import java.util.HashMap;
import java.util.Map;

public class GuiInit implements IContent {
    public static final Map<Integer, AbstractGuiComponent> GUI_MAP = new HashMap<>();

    @Override
    public void createContents() {
        //Gameplay Scene
        GuiList.GAMEPLAY_MENU_BAR.setGuiComponent(new MenuBarHUDGuiComponent(0, 400, 48, 0, 673,
                "gameplay_menu_bar", 8));
        GuiList.CURRENT_ORDER_PROMPT.setGuiComponent(new CurrentOrderDropdownGuiComponent(1, 128, 32, 16, 673,
                "current_order_prompt", 8));

        //Main Menu Scene
        //Options Scene
    }

    @Override
    public void loadContents() {
        GUI_MAP.put(GuiList.GAMEPLAY_MENU_BAR.getGuiID(), GuiList.GAMEPLAY_MENU_BAR.getGuiComponent());
        GUI_MAP.put(GuiList.CURRENT_ORDER_PROMPT.getGuiID(), GuiList.CURRENT_ORDER_PROMPT.getGuiComponent());
    }
}
