package data.psychologytheory.kitchengame.gameplay.init;

import data.psychologytheory.kitchengame.engine.animation.Animation;
import data.psychologytheory.kitchengame.engine.interfaces.IContent;
import data.psychologytheory.kitchengame.engine.utils.AnimationUtil;
import data.psychologytheory.kitchengame.engine.utils.AssetUtil;
import data.psychologytheory.kitchengame.gameplay.characters.AbstractCharacter;
import data.psychologytheory.kitchengame.gameplay.characters.ChefCharacter;
import data.psychologytheory.kitchengame.gameplay.characters.goals.AbstractCharacterGoals;
import data.psychologytheory.kitchengame.gameplay.characters.goals.movetotarget.MoveToTargetGoal;
import data.psychologytheory.kitchengame.gameplay.gameobjects.game.kitchen.AbstractKitchenGameObject;
import data.psychologytheory.kitchengame.gameplay.lists.AssetList;
import data.psychologytheory.kitchengame.gameplay.lists.CharacterList;
import data.psychologytheory.kitchengame.gameplay.lists.GameObjectList;

import java.util.HashMap;
import java.util.Map;

public class CharacterInit implements IContent {
    public static final Map<Integer, AbstractCharacter> CHARACTER_MAP = new HashMap<>();
    @Override
    public void createContents() {
        CharacterList.CHEF.setCharacterInstance(new ChefCharacter(0, 32, 64, 512, 344, "chef_character",
                AssetList.KITCHEN_CHEF.getTexture(), AssetUtil.getInstance().createUniformPartialTextures(AssetList.KITCHEN_CHEF.getTexture(), 0, 0, 64, 128, 16, 16, 1),
                1, 1.0F, 1.0F,
                new Animation[]{AnimationUtil.getInstance().createAnimation(16, 1000)}));
    }

    @Override
    public void loadContents() {
        CHARACTER_MAP.put(CharacterList.CHEF.getCharacterID(), CharacterList.CHEF.getCharacterInstance());

        //Load goals here
        CHARACTER_MAP.get(CharacterList.CHEF.getCharacterID()).setCharacterGoals(
                new AbstractCharacterGoals[]{new MoveToTargetGoal(CHARACTER_MAP.get(CharacterList.CHEF.getCharacterID()))});
    }

    @Override
    public void disposeContents() {

    }
}
