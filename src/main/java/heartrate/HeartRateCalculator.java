package heartrate;

import java.util.Scanner;

public class HeartRateCalculator {

    private int intensity;
    private int age;
    private int restingHeartRate;

    public static void main(String[] args) {
        HeartRateCalculator calculator = new HeartRateCalculator();
        calculator.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter resting heart rate: ");
        restingHeartRate = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter age: ");
        age = Integer.parseInt(scanner.nextLine());

//        if (restingHeartRate == null) {
//            System.out.printf("Please enter resting heart rate");
//        }
//        if(age == null) {
//            System.out.printf("Please enter your age");
//        }

        System.out.printf("Age: %s, Resting heart rate: %s\n", age, restingHeartRate);
        int targetHeartRate = (((220 - age)) - restingHeartRate * intensity + restingHeartRate);
        for (int intensity = 55; intensity <= 56; intensity += 5) {
            System.out.printf("Intensity|Heart rate\n");
            System.out.println("---------|----------");
            System.out.println("   " + intensity + "%" + "   " + "|" + "   " + targetHeartRate);
        }
    }

//    public int calculate(int age, int restingHeartRate, int intensity) {
//
////        System.out.println(targetHeartRate);
//        return targetHeartRate;
//    }


}
