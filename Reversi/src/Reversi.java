public class Reversi {
	
	public enum GameType {
		HUMAN_VS_HUMAN, 
		HUMAN_VS_RANDOM,
		HUMAN_VS_INTEL, 
		RANDOM_VS_RANDOM, 
		RANDOM_VS_INTEL, 
		RANDOM_VS_HUMAN, 
		INTEL_VS_INTEL, 
		INTEL_VS_RANDOM, 
		INTEL_VS_HUMAN
	} // GameType (determined from terminal arguments)
	
	private ReversiBoard board;
	private HumanPlayer human;
	private HumanPlayer human2;
	private RandomComputerPlayer randomCPU;
	private RandomComputerPlayer randomCPU2;
	private IntelligentComputerPlayer intelligentCPU;
	private IntelligentComputerPlayer intelligentCPU2;
	private GameType type;
//___________________________________________________________________________________________
	
	// Below are the 9 constructors... :(
	
	/**
	 * Creates Reversi game with HumanPlayer vs. HumanPlayer
	 * @param player1 the type of player1
	 * @param player2 the type of player2
	 */
	public Reversi(HumanPlayer player1, HumanPlayer player2) {
		board = new ReversiBoard();
		human = player1;
		human2 = player2;
		type = GameType.HUMAN_VS_HUMAN;
		
		randomCPU = null;
		randomCPU2 = null;
		intelligentCPU = null;
		intelligentCPU2 = null;
	} // constructor
	
	/**
	 * Creates Reversi game with HumanPlayer vs. RandomComputerPlayer
	 * @param player1 the type of player1
	 * @param player2 the type of player2
	 */
	public Reversi(HumanPlayer player1, RandomComputerPlayer player2) {
		board = new ReversiBoard();
		human = player1;
		randomCPU = player2;
		type = GameType.HUMAN_VS_RANDOM;
		
		human2 = null;
		randomCPU2 = null;
		intelligentCPU = null;
		intelligentCPU2 = null;
	} // constructor
	
	/**
	 * Creates Reversi game with HumanPlayer vs. IntelligentComputerPlayer
	 * @param player1 the type of player1
	 * @param player2 the type of player2
	 */
	public Reversi(HumanPlayer player1, IntelligentComputerPlayer player2) {
		board = new ReversiBoard();
		human = player1;
		intelligentCPU = player2;
		type = GameType.HUMAN_VS_INTEL;
		
		human2 = null;
		randomCPU = null;
		randomCPU2 = null;
		intelligentCPU2 = null;
	} // constructor
	
	/**
	 * Creates Reversi game with RandomComputerPlayer vs. RandomComputerPlayer
	 * @param player1 the type of player1
	 * @param player2 the type of player2
	 */
	public Reversi(RandomComputerPlayer player1, RandomComputerPlayer player2) {
		board = new ReversiBoard();
		randomCPU = player1;
		randomCPU2 = player2;
		type = GameType.RANDOM_VS_RANDOM;
		
		human = null;
		human2 = null;
		intelligentCPU = null;
		intelligentCPU2 = null;
	} // constructor
	
	/**
	 * Creates Reversi game with RandomComputerPlayer vs. IntelligentComputerPlayer
	 * @param player1 the type of player1
	 * @param player2 the type of player2
	 */
	public Reversi(RandomComputerPlayer player1, IntelligentComputerPlayer player2) {
		board = new ReversiBoard();
		randomCPU = player1;
		intelligentCPU = player2;
		type = GameType.RANDOM_VS_INTEL;
		
		human = null;
		human2 = null;
		randomCPU2 = null;
		intelligentCPU2 = null;
	} //constructor
	
	/**
	 * Creates Reversi game with RandomComputerPlayer vs. HumanPlayer
	 * @param player1 the type of player1
	 * @param player2 the type of player2
	 */
	public Reversi(RandomComputerPlayer player1, HumanPlayer player2) {
		board = new ReversiBoard();
		randomCPU = player1;
		human = player2;
		type = GameType.RANDOM_VS_HUMAN;
		
		human2 = null;
		randomCPU2 = null;
		intelligentCPU = null;
		intelligentCPU2 = null;
	} //constructor
	
	/**
	 * Creates Reversi game with IntelligentComputerPlayer vs. IntelligentComputerPlayer
	 * @param player1 the type of player1
	 * @param player2 the type of player2
	 */
	public Reversi(IntelligentComputerPlayer player1, IntelligentComputerPlayer player2) {
		board = new ReversiBoard();
		intelligentCPU = player1;
		intelligentCPU2 = player2;
		type = GameType.INTEL_VS_INTEL;
		
		human = null;
		human2 = null;
		randomCPU = null;
		randomCPU2 = null;
	} //constructor
	
	/**
	 * Creates Reversi game with IntelligentComputerPlayer vs. RandomComputerPlayer
	 * @param player1 the type of player1
	 * @param player2 the type of player2
	 */
	public Reversi(IntelligentComputerPlayer player1, RandomComputerPlayer player2) {
		board = new ReversiBoard();
		intelligentCPU = player1;
		randomCPU = player2;
		type = GameType.INTEL_VS_RANDOM;
		
		human = null;
		human2 = null;
		randomCPU2 = null;
		intelligentCPU2 = null;
	} //constructor
	
	/**
	 * Creates Reversi game with IntelligentComputerPlayer vs. HumanPlayer
	 * @param player1 the type of player1
	 * @param player2 the type of player2
	 */
	public Reversi(IntelligentComputerPlayer player1, HumanPlayer player2) {
		board = new ReversiBoard();
		intelligentCPU = player1;
		human = player2;
		type = GameType.INTEL_VS_HUMAN;
		
		human2 = null;
		randomCPU = null;
		randomCPU2 = null;
		intelligentCPU2 = null;
	} //constructor
	
//___________________________________________________________________________________________///
//___________________________________________________________________________________________///
//__________________________________END OF CONSTRUCTORS______________________________________///
//___________________________________________________________________________________________///
//___________________________________________________________________________________________///

	/**
	 * Main method
	 * @param args the command line arguments from the user
	 */
	public static void main(String[] args) {
		
		Reversi game = null;

		switch (args.length) {
		
		case 2: 
			
			if(args[0].equals("Human") && args[1].equals("Human")) {
				game = new Reversi(new HumanPlayer("X "), new HumanPlayer("O "));
				break;
			} else if(args[0].equals("Human") && args[1].equals("RandomComputerPlayer")) {
				game = new Reversi(new HumanPlayer("X "), new RandomComputerPlayer("O "));
				break;
			} else if(args[0].equals("Human") && args[1].equals("IntelligentComputerPlayer")) {
				game = new Reversi(new HumanPlayer("X "), new IntelligentComputerPlayer("O "));
				break;
			} else if(args[0].equals("RandomComputerPlayer") && args[1].equals("RandomComputerPlayer")) {
				game = new Reversi(new RandomComputerPlayer("X "), new RandomComputerPlayer("O "));
				break;
			} else if(args[0].equals("RandomComputerPlayer") && args[1].equals("IntelligentComputerPlayer")) {
				game = new Reversi(new RandomComputerPlayer("X "), new IntelligentComputerPlayer("O "));
				break;
			} else if(args[0].equals("RandomComputerPlayer") && args[1].equals("Human")) {
				game = new Reversi(new RandomComputerPlayer("X "), new HumanPlayer("O "));
				break;
			} else if(args[0].equals("IntelligentComputerPlayer") && args[1].equals("IntelligentComputerPlayer")) {
				game = new Reversi(new IntelligentComputerPlayer("X "), new IntelligentComputerPlayer("O "));
				break;
			} else if(args[0].equals("IntelligentComputerPlayer") && args[1].equals("RandomComputerPlayer")) {
				game = new Reversi(new IntelligentComputerPlayer("X "), new RandomComputerPlayer("O "));
				break;
			} else if(args[0].equals("IntelligentComputerPlayer") && args[1].equals("Human")) {
				game = new Reversi(new IntelligentComputerPlayer("X "), new HumanPlayer("O "));
				break;
			}
			
		default:
			
			// display usage statement

		    System.out.println("Usage: java Reversi [PLAYER 1 TYPE] [PLAYER 2 TYPE]");
		

		} // switch

		// if all is good, then run the game
	    game.run();
	    	
	} // main()


//___________________________________________________________________________________________
	
	
	/**
	 * Runs the game.
	 */
	private void run() {
		
		printWelcome();
		
		switch (this.type) {
		
		case HUMAN_VS_HUMAN: 
			while(true) {
				this.<HumanPlayer>playTurn(human);
				determineWinner(human, human2);
				this.<HumanPlayer>playTurn(human2);
				determineWinner(human, human2);
			}
		case HUMAN_VS_RANDOM:
			while(true) {
				this.<HumanPlayer>playTurn(human);
				determineWinner(human, randomCPU);
				this.<RandomComputerPlayer>playTurn(randomCPU);
				determineWinner(human, randomCPU);
			}
		case HUMAN_VS_INTEL:
			while(true) {
				this.<HumanPlayer>playTurn(human);
				determineWinner(human, intelligentCPU);
				this.<IntelligentComputerPlayer>playTurn(intelligentCPU);
				determineWinner(human, intelligentCPU);
			}
		case RANDOM_VS_RANDOM: 
			while(true) {
				this.<RandomComputerPlayer>playTurn(randomCPU);
				determineWinner(randomCPU, randomCPU2);
				this.<RandomComputerPlayer>playTurn(randomCPU2);
				determineWinner(randomCPU, randomCPU2);
			}
		case RANDOM_VS_INTEL:
			while(true) {
				this.<RandomComputerPlayer>playTurn(randomCPU);
				determineWinner(randomCPU, intelligentCPU);
				this.<IntelligentComputerPlayer>playTurn(intelligentCPU);
				determineWinner(randomCPU, intelligentCPU);
			}
		case RANDOM_VS_HUMAN:
			while(true) {
				this.<RandomComputerPlayer>playTurn(randomCPU);
				determineWinner(randomCPU, human);
				this.<HumanPlayer>playTurn(human);
				determineWinner(randomCPU, human);
			}
		case INTEL_VS_INTEL: 
			while(true) {
				this.<IntelligentComputerPlayer>playTurn(intelligentCPU);
				determineWinner(intelligentCPU, intelligentCPU2);
				this.<IntelligentComputerPlayer>playTurn(intelligentCPU2);
				determineWinner(intelligentCPU, intelligentCPU2);
			}
		case INTEL_VS_RANDOM:
			while(true) {
				this.<IntelligentComputerPlayer>playTurn(intelligentCPU);
				determineWinner(intelligentCPU, randomCPU);
				this.<RandomComputerPlayer>playTurn(randomCPU);
				determineWinner(intelligentCPU, randomCPU);
			}
		case INTEL_VS_HUMAN:
			while(true) {
				this.<IntelligentComputerPlayer>playTurn(intelligentCPU);
				determineWinner(intelligentCPU, human);
				this.<HumanPlayer>playTurn(human);
				determineWinner(intelligentCPU, human);
			}
		}
	} // run()
//___________________________________________________________________________________________
	
	/**
	 * Prints welcome message.
	 */
	private void printWelcome() {
		System.out.println();
		System.out.println("Welcome to Reversi!  Moves should be entered in a \"[row] [column]\" format.");
		System.out.println();
	}
//___________________________________________________________________________________________	
	
	/**
	 * Prints forfeit message.
	 * @param p the player who is forfeiting
	 */
	private void printForfeit(Player p) {
		System.out.println();
		System.out.println(p.getPieceIdentifier() + "has no valid moves." + " Turn forfeited.");
		System.out.println();
	}
//___________________________________________________________________________________________	
	
	/**
	 * Plays a turn of any player type.
	 * @param player the player object attempting to play their turn
	 */
	private <T extends Player> void playTurn(T player) {
		
		player.setValidMovesArray(board.getValidMovesFor(player));
		if(!player.hasValidMoveLeft()) {
			player.setDidForfeitTurn(true);
			printForfeit(player);
		} else {
			player.setDidForfeitTurn(false);
		}
		
		if(!player.getDidForfeitTurn()) {
			printScore(); // TODO: delete before turning in
			board.printBoard();
			player.chooseMove(board);
			player.setValidMovesArray(null);
		} 
	}
//______________________________________________________________________________________________________________
	
	/**
	 * After a turn of play, determines if anyone has won the game.
	 * @param p1 the first player to check
	 * @param p2 the second player to check
	 */
	private void determineWinner(Player p1, Player p2) {
		if((p1.getDidForfeitTurn() && p2.getDidForfeitTurn()) || board.isFull()) {
			if(board.countNumX() > board.countNumO()) {
				player1Wins();
			} else if(board.countNumO() > board.countNumX()) {
				player2Wins();
			} else {
				tie();
			}
		} // checks if either both players forfeited, or if the board is full
	} 
//______________________________________________________________________________________________________________
	
	/**
	 * Prints winning message for human, prints final score, ends the game.
	 */
	private void player1Wins() {
		System.out.println();
		System.out.println("X player wins!");
		System.out.println();
		System.out.println("FINAL SCORE: X=" + board.countNumX() + " , O=" + board.countNumO());
		System.out.println();
		board.printBoard();
		System.exit(0);
	}
//______________________________________________________________________________________________________________
	
	/**
	 * Prints winning message for random computer, prints final score, ends the game.
	 */
	private void player2Wins() {
		System.out.println();
		System.out.println("O player wins!");
		System.out.println();
		System.out.println("FINAL SCORE: O=" + board.countNumO() + " , X=" + board.countNumX());
		System.out.println();
		board.printBoard();
		System.exit(0);
	}
//______________________________________________________________________________________________________________	
	
	/**
	 * Prints draw message, prints final score, ends the game.
	 */
	private void tie() {
		System.out.println();
		System.out.println("It's a draw!");
		System.out.println();
		System.out.println("FINAL SCORE: X=" + board.countNumX() + " , O=" + board.countNumO());
		System.out.println();
		board.printBoard();
		System.exit(0);
	}
//______________________________________________________________________________________________________________
	
	/**
	 * Prints current score.
	 */
	private void printScore() {
		System.out.println();
		System.out.println("  SCORE: X=" + board.countNumX() + " , O=" + board.countNumO());
		System.out.println();
	}

} // Reversi


