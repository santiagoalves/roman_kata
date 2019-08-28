package org.san.softplanInterview.converter;

public class RomanNumberStringToIntUsingEnumConverter implements RomanNumberStringToIntConverter {

    public int converte(String romanNumber) {

        RomanNumberEnum last;
        RomanNumberEnum lastButOne = null;
        int resultado = 0;
        for (int i = romanNumber.length()-1; i >= 0; i--) {
            last = RomanNumberEnum.valueOf(String.valueOf(romanNumber.charAt(i)));
            if (i-1 >= 0) {
                lastButOne = RomanNumberEnum.valueOf(String.valueOf(romanNumber.charAt(i-1)));
            }
            if (lastButOne != null && lastButOne.ordinal() < last.ordinal()) {
                resultado +=  last.getValue() - lastButOne.getValue();
                i--;
            } else {
                resultado += last.getValue();
            }
        }

        return resultado;
    }

    private enum RomanNumberEnum {

        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);

        private int value;

        RomanNumberEnum(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

    }

}
