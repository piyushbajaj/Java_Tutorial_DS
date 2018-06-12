package SolidMaster.interface_segregation.good.src;

/**
 * Created by mrk on 4/7/14.
 */
public class Penguin implements SwimmingCreature, FeatheredCreature {
    public String currentLocation;
    public int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void swim() {
        this.currentLocation = "in the water";
    }

    public void molt() {
        this.numberOfFeathers -= 4;
    }
}