class ReversiBoard extends Board {
	
		private final int row = 8;
		private final int col = 8;
		private String [][] board = new String[row][col];
// ________________________________________________________________________________________________________	
	
		/**
		 * Constructor.
		 */
		public ReversiBoard() {
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					board[i][j] = ". ";
				}
			}
			board[3][3] = "X ";
			board[3][4] = "O ";
			board[4][3] = "O ";
			board[4][4] = "X ";
		}
		
// ________________________________________________________________________________________________________
		
		public void printBoard() {
			for(int i=0; i<row; i++) {
				if(i==0) {
					for(int k=0; k<row; k++ ) {
						if(k==0) {
							System.out.print("    " + (k+1));
						} //if
						else {
							System.out.print(" " + (k+1));
						} //else
					} //for
					System.out.println();
				}
				System.out.print("  " + (i+1) + " ");
				for(int j=0; j<col; j++) {
					System.out.print(board[i][j]);
				} //for
				System.out.println();
			} //for
			System.out.println();
		} //printBoard

// ________________________________________________________________________________________________________
		
		public void updateBoard(int r, int c, Player p) {
		
			//Determines which player turn
			String oppositePiece="", playerPiece="";
			if(p.getPieceIdentifier().equals("X ")) {
				oppositePiece = "O ";
				playerPiece = "X ";
			} else {
				oppositePiece = "X ";
				playerPiece = "O ";
			}
			
			
			int intelligentPieces = 0; // counts the number of potential flipped pieces for the intelligent computer's move
			
			//Locate the player piece
			int locatePiece=0;
			if(board[r][c].equals("_ ") || p.getValidMovesArray()[r][c]) { 
				if(!IntelligentComputerPlayer.intelligentExecute) {
					board[r][c]=playerPiece;
				} //if
				locatePiece=1;
			} //if
			
			
			if(locatePiece==1) {
			
				//Checks to the right horizontally
				int checkPiece=0, checkStop=1, otherPiece=0, flipPieces=0, endFlip=0, checkSkip=0;
				for(int i=c+1; i<col; i++) {	
					if(!board[r][i].equals(oppositePiece)) {
						checkSkip=1; //skip the check in that direction since no flips are available
					} //if
					if(board[r][i].equals(oppositePiece) && checkSkip==0) {
						if(checkStop==1) {
							for(int j=i; j<col; j++) {
								if(board[r][j].equals(oppositePiece)) {
									checkPiece=1; //possibly a valid direction to flip pieces
									endFlip++; //used to reiterate the amount of pieces to flip
									continue;
								} //if
								if(board[r][j].equals(". ") || board[r][j].equals("_ ") || (j==col-1 && board[r][j].equals(oppositePiece))){							
									otherPiece=1; //used to identify wrong pieces to not flip the pieces in that direction
									endFlip=0; //eliminate all the pieces to flip since invalid direction
								} //if
								if(board[r][j].equals(playerPiece) && checkPiece==1 && otherPiece!=1) {
									flipPieces=1; //confirms it's a valid direction to flip the pieces
									checkStop=0; //stop the checking of the pieces since the valid flip check is complete
									break;
								} //if
							} //for
						} //if 
						if(flipPieces==1 && board[r][i].equals(oppositePiece) && endFlip>0) {
							if(!IntelligentComputerPlayer.intelligentExecute) {
								board[r][i]=(playerPiece);
							} //if
							endFlip--; //used to stop the pieces from being flipped
							intelligentPieces++; //keep tracks of the flips to determine move for the intelligent computer
							continue;
						} //if
						else if(board[r][i].equals(playerPiece)) {
							break;
						} //else if
					} //if
				} //for

				
				//Checks to the left horizontally
				//comments above are all the same for the different check directions below
				int checkPieceTwo=0, checkStopTwo=1, otherPieceTwo=0, flipPiecesTwo=0, endFlipTwo=0, checkSkipTwo=0;
				for(int i=c-1; i>=0; i--) {	
					if(!board[r][i].equals(oppositePiece)) {
						checkSkipTwo=1;
					} //if
					if(board[r][i].equals(oppositePiece) && checkSkipTwo==0) {
						if(checkStopTwo==1) {
							for(int j=i; j>=0; j--) {
								if(board[r][j].equals(oppositePiece)) {
									checkPieceTwo=1;
									endFlipTwo++; 
									continue;
								} //if
								if(board[r][j].equals(". ") || board[r][j].equals("_ ") || (j==0 && board[r][j].equals(oppositePiece))){
									otherPieceTwo=1;
									endFlipTwo=0;
									break;
								} //if
								if(board[r][j].equals(playerPiece) && checkPieceTwo==1 && otherPieceTwo!=1) {
									flipPiecesTwo=1;
									checkStopTwo=0;
									break;
								} //if
							} //for
						} //if 
						if(flipPiecesTwo==1 && board[r][i].equals(oppositePiece) && endFlipTwo>0) {
							if(!IntelligentComputerPlayer.intelligentExecute) {
								board[r][i]=(playerPiece);
							} //if
							endFlipTwo--;
							intelligentPieces++;
							continue;
						} //if
						else if(board[r][i].equals(playerPiece)) {
							break;
						} //else if				
					} //if				
				} //for
				
				
				//Checks down vertically
				//comments above are all the same for the different check directions below
				int checkPieceThree=0, checkStopThree=1, otherPieceThree=0, flipPiecesThree=0, endFlipThree=0, checkSkipThree=0;
				for(int i=r+1; i<row; i++) {
					if(!board[i][c].equals(oppositePiece)) {
						checkSkipThree=1;
					} //if
					if(board[i][c].equals(oppositePiece) && checkSkipThree==0) {
						if(checkStopThree==1) {
							for(int j=i; j<row; j++) {
								if(board[j][c].equals(oppositePiece)) {
									checkPieceThree=1;
									endFlipThree++;
									continue;
								} //if
								if(board[j][c].equals(". ") || board[j][c].equals("_ ") || (j==row-1 && board[j][c].equals(oppositePiece))){
									otherPieceThree=1;
									endFlip=0;
									break;
								} //if
								if(board[j][c].equals(playerPiece) && checkPieceThree==1 && otherPieceThree!=1) {
									flipPiecesThree=1;
									checkStopThree=0;
									break;
								} //if
							} //for
						} //if 
						if(flipPiecesThree==1 && board[i][c].equals(oppositePiece) && endFlipThree>0) {
							if(!IntelligentComputerPlayer.intelligentExecute) {
								board[i][c]=(playerPiece);
							} //if
							endFlipThree--;
							intelligentPieces++;
							continue;
						} //if
						else if(board[i][c].equals(playerPiece)) {
							break;
						} //else if				
					} //if					
				} //for
				
						
				//Checks up vertically
				//comments above are all the same for the different check directions below
				int checkPieceFour=0, checkStopFour=1, otherPieceFour=0, flipPiecesFour=0, endFlipFour=0, checkSkipFour=0;
				for(int i=r-1; i>=0; i--) {
					if(!board[i][c].equals(oppositePiece)) {
						checkSkipFour=1;
					} //if
					if(board[i][c].equals(oppositePiece) && checkSkipFour==0) {
						if(checkStopFour==1) {
							for(int j=i; j>=0; j--) {
								if(board[j][c].equals(oppositePiece) && otherPieceFour==0) {
									checkPieceFour=1;
									endFlipFour++;
									continue;
								} //if
								if((board[j][c].equals(". ") ||  board[j][c].equals("_ ")) || (j==0 && board[j][c].equals(oppositePiece))){
									otherPieceFour=1;
									endFlipFour=0;
									break;
								} //if
								if(board[j][c].equals(playerPiece) && checkPieceFour==1 && otherPieceFour!=1) {
									flipPiecesFour=1;
									checkStopFour=0;
									break;
								} //if
							} //for
						} //if 
						if(flipPiecesFour==1 && board[i][c].equals(oppositePiece) && endFlipFour>0) {
							if(!IntelligentComputerPlayer.intelligentExecute) {
								board[i][c]=(playerPiece);
							} //if
							endFlipFour--;
							intelligentPieces++;
							continue;
						} //if
						else if(board[i][c].equals(playerPiece)) {
							break;
						} //else if				
					} //if					
				} //for

					
				//Checks to the upper left diagonally
				//comments above are all the same for the different check directions below
				int checkPieceFive=0, checkStopFive=1, otherPieceFive=0, flipPiecesFive=0, endFlipFive=0, checkSkipFive=0;
				for(int i=r-1, j=c-1; i>=0 && j>=0; i--, j--) {
					if(!board[i][j].equals(oppositePiece)) {
						checkSkipFive=1;
					} //if
					if(board[i][j].equals(oppositePiece) && checkSkipFive==0) {
						if(checkStopFive==1) {
							for(int k=i, l=j; k>=0 && l>=0; k--, l--) {
								if(board[k][l].equals(oppositePiece)) {
									checkPieceFive=1;
									endFlipFive++;
									continue;
								} //if
								if(board[k][l].equals(". ") || board[k][l].equals("_ ") || ((k==0 && j==0) && board[k][l].equals(oppositePiece))){
									otherPieceFive=1;
									endFlipFive=0;
									break;
								} //if
								if(board[k][l].equals(playerPiece) && checkPieceFive==1 && otherPieceFive!=1) {
									flipPiecesFive=1;
									checkStopFive=0;
									break;
								} //if
							} //for
						} //if 
						if(flipPiecesFive==1 && board[i][j].equals(oppositePiece) && endFlipFive>0) {
							if(!IntelligentComputerPlayer.intelligentExecute) {
								board[i][j]=(playerPiece);
							} //if
							endFlipFive--;
							intelligentPieces++;
							continue;
						} //if
						else if(board[i][j].equals(playerPiece)) {
							break;
						} //else if				
					} //if					
				} //for
				

				//Checks to the upper right diagonally
				//comments above are all the same for the different check directions below
				int checkPieceSix=0, checkStopSix=1, otherPieceSix=0, flipPiecesSix=0, endFlipSix=0, checkSkipSix=0;
				for(int i=r-1, j=c+1; i>=0 && j<col; i--, j++) {
					if(!board[i][j].equals(oppositePiece)) {
						checkSkipSix=1;
					} //if
					if(board[i][j].equals(oppositePiece) && checkSkipSix==0) {
						if(checkStopSix==1) {
							for(int k=i, l=j; k>=0 && l<col; k--, l++) {
								if(board[k][l].equals(oppositePiece)) {
									checkPieceSix=1;
									endFlipSix++;
									continue;
								} //if
								if(board[k][l].equals(". ") || board[k][l].equals("_ ") || ((k==0 && j==col-1) && board[k][l].equals(oppositePiece))){
									otherPieceSix=1;
									endFlipSix++;
									break;
								} //else
								if(board[k][l].equals(playerPiece) && checkPieceSix==1 && otherPieceSix!=1) {
									flipPiecesSix=1;
									checkStopSix=0;
									break;
								} //if
							} //for
						} //if 
						if(flipPiecesSix==1 && board[i][j].equals(oppositePiece) && endFlipSix>0) {
							if(!IntelligentComputerPlayer.intelligentExecute) {
								board[i][j]=(playerPiece);
							} //if
							endFlipSix--;
							intelligentPieces++;
							continue;
						} //if
						else if(board[i][j].equals(playerPiece)) {
							break;
						} //else if				
					} //if				
				} //for

				
				//Checks to the lower right diagonally
				//comments above are all the same for the different check directions below
				int checkPieceSeven=0, checkStopSeven=1, otherPieceSeven=0, flipPiecesSeven=0, endFlipSeven=0, checkSkipSeven=0;
				for(int i=r+1, j=c+1; i<row && j<col; i++, j++) {
					if(!board[i][j].equals(oppositePiece)) {
						checkSkipSeven=1;
					} //if
					if(board[i][j].equals(oppositePiece) && checkSkipSeven==0) {
						if(checkStopSeven==1) {
							for(int k=i, l=j; k<row && l<col; k++, l++) {
								if(board[k][l].equals(oppositePiece)) {
									checkPieceSeven=1;
									endFlipSeven++;
									continue;
								} //if
								if(board[k][l].equals(". ") || board[k][l].equals("_ ") || ((k==row-1 && j==col-1) && board[k][l].equals(oppositePiece))){
									otherPieceSeven=1;
									endFlipSeven=0;
									break;
								} //if
								if(board[k][l].equals(playerPiece) && checkPieceSeven==1 && otherPieceSeven!=1) {
									flipPiecesSeven=1;
									checkStopSeven=0;
									break;
								} //if
							} //for
						} //if 
						if(flipPiecesSeven==1 && board[i][j].equals(oppositePiece) && endFlipSeven>0) {
							if(!IntelligentComputerPlayer.intelligentExecute) {
								board[i][j]=(playerPiece);
							} //if
							endFlipSeven--;
							intelligentPieces++;
							continue;
						} //if
						else if(board[i][j].equals(playerPiece)) {
							break;
						} //else if				
					} //if					
				} //for
				
				
				//Checks to the lower left diagonally
				//comments above are all the same for the different check directions below
				int checkPieceEight=0, checkStopEight=1, otherPieceEight=0, flipPiecesEight=0, endFlipEight=0, checkSkipEight=0;
				for(int i=r+1, j=c-1; i<row && j>=0; i++, j--) {
					if(!board[i][j].equals(oppositePiece)) {
						checkSkipEight=1;
					} //if
					if(board[i][j].equals(oppositePiece) && checkSkipEight==0) {
						if(checkStopEight==1) {
							for(int k=i, l=j; k<row && l>=0; k++, l--) {
								if(board[k][l].equals(oppositePiece)) {
									checkPieceEight=1;
									endFlipEight++;
									continue;
								} //if
								if(board[k][l].equals(". ") || board[k][l].equals("_ ") || ((k==row-1 && j==0) && board[k][l].equals(oppositePiece))){
									otherPieceEight=1;
									endFlipEight=0;
									break;
								} //if
								if(board[k][l].equals(playerPiece) && checkPieceEight==1 && otherPieceEight!=1) {
									flipPiecesEight=1;
									checkStopEight=0;
									break;
								} //if
							} //for
						} //if 
						if(flipPiecesEight==1 && board[i][j].equals(oppositePiece) && endFlipEight>0) {
							if(!IntelligentComputerPlayer.intelligentExecute) {
								board[i][j]=(playerPiece);
							} //if
							endFlipEight--;
							intelligentPieces++;
							continue;
						} //if
						else if(board[i][j].equals(playerPiece)) {
							break;
						} //else if				
					} //if	
				} //for	
				
				if(p.getClassName() == "IntelligentComputerPlayer") {
					IntelligentComputerPlayer.pointsForEachMove[r][c]=intelligentPieces; 
				}
				//puts the amount of flips possible for that move into an array 
				//used to determine intelligent computer move
				
			} //if
				
		}
