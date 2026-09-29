package fizzbuzz;

public class FizzBuzz {
    public String isFizzBuzz(int num) throws RuntimeException {
        int tracker = 0;
        if (num % 3 == 0) {
            tracker += 1;
        }

        if (num % 5 == 0) {
            tracker += 2;
        }

        switch (tracker) {
            case 0 -> {
                return String.valueOf(num);
            }
            case 1 -> {
                return "Fizz";
            }
            case 2 -> {
                return "Buzz";
            }
            case 3 -> {
                return "FizzBuzz";
            } default -> {
                throw new RuntimeException("Something went wrong");
            }
        }
    }

    public void fizzBuzzer(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println(i + " = " + this.isFizzBuzz(i));
        }
    }

}
