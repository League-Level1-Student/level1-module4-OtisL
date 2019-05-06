package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class WhackAMole implements ActionListener {
	JButton yes;
	JButton no;
	int moleLocation;
	JFrame frame;
	JPanel panel;
	Date start;
	int molesWhacked = 0;
	int emptiesWhacked = 0;
	static WhackAMole wat;
	
	public static void main(String[] args) {
		wat = new WhackAMole();
		wat.makeButtons();
	}
	void makeButtons() {
		moleLocation = new Random().nextInt(42);
		start = new Date();
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(600, 250);
		for(int i=0; i<42; i++) {
			if(i==moleLocation) {
				yes = new JButton();
				panel.add(yes);
				yes.setText("mole!");
				yes.addActionListener(this);
			}else {
				no = new JButton();
				panel.add(no);
				no.addActionListener(this);
			}
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==yes) {
			System.out.println("You got the mole!");
			molesWhacked++;
			if(molesWhacked>=10) {
				System.out.println("You have won!");
				endGame(start, molesWhacked);
				frame.dispose();
			}else {
			frame.dispose();
			wat.makeButtons();
			}
		}else {
			System.out.println("You didn't get the mole! :(");
			emptiesWhacked++;
			if(emptiesWhacked>=5) {
				System.out.println("You have lost");
				endGame(start, molesWhacked);
				frame.dispose();
			}else {
			frame.dispose();
			wat.makeButtons();
			}
		}
	}
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}
}
