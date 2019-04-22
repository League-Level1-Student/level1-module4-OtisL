package extra;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JFrame frame = new JFrame();
	JFrame result = new JFrame();
	JPanel extra = new JPanel();
	JPanel panel = new JPanel();
	JLabel current = new JLabel();
	char currentLetter = generateRandomLetter();

	public static void main(String[] args) {
		TypingTutor oof = new TypingTutor();
		oof.totallyAMainMethod();
	}

	void totallyAMainMethod() {
		frame.add(panel);
		panel.add(current);
		result.setSize(1000, 1000);
		result.setLocation(500, 10);
		result.add(extra);
		current.setFont(current.getFont().deriveFont(800.0f));
		current.setHorizontalAlignment(JLabel.CENTER);
		current.setText(currentLetter + "");
		frame.addKeyListener(this);
		frame.pack();
		frame.setVisible(true);
		result.setVisible(true);
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char a = e.getKeyChar();
		System.out.println("you typed " + a);
		if (a == currentLetter) {
			extra.setBackground(Color.green);
		} else {
			extra.setBackground(Color.red);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		current.setText(currentLetter + "");
	}

}
