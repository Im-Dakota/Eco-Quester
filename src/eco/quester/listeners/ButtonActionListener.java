package eco.quester.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import eco.quester.custom_frame.CustomFrame;
import eco.quester.settings.Settings;

public class ButtonActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		
		case "Apply Filter":
			CustomFrame.statusBar.setText("Applying Filter...");
			break;
		
		}
	}

}
