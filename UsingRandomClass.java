import java.util.Random;

public class UsingRandomClass {
	public static void main (String[] args){
		Random random = new Random();
		
		int number = random.nextInt();
		System.out.printf("The number generated %d%n",Math.abs(number));
		
		int myNumber = random.nextInt(10);
		System.out.printf("My generated number is %d%n",myNumber);
		
		double myDoubleNumber = random.nextDouble();
		System.out.printf("My generated float point number is %f%n",myDoubleNumber);
	}
}