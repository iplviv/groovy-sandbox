package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.File;
import java.util.Properties;

public class JavaPersonTestOne {
    @Test
    public void testMainProperty() throws IOException {
        assertEquals("mainValue", new JavaPerson().readProperty());
    }

    @Test
    public void testTestProperty() throws IOException {
        Properties properties = new Properties();
        properties.load(getClass().getClassLoader().getResourceAsStream("org/gradle/test.properties"));
        assertEquals("testValue", properties.getProperty("test"));
    }
}