// ________________________________________________________________________________________________________	
		
		/**
		 * Determines all possible moves for a player and returns an 8x8 boolean array containing true/false values for each
		 * space depending on whether or not the space is a valid move for the player
		 * @param p the player for which all possible moves are being determined
		 */
		public boolean[][] getValidMovesFor(Player p) {
			
			boolean[][] validMoves = new boolean[row][col];
			
			String oppositePiece, playerPiece;
			if(p.getPieceIdentifier().equals("X ")) {
				oppositePiece = "O ";
				playerPiece = "X ";
			} else {
				oppositePiece = "X ";
				playerPiece = "O ";
			}
			
			for(int r=0; r<row; r++) {
				
				for(int c=0; c<col; c++) {
					
					//Locate the player piece
					int locatePiece=0;
					if(board[r][c].equals(playerPiece)) {
						locatePiece=1;
					} //if
					
					if(locatePiece==1) {
					
						//Checks to the right horizontally
						int didContinue=1, didFindOppositePiece=0;
						for(int i=c+1; i<col; i++) {
							if(board[r][i].equals(". ") && didFindOppositePiece==0) {
								didContinue=0;
								break;
							} //if
							if(board[r][i].equals(oppositePiece) && didContinue==1) {
								didFindOppositePiece=1;
								continue;
							} //if
							else if(!board[r][i].equals(oppositePiece) && !board[r][i].equals(". ") && didContinue==1) {
								break;
							} //else if
							else if(board[r][i].equals(". ") && didFindOppositePiece==1 && didContinue==1) {
								board[r][i]="_ ";
								validMoves[r][i] = true;
								break;
							} //else if
						} //for
				
						
						//Checks to the left horizontally
						int didContinueTwo=1, didFindOppositePieceTwo=0;
						for(int i=c-1; i>=0; i--) {
							if(board[r][i].equals(". ") && didFindOppositePieceTwo==0) {
								didContinueTwo=0;
								break;
							} //if
							if(board[r][i].equals(oppositePiece) && didContinueTwo==1) {
								didFindOppositePieceTwo=1;
								continue;
							} //if
							else if(!board[r][i].equals(oppositePiece) && !board[r][i].equals(". ") && didContinueTwo==1) {
								break;
							} //else if
							else if(board[r][i].equals(". ") && didFindOppositePieceTwo==1 && didContinueTwo==1) {
								board[r][i]="_ ";
								validMoves[r][i] = true;
								break;
							} //else if
						} //for
				
				
						//Checks down vertically
						int didContinueThree=1, didFindOppositePieceThree=0;
						for(int i=r+1; i<row; i++) {
							if(board[i][c].equals(". ") && didFindOppositePieceThree==0) {
								didContinueThree=0;
								break;
							} //if
							if(board[i][c].equals(oppositePiece) && didContinueThree==1) {
								didFindOppositePieceThree=1;
								continue;
							} //if
							else if(!board[i][c].equals(oppositePiece) && !board[i][c].equals(". ") && didContinueThree==1) {
									break;
							} //else if
							else if(board[i][c].equals(". ") && didFindOppositePieceThree==1 && didContinueThree==1) {
								board[i][c]="_ ";
								validMoves[i][c] = true;
								break;
							} //else if
						} //for
						
						
						//Checks up vertically
						int didContinueFour=1, didFindOppositePieceFour=0;
						for(int i=r-1; i>=0; i--) {
							if(board[i][c].equals(". ") && didFindOppositePieceFour==0) {
								didContinueFour=0;
								break;
							} //if
							if(board[i][c].equals(oppositePiece) && didContinueFour==1) {
								didFindOppositePieceFour=1;
								continue;
							} //if
							else if(!board[i][c].equals(oppositePiece) && !board[i][c].equals(". ") && didContinueFour==1) {
								break;
							} //else if
							else if(board[i][c].equals(". ") && didFindOppositePieceFour==1 && didContinueFour==1) {
								board[i][c]="_ ";
								validMoves[i][c] = true;
								break;
							} //else if
						} //for
						
						
						//Checks to the upper left diagonally
						int didContinueFive=1, didFindOppositePieceFive=0;
						for(int i=r-1, j=c-1; i>=0 && j>=0; i--, j--) {
							if(board[i][j].equals(". ") && didFindOppositePieceFive==0) {
								didContinueFive=0;
								break;
							} //if
							else if(board[i][j].equals(oppositePiece) && didContinueFive==1) {
								didFindOppositePieceFive=1;
								continue;
							} //if
							else if(!board[i][j].equals(oppositePiece) && !board[i][j].equals(". ")) {
								break;
							} //else if
							else if(board[i][j].equals(". ") && didFindOppositePieceFive==1 ) {
								board[i][j]="_ ";
								validMoves[i][j] = true;
								break;
							} //else if
						} //for
						
						
						//Checks to the upper right diagonally
						int didContinueSix=1, didFindOppositePieceSix=0;
						for(int i=r-1, j=c+1; i>=0 && j<col; i--, j++) {
							if(board[i][j].equals(". ") && didFindOppositePieceSix==0) {
								didContinueSix=0;
								break;
							} //if
							if(board[i][j].equals(oppositePiece) && didContinueSix==1) {
								didFindOppositePieceSix=1;
								continue;
							} //if
							else if(!board[i][j].equals(oppositePiece) && !board[i][j].equals(". ")) {
								break;
							} //else if
							else if(board[i][j].equals(". ") && didFindOppositePieceSix==1) {
								board[i][j]="_ ";
								validMoves[i][j] = true;
								break;
							} //else if
						} //for
						
						
						//Checks to the lower right diagonally
						int didContinueSeven=1, didFindOppositePieceSeven=0;
						for(int i=r+1, j=c+1; i<row && j<col; i++, j++) {
							if(board[i][j].equals(". ") && didFindOppositePieceSeven==0) {
								didContinueSeven=0;
								break;
							} //if
							if(board[i][j].equals(oppositePiece) && didContinueSeven==1) {
								didFindOppositePieceSeven=1;
								continue;
							} //if
							else if(!board[i][j].equals(oppositePiece) && !board[i][j].equals(". ")) {
								break;
							} //else if
							else if(board[i][j].equals(". ") && didFindOppositePieceSeven==1) {
								board[i][j]="_ ";
								validMoves[i][j] = true;
								break;
							} //else if
						} //for
						
						
						//Checks to the lower left diagonally
						int didContinueEight=1, didFindOppositePieceEight=0;
						for(int i=r+1, j=c-1; i<row && j>=0; i++, j--) {
							if(board[i][j].equals(". ") && didFindOppositePieceEight==0) {
								didContinueEight=0;
								break;
							} //if
							if(board[i][j].equals(oppositePiece) && didContinueEight==1) {
								didFindOppositePieceEight=1;
								continue;
							} //if
							else if(!board[i][j].equals(oppositePiece) && !board[i][j].equals(". ")) {
								break;
							} //else if
							else if(board[i][j].equals(". ") && didFindOppositePieceEight==1) {
								board[i][j]="_ ";
								validMoves[i][j] = true;
								break;
							} //else if
						} //for
					
					} //if
			
				} //for	
			
			} //for
			return validMoves;
		}
