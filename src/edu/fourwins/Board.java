package edu.fourwins;

public class Board {

	private final int [][] board = new int [6][7];

	public Board() {

	}

	public int[] getRow(int row) {
		return board[row];
	}

	public boolean tryAddStone(int stone, int col) {
		int insertRowIndex = -1;
		for (int row = 0; row < board.length; row++) {
			int cell = board[row][col];
			if (cell == 0) {
				insertRowIndex = row;
			}
		}
		if (insertRowIndex >= 0) {
			board[insertRowIndex][col] = stone;
			return true;
		} else {
			return false;
		}
	}

	public int getRowCount() {
		return board.length;
	}

	public int getCount() {
		return board[0].length;
	}

}
