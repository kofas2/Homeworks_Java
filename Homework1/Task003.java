//3) Реализовать простой калькулятор


package Homeworks_Java.Homework1;

import java.util.Scanner;

public class Task003 {
        static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Enter the number: ");
        Scanner n1 = new Scanner(System.in);
        int num1 = n1.nextInt();

        System.out.println("Enter the operation: ");
        char operation = scanner.next().charAt(0);
        
        System.out.println("Enter the number: ");
        Scanner n2 = new Scanner(System.in);
        int num2 = n2.nextInt();


        int result = 0;
        switch (operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            }
    System.out.println("Результат операции: " + result);
    n1.close();
    n2.close();
    }
}
