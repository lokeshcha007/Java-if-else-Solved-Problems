import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your number to check odd or even : ");
        int number = scn.nextInt();
        if (number % 2 == 0) {
            System.out.println("Given number is even " + number);
        } else {
            System.out.println("Given number is odd : " + number);
        }

    }
}
