import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prime numbers are numbers that have only 2 factors: 1 and themselves. For example, the first 5 prime numbers are 2, 3, 5, 7, and 11.");
        System.out.print("Enter a positive number: ");
        int n = scanner.nextInt();

        System.out.println("Prime numbers between 1 and " + n + ":");
        for (int i=2; i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        scanner.close();
    }

    private static boolean isPrime(int number){
        if (number < 2){
            return false;
        }
        for (int i=2; i <=Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
