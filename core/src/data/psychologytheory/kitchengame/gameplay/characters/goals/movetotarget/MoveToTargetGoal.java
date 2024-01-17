package data.psychologytheory.kitchengame.gameplay.characters.goals.movetotarget;

import data.psychologytheory.kitchengame.engine.utils.AnimationUtil;
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
    private int currentWaypointIndex = 0;

    public MoveToTargetGoal(AbstractCharacter character) {
        super(character);
        this.characterPosX = character.getObjPosX();
        this.characterPosY = character.getObjPosY();
        this.characterWidth = character.getObjWidth();
        this.characterHeight = character.getObjHeight();
        this.targetPosX = 0;
        this.targetPosY = 0;
        this.targetWidth = 0;
        this.targetHeight = 0;
        this.currentWallX = 0;
        this.currentWallY = 0;
        this.route = new ArrayList<>();
    }

    @Override
    public void executeGoal() {
        this.setInProgress(true);

        //Generate Route
        if (this.route.isEmpty()) {
            this.generateRoute();
        }

        this.followRoute();

        if (this.atEndWaypoint(this.currentWaypointIndex))
            this.clearRoute();
    }

    @Override
    public boolean isGoalSuccessful() {
        if (this.atEndWaypoint(this.currentWaypointIndex)) {
            this.setInProgress(false);
            return true;
        }
        return false;
    }

    private void generateRoute() {
        //First waypoint
        Waypoint beginingWaypoint = WaypointHelper.getInstance().createNewWaypoint(this.characterPosX, this.characterPosY, WaypointHelper.WaypointType.BEGINNING.getTypeID());

        //Last waypoint
        Waypoint endingWaypoint = WaypointHelper.getInstance().createNewWaypoint(this.targetPosX, this.targetPosY + 32, WaypointHelper.WaypointType.GOAL.getTypeID());

        this.route.add(beginingWaypoint);

        //Second waypoint
        if (this.characterPosX > this.targetPosX || this.characterPosX == this.targetPosX) {
            this.route.add(WaypointHelper.getInstance().createNewWaypoint(WaypointHelper.rightMostX, this.characterPosY, WaypointHelper.WaypointType.INTERMEDIATE.getTypeID()));
        } else {
            this.route.add(WaypointHelper.getInstance().createNewWaypoint(WaypointHelper.leftMostX, this.characterPosY, WaypointHelper.WaypointType.INTERMEDIATE.getTypeID()));
        }

        //Third waypoint
        if (this.targetPosY == WaypointHelper.topMostY) {
            this.route.add(WaypointHelper.getInstance().createNewWaypoint(this.route.get(1).getX(), WaypointHelper.topMostY, WaypointHelper.WaypointType.INTERMEDIATE.getTypeID()));
        } else if ((this.targetPosY == WaypointHelper.centerY)) {
            if (this.characterPosY > this.targetPosY) {
                this.route.add(WaypointHelper.getInstance().createNewWaypoint(this.route.get(1).getX(), WaypointHelper.topMostY, WaypointHelper.WaypointType.INTERMEDIATE.getTypeID()));
            } else {
                this.route.add(WaypointHelper.getInstance().createNewWaypoint(this.route.get(1).getX(), WaypointHelper.bottomMostY, WaypointHelper.WaypointType.INTERMEDIATE.getTypeID()));
            }
        } else {
            this.route.add(WaypointHelper.getInstance().createNewWaypoint(this.route.get(1).getX(), WaypointHelper.bottomMostY, WaypointHelper.WaypointType.INTERMEDIATE.getTypeID()));
        }

        this.route.add(endingWaypoint);
    }

    private void followRoute() {
        int maxIndex = this.route.size() - 1;

        //Determine Direction
        if (!this.atEndWaypoint(this.currentWaypointIndex)) {
            if (this.route.get(this.currentWaypointIndex + 1).getX() > this.route.get(this.currentWaypointIndex).getX() && this.route.get(this.currentWaypointIndex + 1).getY() == this.route.get(this.currentWaypointIndex).getY()) {
                FACING = 3;
            } else if (this.route.get(this.currentWaypointIndex + 1).getX() < this.route.get(this.currentWaypointIndex).getX() && this.route.get(this.currentWaypointIndex + 1).getY() == this.route.get(this.currentWaypointIndex).getY()) {
                FACING = 2;
            } else if (this.route.get(this.currentWaypointIndex + 1).getY() > this.route.get(this.currentWaypointIndex).getY() && this.route.get(this.currentWaypointIndex + 1).getX() == this.route.get(this.currentWaypointIndex).getX()) {
                FACING = 1;
            } else if (this.route.get(this.currentWaypointIndex + 1).getY() < this.route.get(this.currentWaypointIndex).getY() && this.route.get(this.currentWaypointIndex + 1).getX() == this.route.get(this.currentWaypointIndex).getX()) {
                FACING = 0;
            } else {
                FACING = 0;
            }
        }

        if (!this.atEndWaypoint(this.currentWaypointIndex)) {
            if (!this.atNextWaypoint(this.route.get(this.currentWaypointIndex + 1))) {
                switch (FACING) {
                    case 0:
                        this.getCharacter().setObjPosY(this.getCharacter().getObjPosY() - this.getCharacter().getVelocityY());
                        this.characterPosY = this.getCharacter().getObjPosY();
                        AnimationUtil.getInstance().playAnimation(this.getCharacter().getAnimations()[0], 0, 3);
                        break;
                    case 1:
                        this.getCharacter().setObjPosY(this.getCharacter().getObjPosY() + this.getCharacter().getVelocityY());
                        this.characterPosY = this.getCharacter().getObjPosY();
                        AnimationUtil.getInstance().playAnimation(this.getCharacter().getAnimations()[0], 4, 7);
                        break;
                    case 2:
                        this.getCharacter().setObjPosX(this.getCharacter().getObjPosX() - this.getCharacter().getVelocityX());
                        this.characterPosX = this.getCharacter().getObjPosX();
                        AnimationUtil.getInstance().playAnimation(this.getCharacter().getAnimations()[0], 8, 11);
                        break;
                    case 3:
                        this.getCharacter().setObjPosX(this.getCharacter().getObjPosX() + this.getCharacter().getVelocityX());
                        this.characterPosX = this.getCharacter().getObjPosX();
                        AnimationUtil.getInstance().playAnimation(this.getCharacter().getAnimations()[0], 12, 15);
                        break;
                }
            } else {
                if (this.currentWaypointIndex + 1 >= maxIndex) {
                    this.currentWaypointIndex = maxIndex;
                } else {
                    this.currentWaypointIndex++;
                }
            }
        }
    }


    private boolean atNextWaypoint (Waypoint waypoint){
        return this.characterPosX == waypoint.getX() && this.characterPosY == waypoint.getY();
    }

    private boolean atEndWaypoint ( int currentWaypointIndex){
        return currentWaypointIndex == this.route.size() - 1;
    }

    public void clearRoute () {
        this.route.clear();
    }

    public void setTarget (AbstractGameObject target){
        this.targetPosX = target.getObjPosX();
        this.targetPosY = target.getObjPosY();
    }
}
