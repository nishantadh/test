

import java.util.Random;
import java.util.Scanner;
    public class login_system {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); 
            Random random = new Random(); //
            String username = "nishant";
            String password = "nishant123";
            String user_name;
            System.out.println("Enter your username : ");
            user_name  = scanner.nextLine();
            String pass_word;
            System.out.println("Enter your password : ");
            pass_word = scanner.nextLine();
            int choice = 0;
            if (user_name.equals(username) && pass_word.equals(password)){
                System.out.println("You have logged in");
                System.out.println("------------------------");
                System.out.println("1. Greater number between 3 number");
                System.out.println("2. Calculator");
                System.out.println("3. Result Calculator with 3 grades");
                System.out.println("4. Guessing Game");
                System.out.println("--------------------------------");
                System.out.println("Enter number to calculate following : ");
                choice = scanner.nextInt();

                switch (choice){
                    //choice 1 then greater number between 3 number
                    case 1:
                        float num1;
                        float num2;
                        float num3;
                        System.out.println("Enter number 1, number 2, number 3 : ");
                        num1 = scanner.nextFloat();
                        num2 = scanner.nextFloat();
                        num3 = scanner.nextFloat();
                        if (num1 > num2 && num1 > num3){
                            System.out.println("greatest umber is : num1");
                        }
                        else if(num2 > num1 && num2 > num3){
                            System.out.println("greatest number is : num2");
                        }
                        else{
                            System.out.println("greatest number is : num3");
                        }
                        break;
                    case 2 :
                        System.out.println("Enter the first number");
                        int UserInput = scanner.nextInt();
                        System.out.println("Enter the second  number");
                        int number = scanner.nextInt();
                        System.out.println("Enter the operator");
                        String operator = scanner.next();
                        double result = 0;
                        switch (operator){
                            case "+":
                                result= number + UserInput;
                                break;

                            case "-":
                                result= number - UserInput;
                                break;

                            case "*":
                                result= number * UserInput;
                                break;

                            case "/":
                                result= number / UserInput;
                                break;

                            default:
                                System.out.println("Invalid Input");
                                break;
                        }
                        break;
                    case 3:
                        float mathMark,scienceMark,englishMark;
                        float percentage;
                        System.out.println("Enter Math_mark, Science_mark, English_mark : ");
                        mathMark = scanner.nextFloat();
                        scienceMark = scanner.nextFloat();
                        englishMark = scanner.nextFloat();
                        percentage = ((mathMark+scienceMark+englishMark)/300) * 100;
                        if(percentage >= 90 && percentage <= 100){
                            System.out.println("You have got A+");
                        }
                        else if(percentage >= 80 && percentage < 90){
                            System.out.println("You have got A");
                        }
                        else if(percentage >= 70 && percentage < 80){
                            System.out.println("You have got B+");
                        }
                        else if(percentage >= 60 && percentage < 70){
                            System.out.println("You have got B");
                        }
                        else if(percentage >= 50 && percentage < 60){
                            System.out.println("You have got C+");
                        }
                        else if(percentage >= 40 && percentage < 50){
                            System.out.println("You have got C");
                        }
                        else{
                            System.out.println("You have fail the exam !!!");
                        }
                        break;
                    case 4:
                        int rand_int1 = random.nextInt(50);
                        int inputNumber = 0;
                        System.out.println("Enter number from 0 to 50 : ");
                        inputNumber = scanner.nextInt();
                        if (inputNumber == rand_int1){
                            System.out.println("Your answer is correct");
                        }
                        else{
                            System.out.println("Try again");
                        }
                }
            }
            else {
                System.out.println("Invalid login and password");
            }
        }
    }
