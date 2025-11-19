import java.util.Scanner;

public class SentinelControlLoop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        System.out.println("Enter -1 to terminate the loop");

        while (true) {
            System.out.print("Enter number: ");
            num = input.nextInt();

            if (num == -1) {
                break;
            }

            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);
    }
}