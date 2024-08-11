package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // квадрат
        System.out.println("Please enter your number : ");
        int number = scanner.nextInt();
        square(number);

        // объем
        System.out.print(" Enter your radius : ");
        double radius = scanner.nextDouble();
        System.out.print(" Enter your height : ");
        double height = scanner.nextDouble();
        double volume = circle(radius, height);
        System.out.println(" V is : " + volume);

        // массив
        System.out.println("Enter your quantity of elements :");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Choose your elements : ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = sumArray(array);
        System.out.println("The sum of array is : " + sum);

        //строка
        scanner.nextLine();
        System.out.println(" Show me your string and I'll show you magic : ");
        String magicString = scanner.nextLine();
        String revesreString = reverse(magicString);
        System.out.println(" Sooooo, its your string : " + magicString + "\n Its my string :" + revesreString);

        //степень
        System.out.println("Please enter first number : ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter your second number :" );
        int secondNumber = scanner.nextInt();
        int result = power(firstNumber,secondNumber);
        System.out.println(" Its your power number("+ firstNumber + "^" + secondNumber +") is :" + result);

        //строчка n-кол.раз
        System.out.println("Please enter your number ( how many times to repeat)  :");
        int repeatN = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter your string : ");
        String text = scanner.nextLine();
        repeatText(repeatN,text);
    }
    public static void square(int number) {
        int enterNumber = number * number;
        System.out.println(" Square is : " + enterNumber);
    }

    public static double circle(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static int sumArray(int[] array) {
        int total = 0;
        for (int number : array) {
            total += number;
        }
        return total;
    }

    public static String reverse(String inputString) {
        return new StringBuilder(inputString).reverse().toString();
    }
    public static int power(int warp, int powerNumber) {
        return (int) Math.pow(warp, powerNumber);
    }
    public static void repeatText(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}