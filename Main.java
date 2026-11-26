class Main {
  public static void main(String[] args) {
    Utils.printDirections();

    Board player1Board = new Board(10, true);
    System.out.println(player1Board); //DEBUG
    /*Board player1Plot = new Board(10);
    System.out.println(player1Plot); //DEBUG
    Board player2Board = new Board(10, true);
    System.out.println(player2Board); //DEBUG
    Board player2Plot = new Board(10);
    System.out.println(player2Plot); //DEBUG*/
  }
}