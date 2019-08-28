package org.san.softplanInterview.converter;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumberStringToIntUsingHashMapConverterTest {

    @Test
    public void deve_converter_numeros_romanos_para_decimal_usando_hashmap() {
        RomanNumberStringToIntConverter converter = new RomanNumberStringToIntUsingEnumConverter();
        InputSamples.getSamples().forEach((expectedResult, input) -> Assert.assertEquals(expectedResult.intValue(), converter.converte(input)));
    }

}
