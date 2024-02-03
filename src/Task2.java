import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Body mass index (BMI) calculation");
        float kilograms;
        int centimeter;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the weight (kg) = ");
        kilograms = input.nextFloat();
        System.out.printf("Enter the height (cm) = ");
        centimeter = input.nextInt();

        System.out.println();
        System.out.println("The optimal BMI is between 18.5 and 24.9");

        float heightinmeters = centimeter/100f;

        System.out.println("Introduced height (m) = "+ heightinmeters);

        float bmi = kilograms/(heightinmeters*heightinmeters);

        System.out.println("BMI value is = " + bmi);
        if(bmi >= 18.5 && bmi < 24.9){
            System.out.println("Optimal BMI");;
        }else{
            System.out.println("Not optimal BMI");
        }
    }
}
