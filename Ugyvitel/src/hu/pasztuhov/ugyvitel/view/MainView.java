package hu.pasztuhov.ugyvitel.view;

import java.awt.*;
import javax.swing.*;
import hu.pasztuhov.ugyvitel.control.MainControl;
import hu.pasztuhov.ugyvitel.main.*;

public class MainView extends JFrame implements View {
	private UgyvitelMain main;
	private Control control;
	private JPanel panel;
	
	public MainView(UgyvitelMain main) {
		super("Számlázó és könyvelő program");
		this.main = main;
		setLookAndFeel();
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		JMenuItem ujSzamlaMenu = new JMenuItem("Új Számla");
		JMenuItem listSzamlaMenu = new JMenuItem("Számlák listája");
		JMenu szamlazas = new JMenu("Számlázás");
		szamlazas.add(ujSzamlaMenu);
		szamlazas.add(listSzamlaMenu);
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(szamlazas);
		add(menuBar, BorderLayout.NORTH);
		JMenuItem ujFelhasznaloMenu = new JMenuItem("Új felhasználó");
		JMenuItem modositFelhasznaloMenu = new JMenuItem("Felhasználó módosítása");
		JMenuItem delFelhasznaloMenu = new JMenuItem("Felhasználó törlése");
		JMenuItem listFelhasznaloMenu = new JMenuItem("Felhasználók listázása");
		JMenu felhasznaloMenu = new JMenu("Felhasználók kezelése");
		felhasznaloMenu.add(listFelhasznaloMenu);
		felhasznaloMenu.add(ujFelhasznaloMenu);
		felhasznaloMenu.add(modositFelhasznaloMenu);
		felhasznaloMenu.add(delFelhasznaloMenu);
		JMenu adminMenu = new JMenu("Rendszergazda");
		JMenuItem ujCegMenu = new JMenuItem("Új cég felvitele");
		JMenuItem listCegMenu = new JMenuItem("Cégek listázása");
		JMenuItem modositCegMenu = new JMenuItem("Cég módosítása");
		AcMenuItem delCegMenu = new AcMenuItem("Cég törlése", main.getRights().hasRight("del_cég"));
		JMenu cegMenu = new JMenu("Cégek kezelése");
		cegMenu.add(ujCegMenu);
		cegMenu.add(listCegMenu);
		cegMenu.add(modositCegMenu);
		cegMenu.add(delCegMenu);
		adminMenu.add(felhasznaloMenu);
		adminMenu.add(cegMenu);
		menuBar.add(adminMenu);
		panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		setVisible(true);
	}

	@Override
	public void sendData(String key, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setControl(Control control) {
		this.control = control;
	}
	
	public JPanel getPanel() {
		return this.panel;
	}
	
	public void setInnerView(JPanel view) {
		panel.add(view);
		this.getContentPane().validate();
		this.getContentPane().repaint();
	}
	
	private void setLookAndFeel(){
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e) {
			// Do nothing. :)
		}
	}

}
