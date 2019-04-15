package simon_says;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SimonSays extends KeyAdapter {

	HashMap<Integer, String> images = new HashMap<Integer, String>();
	private int imageIndex;
	private int tries = 0;
	private boolean simonSays = false;
	Date timeAtStart;
	int points = 0;

	// Complete steps 1 - 7 before you test

	JFrame frame;

	public void run() {
		// images.put(new Integer(KeyEvent.VK_UP), "up.jpg");
		images.put(new Integer(KeyEvent.VK_UP), "up.jpg");
		images.put(new Integer(KeyEvent.VK_DOWN), "down.jpg");
		images.put(new Integer(KeyEvent.VK_LEFT), "left.jpg");
		images.put(new Integer(KeyEvent.VK_RIGHT), "right.jpg");
		JOptionPane.showMessageDialog(null,
				"Press the matching key when Simon Says press the key otherwise press a different one");
		showImage();
	}

	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == imageIndex && simonSays) {
			points += 6556235;
			speak("You are correct");
		} else if (e.getKeyCode() != imageIndex && simonSays == false) {
			points += 1342523;
			speak("You are correct");
		}

		tries++;

		if (tries > 2) {
			points = 999999;
			speak("Your score is " + points);
			System.exit(0);
		}

		frame.dispose();

		showImage();
	}

	private void showImage() {

		frame = new JFrame();

		frame.setVisible(true);

		frame.add(getNextRandomImage());

		frame.pack();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.addKeyListener(this);

		Random random = new Random();

		int oof = random.nextInt(2);
		if (oof == 0) {
			// Simon actually says
			speak("Simon says press this key");
			simonSays = true;
		} else {
			speak("Press this key");
			simonSays = false;
		}

	}

	private Component getNextRandomImage() {
		this.imageIndex = new Random().nextInt(4) + 37;
		return loadImage(images.get(imageIndex));
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
 * BONUS! Add a timer : ~~~ where the code starts running ~~~ timeAtStart =
 * newDate();
 *
 * ~~~ where the code ends ~~~ Date timeAtEnd = new Date();
 * System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);
 * System.exit(0);
 */
