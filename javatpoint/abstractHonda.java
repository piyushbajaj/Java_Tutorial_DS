package javatpoint;

/**
 * Created by piyush.bajaj on 26/11/16.
 */

abstract class Bike{
    abstract void run();
}

public class abstractHonda extends Bike {
    public void run(){
        System.out.println("running safely..");
    }


    public static void main(String[] args) {
        abstractHonda obj = new abstractHonda();
        obj.run();
    }
}