// ________________________________________________________________________________________________________	
		
		/**
		 * Clears the underscores from the board
		 */
		public void clearUnderscores() {
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					if(board[i][j] == "_ ") {
						board[i][j] = ". ";
					}
				}
			}
		}
// ________________________________________________________________________________________________________	
		
		/**
		 * Gets the board String[][]
		 */
		public String[][] getBoard() {
			return this.board;
		}
// ________________________________________________________________________________________________________
		
		/**
		 * Counts the number of "X" on the game board.
		 * @return the number of "X"
		 */
		public int countNumX() {
			int numX = 0;
			for(int i = 0; i < board.length; i++) {
				for(int j = 0; j < board[i].length; j++) {
					if(board[i][j] == "X ") {
						numX++;
					}
				}
			}
			return numX;
		}
// ________________________________________________________________________________________________________

		/**
		 * Counts the number of "O" on the game board.
		 * @return the number of "O"
		 */
		public int countNumO() {
			int numO = 0;
			for(int i = 0; i < board.length; i++) {
				for(int j = 0; j < board[i].length; j++) {
					if(board[i][j] == "O ") {
						numO++;
					}
				}
			}
			return numO;
		}
// ________________________________________________________________________________________________________
		
		public boolean isFull() {
			return (countNumX() + countNumO()) == board.length*board.length;
		}
		

} // ReversiBoard

