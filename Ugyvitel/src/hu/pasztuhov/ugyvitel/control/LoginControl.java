package hu.pasztuhov.ugyvitel.control;

import javax.swing.JLabel;

import hu.pasztuhov.ugyvitel.main.Control;
import hu.pasztuhov.ugyvitel.main.View;
import hu.pasztuhov.ugyvitel.view.LoginView;

public class LoginControl implements Control {
	private MainControl mainControl;
	private LoginView view;
	
	public LoginControl(MainControl mainControl) {
		this.mainControl = mainControl;
		this.view = new LoginView();
		mainControl.getView().setInnerView(view);
//		this.mainControl.getView().getPanel().add(new JLabel("Akármi."));
	}

}
