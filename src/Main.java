import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int firstNumber = Integer.parseInt(scanner.nextLine(), 2);

    System.out.print("Enter the second number: ");
    int secondNumber = Integer.parseInt(scanner.nextLine(), 2);

    scanner.close();

    String binaryFirstNumber = Integer.toBinaryString(firstNumber);
    String binarySecondNumber = Integer.toBinaryString(secondNumber);

    System.out.format(
      "%s + %s = %s\n",
      binaryFirstNumber,
      binarySecondNumber,
      Integer.toBinaryString(firstNumber + secondNumber)
    );

    System.out.format(
      "%s - %s = %s\n",
      binaryFirstNumber,
      binarySecondNumber,
      Integer.toBinaryString(firstNumber - secondNumber)
    );

    System.out.format(
      "%s * %s = %s\n",
      binaryFirstNumber,
      binarySecondNumber,
      Integer.toBinaryString(firstNumber * secondNumber)
    );

    System.out.format(
      "%s / %s = %s\n",
      binaryFirstNumber,
      binarySecondNumber,
      Integer.toBinaryString(firstNumber / secondNumber)
    );
  }
}