abstract class Board {
	
	/**
	 * Prints out the current state of the board.
	 */
	public void printBoard() {
	}
// _____________________________________________________________________________________
	
	/**
	 * Updates state of board with new player piece
	 * @param r the row of the board the player's piece was placed on
	 * @param c the col of the board the player's piece was placed on
	 * @param p the type of player placing the piece
	 */
	public void updateBoard(int row, int col, Player p) {
}
// _____________________________________________________________________________________
	
	/**
	 * Determines if board is full of pieces or not.
	 * @return true if board is full
	 */
	public boolean isFull() {
	return false;
}
// _____________________________________________________________________________________

	
} // Board

abstract class Player {
	
	protected boolean[][] validMoves;
	private boolean didForfeitTurn = false;
	private String pieceIdentifier = "";
	private String className = "";
// ____________________________________________________________________________________________
	
	/**
	 * Chooses a position on the board to place a player piece
	 * @param board the board to be referenced with a row/col position
	 */
	public abstract void chooseMove(ReversiBoard board); 
// ____________________________________________________________________________________________
	
	/**
	 * Determines if player has any moves left.
	 * @return true if player has valid move remaining
	 */
	public abstract boolean hasValidMoveLeft(); 
	
// ____________________________________________________________________________________________///
// ____________________________________________________________________________________________///
// ______________________________________GETTERS/SETTERS BELOW THIS____________________________///
// ____________________________________________________________________________________________///
// ____________________________________________________________________________________________///
	
