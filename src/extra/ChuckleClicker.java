package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton joke;
	JButton punchline;

	public static void main(String[] args) {
		ChuckleClicker cc = new ChuckleClicker();
		cc.makeButtons();
	}

	void makeButtons() {
		frame = new JFrame();
		panel = new JPanel();
		joke = new JButton();
		punchline = new JButton();
		frame.add(panel);
		panel.add(joke);
		panel.add(punchline);
		joke.setText("joke");
		punchline.setText("punchline");
		joke.addActionListener(this);
		punchline.addActionListener(this);
		frame.pack();
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == joke) {
			JOptionPane.showMessageDialog(null, "wait i had to put a joke here? oh well i am not good at jokes anyway");
		} else {
			JOptionPane.showMessageDialog(null,
					"oh no i don't know any punchlines. but i do know that i am too lazy to capitalize my i's but not lazy to put 's.");

		}
	}
}
