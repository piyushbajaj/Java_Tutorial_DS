package javatpoint.Aggregation;

/**
 * Created by piyush.bajaj on 24/02/17.
 */
public class Circle {
    Operation op;
    double pi = 3.14;

    double area(int radius){
        op = new Operation();
        int rSquare = op.square(radius);
        return pi*rSquare;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        double result = c.area(5);
        System.out.println(result);
    }
}

class Operation{
    int square(int n){
        return n*n;
    }

}
