package data.psychologytheory.kitchengame.gameplay.characters.goals.movetotarget;

import java.util.List;

public class WaypointHelper {
    public static WaypointHelper instance;

    public static float leftMostX = 448F;
    public static float rightMostX = 864F;
    public static float topMostY = 344F;
    public static float centerY = 232F;
    public static float bottomMostY = 200F;

    public Waypoint createNewWaypoint(float x, float y, int type) {
        return new Waypoint(x, y, type);
    }

    public static WaypointHelper getInstance() {
        if (instance == null) {
            instance = new WaypointHelper();
        }
        return instance;
    }

    public enum WaypointType {
        BEGINNING(0),
        INTERMEDIATE(1),
        GOAL(2);

        private final int typeID;

        WaypointType(int typeID) {
            this.typeID = typeID;
        }

        public int getTypeID() {
            return typeID;
        }
    }
}
