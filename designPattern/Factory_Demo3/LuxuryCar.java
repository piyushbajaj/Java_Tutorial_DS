package designPattern.Factory_Demo3;

/**
 * Created by piyush.bajaj on 27/11/16.
 */
public class LuxuryCar implements Car {
    @Override
    public void construct(){
        System.out.println("Building Luxury car");
    }
}