package data.psychologytheory.kitchengame.gameplay.lists;

import data.psychologytheory.kitchengame.gameplay.dishes.AbstractDish;

public enum DishList {
    //Appetizers
    TORTELLINI(),
    FRIES(),

    //Main Course
    FISH(),
    STEAK(),

    //Garnish
    SPINACH(),
    ASPARAGUS(),
    SAUCE(),

    //Dessert
    CARAMEL_PUDDING(),
    ICE_CREAM();

    private AbstractDish dish;
    private int dishID;
    private String dishName;

    public void setDish(AbstractDish dish) {
        this.dish = dish;
        this.dishID = dish.getDishID();
        this.dishName = dish.getDishName();
    }

    public AbstractDish getDish() {
        return dish;
    }

    public int getDishID() {
        return dishID;
    }

    public void setDishID(int dishID) {
        this.dishID = dishID;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }
}

