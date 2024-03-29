package edu.fourwins;

public class Lister {

	private Lister() {}

	public static String listBoard(Board b) {
		StringBuffer sb = new StringBuffer();
		sb.append("  ---------------------------\n");
		for (int row = 0; row < b.getRowCount(); row++ ) {
			sb.append(" | ");
			int[] rowData = b.getRow(row);
			sb.append(toString(rowData)).append(" |\n");
		}
		sb.append("  ---------------------------\n");
		return sb.toString();
	}

	private static String toString(int[] rowData) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < rowData.length; i++) {
			int cell = rowData[i];
			sb.append(toString(cell));
			if (i < rowData.length -1 ) {
				sb.append(" | ");
			}
		}
		return sb.toString();
	}

	private static String toString(int cell) {
		switch (cell) {
			case -1:
				return "O";
			case 0:
				return "-";
			case 1:
				return "X";
			default:
				return "?";
		}
	}

}
