import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        if (n <= 0){
            System.out.println("Please enter a positive integer greater than 0.");
        }else{
            double harmonicSum = calculateHarmonicSum(n);
            System.out.println("The sum of the harmonic series from 1 to " + n + " is: " + harmonicSum);
        }
        scanner.close();
    }
    private static double calculateHarmonicSum(int n){
        double sum = 0.0;
        for (int i = 1; i <= n; i++){
            sum += 1.0 / i;
        }
        return sum;
    }
}
