package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.File;
import java.util.Properties;

public class JavaPersonOneTest {
    @Test
    public void testMainProperty1() throws IOException {
        assertEquals("mainValue", new JavaPerson().readProperty());
    }

    @Test
    public void testTestProperty1() throws IOException {
        Properties properties = new Properties();
        properties.load(getClass().getClassLoader().getResourceAsStream("org/gradle/test.properties"));
        assertEquals("testValue", properties.getProperty("test"));
    }
}
