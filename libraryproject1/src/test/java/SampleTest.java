import lib1.PropsLoader;
import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.assertEquals;

public class SampleTest {

    @Test
    public void shouldHaveProperty() throws Exception {
        Properties props = PropsLoader.fromClassPath("application-test.properties");
        assertEquals("11", props.getProperty("foo.bar"));
    }
}
