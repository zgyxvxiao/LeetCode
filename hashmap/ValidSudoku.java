package hashmap;

import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int m = 1;
        int n = 3;

        for (int i = 0; i < 9; i++) {
            HashSet<Character> row = new HashSet<Character>();
            HashSet<Character> coloumn = new HashSet<Character>();
            for (int j = i; j < 9; j++) {

                if (board[i][j] != '.' && row.contains(board[i][j])) {
                    return false;
                } else {
                    row.add(board[i][j]);
                }
                if (board[j][i] != '.' && coloumn.contains(board[j][i])) {
                    return false;
                } else {
                    coloumn.add(board[j][i]);
                }
                HashSet<Character> grid = new HashSet<Character>();
                while (i == j && n > 0) {
                    System.out.println(n);
                    System.out.println(i + "&&&" + (j + 3 - n));
                    if (board[i][j + m - n] != '.' && grid.contains(board[i][j + m - n])) {
                        return false;
                    } else {
                        grid.add(board[i][j + m - n]);
                    }
                    System.out.println((j + m - n) + "***"+i);
                    if (n !=3 && board[j + m - n][i] != '.' && grid.contains(board[j + m - n][i])) {
                        return false;
                    } else if (n !=3){
                        grid.add(board[j + m - n][i]);
                    }
                    n--;
                }
                m++;
                if(m==3){
                    grid = new HashSet<Character>();
                    m = 1;
                    n = 3;
                }else{
                    n--;
                }


            }
        }
        return true;
    }
}
