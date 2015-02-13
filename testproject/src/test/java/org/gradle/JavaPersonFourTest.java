package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.File;
import java.util.Properties;

public class JavaPersonFourTest {
    @Test
    public void testMarkerFile4() throws IOException {
        new File(System.getProperty("org.gradle.integtest.buildDir") + "/" + getClass().getSimpleName()).createNewFile();
    }
}
