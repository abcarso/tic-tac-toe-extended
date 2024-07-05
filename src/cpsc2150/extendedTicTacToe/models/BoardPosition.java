package cpsc2150.extendedTicTacToe.models;

/*
Project 2
Alaina Carson
Section: 001
*/

/**
 * This class is used to store the position of a space on the game board
 *
 * @author Alaina Carson
 * @version 1.0
 *
 * @invariant NONE
 */

public class BoardPosition {
    private int row;
    private int column;

    /**
     * This constructor creates a new board position at the specified coordinates.
     *
     * @param row the number of the row of the position
     * @param column the number of the column of the position
     *
     * @post row = #row AND column = #column
     */
    BoardPosition(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        int row = -1;

        return row;
    }

    private int getColumn() {
        int column = -1;

        return column;
    }

    /**
     * This method overrides equals to compare the contents of two board position instances.
     * @return true or false.
     *
     * @post getDescription = [The row and column values of two instances are compared for equivilance.]
     */
    //@Override
    public boolean equals() {
        return false;
    }

    /**
     * This method overrides toString and provides a string representation of the coordinates.
     *
     * @pre NONE
     * @post getDescription = [A string representation of the coordinates with its row and column values]
     */
    @Override
    public String toString() {
        return row + "," + column;
    }
}

