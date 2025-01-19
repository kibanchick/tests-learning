package framework.config;

import java.util.ResourceBundle;

public class PropertiesConfig {
    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle("config");

    public static String getUrl() {
        return resourceBundle.getString("url");
    }

    public static String getBrowser() {
        return resourceBundle.getString("browser");
    }
}
