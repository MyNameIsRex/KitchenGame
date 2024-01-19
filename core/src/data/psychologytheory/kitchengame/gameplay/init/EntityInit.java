package data.psychologytheory.kitchengame.gameplay.init;

import data.psychologytheory.kitchengame.engine.animation.Animation;
import data.psychologytheory.kitchengame.engine.interfaces.IContent;
import data.psychologytheory.kitchengame.engine.utils.AnimationUtil;
import data.psychologytheory.kitchengame.engine.utils.AssetUtil;
import data.psychologytheory.kitchengame.gameplay.entities.AbstractEntity;
import data.psychologytheory.kitchengame.gameplay.entities.ChefEntity;
import data.psychologytheory.kitchengame.gameplay.entities.goals.AbstractEntityGoals;
import data.psychologytheory.kitchengame.gameplay.entities.goals.movetotarget.MoveToTargetGoal;
import data.psychologytheory.kitchengame.gameplay.lists.AssetList;
import data.psychologytheory.kitchengame.gameplay.lists.EntityList;

import java.util.HashMap;
import java.util.Map;

public class EntityInit implements IContent {
    public static final Map<Integer, AbstractEntity> ENTITY_MAP = new HashMap<>();
    @Override
    public void createContents() {
        EntityList.CHEF.setCharacterInstance(new ChefEntity(0, 32, 64, 512, 344, "chef_character",
                AssetList.KITCHEN_CHEF.getTexture(), AssetUtil.getInstance().createUniformPartialTextures(AssetList.KITCHEN_CHEF.getTexture(), 0, 0, 64, 128, 16, 16, 1),
                2, 3F, 3F,
                new Animation[]{AnimationUtil.getInstance().createAnimation(16, 1000)}));
    }

    @Override
    public void loadContents() {
        ENTITY_MAP.put(EntityList.CHEF.getCharacterID(), EntityList.CHEF.getCharacterInstance());

        //Load goals here
        ENTITY_MAP.get(EntityList.CHEF.getCharacterID()).setCharacterGoals(
                new AbstractEntityGoals[]{new MoveToTargetGoal(ENTITY_MAP.get(EntityList.CHEF.getCharacterID()))});
    }
}
