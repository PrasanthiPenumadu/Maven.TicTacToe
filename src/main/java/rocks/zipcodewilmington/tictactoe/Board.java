package rocks.zipcodewilmington.tictactoe;

public class Board {

    Character dimarray[][] = new Character[3][3];
    public Board(Character[][] matrix) {
        dimarray = matrix;
    }

    public Boolean isInFavorOfX() {
        Boolean res = false;

        if (dimarray[0][0] == 'X' && dimarray[0][1] == 'X' && dimarray[0][2] == 'X') {
            res = true;

        }
        if (dimarray[1][0] == 'X' && dimarray[1][1] == 'X' && dimarray[1][2] == 'X') {
            res = true;
        }
        if (dimarray[2][0] == 'X' && dimarray[2][1] == 'X' && dimarray[2][2] == 'X') {
            res = true;
        }
        if (dimarray[0][0] == 'X' && dimarray[1][1] == 'X' && dimarray[2][2] == 'X') {
            res = true;
        }
        if (dimarray[0][1] == 'X' && dimarray[1][1] == 'X' && dimarray[2][1] == 'X') {
            res = true;
        }
        if (dimarray[0][2] == 'X' && dimarray[1][2] == 'X' && dimarray[2][2] == 'X') {
            res = true;
        }
        if (dimarray[0][0] == 'X' && dimarray[1][0] == 'X' && dimarray[2][0] == 'X') {
            res = true;
        }
        if (dimarray[0][2] == 'X' && dimarray[1][1] == 'X' && dimarray[2][0] == 'X') {
            res = true;
        }
        return res;
    }

    public Boolean isInFavorOfO() {
        Boolean res = false;
        if (dimarray[0][0] == 'O' && dimarray[1][1] == 'O' && dimarray[2][2] == 'O') {
            res = true;
        }
        if (dimarray[0][0] == 'O' && dimarray[1][0] == 'O' && dimarray[2][0] == 'O') {
            res = true;
        }
        if (dimarray[0][1] == 'O' && dimarray[1][1] == 'O' && dimarray[2][1] == 'O') {
            res = true;
        }
        if (dimarray[0][2] == 'O' && dimarray[1][2] == 'O' && dimarray[2][2] == 'O') {
            res = true;
        }
        if (dimarray[0][2] == 'O' && dimarray[1][1] == 'O' && dimarray[2][0] == 'O') {
            res = true;
        }
        if (dimarray[0][0] == 'O' && dimarray[0][1] == 'O' && dimarray[0][2] == 'O') {
            res = true;
        }
        if (dimarray[1][0] == 'O' && dimarray[1][1] == 'O' && dimarray[1][2] == 'O') {
            res = true;
        }
        if (dimarray[2][0] == 'O' && dimarray[2][1] == 'O' && dimarray[2][2] == 'O') {
            res = true;
        }
        return res;

    }

    public Boolean isTie() {


        if (isInFavorOfO() == isInFavorOfX())
            return true;
        else
            return false;

    }

    public String getWinner() {
       if(isInFavorOfX()==true)
           return "X";
       else if(isInFavorOfO()==true)
           return "O";
       else
           return "";
    }
}
