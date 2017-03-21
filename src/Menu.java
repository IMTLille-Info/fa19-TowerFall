import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

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


public class Menu extends JPanel implements KeyListener{
	
	int selector=0;
	boolean opt=false;
    JButton bout1=new JButton("GAME");
    JButton bout2=new JButton("Fast GAME");
    JButton bout3=new JButton("OPTION");
    JButton bout4=new JButton("EXIT");
    List<JButton> bout=Arrays.asList(bout1,bout2,bout3,bout4);
	
	public Menu() throws IOException{
		this.setLayout(null);
		Jukebox juke=new Jukebox(-1);
		juke.start();
	    GridLayout gl=new GridLayout(4,1,100,75);
	    mouseDeclaration();
	    bout3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
					opt=true;
			}
	    });
	    bout4.addActionListener(new ActionListener(){
	    	  public void actionPerformed(ActionEvent event){
	    		  juke.stop();
	    		  exit();
	    	  }
	    });
	    
	    JPanel pan=new JPanel(gl);
	    pan.setSize(800, 550);
	    pan.setMaximumSize(new Dimension(800,550));
	    pan.setOpaque(false);
	    selector();
	    pan.add(bout1);
	    pan.add(bout2);
	    pan.add(bout3);
	    pan.add(bout4);
	    this.bout1.addKeyListener(this);
	    this.bout2.addKeyListener(this);
	    this.bout3.addKeyListener(this);
	    this.bout4.addKeyListener(this);
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
	}
	
	public void selector(){
		bout1.setForeground(Color.BLACK);
		bout2.setForeground(Color.BLACK);
		bout3.setForeground(Color.BLACK);
		bout4.setForeground(Color.BLACK);
		if (selector==0){
			bout1.setForeground(Color.RED);
		}else if(selector==1){
			bout2.setForeground(Color.RED);
		}else if(selector==2){
			bout3.setForeground(Color.RED);
		}else if(selector==3){
			bout4.setForeground(Color.RED);
		}
	}
	
	public void exit(){
		System.exit(0);
	}

	@Override
	public void keyPressed(KeyEvent event) {
		int source=event.getKeyCode();
		if (source==Setting.J1_UP || source==Setting.J2_UP || source==Setting.J3_UP || source==Setting.J4_UP){
			if (selector>0){
				selector--;
			}
		}else if(source==Setting.J1_DOWN || source==Setting.J2_DOWN || source==Setting.J3_DOWN || source==Setting.J4_DOWN){
			if (selector<bout.size()-1){
				selector++;
			}
		}else if(source==Setting.J1_ACTION || source==Setting.J2_ACTION || source==Setting.J3_ACTION || source==Setting.J4_ACTION){
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