package org.san.softplanInterview.converter;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumberStringToIntUsingEnumConverterTest {

    @Test
    public void deve_converter_numeros_romanos_para_inteiro_usando_enum() {
        RomanNumberStringToIntConverter converter = new RomanNumberStringToIntUsingEnumConverter();
        InputSamples.getSamples().forEach((expectedResult, input) -> Assert.assertEquals(expectedResult.intValue(), converter.converte(input)));
    }

}
