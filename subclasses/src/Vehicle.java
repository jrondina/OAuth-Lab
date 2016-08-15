/**
 * Created by jamesrondina on 6/28/16.
 */
public class Vehicle {
    private int mSpeed;
    private String mOwnerName;

    public Vehicle(String name) {
        mOwnerName = name;
        mSpeed = 0;
    }

    public Vehicle() {
        mOwnerName = "nobody";
        mSpeed = 0;
    }

    public void setSpeed(int speed) {
        mSpeed = speed;

    }

    public int getSpeed() {
        return mSpeed;
    }

    public void goFaster() {
        mSpeed += 5;
    }
}
