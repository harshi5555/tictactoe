package tictactoe;

import java.util.Scanner;


public class TIcTacToe {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Player player1;
		Player player2;
		
		String userInput = "";
		System.out.print("Enter player1 name/if computer please type 'C' : ");
		userInput = scan.nextLine();
		//create a player1 object with name and mark
		if( userInput.equalsIgnoreCase("C") ) {
			 player1 = new Player("COMPUTER1","X",true);
			
			 
		}else{
		     player1 = new Player(userInput,"X");
		}
		System.out.print("Enter player2 name/if computer please type 'C' : ");
		userInput = scan.nextLine();
		//create a player2 object with name and mark
		if( userInput.equalsIgnoreCase("C") ) {
			 player2 = new Player("COMPUTER2","O",true);
		}else{
			 player2 = new Player(userInput,"O");
		}
		
		PlayGame playObj = new PlayGame();
		playObj.play(player1, player2);
	

	}//end main method

}//end class
