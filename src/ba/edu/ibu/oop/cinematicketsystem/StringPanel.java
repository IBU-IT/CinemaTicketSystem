package ba.edu.ibu.oop.cinematicketsystem;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;


public class StringPanel extends JPanel {
	
	private JButton confirmButton;
	private JTextArea usernameArea;
	private SpringLayout currentLayout;
	
	public StringPanel() {
		
		setBackground(new Color(0, 153, 204));
		confirmButton = new JButton("OK");
		usernameArea = new JTextArea();
		currentLayout = new SpringLayout();
		
		
		setupPanel();
	}
	
	private void setupPanel(){
		
		this.setLayout(currentLayout);
		this.add(confirmButton);
		this.add(usernameArea);
		
	}
}
