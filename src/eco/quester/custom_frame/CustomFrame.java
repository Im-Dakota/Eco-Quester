package eco.quester.custom_frame;
import eco.quester.custom_objects.*;
import eco.quester.listeners.ButtonActionListener;
import eco.quester.menus.Difficulty;
import eco.quester.menus.ExpRewards;
import eco.quester.menus.FreeSkills;
import eco.quester.menus.Length;
import eco.quester.menus.MemberSkills;
import eco.quester.settings.*;
import eco.quester.utils.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class CustomFrame extends JFrame {
	
	private static int posX, posY;
	
	private JPanel centerPanel;
	public static JPanel mainPanel;
	public static JLabel statusBar;
	public static CMenuBar menuBar;
	
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
		
		addJMenuBar();
		addStatusBar();

		//This is at the end so the frame can appear first, then add everything, then update itself
		//This is so people don't think the program hangs up
		revalidate();
		repaint();
		
	}

	private void addStatusBar() {
		statusBar = new JLabel("Ready");
		statusBar.setForeground(Settings.PRIMARY_COLOR);
		statusBar.setBorder(BorderFactory.createEtchedBorder(Settings.BACKGROUND_COLOR, Color.WHITE));
		
		centerPanel.add(statusBar, BorderLayout.SOUTH);
	}
	
	private void addJMenuBar() {
		menuBar = new CMenuBar();
		
//		FreeSkills.initFreeSkills(menuBar);
//		MemberSkills.initMemberSkills(menuBar);
		Difficulty.initQuestDifficulties(menuBar);
		Length.initQuestLength(menuBar);
		ExpRewards.initQuestRewards(menuBar);
		
		menuBar.add(Box.createHorizontalGlue());
		CButton applyFilter = new CButton("Apply Filter");
		applyFilter.addActionListener(new ButtonActionListener());
		menuBar.add(applyFilter);
		
		
		centerPanel.add(menuBar, BorderLayout.NORTH);
	}

	private void TitleBar() {
		CustomFrameTitleBar frameBar = new CustomFrameTitleBar();	//Creates a returns a custom title bar object
		add(frameBar);
		
		centerPanel = new JPanel();
		centerPanel.setBounds(0, 25, Settings.FRAME_WIDTH, Settings.FRAME_HEIGHT - 25);
		centerPanel.setBackground(Settings.BACKGROUND_COLOR);
		centerPanel.setLayout(new BorderLayout());
		add(centerPanel);
		
		mainPanel = new JPanel();
		mainPanel.setLayout(null); //Might change
		mainPanel.setBackground(Settings.BACKGROUND_COLOR);
		centerPanel.add(mainPanel, BorderLayout.CENTER);
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
