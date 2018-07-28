package eco.quester.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import eco.quester.settings.Settings;
import eco.quester.tabs.PersonalStatisticsPane;

public class ButtonActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		
		case "Find Player":
			JOptionPane.showMessageDialog(Settings.frame, "User: " + PersonalStatisticsPane.nameTextField.getText(), "Player Lookup", JOptionPane.INFORMATION_MESSAGE);
			break;
		
		}
	}

}
