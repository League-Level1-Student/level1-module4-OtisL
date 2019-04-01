package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurpise implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton trick = new JButton();
	JButton treat = new JButton();
	JLabel cute = new JLabel();
	JLabel scary = new JLabel();

	public static void main(String[] args) {
		new NastySurpise().yeet();
	}

	public void yeet() {
		frame.add(panel);
		panel.add(trick);
		panel.add(treat);
		trick.addActionListener(this);
		treat.addActionListener(this);
		trick.setText("Trick");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == trick) {
			trick.add(cute);
			treat.add(scary);
		}
	}
}
