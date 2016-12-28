package ba.edu.ibu.oop.cinematicketsystem;

import javax.swing.JFrame;


public class StringFrame extends JFrame {
	
	private StringPanel currentPanel;
	
	public StringFrame(){
		
		currentPanel = new StringPanel();
		setupFrame();
	}
	
	private void setupFrame(){
		
		this.setContentPane(currentPanel);
	}
	

}
