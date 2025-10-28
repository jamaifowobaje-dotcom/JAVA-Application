public class OperatorsPart1{
	public static void main(String[] args){
		int num = 0;
		
		//compound assignment operator
		num+= 8;
		num-= 7;
		num*= 4;
		num/= 6;
		num^= 3;
		num%= 2;
		
		System.out.printf("Value = %d%n",num);
		
		//Arithmetic Operator
		int num1 = 10;
		int num2 = 4;
		String name = "Jamzy";
		int sum = num1 + num2;
		int product = num1 * num2;
		int minus = num1 - num2;
		double divide = (double)num1/num2;
		int modulos = num1%num2;
		
		System.out.printf("Sum is %d%n",sum);
		System.out.printf("Product is %d%n",product);
		System.out.printf("Difference between num1 and num2 is %d%n",minus);
		System.out.println(name + sum);
		System.out.printf("Result is %d",divide);
		System.out.printf("Modulos is %d%n",modulos);
		
		//Relational Operators 
		int firstNum = 12;
		int secondNum = 15;
		boolean isGreater = firstNum > secondNum;
		boolean isLesser = firstNum < secondNum;
		boolean isGreaterThanOrEqualTo = firstNum >= secondNum;
		boolean isLessThanOrEqualTo = firstNum <= secondNum;
		boolean isNotEqualTo = firstNum != secondNum;
		boolean isEqualTo = firstNum==secondNum;
		
		System.out.printf("Is firstNum > secondNum? %b%n",isGreater);
		System.out.printf("Is firstNum < secondNum? %b%n",isLesser);
		System.out.printf("Is firstNum >= secondNum? %b%n",isGreaterThanOrEqualTo);
		System.out.printf("Is firstNum <= secondNum? %b%n",isLessThanOrEqualTo);
		System.out.printf("Is firstNum != secondNum? %b%n",isNotEqualTo);
		System.out.printf("Is firstNum == secondNum? %b%n",isEqualTo);
	}
}