package data.psychologytheory.kitchengame.gameplay.entities.goals.movetotarget;

import data.psychologytheory.kitchengame.engine.utils.AnimationUtil;
import data.psychologytheory.kitchengame.gameplay.entities.AbstractEntity;
import data.psychologytheory.kitchengame.gameplay.entities.goals.AbstractEntityGoals;
import data.psychologytheory.kitchengame.gameplay.gameobjects.AbstractGameObject;

import java.util.ArrayList;
import java.util.List;

public class MoveToTargetGoal extends AbstractEntityGoals {

    //FACING: 0 -> Down, 1 -> Up, 2 -> Left, 3 -> Right
    private static int FACING = 0;
    private float entityPosX, entityPosY;
    private float targetPosX, targetPosY;
    private List<Waypoint> route;
    private int currentWaypointIndex = 0;
    private final float entityVelocityX, entityVelocityY;

    public MoveToTargetGoal(AbstractEntity entity) {
        super(entity);
        this.entityPosX = entity.getObjPosX();
        this.entityPosY = entity.getObjPosY();
        this.entityVelocityX = entity.getVelocityX();
        this.entityVelocityY = entity.getVelocityY();
        this.targetPosX = 0;
        this.targetPosY = 0;
        this.route = new ArrayList<>();
    }

    @Override
    public void executeGoal() {
        this.setInProgress(true);

        //Generate Route
        if (this.route.isEmpty()) {
            this.generateRoute();
        }

        this.determineDirection();
        this.walkAlongRoute();

        if (this.atEndWaypoint(this.currentWaypointIndex)) {
            if (this.targetPosY > this.entityPosY) {
                FACING = 1;
            } else if (this.targetPosY < this.entityPosY) {
                FACING = 0;
            }
            this.clearRoute();
        }
    }

    @Override
    public boolean isGoalSuccessful() {
        if (this.atEndWaypoint(this.currentWaypointIndex)) {
            this.setInProgress(false);
            this.currentWaypointIndex = 0;
            return true;
        }
        return false;
    }

    private void generateRoute() {
        int routeSize = this.routeLength();

        //First waypoint
        Waypoint beginingWaypoint = WaypointHelper.getInstance().createNewWaypoint(this.entityPosX, this.entityPosY, WaypointHelper.WaypointType.BEGINNING.getTypeID());
        this.route.add(beginingWaypoint);

        //Second waypoint
        if (routeSize >= 3) {
            if (this.entityPosX < this.targetPosX || this.entityPosX == this.targetPosX) {
                this.route.add(WaypointHelper.getInstance().createNewWaypoint(WaypointHelper.rightMostX, this.entityPosY, WaypointHelper.WaypointType.INTERMEDIATE.getTypeID()));
            } else {
                this.route.add(WaypointHelper.getInstance().createNewWaypoint(WaypointHelper.leftMostX, this.entityPosY, WaypointHelper.WaypointType.INTERMEDIATE.getTypeID()));
            }
        }

        //Third waypoint
        if (routeSize == 4) {
            if (this.targetPosY == WaypointHelper.topMostY + 32) {
                this.route.add(WaypointHelper.getInstance().createNewWaypoint(this.route.get(1).getX(), WaypointHelper.topMostY, WaypointHelper.WaypointType.INTERMEDIATE.getTypeID()));
            } else if (this.targetPosY == WaypointHelper.centerY + 32) {
                this.route.add(WaypointHelper.getInstance().createNewWaypoint(this.route.get(1).getX(), WaypointHelper.centerY, WaypointHelper.WaypointType.INTERMEDIATE.getTypeID()));
            } else if (this.targetPosY == WaypointHelper.topMostY + 48) {
                this.route.add(WaypointHelper.getInstance().createNewWaypoint(this.route.get(1).getX(), WaypointHelper.topMostY + 16, WaypointHelper.WaypointType.INTERMEDIATE.getTypeID()));
            } else if (this.targetPosY == WaypointHelper.centerY + 48) {
                this.route.add(WaypointHelper.getInstance().createNewWaypoint(this.route.get(1).getX(), WaypointHelper.centerY + 16, WaypointHelper.WaypointType.INTERMEDIATE.getTypeID()));
            } else {
                this.route.add(WaypointHelper.getInstance().createNewWaypoint(this.route.get(1).getX(), WaypointHelper.bottomMostY, WaypointHelper.WaypointType.INTERMEDIATE.getTypeID()));
            }
        }

        //Last Waypoint
        Waypoint endingWaypoint;

        if (this.targetPosY == WaypointHelper.bottomMostY - 32) {
            endingWaypoint = WaypointHelper.getInstance().createNewWaypoint(this.targetPosX, this.targetPosY + 32, WaypointHelper.WaypointType.GOAL.getTypeID());
        } else if (this.targetPosY == WaypointHelper.centerY + 48 || this.targetPosY == WaypointHelper.topMostY + 48) {
            endingWaypoint = WaypointHelper.getInstance().createNewWaypoint(this.targetPosX, this.targetPosY - 48, WaypointHelper.WaypointType.GOAL.getTypeID());
        } else {
            endingWaypoint = WaypointHelper.getInstance().createNewWaypoint(this.targetPosX, this.targetPosY, WaypointHelper.WaypointType.GOAL.getTypeID());
        }

        this.route.add(endingWaypoint);
    }

