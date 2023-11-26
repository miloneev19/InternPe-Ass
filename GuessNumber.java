import java.util.Scanner;
public class GuessNumber {

	public static void main(String[] args) {
		 
		System.out.println("----------------------------------------------------------");
		System.out.println("Guess a number between 1-15");
		System.out.println("----------------------------------------------------------");
		
		int min=1;
		int max=15;
		
		int random_int =(int) Math.floor(Math.random() * (max-min +1) + min);
		
		
		Scanner sc= new Scanner(System.in);
	   
	    
	    int choicecode=0;
	     do
	    {
	        System.out.println("Do you wanna play?  0:yes  1:no");
	        choicecode = sc.nextInt();
	        System.out.println("Enter number guessed by you : ");
		    int num = sc.nextInt();
	    if(num>=1 && num<=15)
	    {
	    	if(random_int==num)
	    	{
	    		System.out.println("Number Guessed correct !  YOU WON !!!!");
	    	}
	    	else
	    	{
	    		System.out.println("Sorry its incorrect!!!");
	    	}
	    }   
	    }while(choicecode!=1);

	}

}
