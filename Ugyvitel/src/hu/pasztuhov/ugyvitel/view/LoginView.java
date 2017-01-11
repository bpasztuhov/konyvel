package hu.pasztuhov.ugyvitel.view;

import java.awt.*;

import javax.swing.*;

import hu.pasztuhov.ugyvitel.main.Control;
import hu.pasztuhov.ugyvitel.main.View;

public class LoginView extends JPanel implements View {
	protected JLabel statusLabel;
	public LoginView() {
		statusLabel = new JLabel("Status-sor :)");
		setLayout(new BorderLayout());
		add(statusLabel, BorderLayout.NORTH);
		JPanel belul = new JPanel();
		belul.setLayout(new GridLayout(3,2));
		belul.add(new JLabel("Azonosító:"));
		JTextField account = new JTextField();
		belul.add(account);
		belul.add(new JLabel("Jelszó:"));
		JPasswordField password = new JPasswordField();
		belul.add(password);
		JButton reset = new JButton("Reset");
		belul.add(reset);
		JButton login = new JButton("Bejelentkezés");
		belul.add(login);
		add(belul,BorderLayout.CENTER);
	}

	@Override
	public void sendData(String key, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setControl(Control control) {
		// TODO Auto-generated method stub

	}

}
