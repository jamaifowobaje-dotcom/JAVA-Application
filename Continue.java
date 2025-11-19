public class Continue {
    public static void main(String[] args){
		int i = 2;
		while(i <= 10){
			System.out.printf("Testing the continue statement %d%n",i);
			
			i++;
			
			if(i == 5 || i == 9){
				continue;
			}
			
	    }
	}
}