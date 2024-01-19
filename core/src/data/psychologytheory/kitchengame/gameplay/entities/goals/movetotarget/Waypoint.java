package data.psychologytheory.kitchengame.gameplay.entities.goals.movetotarget;

public class Waypoint {
    private final float x, y;
    private int type;

    //Coordinate based on bottom left hand corner
    public Waypoint(float x, float y, int type) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
