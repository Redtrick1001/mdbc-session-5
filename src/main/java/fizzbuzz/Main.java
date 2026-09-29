package fizzbuzz;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int start;
            int end;
            try {
                System.out.println("Where would you like to start:");
                String rawStart = scanner.nextLine();
                start = Integer.parseInt(rawStart);

                System.out.println("Where would you like to end: ");
                String rawEnd = scanner.nextLine();
                end = Integer.parseInt(rawEnd);

                FizzBuzz runner = new FizzBuzz();
                runner.fizzBuzzer(start, end);

                System.out.println("Would you like to leave");
                String leave = scanner.nextLine();
                if (leave.equalsIgnoreCase("yes")) {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("bye");
        scanner.close();
    }
}
