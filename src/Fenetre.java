import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javafx.event.Event;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Fenetre extends JFrame implements KeyListener{
	
	int selector=0;
	Setting set=new Setting();
	
    JButton bout1=new JButton("GAME");
    JButton bout2=new JButton("Fast GAME");
    JButton bout3=new JButton("OPTION");
    JButton bout4=new JButton("EXIT");
    List<JButton> bout=Arrays.asList(bout1,bout2,bout3,bout4);
	
	public Fenetre() throws IOException{
		Jukebox juke=new Jukebox(-1);
		juke.start();
		this.setTitle("Unicorn ISLAND");
		this.setMinimumSize(new Dimension(1200,800));
		this.setSize(1200,800 );
		this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    this.setResizable(false);
	    GridLayout gl=new GridLayout(4,1,100,75);
	    mouseDeclaration();
	    bout4.addActionListener(new ActionListener(){
	    	  public void actionPerformed(ActionEvent event){
	    		  juke.stop();
	    		  exit();
	    	  }
	    });
	    
	    JPanel pan=new JPanel(gl);
	    pan.setSize(800, 550);
	    pan.setOpaque(false);
	    selector();
	    pan.add(bout1);
	    pan.add(bout2);
	    pan.add(bout3);
	    pan.add(bout4);
	    this.bout1.addKeyListener(this);
	    JPanel pan2=new JPanel();
	    JPanel pan3=new JPanel();
	    JLabel lab=new JLabel(new ImageIcon("lib/background/menu.gif"));
	    JLabel lab2=new JLabel(new ImageIcon("lib/background/unicorn-island.png"));
	    pan2.setSize(1200, 800);
	    pan3.setSize(800,400);
	    pan2.add(lab);
	    pan3.add(lab2);
	    pan.setLocation(200,210);
	    pan3.setLocation(200, 0);
	    pan3.setOpaque(false);
	    this.add(pan3);
	    this.add(pan);
	    this.add(pan2);
	    this.pack();
		this.setVisible(true);
	}
	
	public void selector(){
		if (selector==0){
			bout1.setForeground(Color.RED);
			bout2.setForeground(Color.BLACK);
		}else if(selector==1){
			bout1.setForeground(Color.BLACK);
			bout2.setForeground(Color.RED);
			bout3.setForeground(Color.BLACK);
		}else if(selector==2){
			bout2.setForeground(Color.BLACK);
			bout3.setForeground(Color.RED);
			bout4.setForeground(Color.BLACK);
		}else if(selector==3){
			bout3.setForeground(Color.BLACK);
			bout4.setForeground(Color.RED);
		}
	}
	
	public void exit(){
		this.dispose();
		System.exit(0);
	}

	@Override
	public void keyPressed(KeyEvent event) {
		int source=event.getKeyCode();
		if (source==set.J1_UP || source==set.J2_UP || source==set.J3_UP || source==set.J4_UP){
			if (selector>0){
				selector--;
			}
		}else if(source==set.J1_DOWN || source==set.J2_DOWN || source==set.J3_DOWN || source==set.J4_DOWN){
			if (selector<bout.size()-1){
				selector++;
			}
		}else if(source==set.J1_ACTION || source==set.J2_ACTION || source==set.J3_ACTION || source==set.J4_ACTION){
			if (bout.get(selector).getActionListeners().length!=0){
				bout.get(selector).getActionListeners()[0].actionPerformed(null);
			}
		}
		selector();
	}

	@Override
	public void keyReleased(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}
	
	public void mouseDeclaration(){
		for (int i=0;i<bout.size();i++){
			int ibis=i;
			bout.get(i).addMouseListener(new MouseListener(){

				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					selector=ibis;
					selector();
				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
			});
		}
	}
	
	
}