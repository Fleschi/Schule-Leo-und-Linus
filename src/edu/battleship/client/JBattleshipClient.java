package edu.battleship.client;

import javax.swing.*;

public class JBattleshipClient extends JFrame {

    public JBattleshipClient() {
        System.err.println("JBattleshipClient");
    }

    public static void main(String[] args) {
        JBattleshipClient client = new JBattleshipClient();
        client.setVisible(true);
        client.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        client.setSize(300, 300);

    }

}
