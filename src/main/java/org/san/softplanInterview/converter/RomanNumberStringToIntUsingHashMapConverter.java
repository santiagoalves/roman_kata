package org.san.softplanInterview.converter;

import java.util.HashMap;
import java.util.Map;

public class RomanNumberStringToIntUsingHashMapConverter implements RomanNumberStringToIntConverter {

    private static final Map<Character, Integer> ROMAN_NUMBERS;

    static {
        ROMAN_NUMBERS = new HashMap<>();
        ROMAN_NUMBERS.put('I', 1);
        ROMAN_NUMBERS.put('V', 5);
        ROMAN_NUMBERS.put('X', 10);
        ROMAN_NUMBERS.put('L', 50);
        ROMAN_NUMBERS.put('C', 100);
        ROMAN_NUMBERS.put('D', 500);
        ROMAN_NUMBERS.put('M', 1000);
    }

    public int converte(String romanNumber) {

        Integer last;
        Integer lastButOne = null;

        int resultado = 0;
        for (int i = romanNumber.length()-1; i >= 0; i--) {
            last = ROMAN_NUMBERS.get(romanNumber.charAt(i));
            if (i-1 >= 0) {
                lastButOne = ROMAN_NUMBERS.get(romanNumber.charAt(i-1));
            }
            if (lastButOne != null && lastButOne < last) {
                resultado +=  last - lastButOne;
                i--;
            } else {
                resultado += last;
            }
        }

        return resultado;
    }

}
