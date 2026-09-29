package stringcalculator;

public class StringCalculator {
    public String calc(String nums) {
        if (nums.isEmpty()) return "";

        int output = 0;
        String[] numArray = nums.split(" ");
        for (int i = 0; i <= 2; i++) {
            if (this.validNumber(numArray[i])) {
                output += Integer.parseInt(numArray[i]);
            }
        }

        return output == 0  ? "" : String.valueOf(output);

    }

    public Boolean validNumber(String num) {
        if (num.chars().anyMatch(Character::isLetter)) return false;
        if (Integer.parseInt(num) >= 1000) return false;
        return true;
    }
}