	/**
	 * Gets validMoves array
	 * @return boolean[][] the validMoves array
	 */
	public boolean[][] getValidMovesArray() {
		return this.validMoves;
	}
// ____________________________________________________________________________________________
	
	/**
	 * Sets validMoves array.
	 */
	public void setValidMovesArray(boolean[][] moves) {
		this.validMoves = moves;
	}
// ____________________________________________________________________________________________
	
	/**
	 * Gets didForfeitTurn field.
	 * @return boolean the didForfeitTurn field
	 */
	public boolean getDidForfeitTurn() {
		return this.didForfeitTurn;
	}
// ____________________________________________________________________________________________	
	
	/**
	 * Sets didForfeitTurn field.
	 * @param value the true/false value assigned to the didForfeitTurn field
	 */
	public void setDidForfeitTurn(boolean value) {
		this.didForfeitTurn = value;
	}
// ____________________________________________________________________________________________
	
	/**
	 * Gets pieceIdentifier field.
	 * @return String the pieceIdentifier field
	 */
	public String getPieceIdentifier() {
		return this.pieceIdentifier;
	}
// ____________________________________________________________________________________________
	
	/**
	 * Sets the pieceIdentifier field.
	 * @param id the identifier of the piece, either "X " or "O ". X's always go first in Reversi.
	 */
	public void setPieceIdentifier(String id) {
		if(id.equals("X ") || id.equals("O ")) {
			this.pieceIdentifier = id;
		}
	}
// ____________________________________________________________________________________________
	
