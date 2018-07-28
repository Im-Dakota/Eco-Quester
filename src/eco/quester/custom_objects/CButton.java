package eco.quester.custom_objects;
import eco.quester.settings.*;
import eco.quester.utils.Utils;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class CButton extends JButton implements MouseListener {

	public CButton(String name){
		super(name);	//Calls constructor for JButton
		setForeground(Settings.BUTTON_DEFALT_COLOR);
		setBackground(Settings.PRIMARY_COLOR);
		setBorderPainted(false);
		setFocusable(false);
		addMouseListener(this);
	}
	public CButton(String name, Color background_color){
		super(name);
		setForeground(Settings.BUTTON_DEFALT_COLOR);
		setBackground(background_color);
		setBorderPainted(false);
		setFocusable(false);
		addMouseListener(this);
	}
	public CButton(String name, int fontsize){
		super(name);
		setForeground(Settings.BUTTON_DEFALT_COLOR);
		setBackground(Settings.PRIMARY_COLOR);
		setBorderPainted(false);
		setFocusable(false);
		Utils.setFont(this, "LemonMilk.otf", fontsize);
		addMouseListener(this);
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		setBackground(this.getBackground().darker());	//Creates the hover effect
	}

	@Override
	public void mouseExited(MouseEvent e) {
		setBackground(this.getBackground().brighter());
	}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	

}
