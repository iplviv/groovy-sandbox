package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.File;
import java.util.Properties;

public class JavaPersonTestFive {
    @Test
    public void testMainProperty() throws IOException {
        assertEquals("mainValue", new JavaPerson().readProperty());
    }
}