    private void determineDirection() {
        int lastFacing = FACING;

        if (this.atEndWaypoint(this.currentWaypointIndex)) {
            return;
        }

        if (this.route.get(this.currentWaypointIndex + 1).getX() > this.route.get(this.currentWaypointIndex).getX() &&
            this.route.get(this.currentWaypointIndex + 1).getY() == this.route.get(this.currentWaypointIndex).getY()) {
            FACING = 3;
        } else if (this.route.get(this.currentWaypointIndex + 1).getX() < this.route.get(this.currentWaypointIndex).getX() &&
                   this.route.get(this.currentWaypointIndex + 1).getY() == this.route.get(this.currentWaypointIndex).getY()) {
            FACING = 2;
        } else if (this.route.get(this.currentWaypointIndex + 1).getY() > this.route.get(this.currentWaypointIndex).getY() &&
                   this.route.get(this.currentWaypointIndex + 1).getX() == this.route.get(this.currentWaypointIndex).getX()) {
            FACING = 1;
        } else if (this.route.get(this.currentWaypointIndex + 1).getY() < this.route.get(this.currentWaypointIndex).getY() &&
                   this.route.get(this.currentWaypointIndex + 1).getX() == this.route.get(this.currentWaypointIndex).getX()) {
            FACING = 0;
        }

        if (FACING != lastFacing) {
            switch (FACING) {
                case 1:
                    AnimationUtil.getInstance().initialFrame(this.getEntity().getAnimations()[0], 4);
                    break;
                case 2:
                    AnimationUtil.getInstance().initialFrame(this.getEntity().getAnimations()[0], 8);
                    break;
                case 3:
                    AnimationUtil.getInstance().initialFrame(this.getEntity().getAnimations()[0], 12);
                    break;
                default:
                    AnimationUtil.getInstance().initialFrame(this.getEntity().getAnimations()[0], 0);
                    break;
            }
        }
    }

    private void walkAlongRoute() {
        int maxIndex = this.route.size() - 1;

        if (shouldSlowDown()) {
            this.getEntity().setObjPosX((int) this.getEntity().getObjPosX());
            this.getEntity().setObjPosY((int) this.getEntity().getObjPosY());
            this.getEntity().setVelocityX(1.0F);
            this.getEntity().setVelocityY(1.0F);
        } else {
            this.getEntity().setVelocityX(this.entityVelocityX);
            this.getEntity().setVelocityY(this.entityVelocityY);
        }

        this.moveentity(maxIndex);

        if (this.entityPosY == WaypointHelper.topMostY) {
            this.getEntity().setZIndex(2);
        } else if (this.entityPosY == WaypointHelper.centerY) {
            this.getEntity().setZIndex(4);
        } else if (this.entityPosY == WaypointHelper.bottomMostY) {
            this.getEntity().setZIndex(5);
        }
    }

