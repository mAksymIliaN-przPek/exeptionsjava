package zad3;

public class Main {
    public static void main(String[] args) {
        try {
            Adres adres = new Adres(null, -1, null, null);
        } catch (NieprawidlowyAdresException e) {
            System.out.println(e.getMessage());
        }
    }
}
