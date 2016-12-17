package designPattern.Factory_Demo2;

/**
 * Created by piyush.bajaj on 27/11/16.
 */
public abstract class Plan {

    protected double rate;

    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }

}


