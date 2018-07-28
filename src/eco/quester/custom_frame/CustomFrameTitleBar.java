package eco.quester.custom_frame;
import eco.quester.custom_objects.CButton;
import eco.quester.settings.Settings;
import eco.quester.utils.*;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class CustomFrameTitleBar extends JPanel {
	
	public static CButton exit, mini;
	public static JLabel title;
	
	public CustomFrameTitleBar(){	//This class constructs a custom title bar as a jpanel and returns it
		
		setLayout(null);
		
		setBounds(0, 0, Settings.FRAME_WIDTH, 25);
		setBackground(new Color(60, 60, 60));
		
		exit = new CButton("X");
		exit.setBackground(Settings.PRIMARY_COLOR);
		exit.setBounds(Settings.FRAME_WIDTH - 50, 0, 50, 25);
		exit.setBorderPainted(false);
		add(exit);
		exit.addActionListener(e -> {
			System.exit(0);
		});
		
		mini = new CButton("_");
		mini.setBackground(Settings.BACKGROUND_COLOR);
		mini.setBounds(Settings.FRAME_WIDTH - 100, 0, 50, 25);
		add(mini);
		mini.addActionListener(e -> {
			Settings.frame.setState(JFrame.ICONIFIED);
		});
		
		title = new JLabel(Settings.FRAME_TITLE);
		title.setForeground(Color.WHITE);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		Utils.setFont(title, "OpenSans-Regular.ttf", 18);
		title.setBounds(0, 0, Settings.FRAME_WIDTH, 25);
		add(title);
		
		JLabel icon = new JLabel(Utils.getImage("iconS.png"));
		icon.setBounds(3, -2, 24, 28);
		add(icon);
		
	}

}
