package data.psychologytheory.kitchengame.gameplay.init;

import data.psychologytheory.kitchengame.engine.animation.Animation;
import data.psychologytheory.kitchengame.engine.interfaces.IContent;
import data.psychologytheory.kitchengame.engine.utils.AnimationUtil;
import data.psychologytheory.kitchengame.engine.utils.AssetUtil;
import data.psychologytheory.kitchengame.gameplay.entities.AbstractEntity;
import data.psychologytheory.kitchengame.gameplay.entities.ChefEntity;
import data.psychologytheory.kitchengame.gameplay.entities.LineCookEntity;
import data.psychologytheory.kitchengame.gameplay.entities.goals.AbstractEntityGoals;
import data.psychologytheory.kitchengame.gameplay.entities.goals.cooking.CookingGoal;
import data.psychologytheory.kitchengame.gameplay.entities.goals.movetotarget.MoveToTargetGoal;
import data.psychologytheory.kitchengame.gameplay.entities.goals.movetotarget.WaypointHelper;
import data.psychologytheory.kitchengame.gameplay.gameobjects.game.kitchen.AbstractKitchenGameObject;
import data.psychologytheory.kitchengame.gameplay.lists.AssetList;
import data.psychologytheory.kitchengame.gameplay.lists.EntityList;
import data.psychologytheory.kitchengame.gameplay.lists.GameObjectList;

import java.util.HashMap;
import java.util.Map;

public class EntityInit implements IContent {
    public static final Map<Integer, AbstractEntity> ENTITY_MAP = new HashMap<>();
    @Override
    public void createContents() {
        EntityList.CHEF.setCharacterInstance(new ChefEntity(0, 32, 64, 512, WaypointHelper.bottomMostY, "chef_entity",
                AssetList.KITCHEN_CHEF.getTexture(), AssetUtil.getInstance().createUniformPartialTextures(AssetList.KITCHEN_CHEF.getTexture(), 0, 0, 64, 128, 16, 1, 16),
                5, 3F, 3F,
                new Animation[]{AnimationUtil.getInstance().createAnimation(16, 1000)}));

        EntityList.LINE_COOK_MEAT.setCharacterInstance(new LineCookEntity(5, 32, 64, 736, WaypointHelper.topMostY, "line_cook_meat_entity",
                AssetList.KITCHEN_LINE_COOK.getTexture(), AssetUtil.getInstance().createUniformPartialTextures(AssetList.KITCHEN_LINE_COOK.getTexture(), 0, 0, 64, 128, 16, 1, 16),
                2, 3F, 3F,
                new Animation[]{AnimationUtil.getInstance().createAnimation(16, 1000)}, (AbstractKitchenGameObject) GameObjectList.GRILL.getGameObjectInstance()));
    }

    @Override
    public void loadContents() {
        ENTITY_MAP.put(EntityList.CHEF.getCharacterID(), EntityList.CHEF.getCharacterInstance());
        ENTITY_MAP.put(EntityList.LINE_COOK_MEAT.getCharacterID(), EntityList.LINE_COOK_MEAT.getCharacterInstance());

        //Load goals here
        ENTITY_MAP.get(EntityList.CHEF.getCharacterID()).setCharacterGoals(
                new AbstractEntityGoals[]{new MoveToTargetGoal(ENTITY_MAP.get(EntityList.CHEF.getCharacterID()))});
        if (GameObjectInit.GAME_OBJECT_MAP.get(GameObjectList.GRILL.getGameObjectID()) instanceof AbstractKitchenGameObject)
            ENTITY_MAP.get(EntityList.LINE_COOK_MEAT.getCharacterID()).setCharacterGoals(
                    new AbstractEntityGoals[]{new MoveToTargetGoal(ENTITY_MAP.get(EntityList.LINE_COOK_MEAT.getCharacterID())), new CookingGoal(ENTITY_MAP.get(EntityList.LINE_COOK_MEAT.getCharacterID()), ((AbstractKitchenGameObject) GameObjectInit.GAME_OBJECT_MAP.get(GameObjectList.GRILL.getGameObjectID())).getDishes()[0])});
    }
}
