import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        float firstNumber;
        float secondNumber;
        Scanner scanner = new Scanner(System.in);
        char symbol;

        System.out.print("First number = ");
        firstNumber = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Introduceti simbolul operatiei matematice (+, -, /, *): ");
        symbol = scanner.nextLine().charAt(0);
        System.out.print("Second number = ");
        secondNumber = scanner.nextFloat();

        scanner.close();

        if (secondNumber == 0 && symbol == '/') {
            System.out.println("Can't be calculated");
            return;
        }

        switch (symbol) {
            case '+': {
                System.out.println("Suma numerelor: " + (firstNumber + secondNumber));
                break;
            }
            case '-': {
                System.out.println("Diferenta numerelor este" + (firstNumber - secondNumber));
                break;
            }
            case '/': {
                System.out.println("Catul numerelor: " + firstNumber / secondNumber);
                break;
            }
            case '*': {
                System.out.println("Produsul numerelor: " + firstNumber * secondNumber);
                break;
            }
            default: {
                System.out.println("Invalid symbol");
            }
        }
    }
}
