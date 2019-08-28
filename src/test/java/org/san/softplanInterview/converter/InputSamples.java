package org.san.softplanInterview.converter;

import java.util.HashMap;
import java.util.Map;

public class InputSamples {
    private static final Map<Integer, String> SAMPLES;

    static {
        SAMPLES = new HashMap<>();
        SAMPLES.put(1, "I");
        SAMPLES.put(2, "II");
        SAMPLES.put(3, "III");
        SAMPLES.put(4, "IV");
        SAMPLES.put(5, "V");
        SAMPLES.put(7, "VII");
        SAMPLES.put(9, "IX");
        SAMPLES.put(10, "X");
        SAMPLES.put(30, "XXX");
        SAMPLES.put(39, "XXXIX");
        SAMPLES.put(100, "C");
        SAMPLES.put(166, "CLXVI");
    }

    public static Map<Integer, String> getSamples() {
        return SAMPLES;
    }

}
