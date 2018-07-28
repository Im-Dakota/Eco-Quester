package eco.quester.tabs;

import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import eco.quester.custom_frame.CustomFrame;
import eco.quester.settings.Settings;
import eco.quester.utils.Utils;

@SuppressWarnings("serial")
public class LeftListPanel extends JPanel {
	
	private JPanel personalStatsPanel;
	private JPanel questsByExpPanel;
	private JPanel questsByStatsPanel;
	
	public LeftListPanel() {
		setBackground(Settings.BACKGROUND_COLOR);
		setLayout(null);
		
		addPersonalStatsTab(0);
		addQuestsByExpRewardsTab(50);
		addQuestsByStatsTab(100);
	}

	private void addPersonalStatsTab(int y) {
		personalStatsPanel = new JPanel();
		personalStatsPanel.setBackground(Settings.BACKGROUND_COLOR.brighter());
		personalStatsPanel.setBounds(0, y, 140, 50);
		personalStatsPanel.setLayout(new GridBagLayout());
		personalStatsPanel.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
		personalStatsPanel.setName("personalStatsPanel");
		CustomMouseListener(personalStatsPanel);
		
		JLabel personalStatsText = new JLabel("<html><center>Personal<br>Statistics</center></html>");
		personalStatsText.setForeground(Settings.PRIMARY_COLOR);
		Utils.setFont(personalStatsText, "Neon.ttf", 16);
		personalStatsPanel.add(personalStatsText);
		
		add(personalStatsPanel);
	}

	private void addQuestsByExpRewardsTab(int y) {
		questsByExpPanel = new JPanel();
		questsByExpPanel.setBackground(Settings.BACKGROUND_COLOR);
		questsByExpPanel.setBounds(0, y, 140, 50);
		questsByExpPanel.setLayout(new GridBagLayout());
		questsByExpPanel.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
		questsByExpPanel.setName("questsByExpPanel");
		CustomMouseListener(questsByExpPanel);
		
		JLabel questsByExpText = new JLabel("<html><center>Quests by<br>Exp Rewards</center></html>");
		questsByExpText.setForeground(Settings.PRIMARY_COLOR);
		Utils.setFont(questsByExpText, "Neon.ttf", 16);
		questsByExpPanel.add(questsByExpText);
		
		add(questsByExpPanel);
	}
	
	private void addQuestsByStatsTab(int y) {
		questsByStatsPanel = new JPanel();
		questsByStatsPanel.setBackground(Settings.BACKGROUND_COLOR);
		questsByStatsPanel.setBounds(0, y, 140, 50);
		questsByStatsPanel.setLayout(new GridBagLayout());
		questsByStatsPanel.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
		questsByStatsPanel.setName("questsByStatsPanel");
		CustomMouseListener(questsByStatsPanel);
		
		JLabel questsByStatsText = new JLabel("<html><center>Quests by<br>Statistics</center></html>");
		questsByStatsText.setForeground(Settings.PRIMARY_COLOR);
		Utils.setFont(questsByStatsText, "Neon.ttf", 16);
		questsByStatsPanel.add(questsByStatsText);
		
		add(questsByStatsPanel);
	}
	
	private void CustomMouseListener(JPanel panel) {
		panel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent e) {
				personalStatsPanel.setBackground(Settings.BACKGROUND_COLOR);
				questsByExpPanel.setBackground(Settings.BACKGROUND_COLOR);
				questsByStatsPanel.setBackground(Settings.BACKGROUND_COLOR);
				panel.setBackground(Settings.BACKGROUND_COLOR.brighter());
				switch(panel.getName()) {
				case "personalStatsPanel":
					CustomFrame.personalStatisticsView.setVisible(true);
					CustomFrame.questsByExpRewardsView.setVisible(false);
					CustomFrame.questsByStatisticsView.setVisible(false);
					break;
				case "questsByExpPanel":
					CustomFrame.personalStatisticsView.setVisible(false);
					CustomFrame.questsByExpRewardsView.setVisible(true);
					CustomFrame.questsByStatisticsView.setVisible(false);
					break;
				case "questsByStatsPanel":
					CustomFrame.personalStatisticsView.setVisible(false);
					CustomFrame.questsByExpRewardsView.setVisible(false);
					CustomFrame.questsByStatisticsView.setVisible(true);
					break;
				}
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				if(!panel.getBackground().equals(Settings.BACKGROUND_COLOR.brighter()))
					panel.setBackground(Settings.BACKGROUND_COLOR.darker());
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if(panel.getBackground().equals(Settings.BACKGROUND_COLOR.darker()))
					panel.setBackground(Settings.BACKGROUND_COLOR);
			}
			
		});
	}

}