	/**
	 * Gets className field
	 */
	public String getClassName() {
		return this.className;
	}
// ____________________________________________________________________________________________
	
	/**
	 * Sets the className field
	 * @param name the name of the class
	 */
	public void setClassName(String name) {
		this.className = name;
	}
	
	
} // Player
class HumanPlayer extends Player {
	
	/**
	 * Creates HumanPlayer with desired piece identifier
	 * @param id the identifier of the piece, either "X " or "O ". X's always go first in Reversi. 
	 */
	public HumanPlayer(String id) {
		setPieceIdentifier(id);
		setClassName("HumanPlayer");
	} // constructor
//______________________________________________________________________________________________________________
	
	public boolean hasValidMoveLeft() {
		boolean hasValidMove = false;
		for(int i = 0; i < validMoves.length; i++) {
			for(int j = 0; j < validMoves[i].length; j++) {
				if(validMoves[i][j]) {
					hasValidMove = true;
				}
			}
		}
		return hasValidMove;
	}
//______________________________________________________________________________________________________________
	
	/**
	 * Takes a row and col input from the human user and, if valid, places the user's piece at the specified position on the
	 * board.
	 * @param board the board to be referenced with the row/col position
	 */
	public void chooseMove(ReversiBoard board) {
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		boolean isValidInput = false;
		String input;
		do {
			System.out.print("Enter your move, " + getPieceIdentifier() + "player: ");
			input = keyboard.nextLine().trim();
			System.out.println();
			if(input.length() == 3 && input.charAt(1) == ' ') {
				java.util.Scanner keyboardTwo = new java.util.Scanner(input);
				if(keyboardTwo.hasNextInt()) {
					int row = keyboardTwo.nextInt() - 1; // takes into account that reversi does start indices at 0
					if(keyboardTwo.hasNextInt()) {
						int col = keyboardTwo.nextInt() - 1; // takes into account that reversi does start indices at 0
						if(row < board.getBoard().length && col < board.getBoard()[0].length && row >= 0 && col >= 0) {
							if(validMoves[row][col]) {
 								board.updateBoard(row, col, this);
								board.clearUnderscores();
								isValidInput = true;
							}
						}
					}
				}
			} 
			if(!isValidInput) {
				System.out.println();
				System.out.println("Please enter a valid move.");
				System.out.println();
				board.printBoard();
			}
		} while(!isValidInput);
	}
	
} // HumanPlayer

abstract class ComputerPlayer extends Player {
	
	/**
	 * Pauses execution of the program for a specified amount of time
	 * @param milliseconds the number of milliseconds to pause execution
	 */
	public void createTimeDelay(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
	
}

class RandomComputerPlayer extends ComputerPlayer {
	
