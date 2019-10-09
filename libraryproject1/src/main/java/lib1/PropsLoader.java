package lib1;

import java.io.InputStream;
import java.util.Properties;

public class PropsLoader {
    public static Properties fromClassPath(String res) throws Exception {
        try (InputStream inputStream = PropsLoader.class.getClassLoader().getResourceAsStream(res)) {
            Properties p = new Properties();
            p.load(inputStream);
            return p;
        }
    }
}
