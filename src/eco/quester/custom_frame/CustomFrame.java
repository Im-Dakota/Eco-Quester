package eco.quester.custom_frame;
import eco.quester.custom_objects.*;
import eco.quester.settings.*;
import eco.quester.tabs.LeftListPanel;
import eco.quester.tabs.QuestsByExpRewardsPane;
import eco.quester.tabs.QuestsByStatisticsPane;
import eco.quester.utils.*;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class CustomFrame extends JFrame {
	
	public static JPanel loginPanel;
	private static int posX, posY;
	
	public static JPanel personalStatisticsView;
	public static JPanel questsByExpRewardsView;
	public static JPanel questsByStatisticsView;
	
	public CustomFrame() {
		
		getContentPane().setBackground(Settings.BACKGROUND_COLOR);
		setUndecorated(true);
		setTitle(Settings.FRAME_TITLE);
		setSize(Settings.FRAME_WIDTH, Settings.FRAME_HEIGHT);
		setVisible(true);
		TitleBar();
		MouseListener();
		setIconImage(Utils.getImage("iconB.png").getImage());
		setLayout(null);
		setAlwaysOnTop(true);
		setLocation(10, 50);
		getRootPane().setBorder(new LineBorder(Color.BLACK));
		getContentPane().setBackground(Settings.BACKGROUND_COLOR);	//Up to here is some standards on the frame
		
		addLeftListSelectionOptions();
		initSelectedOptionPanels();

		//This is at the end so the frame can appear first, then add everything, then update itself
		//This is so people don't think the program hangs up
		revalidate();
		repaint();
		
	}

	private void TitleBar() {
		CustomFrameTitleBar frameBar = new CustomFrameTitleBar();	//Creates a returns a custom title bar object
		add(frameBar);
	}
	
	private void initSelectedOptionPanels() {		
		questsByExpRewardsView = new QuestsByExpRewardsPane();
//		questsByExpRewardsView.setBackground(Color.RED);
		questsByExpRewardsView.setBounds(140, 25, Settings.FRAME_WIDTH - 140, Settings.FRAME_HEIGHT - 25);
		questsByExpRewardsView.setVisible(false);
		add(questsByExpRewardsView);
		
		questsByStatisticsView = new QuestsByStatisticsPane();
//		questsByStatisticsView.setBackground(Color.MAGENTA);
		questsByStatisticsView.setBounds(140, 25, Settings.FRAME_WIDTH - 140, Settings.FRAME_HEIGHT - 25);
		questsByStatisticsView.setVisible(false);
		add(questsByStatisticsView);
	}
	
	private void addLeftListSelectionOptions() {
		JPanel leftListPanel = new LeftListPanel();
		leftListPanel.setBounds(0, 25, 140, Settings.FRAME_HEIGHT - 25);
		
		add(leftListPanel);
	}

	
	private void MouseListener() {	//Here down allows the custom frame to be moved like a normal frame
		addMouseListener(new MouseAdapter() {
	        public void mousePressed(MouseEvent e) {
	        	posX = e.getX();
	            posY = e.getY();
	        }
	    });
		
		addMouseMotionListener(new MouseMotionAdapter() {
	        @Override
	        public void mouseDragged(MouseEvent e) {
	        	if (posX >= 0 && posX <= Settings.FRAME_WIDTH && posY >= 0 && posY <= 25) {
	        		Rectangle rectangle = Settings.frame.getBounds();
		        	Settings.frame.setBounds(e.getXOnScreen() - posX, e.getYOnScreen() - posY, rectangle.width, rectangle.height);
	        	}
	        }
	    });
	}

}
