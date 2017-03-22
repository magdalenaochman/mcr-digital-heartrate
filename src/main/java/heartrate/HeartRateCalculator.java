package heartrate;

import java.util.Scanner;

public class HeartRateCalculator {

    public static void main(String[] args) {
        HeartRateCalculator calculator = new HeartRateCalculator();
        calculator.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter resting heart rate: ");
        String restingHeartRate = scanner.nextLine();
        System.out.print("Enter age: ");
        String age = scanner.nextLine();

        System.out.printf("Age: %s, Resting heart rate: %s\n", age, restingHeartRate);

        System.out.printf("Intensity\t|Heart rate\n");


    }
}
