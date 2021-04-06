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

public class WhoWantsToBeAMillionaireOver {
	static JFrame frameMain;
	static JLabel title, playerWon,amountPlayerWon;
	static JButton playAgain,exit;
	private static void guiApp() {
		frameMain = new JFrame("Who wants to be a millionaire? (Pop Culture Edition)");
		frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// declare all panels
		JPanel topPanel = new JPanel(new GridLayout(1, 1));
		JPanel centerPanel = new JPanel(new GridLayout(2, 1));
		JPanel bottomPanel = new JPanel(new GridLayout(1, 2));
		
		WhoWantsToBeAMillionaireIntro intro = new WhoWantsToBeAMillionaireIntro();
		WhoWantsToBeAMillionaireMain main = new WhoWantsToBeAMillionaireMain();
		// components for top panel
		Font titleFont = new Font("Ariel", Font.BOLD, 24);
		title= new JLabel("Thank You For Playing!",JLabel.CENTER);
		title.setFont(titleFont);
		title.setForeground(new Color(255,255,255));
		// components for center panel
		Font playerWonFont = new Font("Ariel", Font.BOLD, 40);
		Font amountPlayerWonFont = new Font("Ariel", Font.BOLD, 30);
		playerWon= new JLabel(intro.name+" Won",JLabel.CENTER);
		playerWon.setFont(playerWonFont);
		
		amountPlayerWon= new JLabel("$"+main.winnings,JLabel.CENTER);
		amountPlayerWon.setForeground(new Color(245, 215, 66));
		amountPlayerWon.setFont(amountPlayerWonFont);
		
		
		// bottom panel
		Font btn = new Font("Ariel", Font.BOLD, 20);
		playAgain = new JButton("Play Again");
		playAgain.setFont(btn);
		playAgain.setBackground(Color.decode("#333399"));
		playAgain.setForeground(new Color(255,255,255));
		exit = new JButton("Exit");
		exit.setFont(btn);
		exit.setBackground(Color.decode("#333399"));
		exit.setForeground(new Color(255,255,255));
		
		// add to panels
		// center panel
		centerPanel.add(playerWon);
		centerPanel.add(amountPlayerWon);
		// top panel
		topPanel.add(title);
		// bottom panel
		bottomPanel.add(playAgain);
		bottomPanel.add(exit);
		
		
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
		playAgain.addActionListener(onClick);
		exit.addActionListener(onClick);
		
		
	} // guiApp
	
	private static class ButtonHandler implements ActionListener{
		public void actionPerformed (ActionEvent e) {
			String b=e.getActionCommand();
			
			if (b.equals("Play Again")) {
				WhoWantsToBeAMillionaireControl.page=4;
				WhoWantsToBeAMillionaireControl.main(null);
			}
			else if (b.equals("Exit")) {
				WhoWantsToBeAMillionaireControl.page=5;
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
