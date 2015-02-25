package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.File;
import java.util.Properties;

public class JavaPersonTwoTest {
    @Test
    public void testMainProperty2() throws IOException {
        assertEquals("mainValue", new JavaPerson().readProperty());
    }

    @Test
    public void testMarkerFile2() throws IOException {
        new File(System.getProperty("org.gradle.integtest.buildDir") + "/" + getClass().getSimpleName()).createNewFile();
        assert false;
    }
}
