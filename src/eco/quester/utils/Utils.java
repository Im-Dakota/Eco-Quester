package eco.quester.utils;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.net.URL;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.ImageIcon;

public class Utils {
	/**
	 * This class has a multitude of different methods that don't fit anywhere specific.
	 * Think of this class as a screwdriver class, it's used for many different functions throughout the program
	 */
	
	public static void setFont(Component c, String fontName, float size) {
		try {
			Font font = Font.createFont(0, Utils.class.getResource("/data/fonts/" + fontName).openStream());
			GraphicsEnvironment genv = GraphicsEnvironment.getLocalGraphicsEnvironment();
			genv.registerFont(font);
			font = font.deriveFont(size);
			c.setFont(font);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void openWebpage(String url) {
	    Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
	    if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
	        try {
	            desktop.browse(new URL(url).toURI());
	        } catch (Exception e) {
	        	e.printStackTrace();
	        }
	    }
	}
	
	public static ImageIcon getImage(String name) {
		return new ImageIcon(Utils.class.getResource("/data/img/" + name));
	}
	
}
