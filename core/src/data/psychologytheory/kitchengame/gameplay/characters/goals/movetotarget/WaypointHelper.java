package data.psychologytheory.kitchengame.gameplay.characters.goals.movetotarget;

import java.util.List;

public class WaypointHelper {
    public static WaypointHelper instance;

    public static final float LEFT_MOST_X = 0;
    public static final float RIGHT_MOST_X = 0;
    public static final float TOP_MOST_Y = 0;
    public static final float CENTER_Y = 0;
    public static final float BOTTOM_MOST_Y = 0;

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
