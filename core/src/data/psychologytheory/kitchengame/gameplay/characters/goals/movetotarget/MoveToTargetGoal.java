package data.psychologytheory.kitchengame.gameplay.characters.goals.movetotarget;

import data.psychologytheory.kitchengame.gameplay.characters.AbstractCharacter;
import data.psychologytheory.kitchengame.gameplay.characters.goals.AbstractCharacterGoals;
import data.psychologytheory.kitchengame.gameplay.gameobjects.AbstractGameObject;
import data.psychologytheory.kitchengame.gameplay.gameobjects.game.kitchen.AbstractKitchenGameObject;
import data.psychologytheory.kitchengame.gameplay.init.GameObjectInit;

import java.util.ArrayList;
import java.util.List;

public class MoveToTargetGoal extends AbstractCharacterGoals {

    //FACING: 0 -> Down, 1 -> Up, 2 -> Left, 3 -> Right
    private static int FACING = 0;
    private float characterPosX, characterPosY;
    private float characterWidth, characterHeight;
    private float targetPosX, targetPosY;
    private float targetWidth, targetHeight;
    private float currentWallX, currentWallY;
    private float currentWallWidth, currentWallHeight;

    private List<Waypoint> route;

    public MoveToTargetGoal(AbstractCharacter character, AbstractKitchenGameObject target) {
        super(character);
        this.characterPosX = character.getObjPosX();
        this.characterPosY = character.getObjPosY();
        this.characterWidth = character.getObjWidth();
        this.characterHeight = character.getObjHeight();
        this.targetPosX = target.getObjPosX();
        this.targetPosY = target.getObjPosY();
        this.targetWidth = target.getObjWidth();
        this.targetHeight = target.getObjHeight();
        this.currentWallX = 0;
        this.currentWallY = 0;
        this.route = new ArrayList<>();
    }

    @Override
    public void executeGoal() {
        //Generate Route
        if (this.route.isEmpty()) {
            this.generateRoute();
        }

        //Clear route
        this.clearRoute(route);
    }

    @Override
    public boolean isGoalSuccessful() {
        return false;
    }

    private void generateRoute() {
        //First waypoint
        Waypoint beginingWaypoint = WaypointHelper.getInstance().createNewWaypoint(this.characterPosX, this.characterPosY, WaypointHelper.WaypointType.BEGINNING.getTypeID());

        //Last waypoint
        Waypoint endingWaypoint = WaypointHelper.getInstance().createNewWaypoint(this.targetPosX, this.targetPosY - 64, WaypointHelper.WaypointType.GOAL.getTypeID());

        this.route.add(beginingWaypoint);

        //Second waypoint
        if (this.characterPosX > this.targetPosX || this.characterPosX == this.targetPosX) {
            this.route.add(WaypointHelper.getInstance().createNewWaypoint(WaypointHelper.RIGHT_MOST_X, this.characterPosY, WaypointHelper.WaypointType.INTERMEDIATE.getTypeID()));
        } else {
            this.route.add(WaypointHelper.getInstance().createNewWaypoint(WaypointHelper.LEFT_MOST_X, this.characterPosY, WaypointHelper.WaypointType.INTERMEDIATE.getTypeID()));
        }

        //Third waypoint
        if (this.targetPosY == WaypointHelper.TOP_MOST_Y) {
            this.route.add(WaypointHelper.getInstance().createNewWaypoint(this.route.get(1).getX(), WaypointHelper.TOP_MOST_Y, WaypointHelper.WaypointType.INTERMEDIATE.getTypeID()));
        } else if ((this.targetPosY == WaypointHelper.CENTER_Y)) {
            if (this.characterPosY > this.targetPosY) {
                this.route.add(WaypointHelper.getInstance().createNewWaypoint(this.route.get(1).getX(), WaypointHelper.TOP_MOST_Y, WaypointHelper.WaypointType.INTERMEDIATE.getTypeID()));
            } else {
                this.route.add(WaypointHelper.getInstance().createNewWaypoint(this.route.get(1).getX(), WaypointHelper.BOTTOM_MOST_Y, WaypointHelper.WaypointType.INTERMEDIATE.getTypeID()));
            }
        } else {
            this.route.add(WaypointHelper.getInstance().createNewWaypoint(this.route.get(1).getX(), WaypointHelper.BOTTOM_MOST_Y, WaypointHelper.WaypointType.INTERMEDIATE.getTypeID()));
        }

        this.route.add(endingWaypoint);
    }

    public void clearRoute(List<Waypoint> route) {
        route.clear();
    }

    private boolean hasReachedWaypoint(Waypoint targetWaypoint, AbstractKitchenGameObject target) {
        return targetWaypoint.getX() == target.getObjPosX() && targetWaypoint.getY() == target.getObjPosY();
    }

    private void findNextWaypoint() {

    }
}
