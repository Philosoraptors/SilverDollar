import java.util.Arrays;

public class Board {
  private boolean[] board;

  public Board() {

  }

  public void setupBoard(int coins) {

  }

  public boolean moveCoin(int location) {
    return true;
  }

  public boolean gameOver() {
    return false;
  }

  public String drawBoard() {
    String output = "";

    // iterate over board
    for (int i = 0; i < board.length; i++) {

      if (board[i] == true) {
        // there is a coin here
        output += "[0]";
      } else {
        // blank space
        output += "[ ]";
      }

    }

    // add a second line to label spaces
    output += "\n\n";    // two newline characters

    for (int i = 0; i < board.length; i++) {
      output += " " + (i + 1) + " ";     // Should result in: " 1  2  3  4 "...etc
    }

    return output;
  }

  public static void main(String[] args) {
    Board b = new Board();
    b.setupBoard(0);
    System.out.println(b.drawBoard());

    return;
  }
}
