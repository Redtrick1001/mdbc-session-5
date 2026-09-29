package romannumeralscalculator;

public class RomanNumeralCalculator {

    //
    public String calc(int num) {
        String output = "";
        while (true) {
            if (num - 100 >= 0) {
                output += "C";
                num -= 100;
            } else if (num- 90 >= 0) {
                output += "XC";
                num -= 90;
            } else if (num - 50 >= 0) {
                output += "L";
                num -= 50;
            } else if (num - 40 >= 0) {
                output += "XL";
                num -= 40;
            } else if (num - 10 >= 0) {
                output += "X";
                num -= 10;
            } else if (num - 9 >= 0) {
                output += "IX";
                num -= 9;
            } else if (num - 5 >= 0) {
                output += "V";
                num -= 5;
            } else if (num - 4 >= 0) {
                output += "IV";
                num -= 4;
            } else if (num - 1 >= 0) {
                output += "I";
                num -= 1;
            } else {
                break;
            }

        }
        return output;
    }
}
