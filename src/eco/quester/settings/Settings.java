package eco.quester.settings;
import eco.quester.custom_frame.*;
import eco.quester.utils.*;

import java.awt.Color;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Settings {
	/**
	 * Everything is left as follows:
	 * public, so every class can access this data
	 * static, so there does not need to be an object declared for this class
	 * final, so that the other classes know this data is not going to change
	 */
	
	public static final int FRAME_WIDTH = 610;
	public static final int FRAME_HEIGHT = 350;
	public static final Color BORDER_COLOR = new Color(0, 0, 0);
	public static final Color BACKGROUND_COLOR = new Color(30, 30, 30);
	public static final Color ICON_SHADOW = new Color(0, 0, 0);
	public static Color PRIMARY_COLOR = new Color(66, 134, 244);
	public static final Color BUTTON_DEFALT_COLOR = new Color(255, 255, 255);
	public static final String FRAME_TITLE = "Eco Quester";
	
	public static String playerDisplayName;
	
//	public static Audio audio = new Audio("/data/audio/Autumn_Voyage.mid");	//No longer used
																			//DN 28JUL2018
	
	public static CustomFrame frame;	//Creates a custom frame object
	public static void main(String[] args) {
		
		
		try {	//This line is especially important on mac because it allows it to look like the windows version
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
<<<<<<< HEAD
		//TODO 			THIS IS ONLY TEMP CODE - A REMINDER
		Settings.playerDisplayName = "Code Not Complete#";
=======
		
		if(playAudio)
			Settings.audio.playAudio();
>>>>>>> master
		frame = new CustomFrame();
		
	}

}
