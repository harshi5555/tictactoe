package tictactoe;

import java.util.Scanner;

public class PlayGame  {
	private boolean gameOver = false;
	private boolean isBoxFilled=false;
	private Scanner scan = new Scanner(System.in);

	public void PlayGame(Player p,Board b){
		do{//loop to get the player choice
		int userIn=0;
		
		if(p.iscomputerPlayer()){
			userIn = generateSelection();
	
		} else {
			System.out.println("\n Enter  " + p.getName() + "  Selection (" + p.getPlayerMark() + "): ");
			userIn = scan.nextInt();
		}
		//mark the selected box, outcome is either failed or pass
		
			isBoxFilled =b.setSelection(userIn,p.getPlayerMark());
			
			//if box marking successful (passed)
			if(isBoxFilled == true){
				//check if the player has win the game
				if(b.didWin(p.getPlayerMark()) == true){
					//mark completion of the game
					gameOver = true;
					//set the player win status to true to indicate he/she has win
					p.setWinStatus(true);
					//set the player total score for all the games played
					p.setScore(p.getScore()+1);
				}
			}
	}while(isBoxFilled==false);
	}

	
	public void play(Player player1,Player player2){
		boolean playAnotherGame=false;
		String userInput = "";
		PrintResult ps = new PrintResult();
		
		do{//do while for playing multiple games
			Board ticTacToeBoard = new Board(24,24);
			//drow the board 
			ticTacToeBoard.drawBoard();
		    isBoxFilled=false;
			//while loop for repeating the player choice
			while(gameOver==false){
					if(ticTacToeBoard.isBoardComplete()==false){
						PlayGame(player1, ticTacToeBoard);
					}else{
							gameOver=true;
					}
					ticTacToeBoard.drawBoard();
					if(gameOver==false && ticTacToeBoard.isBoardComplete()==false){
						PlayGame(player2,ticTacToeBoard);
						ticTacToeBoard.drawBoard();
					}//end if
					
				
				}//end while
	
			//print result of the game
			ps.printResult(player1,player2);
			//Ask users to  play another game
			Scanner scanNew = new Scanner(System.in);
			System.out.print("Do you want to play again(y/n) : ");
			userInput = scanNew.nextLine();
			if(userInput.equalsIgnoreCase("Y") ){
				playAnotherGame = true;
				gameOver=false;
				player1.setWinStatus(false);
				player2.setWinStatus(false);
				System.out.println("You can play again...");
			}else{
				playAnotherGame = false;
				System.out.println("Game end....");
			}//end if
		}while(playAnotherGame==true);
	}
	
	public int generateSelection(){
		 Double obj = Math.random()*10;
	     int i = obj.intValue();
		 return i ;
	}

			
}
	