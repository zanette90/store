package br.com.alan.store.view;

import javax.swing.*;

public class login {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.add(new JButton("teste"));
        panel.add(new JButton("teste2"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.setVisible(true);

    }
}
