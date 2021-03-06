package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.File;
import java.util.Properties;

public class JavaPersonThreeTest {
    @Test
    public void testTestProperty3() throws IOException {
        Properties properties = new Properties();
        properties.load(getClass().getClassLoader().getResourceAsStream("org/gradle/test.properties"));
        assertEquals("testValue", properties.getProperty("test"));
    }

    @Test
    public void testMarkerFile3() throws IOException {
        new File(System.getProperty("org.gradle.integtest.buildDir") + "/" + getClass().getSimpleName()).createNewFile();
    }
}
