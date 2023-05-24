package zad3;
class NieprawidlowyAdresException extends Exception {
    public NieprawidlowyAdresException(String message) {
        super(message);
    }
}

class Adres {
    private String ulica;
    private int numerDomu;
    private String kodPocztowy;
    private String miasto;

    public Adres(String ulica, int numerDomu, String kodPocztowy, String miasto) throws NieprawidlowyAdresException {
        StringBuilder sb = new StringBuilder();

        if (ulica == null) {
            sb.append("Ulica nie może być nullem. ");
        }

        if (numerDomu <= 0) {
            sb.append("Numer domu musi być większy od 0. ");
        }

        if (kodPocztowy == null) {
            sb.append("Kod pocztowy nie może być nullem. ");
        }

        if (miasto == null) {
            sb.append("Miasto nie może być nullem. ");
        }

        if (sb.length() > 0) {
            throw new NieprawidlowyAdresException(sb.toString());
        }

        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }
}

