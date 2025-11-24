import java.util.Scanner;

public class UsingEnums{
	public enum AccountType{
		SAVINGS,
		CURRENT,
		FIXED_DEPOSIT
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Account type (SAVINGS, CURRENT OR FIXED_DEPOSIT)");
		System.out.print("Please Enter your Account type: ");
		String userChoice = scan.nextLine().toUpperCase();
		
		AccountType selectedType = null;
		
		if(userChoice.equals("SAVINGS")){
			selectedType = AccountType.SAVINGS;
			System.out.printf("Your %s account was created successfully",selectedType);
		}
		else if(userChoice.equals("CURRENT")){
			selectedType = AccountType.CURRENT;
			System.out.printf("Your %s account was created successfully",selectedType);
		}
		if(userChoice.equals("FIXED_DEPOSIT")){
			selectedType = AccountType.FIXED_DEPOSIT;
			System.out.printf("Your %s account was created successfully",selectedType);
		}
		if(selectedType != null){
			System.out.println("Selected account type is " + selectedType);
		}
		else{
			System.out.println("Invalid Input");
		}
	} 
}