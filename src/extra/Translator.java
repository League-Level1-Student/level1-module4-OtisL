package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Translator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField input = new JTextField(15);
	JLabel output = new JLabel();
	JButton go = new JButton();
	PigLatinTranslator translator = new PigLatinTranslator();
	public static void main(String[] args) {
		Translator wut = new Translator();
		wut.methodNameHereTM();
	}
	void methodNameHereTM(){
		
		frame.add(panel);
		panel.add(input);
		panel.add(go);
		panel.add(output);
		go.addActionListener(this);
		
		frame.setVisible(true);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		output.setText(translator.translate(input.getText()));
		frame.pack();
	}
}

