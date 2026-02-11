package i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class AppResourceBundle2 {
    public static void main(String[] args) {

        ResourceBundle bundle = ResourceBundle.getBundle("Messagens", Locale.of("fr", "FR"));

        System.out.println(bundle.getString("greetings"));

    }
}
