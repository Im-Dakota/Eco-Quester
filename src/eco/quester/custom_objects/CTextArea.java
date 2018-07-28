package eco.quester.custom_objects;
import java.awt.Color;

import javax.swing.JTextArea;

import eco.quester.settings.*;

@SuppressWarnings("serial")
public class CTextArea extends JTextArea {
	
	public CTextArea() {
		/*super(Utils.connectAndReadUrl(Settings.TXT_FILE_URL));	//Calls constructor for JTextArea TODO
		setBackground(Settings.BACKGROUND_COLOR);
		setForeground(Settings.PRIMARY_COLOR);
		setEditable(false);
		setLineWrap(true);
		setWrapStyleWord(true);*/
	}

	public CTextArea(String text) {
		super(text);
		setBackground(Settings.BACKGROUND_COLOR);
		setForeground(Settings.PRIMARY_COLOR);
		setEditable(false);
		setLineWrap(true);
		setWrapStyleWord(true);
	}
	
	public CTextArea(String text, Color white) {
		super(text);
		setBackground(Settings.BACKGROUND_COLOR);
		setForeground(white);
		setCaretColor(white);
		setEditable(false);
		setLineWrap(true);
		setWrapStyleWord(true);
	}

}
