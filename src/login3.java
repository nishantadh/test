import java.util.Random;
import java.util.Scanner;
public class login3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String username = "nishant";
        String password = "nishant123";
        String admin;
        System.out.println("Enter your username : ");
        admin = scanner.nextLine();
        String passcode;
        System.out.println("Enter your password : ");
        passcode = scanner.nextLine();
        int user_choice = 0;
        if (admin.equals(username) && passcode.equals(password)) {
            System.out.println("You have logged in");
            System.out.println("1. Greater number between 3 number");
            System.out.println("2. Calculator");
            System.out.println("3. Result Calculator with 3 grades");
            System.out.println("4. Guessing Game");
            System.out.println("Enter number to calculate following : ");
            user_choice = scanner.nextInt();

            switch (user_choice) {
                case 1:
                    int number1;
                    int number2;
                    int number3;
                    System.out.println("Enter number 1, number 2, number 3 : ");
                    number1 = scanner.nextInt();
                    number2 = scanner.nextInt();
                    number3 = scanner.nextInt();
                    if (number1 > number2 && number1 > number3) {
                        System.out.println("greatest umber is : num1");
                    } else if (number2 > number1 && number2 > number3) {
                        System.out.println("greatest number is : num2");
                    } else {
                        System.out.println("greatest number is : num3");
                    }
                    break;
                case 2:
                    System.out.println("Enter the first number");
                    int UserInput = scanner.nextInt();
                    System.out.println("Enter the second  number");
                    int num2 = scanner.nextInt();
                    System.out.println("Enter the operator");
                    String operator = scanner.next();
                    double result = 0;



                    switch (operator) {

                        case "+":
                            result= num2 + UserInput;
                            break;

                        case "-":
                            result= num2 - UserInput;
                            break;

                        case "*":
                            result= num2 * UserInput;
                            break;

                        case "/":
                            result= num2 / UserInput;
                            break;

                        default:
                            System.out.println("Invalid Input");
                            break;
                    }

                    System.out.println(result);

                case 3:
                    float gkmark, computermark, nepalimark;
                    float total_percent;
                    System.out.println("Enter Math_mark, Science_mark, English_mark : ");
                    gkmark = scanner.nextFloat();
                    computermark = scanner.nextFloat();
                    nepalimark = scanner.nextFloat();
                    total_percent = ((gkmark + computermark + nepalimark) / 300) * 100;
                    if (total_percent > 100) {
                        if (total_percent >= 90 && total_percent <= 100) {
                            System.out.println("You have got A+");
                        } else if (total_percent >= 80 && total_percent < 90) {
                            System.out.println("You have got A");
                        } else if (total_percent >= 70 && total_percent < 80) {
                            System.out.println("You have got B+");
                        } else if (total_percent >= 60 && total_percent < 70) {
                            System.out.println("You have got B");
                        } else if (total_percent >= 50 && total_percent < 60) {
                            System.out.println("You have got C+");
                        } else if (total_percent >= 40 && total_percent < 50) {

                            System.out.println("You have got C");
                        } else {
                            System.out.println("You have fail the exam !!!");
                        }
                    } else {
                        System.out.println("invalid");
                    }
                    break;
                case 4:
                    int rand_int1 = random.nextInt(50);
                    int inputNumber = 0;
                    System.out.println("Enter number from 0 to 50 : ");
                    inputNumber = scanner.nextInt();
                    if (inputNumber == rand_int1) {
                        System.out.println("Your answer is correct");
                    } else {
                        System.out.println("Try again");
                    }
                    break;

            }
            {
                System.out.println("Invalid login and password");
            }
        }
    }
}
