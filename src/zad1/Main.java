package zad1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę, której pierwiastek chcesz obliczyć:");

        try {
            String userInput = scanner.nextLine();
            double number = Double.parseDouble(userInput);

            if (number < 0) {
                throw new IllegalArgumentException("Nie można obliczyć pierwiastka kwadratowego z liczby ujemnej.");
            }

            double result = Math.sqrt(number);
            System.out.println("Pierwiastek kwadratowy z liczby " + number + " wynosi: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Podany ciąg znaków nie jest liczbą. Spróbuj ponownie.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
