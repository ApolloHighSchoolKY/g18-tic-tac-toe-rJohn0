//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char[3][3];
		mat[0][0] = 'x';
		mat[0][1] = 'x';
		mat[0][2] = 'x';
		mat[1][0] = 'o';
		mat[1][1] = 'o';
		mat[1][2] = 'o';
		mat[2][0] = 'x';
		mat[2][1] = 'x';
		mat[2][2] = 'x';
	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];
		int index =0;
		//rowmajor order here
		for(int row =0; row < mat.length;row++)
		{
			for(int col=0; col<mat[row].length;col++)
			{
				mat[row][col] = game.charAt(index);
				index++;
			}
		}

	}

	public String getWinner()
	{
		String winner = "";
		//horrizontal  start below
		if(mat[0][0] == mat[0][1] && mat[0][1] == mat[0][2]) {
			winner = "" + mat[0][0] + " wins";
		
		} else if (mat[1][0] == mat[1][1] && mat[1][1] == mat[1][2]) {
			winner = "" + mat[1][0] + " wins";
		
		} else if (mat[2][0] == mat[2][1] && mat[2][1] == mat[2][2]) {
			winner = "" + mat[2][0] + " wins";
		//veritcal start below
		} else if (mat[0][0] == mat[1][0] && mat[1][0] == mat[2][0]) {
			winner = "" + mat[0][0] + " wins";

		} else if (mat[0][1] == mat[1][1] && mat[1][1] == mat[2][1]) {
			winner = "" + mat[1][0] + " wins";

		} else if (mat[0][2] == mat[1][2] && mat[1][2] == mat[2][2]) {
			winner = "" + mat[2][2] + " wins";
		// diagonal start below
		} else if (mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2])
		{
			winner = "" + mat[0][0] + " wins";

		} else if (mat[0][2] == mat[1][1] && mat[1][1] == mat[2][0]) {
			winner = "" + mat[2][0] + " wins";
		//tie
		} else	{
			winner = "tie! no one wins";
		}



		return "" + winner;
	}

	public String toString()
	{
		String output="";
		for(char[] row: mat)
		{
			for(char col: row)
			{
				output+= col;
			}
			output+= "\n";
		}





		return output+"\n\n";
	}
}