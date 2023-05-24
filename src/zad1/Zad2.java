package zad1;

public class Zad2 {
    public static void main(String[] args) {
        try {
            int number = 5; // Podaj wartość do obliczenia silni
            System.out.println(factorial(number));
        } catch (BlednaWartoscDlaSilniException e) {
            System.out.println(e.getMessage());
        }
    }

    public static long factorial(int number) throws BlednaWartoscDlaSilniException {
        if (number < 0) {
            throw new BlednaWartoscDlaSilniException("Silnia nie jest zdefiniowana dla liczb ujemnych.");
        }

        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}

class BlednaWartoscDlaSilniException extends Exception {
    public BlednaWartoscDlaSilniException(String message) {
        super(message);
    }
}
