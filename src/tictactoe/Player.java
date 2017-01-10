package tictactoe;

public class Player {
	
	String name;
	int score =0;
	boolean winStatus=false;
	String playerMark;
	boolean computerPlayer=false;
	
	public Player(String name,String playerMark) {
		
		this.name = name;
		this.playerMark = playerMark;
	}
	
	public Player(String name,String playerMark,boolean computerPlayer) {
		
		this.name = name;
		this.playerMark = playerMark;
		this.computerPlayer = computerPlayer;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public boolean isWinStatus() {
		return winStatus;
	}
	public void setWinStatus(boolean winStatus) {
		this.winStatus = winStatus;
	}
	public String getPlayerMark() {
		return playerMark;
	}
	public void setPlayerMark(String playerMark) {
		this.playerMark = playerMark;
	}

	public boolean iscomputerPlayer() {
		return computerPlayer;
	}

	public void setcomputerPlayer(boolean computerPlayer) {
		this.computerPlayer = computerPlayer;
	}
	
}
