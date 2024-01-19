package data.psychologytheory.kitchengame.gameplay.init;

import java.util.Map;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import data.psychologytheory.kitchengame.engine.interfaces.IContent;
import data.psychologytheory.kitchengame.engine.utils.AssetUtil;
import data.psychologytheory.kitchengame.gameplay.dishes.AbstractDish;
import data.psychologytheory.kitchengame.gameplay.dishes.appetizers.FriesDish;
import data.psychologytheory.kitchengame.gameplay.dishes.appetizers.TortelliniDish;
import data.psychologytheory.kitchengame.gameplay.dishes.desserts.CaramelPuddingDish;
import data.psychologytheory.kitchengame.gameplay.dishes.desserts.IceCreamDish;
import data.psychologytheory.kitchengame.gameplay.dishes.garnishes.AsparagusDish;
import data.psychologytheory.kitchengame.gameplay.dishes.garnishes.SauceDish;
import data.psychologytheory.kitchengame.gameplay.dishes.garnishes.SpinachDish;
import data.psychologytheory.kitchengame.gameplay.dishes.mains.FishDish;
import data.psychologytheory.kitchengame.gameplay.dishes.mains.SteakDish;
import data.psychologytheory.kitchengame.gameplay.lists.AssetList;
import data.psychologytheory.kitchengame.gameplay.lists.DishList;

import java.util.HashMap;

public class DishInit implements IContent {
    public static final Map<Integer, AbstractDish> DISH_MAP = new HashMap<>();

    @Override
    public void createContents() {
        //Appetizers
        DishList.TORTELLINI.setDish(new TortelliniDish(0, "Tortellini", 10, null,
                AssetUtil.getInstance().createUniformPartialTextures(AssetList.TORTELLINI.getTexture(), 0, 0, 32, 32, 2, 1, 2)));
        DishList.FRIES.setDish(new FriesDish(1, "Fries", 8, null,
                AssetUtil.getInstance().createUniformPartialTextures(AssetList.FRIES.getTexture(), 0, 0, 32, 32, 2, 1, 2)));

        //Main Course
        DishList.FISH.setDish(new FishDish(10, "Fish", 15, null,
                AssetUtil.getInstance().createUniformPartialTextures(AssetList.FISH.getTexture(), 0, 0, 32, 32, 3, 1, 3)));
        DishList.STEAK.setDish(new SteakDish(11, "Steak", 14, null,
                AssetUtil.getInstance().createUniformPartialTextures(AssetList.STEAK.getTexture(), 0, 0, 32, 32, 3, 1, 3)));

        //Garnish
        DishList.ASPARAGUS.setDish(new AsparagusDish(20, "Asparagus", 5, null,
                AssetUtil.getInstance().createUniformPartialTextures(AssetList.ASPARAGUS.getTexture(), 0, 0, 32, 32, 3, 1, 3)));
        DishList.SPINACH.setDish(new SpinachDish(21, "Spinach", 2, null,
                AssetUtil.getInstance().createUniformPartialTextures(AssetList.SPINACH.getTexture(), 0, 0, 32, 32, 3, 1, 3)));
        DishList.SAUCE.setDish(new SauceDish(22, "Sauce", 3, null,
                AssetUtil.getInstance().createUniformPartialTextures(AssetList.SAUCE.getTexture(), 0, 0, 32, 32, 2, 1, 2)));

        //Dessert
        DishList.CARAMEL_PUDDING.setDish(new CaramelPuddingDish(30, "Caramel Pudding", 7, null,
                AssetUtil.getInstance().createUniformPartialTextures(AssetList.CARAMEL_PUDDING.getTexture(), 0, 0, 32, 32, 1, 1, 1)));
        DishList.ICE_CREAM.setDish(new IceCreamDish(31, "Ice Cream", 4, null,
                AssetUtil.getInstance().createUniformPartialTextures(AssetList.ICE_CREAM.getTexture(), 0, 0, 32, 32, 1, 1, 1)));
    }

    @Override
    public void loadContents() {
        DISH_MAP.put(DishList.TORTELLINI.getDishID(), DishList.TORTELLINI.getDish());
        DISH_MAP.put(DishList.FRIES.getDishID(), DishList.FRIES.getDish());

        DISH_MAP.put(DishList.FISH.getDishID(), DishList.FISH.getDish());
        DISH_MAP.put(DishList.STEAK.getDishID(), DishList.STEAK.getDish());

        DISH_MAP.put(DishList.ASPARAGUS.getDishID(), DishList.ASPARAGUS.getDish());
        DISH_MAP.put(DishList.SPINACH.getDishID(), DishList.SPINACH.getDish());
        DISH_MAP.put(DishList.SAUCE.getDishID(), DishList.SAUCE.getDish());

        DISH_MAP.put(DishList.CARAMEL_PUDDING.getDishID(), DishList.CARAMEL_PUDDING.getDish());
        DISH_MAP.put(DishList.ICE_CREAM.getDishID(), DishList.ICE_CREAM.getDish());
    }
}
