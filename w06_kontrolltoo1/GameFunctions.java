public class GameFunctions {

    private char[][] board;
    private char symbol;

    public GameFunctions() {
        board = new char[3][3];
        symbol = 'x';
        createBoard();
    }

    public char getSymbol()
    {
        return symbol;
    }

    public void createBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public boolean isBoardFull() {
        boolean isFull = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    isFull = false;
                }
            }
        }

        return isFull;
    }


    public boolean checkWin() {
        return (checkWinConditions());
    }

    private boolean checkWinConditions() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
                return true;
            } else if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
                return true;
            } else if ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true)){
                return true;
            }
        }
        return false;
    }

    private boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
    }

    public void changePlayer() {
        if (symbol == 'x') {
            symbol = 'o';
        }
        else if (symbol == 'o'){
            symbol = 'x';
        }
    }

    public boolean placeSymbol(int row, int column) {
        if ((row >= 0) && (row < 3)) {
            if ((column >= 0) && (column < 3)) {
                if (board[row][column] == '-') {
                    board[row][column] = symbol;
                    return true;
                }
            }
        }
        return false;
    }
}