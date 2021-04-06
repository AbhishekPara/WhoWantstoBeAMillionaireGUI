package WhoWantsToBeAMillionaire;
/*
 * RUN PROGRAM FROM WhoWantsToBeAMillionaireControl class
 */
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class WhoWantsToBeAMillionaireMain {
	static int winnings;
	static JFrame frameMain;
	static int questionNumber = 1;
	static int fiftyfiftyCounter=2;
	static int phoneAFriendCounter=1;
	static int audienceVoteCounter=1;
	static int[] price= {100,200,500,1000,16000,25000,100000,1000000};
	static String questionsList[]= {
			"Who acted as Harry Potter",
			"Who goes by the code name 007",
			"Which Star Wars movie has the line: Luke, I am your father",
			"What TV show was Meghan Markle in for 7 seasons",
			"What is Eleven's real name in Stranger Things",
			"What christmas hit Mariah Carey known for",
			"Who is the artist with the best selling pop album",
			"Why did Ross not marry Emily in the TV show Friends"};
	static String posAnswerList[][]= {
			{"Dwayne Johnson","Daniel Radcliffe","Tom Holland","Henry Cavill"},
			{"James Bond","Jason Bourne","Ethan Hunt","Jack Reacher"},
			{"The Empire Strike Back","Revenge of the Sith", "A New Hope", "Return of the Jedi"},
			{"The Good Wife","Law and Order","House of Cards","Suits"},
			{"Waffle","Eleven is the only name she knows","Jane","Jennifer"},
			{"Last Christmas","All I Want For Christmas","White Christmas","Winter Wonderland"},
			{"Taylor Swift","Justin Bieber","Michael Jackson","Elvis Presley"},
			{"They did marry","They did not love each other","Ross cheated on Emily","He said the wrong name at the wedding"}};
	// top panel
	static JLabel title;
	// center panel
	static JLabel lblPriceQuestion, lblQuestion;
	static JRadioButton answerA,answerB,answerC,answerD;
	static ButtonGroup choices;
	static JButton finalAnswer,walk;
	// left and right panel
	static JLabel[] pricesLeftAndRight = new JLabel[8];
	// bottom panel
	static JButton fiftyfifty,phoneAFriend,audienceVote;
	
	private static void guiApp() {
		frameMain = new JFrame("Who wants to be a millionaire? (Pop Culture Edition)");
		frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// declare all panels
		JPanel topPanel = new JPanel(new GridLayout(1, 1));
		JPanel bottomPanel = new JPanel(new GridLayout(1, 3));
		JPanel leftPanel = new JPanel(new GridLayout(4, 1));
		JPanel rightPanel = new JPanel(new GridLayout(4, 1));
		JPanel centerPanel = new JPanel(new GridLayout(4, 1));
		
		// components for top panel
		WhoWantsToBeAMillionaireIntro intro = new WhoWantsToBeAMillionaireIntro();
		Font titleFont = new Font("Ariel", Font.BOLD, 24);
		title= new JLabel(intro.name+" Wants to be a Millionaire!",JLabel.CENTER);
		title.setFont(titleFont);
		title.setForeground(new Color(255,255,255));
		// components for center panel
		Font lblFontPriceQuestion = new Font("Ariel", Font.BOLD, 24);
		Font lblFontQuestion = new Font("Ariel", Font.BOLD, 18);
		lblPriceQuestion= new JLabel("$"+price[0]+" "+"question",JLabel.CENTER);
		lblPriceQuestion.setFont(lblFontPriceQuestion);
		lblQuestion= new JLabel(questionsList[0]+"?",JLabel.CENTER);
		lblQuestion.setFont(lblFontQuestion);
		JPanel answersPanel = new JPanel(new GridLayout(2,2));
		
		answerA=new JRadioButton(posAnswerList[0][0], false);
		answerB=new JRadioButton(posAnswerList[0][1], false);
		answerC=new JRadioButton(posAnswerList[0][2], false);
		answerD=new JRadioButton(posAnswerList[0][3], false);
		
		answerA.setBackground(new Color(255,255,255));
		answerB.setBackground(new Color(255,255,255));
		answerC.setBackground(new Color(255,255,255));
		answerD.setBackground(new Color(255,255,255));
		
		choices = new ButtonGroup();
		choices.add(answerA);
		choices.add(answerB);
		choices.add(answerC);
		choices.add(answerD);
		
		answersPanel.add(answerA);
		answersPanel.add(answerB);
		answersPanel.add(answerC);
		answersPanel.add(answerD);
		
		Font btnCenter = new Font("Ariel", Font.BOLD, 20);
		finalAnswer= new JButton("Final Answer");
		walk= new JButton("Walk");
		finalAnswer.setFont(btnCenter);
		walk.setFont(btnCenter);
		finalAnswer.setForeground(new Color(255,255,255));
		walk.setForeground(new Color(255,255,255));
		finalAnswer.setBackground(Color.decode("#3366CC"));
		walk.setBackground(Color.decode("#3366CC"));
		JPanel centerButtons= new JPanel(new GridLayout(1,2));
		centerButtons.add(finalAnswer);
		centerButtons.add(walk);
		
		// components for left panel
		pricesLeftAndRight[0]=new JLabel("         $100          ");
		pricesLeftAndRight[1]=new JLabel("       $200");
		pricesLeftAndRight[2]=new JLabel("       $500");
		pricesLeftAndRight[3]=new JLabel("      $1000");
		
		pricesLeftAndRight[0].setBackground(new Color(245, 215, 66));
		pricesLeftAndRight[0].setOpaque(true);
		
		// components for right panel
		pricesLeftAndRight[4]=new JLabel("       $16000");
		pricesLeftAndRight[5]=new JLabel("       $25000");
		pricesLeftAndRight[6]=new JLabel("      $100000");
		pricesLeftAndRight[7]=new JLabel("     $1000000      ");
		
		// components for bottom panel
		Font btnBottom = new Font("Ariel", Font.BOLD, 15);
		fiftyfifty= new JButton("50/50");
		phoneAFriend= new JButton("Phone A Friend");
		audienceVote= new JButton("Audience Vote");
		fiftyfifty.setFont(btnBottom);
		phoneAFriend.setFont(btnBottom);
		audienceVote.setFont(btnBottom);
		
		fiftyfifty.setBackground(Color.decode("#333399"));
		fiftyfifty.setForeground(new Color(255,255,255));
		phoneAFriend.setBackground(Color.decode("#333399"));
		phoneAFriend.setForeground(new Color(255,255,255));
		audienceVote.setBackground(Color.decode("#333399"));
		audienceVote.setForeground(new Color(255,255,255));
		
		// add to panels
		// top panel
		topPanel.add(title);
		// left panel
		for (int i=3;i>=0;i--) {
			leftPanel.add(pricesLeftAndRight[i]);
		}
		// right panel
		for (int i=7;i>=4;i--) {
			rightPanel.add(pricesLeftAndRight[i]);
		}
		// bottom panel
		bottomPanel.add(fiftyfifty);
		bottomPanel.add(phoneAFriend);
		bottomPanel.add(audienceVote);
		// center panel
		centerPanel.add(lblPriceQuestion);
		centerPanel.add(lblQuestion);
		centerPanel.add(answersPanel);
		centerPanel.add(centerButtons);
		
		
		// panel colors
		topPanel.setBackground(Color.decode("#333399"));
		bottomPanel.setBackground(Color.decode("#333399"));		
		leftPanel.setBackground(Color.decode("#3399FF"));
		rightPanel.setBackground(Color.decode("#3399FF"));
		centerPanel.setBackground(Color.decode("#3366CC"));
		
		// add to frame
		frameMain.add(topPanel,BorderLayout.PAGE_START);
		frameMain.add(bottomPanel,BorderLayout.PAGE_END);
		frameMain.add(leftPanel,BorderLayout.LINE_START);
		frameMain.add(rightPanel,BorderLayout.LINE_END);
		frameMain.add(centerPanel,BorderLayout.CENTER);
		
		frameMain.setSize(900,400);
		frameMain.setVisible(true);
		
		ButtonHandler onClick = new ButtonHandler();
		fiftyfifty.addActionListener(onClick);
		phoneAFriend.addActionListener(onClick);
		audienceVote.addActionListener(onClick);
		finalAnswer.addActionListener(onClick);
		walk.addActionListener(onClick);
		
	} // guiApp
	
	private static class ButtonHandler implements ActionListener{
		public void actionPerformed (ActionEvent e) {
			JRadioButton answerKey[]= {answerB,answerA,answerA,answerD,answerC,answerB,answerC,answerD};
			JRadioButton fiftyfiftyKey[]= {answerA,answerB,answerD,answerC,answerA,answerD,answerD,answerA};
			JRadioButton fiftyfiftyKey2[]= {answerC,answerC,answerB,answerA,answerB,answerC,answerA,answerB};
			JRadioButton phoneAFriendKey[]= {answerB,answerA,answerC,answerA,answerC,answerB,answerA,answerC};
			JRadioButton audienceVoteKey[]= {answerB,answerA,answerA,answerD,answerB,answerB,answerC,answerB};
			String b=e.getActionCommand();
			
			if (b.equals("Final Answer")) {
				if (answerKey[questionNumber-1].isSelected()) {
					
					if (questionNumber==8) {
						winnings=1000000;
						WhoWantsToBeAMillionaireControl.page=3;
						WhoWantsToBeAMillionaireControl.main(null);
					}
					
					lblPriceQuestion.setText("Testing");
					questionNumber+=1;
					
					answerA.setText(posAnswerList[questionNumber-1][0]);
					answerB.setText(posAnswerList[questionNumber-1][1]);
					answerC.setText(posAnswerList[questionNumber-1][2]);
					answerD.setText(posAnswerList[questionNumber-1][3]);
					answerA.setEnabled(true);
					answerB.setEnabled(true);
					answerC.setEnabled(true);
					answerD.setEnabled(true);
					answerA.setForeground(new Color(0,0,0));
					answerB.setForeground(new Color(0,0,0));
					answerC.setForeground(new Color(0,0,0));
					answerD.setForeground(new Color(0,0,0));
					
					choices.clearSelection();			
					
					lblPriceQuestion.setText("$"+price[questionNumber-1]+" "+"question");
					lblQuestion.setText(questionsList[questionNumber-1]+"?");
					pricesLeftAndRight[questionNumber-1].setBackground(new Color(245, 215, 66));
					pricesLeftAndRight[questionNumber-1].setOpaque(true);
					pricesLeftAndRight[questionNumber-2].setBackground(Color.decode("#3399FF"));
				}
				else {
					if (questionNumber<=2) {
						winnings=0;
					}
					else if (questionNumber<=4) {
						winnings=200;
					}
					else if (questionNumber<=6) {
						winnings=1000;
					}
					else if (questionNumber<=8) {
						winnings=25000;
					}
					WhoWantsToBeAMillionaireControl.page=3;
					WhoWantsToBeAMillionaireControl.main(null);
				}
			}
			else if (b.equals("50/50") && fiftyfiftyCounter>0) {
				fiftyfiftyKey[questionNumber-1].setEnabled(false);
				fiftyfiftyKey2[questionNumber-1].setEnabled(false);
				fiftyfiftyCounter-=1;
			}
			else if (b.equals("Phone A Friend") && phoneAFriendCounter>0) {
				phoneAFriendKey[questionNumber-1].setForeground(new Color(255,1,1));
				phoneAFriendCounter-=1;
			}
			else if (b.equals("Audience Vote") && audienceVoteCounter>0) {
				audienceVoteKey[questionNumber-1].setForeground(new Color(255,1,1));
				audienceVoteCounter-=1;
			}
			else if (b.equals("Walk")) {
				if (questionNumber==1) {
					winnings=0;
				}
				else {
					winnings=price[questionNumber-2];
				}
				WhoWantsToBeAMillionaireControl.page=3;
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
	
} // class
