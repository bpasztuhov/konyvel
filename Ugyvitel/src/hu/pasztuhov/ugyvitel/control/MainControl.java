package hu.pasztuhov.ugyvitel.control;

import javax.swing.JLabel;

import hu.pasztuhov.ugyvitel.main.*;
import hu.pasztuhov.ugyvitel.model.*;
import hu.pasztuhov.ugyvitel.view.*;

public class MainControl implements Control {
	private UgyvitelMain main;
	private MainView view;
	
	public MainControl(UgyvitelMain main) {
		this.main = main;
		this.view = new MainView(this.main);
		run();
	}
	
	private void run() {
		LoginControl loginControl = new LoginControl(this);
	}
	public MainView getView() {
		return this.view;
	}
}
