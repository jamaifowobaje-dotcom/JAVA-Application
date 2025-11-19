// Get 10 numbers from user and find the sum of all the numbers
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int sum = 0;
        int i = 1;

        while (i <= 10) {
            System.out.printf("Input no.%d: ", i);
            num = input.nextInt();
            sum += num;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}
