import java.util.Random;
import java.util.Scanner;

public class RPS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int upperBound = 3, player1, player2, a=0, b=0, i=1;
		while(i<=5) 
		{
			again:{
				System.out.println("Match No. "+i);
				System.out.println("Choose one of them");
				System.out.println("Enter 1 for Scissor");
				System.out.println("Enter 2 for Paper");
				System.out.println("Enter 3 for Rock");
				System.out.print("Enter: ");
				player1 = sc.nextInt();
				if(player1 >=1 && player1 <=3)
				{
					player2 = r.nextInt(upperBound);
					if(player1 == player2)
					{
						System.out.println("Player 2 choice :" + player2);
						System.out.println("It is a tie!!!");
					}
					else
					{
						if(player1 == 1)
						{
							if(player2 == 2)
							{
								System.out.println("Player 2 choice :" + player2);
								a++;
							}
							else
							{
								System.out.println("Player 2 choice :" + player2);
								b++;
							}
						}
						else if(player1 == 2)
						{
							if(player2 == 3)
							{
								System.out.println("Player 2 choice :" + player2);
								a++;
							}
							else
							{
								System.out.println("Player 2 choice :" + player2);
								b++;
							}
						}
						else
						{
							
							if(player2 == 1) {
								System.out.println("Player 2 choice :" + player2);
								a++;}
							else
							{
								System.out.println("Player 2 choice :" + player2);
								b++;
						}
							}
					}
				}
				else
				{
					System.out.println("\n\nWrong Choice!\nTry Again\n\n");
					break again;
				}
			}
			i++;
		}
		if(a > b)
			System.out.println("You Win!!!");
		else
			System.out.println("You Lose!!!");
	}
}