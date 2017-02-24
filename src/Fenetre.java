import javax.swing.JFrame;

import java.awt.GridLayout;

import javax.swing.JButton;


public class Fenetre extends JFrame{
	public Fenetre(){
		this.setTitle("Unicorn ISLAND");
		this.setSize(1200,800 );
		this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    
	    this.setLayout(new GridLayout(4, 1));
	    this.getContentPane().add(new JButton("GAME"));
	    this.getContentPane().add(new JButton("Fast GAME"));
	    this.getContentPane().add(new JButton("OPTION"));
	    this.getContentPane().add(new JButton("EXIT"));
	    
		this.setVisible(true);
	}
	
}