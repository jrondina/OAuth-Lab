/**
 * Created by jamesrondina on 6/28/16.
 */
public class Car extends Vehicle {
    private int mNumOfWheels;
    private String mModel;

    public Car(String name, String model){
        super(name);
        mNumOfWheels = 4;
        mModel = model;
    }

    public int getWheels() {
        return mNumOfWheels;
    }

    public String getModel() {
        return mModel;
    }

    public void goFaster() {
        setSpeed(getSpeed() + 10);
    }
}
