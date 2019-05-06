package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class Twitter implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField search = new JTextField(15);
	JButton go = new JButton();
	JLabel label = new JLabel();
	public static void main(String[] args) {
		Twitter hi = new Twitter();
		hi.stuff();
	}
	void stuff() {
		frame.add(panel);
		panel.add(search);
		panel.add(go);
		panel.add(label);
		frame.setTitle("Search Twitter");
		go.setText("Go!");
		go.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("TWEET");
		label.setText(getLatestTweet(search.getText()));
		frame.pack();
	}
	private String getLatestTweet(String searchingFor) {

	      twitter4j.Twitter twitter = new TwitterFactory().getInstance();

	      AccessToken accessToken = new AccessToken(
	            "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
	            "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");

	      twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
	            "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");

	      twitter.setOAuthAccessToken(accessToken);

	      Query query = new Query(searchingFor);
	      try {
	            QueryResult result = twitter.search(query);
	            return result.getTweets().get(0).getText();
	      } catch (Exception e) {
	            System.err.print(e.getMessage());
	            return "What the heck is that?";
	      }
	}

}
