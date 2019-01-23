import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertyFile {

    public Properties prop = null;
    protected InputStream input = null;

    public ReadPropertyFile() throws IOException {
        prop = new Properties();
        input = new FileInputStream("C:\\projectsJava\\javapumped\\badges\\src\\properties\\config.properties");
        prop.load(input);
    }

    public String getUrl() {
        return prop.getProperty("url");
    }


}