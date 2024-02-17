package edu.battleship.client;

import javax.swing.*;
import java.awt.*;

public class JBattleshipBoard extends JPanel {

	public JBattleshipBoard() {
		setBackground(Color.CYAN);
	}

	@Override
	protected void paintComponent(Graphics og) {
		super.paintComponent(og);
		int w = getWidth();
		int h = getHeight();
		int s = Math.min(w, h);
		int x1 = 0;
		int y1 = 0;
		if (w > h) {
			x1 = w / 2 - s / 2;
		} else {
			y1 = h / 2 - s / 2;
			;
		}
		Graphics2D g = (Graphics2D) og;
		g.setColor(Color.white);
		g.fillRect(x1, y1, s, s);
		paintGrid(g, x1, y1, s);
		double t = s / 11.0;
		FontMetrics fm = g.getFontMetrics();
		for (int i = 0; i < 10; i++) {
			g.drawString("A", r(x1 + i * t + 0.5 * t), r(y1 + 0.5 * t));
		}

	}

	private static void paintGrid(Graphics2D g, int x1, int y1, int s) {
		g.setColor(Color.black);
		double t = s / 11.0;
		for (int i = 0; i < 12; i++) {
			g.drawLine(x1, r(y1 + t * i), x1 + s, r(y1 + t * i));
			g.drawLine(r(x1 + t * i), y1, r(x1 + t * i), y1 + s);
		}
	}



	private static int r(double d) {
		return (int) Math.round(d);
	}


}
