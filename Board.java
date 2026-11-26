public class Board {
  private char[][] board;
  private int boardSize;
  private boolean isUserBoard;
  public Board(int bS) {
    boardSize = bS;
    board = Utils.create2dArray(boardSize, boardSize, '~');
    isUserBoard = false;
  }
  public Board(int bS, boolean iUB) {
    boardSize = bS;
    board = Utils.create2dArray(boardSize, boardSize, '~');
    isUserBoard = iUB;
    if(isUserBoard) {
      genUserShips();
    }
  }

  public String toString() {
    String output = "";
    char[] letters = Utils.genLetters(board.length);
    
    output += "\n ";
    for(int i = 0; i < board.length; i++) {
      output += "  " + i;
    }
    output += "\n";
    for(int i = 0; i < board.length; i++) {
        output += letters[i];
        for(int j = 0; j < board[i].length; j++) {
          output +=  "  " + board[i][j];
        }
        output += "\n";
    }
    return output;
  }
}