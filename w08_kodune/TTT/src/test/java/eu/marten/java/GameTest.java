package eu.marten.java;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.runners.MethodSorters;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;

/**
 * Unit test for Tic-Tac-Toe.
 */
@FixMethodOrder(MethodSorters.JVM)
public class GameTest {

    
    static GameFunctions gf = new GameFunctions();

    @BeforeClass
    public static void initiateGame() {
    gf.createGame();
    
    } 

    
    @Test
    public void getSymbolTest() {
        assertTrue("getSymbol returns x", gf.getSymbol() == 'x');
    }

    @Test
    public void createBoardTest() {
        assertFalse("Board is created", gf.isBoardFull());

    }
    @Test
    public void placeSymbolTest() {
        assertTrue("Can place symbol to empty board space", gf.placeSymbol(1, 1));
        assertFalse("Can't place symbol to occupied board space", gf.placeSymbol(1, 1));
    }

    @Test
    public void changePlayerTest(){
        assertTrue("Changes symbol to O", gf.changePlayer() == 'o');
        assertTrue("Changes symbol back to X", gf.changePlayer() == 'x');
    }

    @Test
    public void printBoardTest() {
        try {
            gf.printBoard();
        } catch (Exception e) {
            fail("Print board doesn't work");
        }
    }


    @Test
    public void isBoardFullTest() {
        
        assertFalse("Board is not full", gf.isBoardFull());
        gf.placeSymbol(0, 0);
        gf.changePlayer();
        gf.placeSymbol(0, 1);
        gf.changePlayer();
        gf.placeSymbol(0, 2);
        gf.changePlayer();
        gf.placeSymbol(1, 0);
        gf.changePlayer();
        gf.placeSymbol(1, 1);
        gf.changePlayer();
        gf.placeSymbol(1, 2);
        gf.changePlayer();
        gf.placeSymbol(2, 0);
        gf.changePlayer();
        gf.placeSymbol(2, 1);
        gf.changePlayer();
        gf.placeSymbol(2, 2);
        gf.changePlayer();
        gf.printBoard();
        assertTrue("Board is Full", gf.isBoardFull());
    }

    @Test
    public void checkWinTest(){
        //Check first row for win
        gf.placeSymbol(0, 0);
        gf.placeSymbol(0, 1);
        gf.placeSymbol(0, 2);
        assertTrue("Check first row for win", gf.checkWin());
        gf.createBoard();
        //Check second row for win
        gf.placeSymbol(1, 0);
        gf.placeSymbol(1, 1);
        gf.placeSymbol(1, 2);
        assertTrue("Check second row for win", gf.checkWin());
        gf.createBoard();
        //Check third row for win
        gf.placeSymbol(2, 0);
        gf.placeSymbol(2, 1);
        gf.placeSymbol(2, 2);
        assertTrue("Check third row for win", gf.checkWin());
        gf.createBoard();
        //Check first column for win
        gf.placeSymbol(0, 0);
        gf.placeSymbol(1, 0);
        gf.placeSymbol(2, 0);
        assertTrue("Check first column for win", gf.checkWin());
        gf.createBoard();
        //Check second column for win
        gf.placeSymbol(0, 1);
        gf.placeSymbol(1, 1);
        gf.placeSymbol(2, 1);
        assertTrue("Check second column for win", gf.checkWin());
        gf.createBoard();
        //Check third column for win
        gf.placeSymbol(0, 2);
        gf.placeSymbol(1, 2);
        gf.placeSymbol(2, 2);
        assertTrue("Check third column for win", gf.checkWin());
        gf.createBoard();
        //Check first diagonal for win
        gf.placeSymbol(0, 0);
        gf.placeSymbol(1, 1);
        gf.placeSymbol(2, 2);
        assertTrue("Check first diagonal for win", gf.checkWin());
        gf.createBoard();




    }
    
}
