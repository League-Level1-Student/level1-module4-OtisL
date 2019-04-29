package extra;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.sun.org.apache.xerces.internal.parsers.IntegratedParserConfiguration;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Calculator implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel instructions = new JLabel();
	JTextField first = new JTextField(20);
	JTextField second = new JTextField(20);
	JButton add = new JButton();
	JButton subtract = new JButton();
	JButton multiply = new JButton();
	JButton divide = new JButton();
	JLabel result = new JLabel();
	public static void main(String[] args) {
		Calculator oof = new Calculator();
		oof.stuff();
	}
	void stuff() {
		frame.add(panel);
		panel.add(instructions);
		panel.add(first);
		panel.add(second);
		panel.add(add);
		frame.pack();
		panel.add(subtract);
		panel.add(multiply);
		panel.add(divide);
		panel.add(result);
		add.setText("+");
		subtract.setText("-");
		multiply.setText("*");
		divide.setText("/");
		//first.setSize(50, 100);
		//second.setSize(50, 100);
		add.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		result.setFont(result.getFont().deriveFont(40.0f));
		frame.pack();
		frame.setVisible(true);
	}
	double add (double firstNumber, double secondNumber) {
		double newNumber = firstNumber+secondNumber;
		return newNumber;
	}
	double subtract (double firstNumber, double secondNumber) {
		double newNumber = firstNumber-secondNumber;
		return newNumber;
	}
	double multiply (double firstNumber, double secondNumber) {
		double newNumber = firstNumber*secondNumber;
		return newNumber;
	}
	double divide (double firstNumber, double secondNumber) {
		double newNumber = firstNumber/secondNumber;
		return newNumber;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		double newNumber=0;
		String firstNumber=first.getText();
		String secondNumber=second.getText();
		double firstInt=Double.parseDouble(firstNumber);
		double secInt=Double.parseDouble(secondNumber);
		if (e.getSource().equals(add)) {
			newNumber = add(firstInt, secInt);
		}else if (e.getSource().equals(subtract)) {
			newNumber = subtract(firstInt, secInt);
		}else if (e.getSource().equals(multiply)) {
			newNumber = multiply(firstInt, secInt);
		}else if (e.getSource().equals(divide)) {
			newNumber = divide(firstInt, secInt);
		}
		result.setText(newNumber+"");
		frame.pack();
	}
}
