package academy.devdojo.maratonajava.javacore.SformatacaoTest;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoLanguages = Locale.getISOLanguages();
        String[] isoCountries = Locale.getISOCountries();

        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
        }
        System.out.println();

        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry+ " ");
        }


    }
}