	/**
	 * Creates RandomComputerPlayer with desired piece identifier
	 * @param id the identifier of the piece, either "X " or "O ". X's always go first in Reversi. 
	 */
	public RandomComputerPlayer(String id) {
		setPieceIdentifier(id);
		setClassName("RandomComputerPlayer");
	} // constructor
//______________________________________________________________________________________________________________
	
	public boolean hasValidMoveLeft() {
		boolean hasValidMove = false;
		for(int i = 0; i < validMoves.length; i++) {
			for(int j = 0; j < validMoves[i].length; j++) {
				if(validMoves[i][j]) {
					hasValidMove = true;
				}
			}
		}
		return hasValidMove;
	}
//______________________________________________________________________________________________________________	
	
	/**
	 * Chooses random position from the valid positions contained in the validMoves array and places the computer's piece
	 * at that position.
	 * @param board the board to be referenced with the chosen position
	 */
	public void chooseMove(ReversiBoard board) {
		
		System.out.print("Enter your move, " + getPieceIdentifier() + "player: ");
		
		java.util.Random numGen = new java.util.Random();
		int countMin = 20; // chose a number that would, without a doubt, always be greater than the number of validMoves
		int countMax = numGen.nextInt(30) + countMin; // the random number that validMoveCount must reach before the loop stops
		
		int validMoveCount = 0;
		while(validMoveCount <= countMax) {
			for(int i = 0; i < validMoves.length; i++) {
				for(int j = 0; j < validMoves[i].length; j++) {
					if(validMoves[i][j]) {
						validMoveCount++;
						if(validMoveCount == countMax) {
							createTimeDelay(3000); // pauses execution for 3 seconds
							System.out.print((i+1) + " " + (j+1)); // adding 1 takes into account the board doesn't start at 0,0
							System.out.println("\n");
							board.updateBoard(i, j, this);
							board.clearUnderscores();
							return;
						}
					}
				}
			}
		} /* basically like spinning the wheel on wheel of fortune. what it lands on is essentially random, 
			 and the pegs the arrow contacts on the way around represent the validMoveCount incrementing */
	}
	
}

class IntelligentComputerPlayer extends ComputerPlayer {

	protected static int[][] pointsForEachMove;
	protected static boolean intelligentExecute = false;
	
	/**
	 * Creates IntelligentComputerPlayer with desired piece identifier
	 * @param id the identifier of the piece, either "X " or "O ". X's always go first in Reversi. 
	 */
	public IntelligentComputerPlayer(String id) {
		setPieceIdentifier(id);
		setClassName("IntelligentComputerPlayer");
	} // constructor
//______________________________________________________________________________________________________________
	
	public boolean hasValidMoveLeft() {
		boolean hasValidMove = false;
		for(int i = 0; i < validMoves.length; i++) {
			for(int j = 0; j < validMoves[i].length; j++) {
				if(validMoves[i][j]) {
					hasValidMove = true;
				}
			}
		}
		return hasValidMove;
	}
//______________________________________________________________________________________________________________	
	
	/**
	 * Chooses best position from the valid positions contained in the validMoves array and places the computer's piece
	 * at that position.
	 * @param board the board to be referenced with the chosen position
	 */
	public void chooseMove(ReversiBoard board) {
		
		System.out.print("Enter your move, " + getPieceIdentifier() + "player: ");
		
		setPointPossibilities(board);
		determineBestMove(board);
		
	}
//______________________________________________________________________________________________________________
	
	/**
	 * Uses the updateBoard method, not to place a piece/flip pieces, but to update the pointsForEachMove array with the values
	 * for each potential valid move
	 * @param board the board to be referenced 
	 */
	private void setPointPossibilities(ReversiBoard board) {
		
		pointsForEachMove = new int[board.getBoard().length][board.getBoard()[0].length];
		
		for(int r=0; r<board.getBoard().length; r++) {
			for(int c=0; c<board.getBoard()[r].length; c++) {
				intelligentExecute=true; // prevent update board from updating the pieces 
				board.updateBoard(r, c, this); // uses updateBoard to udpate an array of points for each possible flip for
											   // intelligent computer, instead of actually placing a piece
			} // for
		} // for
		board.clearUnderscores();
		intelligentExecute=false; // allows updateBoard to be able to actually place a piece

	} // setPointPossibilities
//______________________________________________________________________________________________________________
	
	/**
	 * Using the pointsForEachMove array, this chooses the highest point move out of all the valid moves, and if there is a tie 
	 * for the highest value, randomly chooses between the tie, and then places the piece at the chosen space.
	 * @param board the board to be referenced
	 */
	private void determineBestMove(ReversiBoard board) {
		
		int intellectualPrevious=0;
		int intellectualRow=0;
		int intellectualCol=0;
		
		for(int i=0; i<board.getBoard().length; i++) {
			for(int j=0; j<board.getBoard()[i].length; j++) {
				
				if(pointsForEachMove[i][j]>=intellectualPrevious) {
					intellectualPrevious=pointsForEachMove[i][j];
					intellectualRow=i;
					intellectualCol=j;
				} // if
				
			} // for
		} // for
		
		
		/* if there is more than one move which has the highest point total, this code chooses randomly between them. this way, the last move with the highest
		 * point total isn’t always the one chosen. Note: if this were the case, all games between 2 IntelligentComputerPlayer’s would be the exact same.
		 */
		java.util.Random numGen = new java.util.Random();
		int countMin = 20; // chose a number that would, without a doubt, always be greater than the number of validMoves
		int countMax = numGen.nextInt(30) + countMin; // the random number that validMoveCount must reach before the loop stops
		int highestPointMoveCount = 0;
		while(highestPointMoveCount <= countMax) {
			for(int i=0; i<board.getBoard().length; i++) {
				for(int j=0; j<board.getBoard()[i].length; j++) {
					if(pointsForEachMove[i][j]==pointsForEachMove[intellectualRow][intellectualCol]) { // find the tie of the highest possible point
						highestPointMoveCount++;
						if(highestPointMoveCount == countMax) {
							createTimeDelay(3000); // pauses execution for 3 seconds
							System.out.print((i+1) + " " + (j+1)); // adding 1 takes into account the board doesn't start at 0,0
							System.out.println("\n");
							board.updateBoard(i, j, this);
						}
					} //if
				} //for
			} //for
		} //while
		
	} // chooseBestMove
	
}


