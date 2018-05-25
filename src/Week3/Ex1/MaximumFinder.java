package Week3.Ex1;
import java.util.Scanner;
//Demonstrate static function calls
public class MaximumFinder {
    public static void main(String[] args) {
        //create new instance of Scanner
        Scanner input = new Scanner(System.in);

        //prompt user to enter in values
        System.out.print("Enter three floating-point values seperated by spaces: ");

        //Read values from user
        double number1= input.nextDouble();
        double number2= input.nextDouble();
        double number3= input.nextDouble();

        double result=maximum(number1, number2, number3);

        //double result1= Math.max(number1, number2);

        System.out.println("Maximum is: "+ result);
        //System.out.print(number1+ result1);
    }
    //find the maximum value between 3 double numbers
    public static double maximum(double x, double y, double z){
      return Math.max(x, Math.max(y,z));

        /*  double maximumvalue =x;
        if(y>maximumvalue){
            maximumvalue = y;
        }
        if(z>maximumvalue){
            maximumvalue = z;
        }
        return maximumvalue;
    */
    }

}
