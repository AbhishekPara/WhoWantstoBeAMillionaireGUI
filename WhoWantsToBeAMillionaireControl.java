package WhoWantsToBeAMillionaire;
/*
 *   RUN PROGRAM FROM HERE
 */
public class WhoWantsToBeAMillionaireControl {
	static int page=1;
	public static void main(String[] args) {
		
		if (page==1) {
			WhoWantsToBeAMillionaireIntro.main(null);
		}
		else if (page==2) {
			WhoWantsToBeAMillionaireIntro.frameMain.setVisible(false);
			WhoWantsToBeAMillionaireMain.main(null);
		}
		else if(page==3) {
			WhoWantsToBeAMillionaireMain.frameMain.setVisible(false);
			WhoWantsToBeAMillionaireOver.main(null);
		}
		else if (page==4) {
			WhoWantsToBeAMillionaireOver.frameMain.setVisible(false);
			WhoWantsToBeAMillionaireMain.questionNumber=1;
			WhoWantsToBeAMillionaireMain.fiftyfiftyCounter=2;
			WhoWantsToBeAMillionaireMain.phoneAFriendCounter=1;
			WhoWantsToBeAMillionaireMain.audienceVoteCounter=1;
			WhoWantsToBeAMillionaireMain.main(null);
		}
		else if(page==5) {
			System.exit(0);
		}
	}

}
