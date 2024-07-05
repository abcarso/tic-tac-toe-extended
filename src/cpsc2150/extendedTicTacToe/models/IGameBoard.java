package cpsc2150.extendedTicTacToe.models;

public interface IGameBoard {

    /**
     * checks the given position to see if it is valid and empty
     * @param pos the coordinates of a space on the board
     * @return true if the position specified in pos is available;
     * false otherwise. If a space is not in bounds, then it is not available
     *
     * @post pos = #pos AND space must contain ' ' OR 'X' OR 'O'
     */
    default boolean checkSpace(BoardPosition pos) {
        boolean isTrue = false;

        return isTrue;
    }


    /**
     * places the character in marker on the position specified by
     * marker
     * @param marker the coordinates of the space on the board the marker should be placed
     * @param player a character to denote which player's move it is
     *
     * @pre [marker must be an available space]
     * @post [value at marker = player]
     */
    public void placeMarker(BoardPosition marker, char player);


    /**
     * checks all winning conditions to determine anyone has won
     * @param lastPos the coordinates of the last marker placed on the board
     * @return if the lastPos placed resulted in a winner return true otherwise false
     *
     * @pre lastpos = [the board position of the latest play]
     * @post lastPos = #lastPos AND [returns true if checkHorizontalWin(lastPos) = true OR checkVerticalWin(lastPos) = true OR checkDiagonalWin(lastPos) = true]
     */
    default boolean checkForWinner(BoardPosition lastPos) {
        boolean isTrue = false;

        return isTrue;
    }


    /**
     * checks if the whole board is filled
     * @return true if the game is tied and false otherwise
     *
     * @pre checkForWinner != true
     * @post [returns true if all spaces on the board != ' ']
     */
    default boolean checkForDraw() {
        boolean isTrue = false;

        return isTrue;
    }


    /**
     * checks to see if the last marker placed resulted in 5 in a row horizontally
     * @param lastPos the coordinates of the last marker placed on the board
     * @param player a character to denote which player's move it is
     * @return if 5 in a row horizontally return true otherwise false
     *
     * @pre [lastPos is a valid play]
     * @post lastPos = #lastPos AND player = #player AND [returns true if the marker at last pos is a set of 5 consecutive markers horizontally for player]
     */
    default boolean checkHorizontalWin(BoardPosition lastPos, char player) {
        boolean isTrue = false;

        return isTrue;
    }


    /**
     * checks to see if the last marker placed resulted in 5 in a row vertically
     * @param lastPos the coordinates of the last marker placed on the board
     * @param player a character to denote which player's move it is
     * @return if 5 in a row vertically return true otherwise false
     *
     * @pre [lastPos is a valid play]
     * @post lastPos = #lastPos AND player = #player AND [returns true if the marker at last pos is a set of 5 consecutive markers vertically for player]
     */
    default boolean checkVerticalWin(BoardPosition lastPos, char player) {
        boolean isTrue = false;

        return isTrue;
    }


    /**
     * checks to see if the last marker placed resulted in 5 in a row diagonally
     * @param lastPos the coordinates of the last marker placed on the board
     * @param player a character to denote which player's move it is
     * @return if 5 in a row diagonally return true otherwise false
     *
     * @pre [lastPos is a valid play]
     * @post lastPos = #lastPos AND player = #player AND [returns true if the marker at last pos is a set of 5 consecutive markers diagonally for player]
     */
    default boolean checkDiagonalWin(BoardPosition lastPos, char player) {
        boolean isTrue = false;

        return isTrue;
    }


    /**
     * checks what character is at a given position on the game board
     * @param pos the coordinates of a space on the board
     * @return the char in the GameBoard at position pos
     *
     * @pre 0 <= row of pos < 5 AND 0 <= column of pos < 8
     * @post pos = #pos AND [returns the value at pos]
     */
    public char whatsAtPos(BoardPosition pos);


    /**
     * checks if the given player has a marker at the given space
     * @param pos the coordinates of a space on the board
     * @param player a character to denote which player's move it is
     * @return true if the player is at pos otherwise it returns false
     *
     * @pre 0 <= row of pos < 5 AND 0 <= column of pos < 8
     * @post pos = #pos AND player = #player
     */
    default boolean isPlayerAtPos(BoardPosition pos, char player) {
        boolean isTrue = false;

        return isTrue;
    }

    /**
     * returns the number of rows in the GameBoard
     * @return [int of rows in the GameBoard]
     *
     * @post [returns an int of rows in the GameBoard]
     */
    public int getNumRows();


    /**
     * returns the number of columns in the GameBoard
     * @return [int of columns in the GameBoard]
     *
     * @post [returns an int of columns in the GameBoard]
     */
    public int getNumColumns();

    /**
     * returns the number of tokens in a row needed to win the game
     * @return an int of the num tokens needed in a row
     *
     * @pre checkWinner != true
     * @post returns and int of tokens needed to win in a row
     */
    public int getNumToWin();


}
