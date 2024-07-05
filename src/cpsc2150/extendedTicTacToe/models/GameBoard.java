package cpsc2150.extendedTicTacToe.models;

/*
Project 2
Alaina Carson
Section: 001
*/

/**
 * This class contains the game board and controls all interactions with it
 *
 * @author Alaina Carson
 * @version 1.0
 *
 * @invariant NONE
 */

public class GameBoard extends AbsGameBoard implements IGameBoard{
    /**
     * This constructor creates a 5x8 array of char's containing spaces
     *
     * @post An instance of the object is created with every board position empty
     */
    GameBoard () {

    }
    public void placeMarker(BoardPosition marker, char player) {

    }

    public char whatsAtPos(BoardPosition pos) {
        char atPos = ' ';

        return atPos;
    }

    public int getNumRows() {
        int numRows = 0;

        return numRows;
    }

    public int getNumColumns() {
        int numColumns = 0;

        return numColumns;
    }

    public int getNumToWin() {
        int numToWin = -1;

        return numToWin;
    }
}
