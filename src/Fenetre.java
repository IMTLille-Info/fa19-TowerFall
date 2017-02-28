import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	    GridLayout gl=new GridLayout(4,1,100,100);
	    
	    JButton bout1=new JButton("GAME");
	    JButton bout2=new JButton("Fast GAME");
	    JButton bout3=new JButton("OPTION");
	    JButton bout4=new JButton("EXIT");
	    bout4.addActionListener(new ActionListener(){
	    	  public void actionPerformed(ActionEvent event){
	    		  exit();
	    	  }
	    });
	    
	    JPanel pan=new JPanel(gl);
	    pan.setSize(800, 600);
	    pan.add(bout1);
	    pan.add(bout2);
	    pan.add(bout3);
	    pan.add(bout4);
	    JLabel lab=new JLabel(new ImageIcon("lib/background/menu.gif"));
	    JPanel pan2=new JPanel();
	    pan2.add(lab);
	    this.add(pan);
	    this.add(pan2);
	    this.pack();
	    this.repaint();
	    
		this.setVisible(true);
	}
	
	public void exit(){
		this.dispose();
	}
	
}