package data.psychologytheory.kitchengame.gameplay.characters.goals.movetotarget;

public class WaypointHelper {
    public static WaypointHelper instance;

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
