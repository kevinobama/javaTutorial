package kevinGates;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JframeExample {

	public static void main(String[] args) {
        JFrame frame = new JFrame("Beeper " );
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Hello World"));
        frame.pack();
        frame.setSize(600,600);
        frame.setVisible(true);
	}
}
