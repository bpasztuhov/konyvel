package hu.pasztuhov.ugyvitel.view;

import javax.swing.JMenuItem;

public class AcMenuItem extends JMenuItem {
	public AcMenuItem(String text, boolean enable) {
		super(text);
		setEnabled(enable);
	}

}
