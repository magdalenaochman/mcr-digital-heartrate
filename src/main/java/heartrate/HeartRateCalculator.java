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
            int restingHeartRate = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.printf("Age: %s, Resting heart rate: %s\n", age, restingHeartRate);
            System.out.printf("Intensity|Heart rate\n");
            System.out.println("---------|----------");

            for (int intensity = 55; intensity <= 95; intensity += 5) {
                int targetHeartRate = ((((220 - age) - restingHeartRate) * intensity) / 100) + restingHeartRate;
                System.out.println("   " + intensity + "%" + "   " + "|" + "   " + targetHeartRate);
            }
        }
    }
