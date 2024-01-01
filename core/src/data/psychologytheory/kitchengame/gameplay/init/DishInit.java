package data.psychologytheory.kitchengame.gameplay.init;

import java.util.Map;
import data.psychologytheory.kitchengame.engine.interfaces.IContent;
import data.psychologytheory.kitchengame.gameplay.dishes.AbstractDish;
import data.psychologytheory.kitchengame.gameplay.dishes.appetizers.FriesDish;
import data.psychologytheory.kitchengame.gameplay.dishes.appetizers.TortelliniDish;
import data.psychologytheory.kitchengame.gameplay.dishes.desserts.CaramelPuddingDish;
import data.psychologytheory.kitchengame.gameplay.dishes.desserts.IceCreamDish;
import data.psychologytheory.kitchengame.gameplay.dishes.garnishes.AsparagusDish;
import data.psychologytheory.kitchengame.gameplay.dishes.garnishes.SpinachDish;
import data.psychologytheory.kitchengame.gameplay.dishes.mains.FishDish;
import data.psychologytheory.kitchengame.gameplay.dishes.mains.SteakDish;
import data.psychologytheory.kitchengame.gameplay.lists.DishList;

import java.util.HashMap;

public class DishInit implements IContent {
    public static final Map<Integer, AbstractDish> DISH_MAP = new HashMap<>();

    @Override
    public void createContents() {
        //Appetizers
        DishList.TORTELLINI.setDish(new TortelliniDish(0, "Tortellini", 10, null,
                null));
        DishList.FRIES.setDish(new FriesDish(1, "Fries", 8, null,
                null));

        //Main Course
        DishList.FISH.setDish(new FishDish(10, "Fish", 15, null,
                null));
        DishList.STEAK.setDish(new SteakDish(11, "Steak", 14, null,
                null));

        //Garnish
        DishList.ASPARAGUS.setDish(new AsparagusDish(20, "Asparagus", 5, null,
                null));
        DishList.SPINACH.setDish(new SpinachDish(21, "Spinach", 2, null,
                null));

        //Dessert
        DishList.CARAMEL_PUDDING.setDish(new CaramelPuddingDish(30, "Caramel Pudding", 7, null,
                null));
        DishList.ICE_CREAM.setDish(new IceCreamDish(31, "Ice Cream", 4, null,
                null));
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

    @Override
    public void disposeContents() {

    }
}
