package edu.fourwins;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Board b = new Board();
		System.err.println(Lister.listBoard(b));
		if (!b.tryAddStone(1, 6)) {
			System.err.println("problem in column " + (6 + 1) );
		}

		System.err.println(Lister.listBoard(b));
	}

}
