package eco.quester.custom_objects;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JCheckBox;

@SuppressWarnings("serial")
public class CCheckBox extends JCheckBox implements MouseListener {
	
	public CCheckBox(String text) {
		super(text);
		setForeground(Color.DARK_GRAY);
		setBackground(null);
		setBorderPainted(false);
		setFocusable(false);
		addMouseListener(this);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		setBackground(this.getBackground().darker());
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
