package i18n;

import java.util.ListResourceBundle;

public class Messagens_fr_CA extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{
            { "msg", "Hello!"},
            {"greeting", "Bienvvenue!"},
        };
    }
}
