package eco.quester.listeners;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import eco.quester.tabs.PersonalStatisticsPane;

public class ButtonKeyListener implements KeyListener {
	
	private String actionCommand;

	public ButtonKeyListener(String action) {
		this.actionCommand = action;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER && this.actionCommand.equals("Find Player")) {
			PersonalStatisticsPane.searchPlayer.doClick();
			//Soo.... this doClick() method is new for me lol, I'm learning :D
		}
	}

}
