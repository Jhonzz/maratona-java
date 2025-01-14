package academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.dominio;

public class CurrencyFactory {
    public static Currency newCurrency(Country country) {
        switch (country) {
            case USA:
                return new USDollar();
            case BRAZIL:
                return new Real();
            default:
                throw new IllegalArgumentException("Currency not fount for this country");
        }
    }
}
