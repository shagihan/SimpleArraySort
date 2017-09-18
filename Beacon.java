package com.company;

/**
 * Created by shanaka on 9/18/17.
 */
public class Beacon {
    public int distance;
    public int ID;

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Beacon(int distance, int ID) {
        this.distance = distance;
        this.ID = ID;
    }
}
