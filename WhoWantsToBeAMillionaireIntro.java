package WhoWantsToBeAMillionaire;
/*
 * RUN PROGRAM FROM WhoWantsToBeAMillionaireControl class
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class WhoWantsToBeAMillionaireIntro {
	static String name;
	static JFrame frameMain;
	static JLabel playerName ,intructions1,intructions2,intructions3,intructions4,intructions5;
	static JLabel title,blank1,blank2;
	static JTextField playerNameInput;
	static JCheckBox termsAndConditions; 
	static JButton start;
	private static void guiApp() {
		frameMain = new JFrame("Who wants to be a millionaire? (Pop Culture Edition)");
		frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// declare all panels
		JPanel topPanel = new JPanel(new GridLayout(1, 1));
		JPanel centerPanel = new JPanel(new GridLayout(8, 1));
		JPanel bottomPanel = new JPanel(new GridLayout(1, 1));
		
		// components for top panel
		Font titleFont = new Font("Ariel", Font.BOLD, 24);
		title= new JLabel("Welcome to Who Wants to be a Millionaire!",JLabel.CENTER);
		title.setFont(titleFont);
		title.setForeground(new Color(255,255,255));
		// components for center panel
		Font lblPlayerName = new Font("Ariel", Font.BOLD, 24);
		playerName= new JLabel("Enter Player Name",JLabel.CENTER);
		playerName.setFont(lblPlayerName);
		
		playerNameInput= new JTextField("");
		blank1 = new JLabel();
		blank2 = new JLabel();
		
		intructions1 = new JLabel
				("  Once started, you will answer a series of questions. Select your desired "
				+ "answer and click the final answer button to proceed to the next question.");
		
		intructions2 = new JLabel("  For each correct answer, you will win higher amounts of money displayed at "
				+ "the sides of the screen. If you do not know the answer to a question, you ");
		
		intructions3 = new JLabel("  can click walk to take away any money earned so far. You can choose 50/50 "
				+ "twice to eliminate two possible answers. You can also choose audience vote ");
		intructions4= new JLabel("  or phone a friend once to see what they think (keep in mind they may be wrong "
				+ "and audience vote is more likely to be correct). If you get an answer wrong, ");
		
		intructions5= new JLabel("  you only get a portion of the money you have "
				+ "earned so play wisely. Lastly, have fun!!");
		
		termsAndConditions=new JCheckBox("I have read over the rules and am ready to play");
		termsAndConditions.setBackground(new Color(255,255,255));
		
		blank1.setBackground(Color.decode("#3366CC"));
		blank2.setBackground(Color.decode("#3366CC"));
		blank1.setOpaque(true);
		blank2.setOpaque(true);
		JPanel textGroup= new JPanel(new GridLayout(1,3));
		textGroup.add(blank1);
		textGroup.add(playerNameInput);
		textGroup.add(blank2);
		
		// bottom panel
		Font btn = new Font("Ariel", Font.BOLD, 20);
		start = new JButton("Start");
		start.setFont(btn);
		start.setBackground(Color.decode("#333399"));
		start.setForeground(new Color(255,255,255));
		
		// add to panels
		// center panel
		centerPanel.add(playerName);
		centerPanel.add(textGroup);
		centerPanel.add(intructions1);
		centerPanel.add(intructions2);
		centerPanel.add(intructions3);
		centerPanel.add(intructions4);
		centerPanel.add(intructions5);
		centerPanel.add(termsAndConditions);
		// top panel
		topPanel.add(title);
		// bottom panel
		bottomPanel.add(start);
		
		
		// panel colors
		topPanel.setBackground(Color.decode("#333399"));
		centerPanel.setBackground(Color.decode("#3366CC"));
		
		// add to frame
		frameMain.add(topPanel,BorderLayout.PAGE_START);
		frameMain.add(centerPanel,BorderLayout.CENTER);
		frameMain.add(bottomPanel,BorderLayout.PAGE_END);
		
		frameMain.setSize(900,400);
		frameMain.setVisible(true);
		
		ButtonHandler onClick = new ButtonHandler();
		start.addActionListener(onClick);
		
		
	} // guiApp
	
	private static class ButtonHandler implements ActionListener{
		public void actionPerformed (ActionEvent e) {
			String b=e.getActionCommand();
			
			if (b.equals("Start") && termsAndConditions.isSelected() && !playerNameInput.getText().equals("")) {
				name=playerNameInput.getText();
				WhoWantsToBeAMillionaireControl.page=2;
				WhoWantsToBeAMillionaireControl.main(null);
			}
				
		}
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable()
		{
			public void run() {
				guiApp();
			}
		}		
		);
	} // main method
	

}
