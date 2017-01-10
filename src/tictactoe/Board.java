package tictactoe;

public class Board {
	String[][] box={{"1","2","3"},{"4","5","6"},{"7","8","9"}};
	int boardHeight,boardWidth;
	int count = 0;
	
	
	
	public Board( int boardHeight, int boardWidth) {
		this.boardHeight = boardHeight;
		this.boardWidth = boardWidth;
		
	}
	
	public boolean isBoardComplete(){
		if(count == 9)
			return true;
		else
			return false;
	}
	public boolean didWin(String mark){
		boolean didWin= false;
		
		if(box[0][0]==mark && box[0][1]==mark && box[0][2] == mark
				|| box[1][0]==mark && box[1][1]==mark && box[1][2] == mark
						|| box[2][0]==mark && box[2][1]==mark && box[2][2] == mark
								|| box[0][0]==mark && box[1][0]==mark && box[2][0] == mark
										|| box[0][1]==mark && box[1][1]==mark && box[2][1] == mark
												|| box[0][2]==mark && box[1][2]==mark && box[2][2] == mark
														|| box[0][0]==mark && box[1][1]==mark && box[2][2] == mark
																|| box[2][0]==mark && box[1][1]==mark && box[0][2] == mark)
				{
			didWin=true;
			//System.out.println(" win");
		} 
		
		
			
			
		return didWin;
	}
	
	//function to check and set user selected box in two dimensional array
	public boolean setSelection(int selection,String mark){
		boolean markCom=false;
		String possibleNum = "123456789";
		if(selection == 1 && (possibleNum.indexOf(box[0][0]) >= 0) ){
			box[0][0] = mark;
			markCom=true;
			
		}
		else if (selection == 2 && (possibleNum.indexOf(box[0][1]) >= 0) ){
			box[0][1] = mark;
			markCom=true;
		}
		else if (selection == 3 && (possibleNum.indexOf(box[0][2]) >= 0) ){
			box[0][2] = mark;
			markCom=true;
		}
		else if (selection == 4 &&  (possibleNum.indexOf(box[1][0]) >= 0) ){
			box[1][0] = mark;
			markCom=true;
		}
		else if (selection == 5 &&  (possibleNum.indexOf(box[1][1]) >= 0) ){
			box[1][1] = mark;
			markCom=true;
		}
		else if (selection == 6 &&  (possibleNum.indexOf(box[1][2]) >= 0) ){
			box[1][2] = mark;
			markCom=true;
		}
		else if (selection == 7 &&  (possibleNum.indexOf(box[2][0]) >= 0) ){
			box[2][0] = mark;
			markCom=true;
		}
		else if (selection == 8 &&  (possibleNum.indexOf(box[2][1]) >= 0) ){
			box[2][1] = mark;
			markCom=true;
		}
		else if (selection == 9 &&  (possibleNum.indexOf(box[2][2]) >= 0) ){
			box[2][2] = mark;
			markCom=true;
		}

		if(markCom==true){
			count++;
		}
		return markCom;
	}

public void drawBoard(){
		for(int w = 0;w<= boardWidth;w++){
			System.out.print("\n");
			for(int h= 0 ; h<= boardHeight;h++){
			
					if(w==(boardWidth/6) && (h==(boardHeight/6)||h==(boardHeight/6)*3 ||h==(boardHeight/6)*5)      || 
					   w==(boardWidth/6)*3 && (h==(boardHeight/6)||h==(boardHeight/6)*3 ||h==(boardHeight/6)*5)	||
					   w==(boardWidth/6)*5 && (h==(boardHeight/6)||h==(boardHeight/6)*3 ||h==(boardHeight/6)*5)){
						//setting for raw number 1
					   if(w==(boardWidth/6) && h==(boardHeight/6)){
						   System.out.print(box[0][0]); 
					   }
					   if(w==(boardWidth/6) && h==(boardHeight/6)*3){
						   System.out.print(box[0][1]); 
					   }
					   if(w==(boardWidth/6) && h==(boardHeight/6)*5){
						   System.out.print(box[0][2]); 
					   }
					 //setting for raw number 2
					   if(w==(boardWidth/6)*3 && h==(boardHeight/6)){
						   System.out.print(box[1][0]); 
					   }
					   if(w==(boardWidth/6)*3 && h==(boardHeight/6)*3){
						   System.out.print(box[1][1]); 
					   }
					   if(w==(boardWidth/6)*3 && h==(boardHeight/6)*5){
						   System.out.print(box[1][2]); 
					   }
					
					   //setting for raw number 3
					   if(w==(boardWidth/6)*5 && h==(boardHeight/6)){
						   System.out.print(box[2][0]); 
					   }
					   if(w==(boardWidth/6)*5 && h==(boardHeight/6)*3){
						   System.out.print(box[2][1]); 
					   }
					   if(w==(boardWidth/6)*5 && h==(boardHeight/6)*5){
						   System.out.print(box[2][2]); 
					   }
					   
					}else if(w==0 || w == boardWidth/3 || w==(boardWidth/3)*2 || w==(boardWidth/3)*3 )
					{
						System.out.print(".");
					}else{
						System.out.print(" ");
					}
					
					if(h==0|| h == boardHeight/3 || h==(boardHeight/3)*2 || h==(boardHeight/3)*3 )
					{
						System.out.print(".");
					}else
					{
					
						System.out.print(" ");
					}
				
				
				
			}
		}
		
	}




}
