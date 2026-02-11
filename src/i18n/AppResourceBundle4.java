package i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class AppResourceBundle4 {
    public static void main(String[] args) {
        /*
        pt_BR ==> Fui ao  shopping e comprei 2 camisas. Custou R$ 200,00.
        en_GB ==> I went to te mall and bought 2 shirts. They cost 200.00
         */

        Locale loc = Locale.of("en", "GB");

        ResourceBundle bundle = ResourceBundle.getBundle("i18n.Messagens", loc);
        String sentence = bundle.getString("sentence");
        System.out.println(sentence);

        MessageFormat mf = new MessageFormat(sentence, loc);
        String formatted = mf.format(new Object[]{2, 200.0});
        System.out.println(formatted);


    }
}
