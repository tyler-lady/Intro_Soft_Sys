import java.util.Scanner;

public class Problem2 {

    private static float sum(float x, float y){
        return x + y;
    }

    private static float difference(float x, float y){
        return x - y;
    }

    private static float product(float x, float y){
        return x * y;
    }

    private static float average(float x, float y){
        return (x + y) / 2;
    }

    private static float distance(float x, float y){
        return Math.abs(difference(x,y));
    }

    private static float maximum(float x, float y){
        return x >= y ? x : y;
    }

    private static float minimum(float x, float y){
        return x <= y ? x : y;
    }

    private static void displayResults(float x, float y){
        System.out.printf("%-14s%10.2f\n","Sum : ", sum(x,y));
        System.out.printf("%-14s%10.2f\n","Difference : ", difference(x,y));
        System.out.printf("%-14s%10.2f\n","Product : ", product(x,y));
        System.out.printf("%-14s%10.2f\n","Average : ", average(x,y));
        System.out.printf("%-14s%10.2f\n","Distance : ", distance(x,y));
        System.out.printf("%-14s%10.2f\n","Maximum : ", maximum(x,y));
        System.out.printf("%-14s%10.2f\n","Minimum : ", minimum(x,y));
    }

    public static void main(String[] args) {
        float x;
        float y;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first value: ");
        x = input.nextFloat();
        System.out.println("Enter second value: ");
        y = input.nextFloat();

        displayResults(x, y);
    }
}
