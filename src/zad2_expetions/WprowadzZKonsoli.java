package zad2_expetions;

import java.util.Scanner;
import java.util.InputMismatchException;

public class WprowadzZKonsoli {
    private Scanner scanner;

    public WprowadzZKonsoli() {
        scanner = new Scanner(System.in);
    }

    public int wprowadzInt() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.next();  // odrzuć błędne dane
                System.out.println("To nie jest poprawna liczba całkowita. Spróbuj ponownie:");
            }
        }
    }

    public long wprowadzLong() {
        while (true) {
            try {
                return scanner.nextLong();
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("To nie jest poprawna liczba long. Spróbuj ponownie:");
            }
        }
    }

    public short wprowadzShort() {
        while (true) {
            try {
                return scanner.nextShort();
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("To nie jest poprawna liczba short. Spróbuj ponownie:");
            }
        }
    }

    public float wprowadzFloat() {
        while (true) {
            try {
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("To nie jest poprawna liczba zmiennoprzecinkowa (float). Spróbuj ponownie:");
            }
        }
    }

    public double wprowadzDouble() {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("To nie jest poprawna liczba zmiennoprzecinkowa (double). Spróbuj ponownie:");
            }
        }
    }

    public char wprowadzChar() {
        while (true) {
            try {
                String input = scanner.next();
                if (input.length() > 1) {
                    throw new InputMismatchException();
                }
                return input.charAt(0);
            } catch (InputMismatchException e) {
                System.out.println("To nie jest poprawny znak. Spróbuj ponownie:");
            }
        }
    }

    public String wprowadzString() {
        return scanner.next();
    }
}
