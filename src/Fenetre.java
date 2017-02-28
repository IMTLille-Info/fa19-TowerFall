import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Fenetre extends JFrame{
	public Fenetre() throws IOException{
		this.setTitle("Unicorn ISLAND");
		this.setSize(1200,800 );
		this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    this.setResizable(false);
	    this.setLayout();
	    GridLayout gl=new GridLayout(4,1,100,100);
	    
	    JPanel pan=new JPanel(gl);
	    pan.setSize(800, 600);
	    pan.add(new JButton("GAME"));
	    pan.add(new JButton("Fast GAME"));
	    pan.add(new JButton("OPTION"));
	    pan.add(new JButton("EXIT"));
	    JLabel lab=new JLabel(new ImageIcon("lib/background/menu.gif"));
	    JPanel pan2=new JPanel();
	    pan2.add(lab);
	    this.add(pan2);
	    this.add(pan);
	    this.pack();
	    
		this.setVisible(true);
	}
	
}