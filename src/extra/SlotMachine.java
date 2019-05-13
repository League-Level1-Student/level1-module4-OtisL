package extra;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javafx.beans.binding.When;

import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

public class SlotMachine implements ActionListener {
	
	JFrame frame;
	JPanel panel; 
	JLabel first; 
	JLabel second; 
	JLabel third;  
	JButton spin = new JButton();
	Random rand = new Random();
	public static void main(String[] args) {
		SlotMachine INeedToCreateAnInstance = new SlotMachine();
		INeedToCreateAnInstance.IDoStuff();
	}
	
	void IDoStuff(){
		frame=new JFrame();
		panel=new JPanel();
		frame.add(panel);
		
		panel.add(spin);
		spin.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.dispose();
		frame=new JFrame();
		panel = new JPanel();
		frame.add(panel);
		panel.add(spin);
		int one = rand.nextInt(3);
		int two = rand.nextInt(3);
		int three = rand.nextInt(3);
		if(one==0) {
			try {
				first=createLabelImage("cherry.png");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (one==1) {
			try {
				first=createLabelImage("7.jpeg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (one==2) {
			try {
				first=createLabelImage("orange.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(two==0) {
			try {
				second=createLabelImage("cherry.png");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (two==1) {
			try {
				second=createLabelImage("7.jpeg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (two==2) {
			try {
				second=createLabelImage("orange.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(three==0) {
			try {
				third=createLabelImage("cherry.png");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (three==1) {
			try {
				third=createLabelImage("7.jpeg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (three==2) {
			try {
				third=createLabelImage("orange.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		panel.add(first);
		panel.add(second);
		panel.add(third);
		frame.setVisible(true);
		frame.pack();
		if(one==0 && two==0 && three==0) {
			JOptionPane.showMessageDialog(null, "YOU WIN!!");
		}else if(one==1 && two==1 && three==1) {
			JOptionPane.showMessageDialog(null, "YOU WIN MAX WIN!! GREAT JOB!!");
		}else if(one==2 && two==2 && three==2) {
			JOptionPane.showMessageDialog(null, "YOU WIN!!");
		}
	}
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
}
