import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        GameFunctions gf = new GameFunctions();
        gf.createBoard();
        while(!gf.checkWin() && !gf.isBoardFull()){
        gf.printBoard();
        int row;
        int column;
        do {
            System.out.println(gf.getSymbol() + ": Sisesta rida!");
            row = scanner.nextInt()-1; 
             System.out.println(gf.getSymbol() + ": Sisesta veerg!");
            column = scanner.nextInt()-1;
        } while (!gf.placeSymbol(row, column));
            gf.changePlayer();
        }

        if (gf.isBoardFull() && !gf.checkWin()) {
            System.out.println("Viik!");
        }
        else if (gf.checkWin())
        {
            gf.printBoard();
            gf.changePlayer();
            System.out.println(gf.getSymbol() + " Võitis!");
        }
        scanner.close();
    }

}

    

