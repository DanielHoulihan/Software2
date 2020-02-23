import java.util.Arrays;

public class Board {


    Square square;
    String board[][] = new String[15][15];


    public void placeWord(int x, int y, String direction, String[] l, Frame frame) {
        int count = 0;
        if (x >= 15 || x < 0) {
            System.out.println("x must be between 1 and 15");
        }
        if (y >= 15 || y < 0) {
            System.out.println("y must be between 1 and 15");
        }


            if (validStartPoint(x, y, l)) {
                for (int k = 0; k < l.length; k++) {
                    if (areLettersValid(frame, l) == true) {
                        if (direction.equals("down")) {
                            for (int j = 0; j < l.length; j++) {
                                board[y + (j)][x] = l[j] + " ";
                            }
                        }
                        if (direction.equals("right")) {
                            for (int j = 0; j < l.length; j++) {
                                board[y][x + (j)] = l[j] + " ";
                            }
                        }
                        count++;
                    }
                }
            printBoard();
        }
    }


public boolean validStartPoint(int x, int y, String[] l){
        for(int i=0; i<l.length; i++){
            if(board[x+i][y].equals("@ ")){
                return true;
            }
            if(board[x][y+i].equals("@ ")){
                return true;
            }
        }
        return false;
}

public boolean areLettersValid(Frame frame, String[] l) {
        int count=0;
    for (int k = 0; k < l.length; k++) {
        if (frame.areLettersInFrame(l[k]) == true) {
            count++;
        }
        if(count==l.length){
            return true;
        }
    }
    return false;
}


public boolean notOnAnotherWord(int x, int y, String[] l){
    for(int i=0; i<l.length; i++){
        if(board[x+i][y].equals("+ ") || board[x+i][y].equals("- ") || board[x+i][y].equals("% ") || board[x+i][y].equals("* ")){
            return true;
        }
    }
    return false;
    }

//    public boolean overlapping(){
//        if(board[7][7].equals("@ ")){
//            return false;
//        }
//        else return true;
//    }





    public void resetBoard() {
        board(square);
    }

    public void board (Square square) {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                board[i][j] = square.getBoardValue();
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                //triple word
                if (board[0][0].equals("- "))     {   board[0][0] = "# ";      }
                if (board[7][0].equals("- "))     {   board[7][0] = "# ";      }
                if (board[0][7].equals("- "))     {   board[0][7] = "# ";      }
                if (board[0][14].equals("- "))     {   board[0][14] = "# ";      }
                if (board[14][0].equals("- "))     {   board[14][0] = "# ";      }
                if (board[14][7].equals("- "))     {   board[14][7] = "# ";      }
                if (board[7][14].equals("- "))     {   board[7][14] = "# ";      }
                if (board[14][14].equals("- "))     {   board[14][14] = "# ";      }

                //double word
                if (board[1][1].equals("- "))     {   board[1][1] = "* ";      }
                if (board[2][2].equals("- "))     {   board[2][2] = "* ";      }
                if (board[3][3].equals("- "))     {   board[3][3] = "* ";      }
                if (board[4][4].equals("- "))     {   board[4][4] = "* ";      }
                if (board[1][13].equals("- "))     {   board[1][13] = "* ";      }
                if (board[2][12].equals("- "))     {   board[2][12] = "* ";      }
                if (board[3][11].equals("- "))     {   board[3][11] = "* ";      }
                if (board[4][10].equals("- "))     {   board[4][10] = "* ";      }
                if (board[13][1].equals("- "))     {   board[13][1] = "* ";      }
                if (board[12][2].equals("- "))     {   board[12][2] = "* ";      }
                if (board[11][3].equals(" "))     {   board[11][3] = "* ";      }
                if (board[10][4].equals("- "))     {   board[10][4] = "* ";      }
                if (board[10][10].equals("- "))     {   board[10][10] = "* ";      }
                if (board[11][11].equals("- "))     {   board[11][11] = "* ";      }
                if (board[12][12].equals("- "))     {   board[12][12] = "* ";      }
                if (board[13][13].equals("- "))     {   board[13][13] = "* ";      }

                //tripple letter
                if (board[5][1].equals("- "))     {   board[5][1] = "+ ";      }
                if (board[9][1].equals("- "))     {   board[9][1] = "+ ";      }
                if (board[1][5].equals("- "))     {   board[1][5] = "+ ";      }
                if (board[5][5].equals("- "))     {   board[5][5] = "+ ";      }
                if (board[9][5].equals("- "))     {   board[9][5] = "+ ";      }
                if (board[13][5].equals("- "))     {   board[13][5] = "+ ";      }
                if (board[1][9].equals("- "))     {   board[1][9] = "+ ";      }
                if (board[5][9].equals("- "))     {   board[5][9] = "+ ";      }
                if (board[9][9].equals("- "))     {   board[9][9] = "+ ";      }
                if (board[13][9].equals("- "))     {   board[13][9] = "+ ";      }
                if (board[5][13].equals("- "))     {   board[5][13] = "+ ";      }
                if (board[9][13].equals("- "))     {   board[9][13] = "+ ";      }

                //double letter
                if (board[3][0].equals("- "))     {   board[3][0] = "% ";      }
                if (board[11][0].equals("- "))     {   board[11][0] = "% ";      }
                if (board[6][2].equals("- "))     {   board[6][2] = "% ";      }
                if (board[8][2].equals("- "))     {   board[8][2] = "% ";      }
                if (board[0][3].equals("- "))     {   board[0][3] = "% ";      }
                if (board[7][3].equals("- "))     {   board[7][3] = "% ";      }
                if (board[14][3].equals("- "))     {   board[14][3] = "% ";      }
                if (board[2][6].equals("- "))     {   board[2][6] = "% ";      }
                if (board[6][6].equals("- "))     {   board[6][6] = "% ";      }
                if (board[8][6].equals("- "))     {   board[8][6] = "% ";      }
                if (board[12][6].equals("- "))     {   board[12][6] = "% ";      }
                if (board[3][7].equals("- "))     {   board[3][7] = "% ";      }
                if (board[11][7].equals("- "))     {   board[11][7] = "% ";      }
                if (board[2][8].equals("- "))     {   board[2][8] = "% ";      }
                if (board[6][8].equals("- "))     {   board[6][8] = "% ";      }
                if (board[8][8].equals("- "))     {   board[8][8] = "% ";      }
                if (board[12][8].equals("- "))     {   board[12][8] = "% ";      }
                if (board[0][11].equals("- "))     {   board[0][11] = "% ";      }
                if (board[7][11].equals("- "))     {   board[7][11] = "% ";      }
                if (board[14][11].equals("- "))     {   board[14][11] = "% ";      }
                if (board[6][12].equals("- "))     {   board[6][12] = "% ";      }
                if (board[8][12].equals("- "))     {   board[8][12] = "% ";      }
                if (board[3][14].equals("- "))     {   board[3][14] = "% ";      }
                if (board[11][14].equals("- "))     {   board[11][14] = "% ";      }
                //starting point
                if (board[7][7].equals("- "))     {   board[7][7] = "@ ";      }
            }
        }
    }

public void printBoard() {
    for (int i = 0; i < 15; i++) {
        for (int j = 0; j < 15; j++) {
            System.out.print(board[i][j]);
        }
        System.out.println();
    }
}
}


