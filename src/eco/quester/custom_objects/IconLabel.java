package eco.quester.custom_objects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.LineMetrics;

import javax.swing.JLabel;

import eco.quester.settings.*;
import eco.quester.utils.Utils;

@SuppressWarnings("serial")
public class IconLabel extends JLabel implements MouseListener {
	/**
	 * This class is used to display those custom icons, such as the theme picker icon
	 * I will not comment this class, as it's really a final class. It does not need to be touched.
	 * This class also has the most constructors by far, for many uses throughout the program
	 */
	private int tracking;
	private String action, statusText;
	
	public IconLabel(String text, int fontSize) {
		super(text);
		this.tracking = 1;
		setForeground(Settings.PRIMARY_COLOR);
		this.setRightShadow(1, 1, Settings.ICON_SHADOW);
		Utils.setFont(this, "OpenSans-Light.ttf", fontSize);
	}
	
	public IconLabel(String text, int fontSize, String action) {
		super(text);
		this.tracking = 1;
		this.action = action;
		setForeground(Settings.PRIMARY_COLOR);
		addMouseListener(this);
		this.setRightShadow(1, 1, Settings.ICON_SHADOW);
		Utils.setFont(this, "OpenSans-Light.ttf", fontSize);
	}
	
	public IconLabel(String text, String action, int fontSize) {
		super(text);
		this.statusText = action;
		this.action = action;
		setForeground(Settings.PRIMARY_COLOR);
		addMouseListener(this);
		this.setRightShadow(1, 1, Settings.ICON_SHADOW);
		Utils.setFont(this, "FontAwesome.ttf", fontSize);
	}
	
	public IconLabel(String text, String action, int fontSize, Color color) {
		super(text);
		this.statusText = action;
		this.tracking = 1;
		this.action = action;
		setForeground(color);
		addMouseListener(this);
		this.setRightShadow(1, 1, Settings.ICON_SHADOW);
		Utils.setFont(this, "FontAwesome.ttf", fontSize);
	}
	
	public IconLabel(String text, String action, String font, int fontSize) {
		super(text);
		this.statusText = action;
		this.tracking = 1;
		this.action = action;
		setForeground(Settings.PRIMARY_COLOR);
		addMouseListener(this);
		this.setRightShadow(1, 1, Settings.ICON_SHADOW);
		Utils.setFont(this, font, fontSize);
	}
	
	private int left_x, left_y, right_x, right_y;
	private Color left_color, right_color;
	public void setLeftShadow(int x, int y, Color color) {
		left_x = x;
		left_y = y;
		left_color = color;
	}
	
	public void setRightShadow(int x, int y, Color color) {
		right_x = x;
		right_y = y;
		right_color = color;
	}
	
	public Dimension getPreferredSize() {
		String text = getText();
		FontMetrics fm = this.getFontMetrics(getFont());
		
		int w = fm.stringWidth(text);
		w += (text.length() - 1) * tracking;
		w += left_x + right_x;
		
		int h = fm.getHeight();
		h += left_y + right_y;
		
		return new Dimension(w, h);
	}
	
	public void paintComponent(Graphics g) {
		((Graphics2D)g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		
		char[] chars = getText().toCharArray();
		
		FontMetrics fm = this.getFontMetrics(getFont());
		int h = fm.getAscent();
		@SuppressWarnings("unused")
		LineMetrics lm = fm.getLineMetrics(getText(), g);
		g.setFont(getFont());
		
		int x = 0;
		
		for(int i = 0; i < chars.length; i++) {
			char ch = chars[i];
			int w = fm.charWidth(ch) + tracking;
			
			g.setColor(left_color);
			g.drawString("" + ch, x - left_x, h - left_y);
			
			g.setColor(right_color);
			g.drawString("" + ch, x + right_x, h + right_y);
			
			g.setColor(getForeground());
			g.drawString("" + ch, x, h);
			
			x += w;
		}
	}

	@Override
	public void setForeground(Color c) {
		super.setForeground(c);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {
		switch(this.action) {
		
		
		
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		setForeground(this.getForeground().darker());
	}

	@Override
	public void mouseExited(MouseEvent e) {
		setForeground(this.getForeground().brighter());
	}

}
