package eco.quester.custom_objects;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import eco.quester.settings.Settings;

@SuppressWarnings("serial")
public class CTextField extends JTextField implements MouseListener {
	
	public CTextField() {
		super();
		setBackground(Settings.BACKGROUND_COLOR);
		setCaretColor(Settings.PRIMARY_COLOR);
		setForeground(Color.WHITE.darker());
		setHorizontalAlignment(SwingConstants.CENTER);
		setBorder(BorderFactory.createLineBorder(new Color(60, 60, 60), 1));
		addMouseListener(this);
		LineBorder bord = (LineBorder) this.getBorder();
		BorderColorListener(this, bord.getLineColor(), bord.getThickness());
	}
	
	public CTextField(String text) {
		super(text);
		setBackground(Settings.BACKGROUND_COLOR);
		setCaretColor(Settings.PRIMARY_COLOR);
		setForeground(Color.LIGHT_GRAY);
		setHorizontalAlignment(SwingConstants.CENTER);
		setBorder(BorderFactory.createLineBorder(new Color(60, 60, 60), 1));
		addMouseListener(this);
		LineBorder bord = (LineBorder) this.getBorder();
		BorderColorListener(this, bord.getLineColor(), bord.getThickness());
	}
	
	public CTextField(String text, Border border) {
		super(text);
		setBackground(Settings.BACKGROUND_COLOR);
		setCaretColor(Settings.PRIMARY_COLOR);
		setForeground(Color.LIGHT_GRAY);
		setHorizontalAlignment(SwingConstants.CENTER);
		setBorder(border);
		addMouseListener(this);
		LineBorder bord = (LineBorder) this.getBorder();
		BorderColorListener(this, bord.getLineColor(), bord.getThickness());
	}
	
	public CTextField(String text, String shade, boolean bool) {
		super(text);
		if(shade.equals("light"))
			setBackground(Settings.BACKGROUND_COLOR.brighter());
		else if(shade.equals("dark"))
			setBackground(Settings.BACKGROUND_COLOR.darker());
		else
			setBackground(Settings.BACKGROUND_COLOR);
		
		setForeground(Color.WHITE);
		if(bool) {
			setCaretColor(Settings.PRIMARY_COLOR);
			setHorizontalAlignment(SwingConstants.CENTER);
		}
		setBorder(BorderFactory.createLineBorder(new Color(60, 60, 60), 1));
		addMouseListener(this);
		LineBorder bord = (LineBorder) this.getBorder();
		BorderColorListener(this, bord.getLineColor(), bord.getThickness());
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(super.getText().equals("Enter Text Here")) {
			super.setText(null);
			super.setForeground(Color.WHITE);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}
	
	private void BorderColorListener(CTextField field, Color borderColor, int borderSize) {
		field.addKeyListener(new KeyListener() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(field.getText().isEmpty())
					field.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
				else
					field.setBorder(BorderFactory.createLineBorder(borderColor, borderSize));
			}
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
		});
	}

}
