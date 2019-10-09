package sample.multi;

import lib1.PropsLoader;
import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.assertEquals;

public class SampleTest {

    @Test
    public void shouldHaveProperty() throws Exception {
        Properties props = PropsLoader.fromClassPath("application.properties");
        assertEquals("1", props.getProperty("foo.bar"));
    }
}
