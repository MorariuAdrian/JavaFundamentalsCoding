import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("This program calculates a quadratic equation");
        System.out.println("Quadratic equation is: ax^2 + bx + c");

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.printf("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.printf("Enter coefficient c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if(delta < 0){
            System.out.println("Delta is negative, we don't have real roots.");
        }else{
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);

            System.out.println("Root 1 (x1): " +x1);
            System.out.println("Root 2 (x2): " +x2);
        }
        scanner.close();
    }
}
