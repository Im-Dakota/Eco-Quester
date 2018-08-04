package eco.quester.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

<<<<<<< HEAD
import javax.swing.JOptionPane;

import eco.quester.settings.Settings;
=======
import eco.quester.custom_frame.CustomFrame;
>>>>>>> master

public class ButtonActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		
<<<<<<< HEAD
		
=======
		case "Apply Filter":
			CustomFrame.statusBar.setText("Applying Filter...");
			Filters.applyDifficultyFilter();
			break;
>>>>>>> master
		
		}
	}

}
