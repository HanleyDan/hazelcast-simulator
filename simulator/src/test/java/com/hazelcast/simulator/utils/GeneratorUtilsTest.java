package com.hazelcast.simulator.utils;

import org.junit.Test;

import java.util.Random;

import static com.hazelcast.simulator.utils.GeneratorUtils.generateByteArray;
import static com.hazelcast.simulator.utils.GeneratorUtils.generateAsciiString;
import static com.hazelcast.simulator.utils.GeneratorUtils.generateAsciiStrings;
import static com.hazelcast.simulator.utils.ReflectionUtils.invokePrivateConstructor;
import static com.hazelcast.simulator.utils.TestUtils.assertEqualsStringFormat;

public class GeneratorUtilsTest {

    @Test
    public void testConstructor() throws Exception {
        invokePrivateConstructor(GeneratorUtils.class);
    }

    @Test
    public void testGenerateStrings() throws Exception {
        String[] strings = generateAsciiStrings(3, 7);

        assertEqualsStringFormat("Expected to get %d strings, but was %d", 3, strings.length);
        for (String actual : strings) {
            assertEqualsStringFormat("Expected generated string length to be %d, but was %d", 7, actual.length());
        }
    }

    @Test
    public void testGenerateStringZeroLength() throws Exception {
        String actual = generateAsciiString(0);

        assertEqualsStringFormat("Expected generated string length to be %d, but was %d", 0, actual.length());
    }

    @Test
    public void testGenerateString() throws Exception {
        String actual = generateAsciiString(42);

        assertEqualsStringFormat("Expected generated string length to be %d, but was %d", 42, actual.length());
    }

    @Test
    public void testGenerateByteArray() throws Exception {
        byte[] actual = generateByteArray(new Random(), 23);

        assertEqualsStringFormat("Expected generated byte array length to be %d, but was %d", 23, actual.length);
    }
}
