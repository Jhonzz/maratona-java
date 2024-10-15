package academy.devdojo.maratonajava.javacore.SformatacaoTest;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeUSA = Locale.US;
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[1] = NumberFormat.getCurrencyInstance(localeUSA);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);
        double valor = 1_000.5213;

        for (NumberFormat numberFormat : nfa) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }
        String valorString = "￥1000.52";

        // Transformando esse valor com base no nfa1
        try {
            System.out.println(nfa[2].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
