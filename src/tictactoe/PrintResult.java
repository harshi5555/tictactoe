package tictactoe;

public class PrintResult {

	public static void printResult(Player p1,Player p2){
		if(p1.isWinStatus()==true){
			System.out.println("\n***********************\n" + p1.getName() + " won the game !!!");
			System.out.println("" + p1.getName() + " score : " + p1.getScore() );
			System.out.println("" + p2.getName() + " score : " + p2.getScore() );
		} else if(p2.isWinStatus()==true){
			System.out.println("\n***********************\n" + p2.getName() + " won the game !!!");
			System.out.println("" + p1.getName() + " score : " + p1.getScore() );
			System.out.println("" + p2.getName() + " score : " + p2.getScore() );
		} else {
			System.out.println("\n***********************\n Game draw...");
			System.out.println("" + p1.getName() + " score : " + p1.getScore() );
			System.out.println("" + p2.getName() + " score : " + p2.getScore() );
		
		}//end if
	}
}