    private void moveentity(int maxIndex) {
        if (this.atEndWaypoint(this.currentWaypointIndex)) {
            if (targetPosY > entityPosY) {
                AnimationUtil.getInstance().initialFrame(this.getEntity().getAnimations()[0], 4);
            } else {
                AnimationUtil.getInstance().initialFrame(this.getEntity().getAnimations()[0], 0);
            }
            return;
        }

        if (this.atNextWaypoint(this.route.get(this.currentWaypointIndex + 1))) {
            this.incrementWaypointIndex(maxIndex);
            return;
        }

        switch (FACING) {
            case 0:
                this.getEntity().setObjPosY(this.getEntity().getObjPosY() - this.getEntity().getVelocityY());
                AnimationUtil.getInstance().playAnimation(this.getEntity().getAnimations()[0], 0, 3);
                this.entityPosY = this.getEntity().getObjPosY();
                break;
            case 1:
                this.getEntity().setObjPosY(this.getEntity().getObjPosY() + this.getEntity().getVelocityY());
                AnimationUtil.getInstance().playAnimation(this.getEntity().getAnimations()[0], 4, 7);
                this.entityPosY = this.getEntity().getObjPosY();
                break;
            case 2:
                this.getEntity().setObjPosX(this.getEntity().getObjPosX() - this.getEntity().getVelocityX());
                AnimationUtil.getInstance().playAnimation(this.getEntity().getAnimations()[0], 8, 11);
                this.entityPosX = this.getEntity().getObjPosX();
                break;
            case 3:
                this.getEntity().setObjPosX(this.getEntity().getObjPosX() + this.getEntity().getVelocityX());
                AnimationUtil.getInstance().playAnimation(this.getEntity().getAnimations()[0], 12, 15);
                this.entityPosX = this.getEntity().getObjPosX();
                break;
        }
    }

    private boolean shouldSlowDown() {
        int nextIndex = Math.min(this.currentWaypointIndex + 1, this.route.size() - 1);
        return (this.entityPosX + 8 >= this.route.get(nextIndex).getX() &&
                this.entityPosX <= this.route.get(nextIndex).getX()) ||
               (this.entityPosX - 8 <= this.route.get(nextIndex).getX() &&
                this.entityPosX >= this.route.get(nextIndex).getX()) ||
               (this.entityPosX + 8 >= this.route.get(nextIndex).getY() &&
                this.entityPosX <= this.route.get(nextIndex).getY()) ||
               (this.entityPosX - 8 <= this.route.get(nextIndex).getY() &&
                this.entityPosX >= this.route.get(nextIndex).getY());
    }

    private boolean atNextWaypoint (Waypoint waypoint) {
        return this.entityPosX == waypoint.getX() && this.entityPosY == waypoint.getY();
    }

    private boolean atEndWaypoint(int currentWaypointIndex) {
        return currentWaypointIndex == this.route.size() - 1;
    }

    private void incrementWaypointIndex(int maxIndex) {
        if (this.currentWaypointIndex + 1 >= maxIndex) {
            this.currentWaypointIndex = maxIndex;
        } else {
            this.currentWaypointIndex++;
        }
    }

    private int routeLength() {
        if ((this.targetPosX >= WaypointHelper.leftMostX && this.targetPosX <= WaypointHelper.rightMostX) && (
            (this.entityPosY == this.targetPosY - 32) || (this.entityPosY == this.targetPosY - 48))) {
            return 2;
        }
        if ((this.entityPosY == WaypointHelper.topMostY && this.targetPosY - 32 == WaypointHelper.topMostY) ||
            (this.entityPosY == WaypointHelper.topMostY && this.targetPosY - 48 == WaypointHelper.topMostY) ||
            (this.entityPosY == WaypointHelper.centerY && this.targetPosY - 32 == WaypointHelper.centerY) ||
            (this.entityPosY == WaypointHelper.centerY && this.targetPosY - 48 == WaypointHelper.centerY)) {
            return 3;
        }
        return 4;
    }

    public void clearRoute () {
        this.route.clear();
    }

    public void setTarget (AbstractGameObject target){
        this.targetPosX = target.getObjPosX();
        this.targetPosY = target.getObjPosY();
    }
}
