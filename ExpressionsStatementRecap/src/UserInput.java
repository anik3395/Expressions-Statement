import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        double number;
        number = input.nextDouble();
        System.out.println("The number is : " + number);
    }
}
