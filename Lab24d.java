//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("lab24d.dat"));
		int howMany = file.nextInt();
		file.nextLine();
		for(int i=0; i<howMany;i++)
		{
			TicTacToe game = new TicTacToe(file.nextLine());
			game.getWinner();
			System.out.println(game.getWinner());
			System.out.println(game);
			
		}
		file.close();
		//tictactoe only wants this file.nextInt()

		







	}
}



