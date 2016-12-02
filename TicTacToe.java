import java.util.*;
public class TicTacToe {
  public static void main(String[]args){
  int i = 2;
  String win = "NULL";
  String[][]board = new String[][]{{"-","-","-"},{"-","-","-"},{"-","-","-"}};
    while(win.equals("NULL")){
      i++;
      System.out.println(board[0][0]+board[1][0]+board[2][0]+"\n"+board[0][1]+board[1][1]+board[2][1]+"\n"+board[0][2]+board[1][2]+board[2][2]+"\n");
      Scanner scan = new Scanner(System.in);
      System.out.println("Where you put");
      try {
        int a = scan.nextInt(), b = scan.nextInt();
        if(a>2||b>2||board[a][b].equals("x")||board[a][b].equals("o")){
          System.out.println("Invalid argument"); i--;
        } else if(i%2==0){
          board[a][b] = "x";
        } else if(i%2==1){
          board[a][b] = "o";
        }
        for(int o = 0; o<board.length;o++){
          if(board[o][0].equals("x")&&board[o][1].equals("x")&&board[o][2].equals("x")) win = "x";
          if(board[o][0].equals("o")&&board[o][1].equals("o")&&board[o][2].equals("o")) win = "o";
          if(board[0][o].equals("x")&&board[1][o].equals("x")&&board[2][o].equals("x")) win = "x";
          if(board[0][o].equals("o")&&board[1][o].equals("o")&&board[2][o].equals("o")) win = "o";
        }
          if(board[0][0].equals("x")&&board[1][1].equals("x")&&board[2][2].equals("x")) win = "x";
          if(board[0][0].equals("o")&&board[1][1].equals("o")&&board[2][2].equals("o")) win = "o";
          if(board[0][2].equals("x")&&board[1][1].equals("x")&&board[2][0].equals("x")) win = "x";
          if(board[0][2].equals("o")&&board[1][1].equals("o")&&board[2][0].equals("o")) win = "o";
      } catch (InputMismatchException e) {
        System.err.println("Invalid argument");
        i--;
        continue;
        }
      }
      System.out.println("The winner is " + win);
    }
  }
