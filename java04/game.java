package java04;

import javax.swing.JButton;
import javax.swing.JFrame;

public class game {
    private final static int HEIGHT = 800;
    private final static int WIDTH = 1200;

    public static void main(String[] args) {
        JButton label = new JButton("Event");
        label.setBounds(400, 400, 100, 100);
        // label.setBackground(Color.RED);
        // label.setForeground(Color.white);
        label.setOpaque(true);
        label.addActionListener(e -> {
            System.out.println("Clicked");
        });

        JFrame frame = new JFrame("My Game");
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
