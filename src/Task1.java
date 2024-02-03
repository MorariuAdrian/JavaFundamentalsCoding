import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        float diameter;
        Scanner input = new Scanner(System.in);
        diameter = input.nextFloat();
        System.out.println("The diameter of the circle is: " + diameter);
        float pi = 3.14f;
        double perimetru = pi * diameter;
        System.out.println("The perimeter of the circle is: " + perimetru);

    }

}
