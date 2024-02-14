package edu.battleship.client;

import javax.swing.*;
import java.awt.*;

public class JBattleshipClient extends JFrame {

    public JBattleshipClient() {
        super("Battleship");
        Container cont = getContentPane();
        cont.setLayout(new BorderLayout());
        createClient(cont);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(600, 600));
        setLocationRelativeTo(null);
    }

    private void createClient(Container cont) {
        cont.add(new JSideBar(), BorderLayout.WEST);
        cont.add(new JBattleshipBoard(), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        JBattleshipClient client = new JBattleshipClient();
        client.setVisible(true);
    }

}
