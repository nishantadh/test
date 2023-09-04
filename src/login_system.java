

import java.util.Random;
import java.util.Scanner;
    public class login_system {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            String username = "nishant";
            String password = "nishant123";
            String user_name;
            System.out.println("Enter your username : ");
            user_name = scanner.nextLine();
            String pass_word;
            System.out.println("Enter your password : ");
            pass_word = scanner.nextLine();
            int choice = 0;
            if (user_name.equals(username) && pass_word.equals(password)) {
                System.out.println("You have logged in");
                System.out.println("1. Greater number between 3 number");
                System.out.println("2. Calculator");
                System.out.println("3. Result Calculator with 3 grades");
                System.out.println("4. Guessing Game");
                System.out.println("Enter number to calculate following : ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        int num1;
                        int num2;
                        int num3;
                        System.out.println("Enter number 1, number 2, number 3 : ");
                        num1 = scanner.nextInt();
                        num2 = scanner.nextInt();
                        num3 = scanner.nextInt();
                        if (num1 > num2 && num1 > num3) {
                            System.out.println("greatest umber is : num1");
                        } else if (num2 > num1 && num2 > num3) {
                            System.out.println("greatest number is : num2");
                        } else {
                            System.out.println("greatest number is : num3");
                        }
                        break;
                    case 2:
                        double num8 = 0, num9 = 0;
                        Scanner scan = new Scanner(System.in);
                        System.out.println(" ");
                        System.out.println("** I hope you like my Calculator **");
                        System.out.println(" ");
                        System.out.print("Enter Operation (+,-,*,/): ");
                        String operation = scan.next();
                        System.out.print("Enter First Number: ");
                        double firstnum = scan.nextDouble();
                        System.out.print("Enter Second Number: ");
                        double secondnum = scan.nextDouble();
                        if (operation.equals("+")) {
                            System.out.println("The sum is:" + (firstnum + secondnum));
                        } else if (operation.equals("-")) {
                            System.out.println("The difference is:" + (num8 - num9));
                        } else if (operation.equals("*")) {
                            System.out.println("The result is:" + (num8 * num9));
                        } else if (operation.equals("/")) {
                            System.out.println("The division is:" + (num8 / num9));
                        } else {
                            System.out.println("Operation Not Found");
                        }

                    case 3:
                        float mathMark, scienceMark, englishMark;
                        float percentage;
                        System.out.println("Enter Math_mark, Science_mark, English_mark : ");
                        mathMark = scanner.nextFloat();
                        scienceMark = scanner.nextFloat();
                        englishMark = scanner.nextFloat();
                        percentage = ((mathMark + scienceMark + englishMark) / 300) * 100;
                        if (percentage > 100) {
                            if (percentage >= 90 && percentage <= 100) {
                                System.out.println("You have got A+");
                            } else if (percentage >= 80 && percentage < 90) {
                                System.out.println("You have got A");
                            } else if (percentage >= 70 && percentage < 80) {
                                System.out.println("You have got B+");
                            } else if (percentage >= 60 && percentage < 70) {
                                System.out.println("You have got B");
                            } else if (percentage >= 50 && percentage < 60) {
                                System.out.println("You have got C+");
                            } else if (percentage >= 40 && percentage < 50) {
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

