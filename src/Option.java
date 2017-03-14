import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Option extends JPanel implements KeyListener{

	boolean opt=false;
	
	public Option() {
		Font f = null;
		try
		{
		     File fis = new File("lib/jupiterc.ttf");
		     f = Font.createFont(Font.TRUETYPE_FONT, fis);
		     f = f.deriveFont((float)28.0);
		}
		catch (Exception e) {} 
		this.setLayout(null);
	    GridLayout gl=new GridLayout(6,1,0,0);
	    JPanel pan1=new JPanel(gl);
	    JPanel pan2=new JPanel(gl);
	    JPanel pan3=new JPanel(gl);
	    JPanel pan4=new JPanel(gl);
	    JPanel panFinal=new JPanel();
	    panFinal.setOpaque(false);
	    JPanel panFont=new JPanel();
	    JLabel lab=new JLabel(new ImageIcon("lib/background/menu.gif"));
	    panFont.setSize(1200, 800);
	    panFont.add(lab);
	    List<JLabel> P1=Arrays.asList(new JLabel("P1"),new JLabel("Jump : "+KeyEvent.getKeyText(Setting.J1_UP)),new JLabel("Down : "+KeyEvent.getKeyText(Setting.J1_DOWN)),new JLabel("Left : "+KeyEvent.getKeyText(Setting.J1_LEFT)),new JLabel("Right : "+KeyEvent.getKeyText(Setting.J1_RIGHT)),new JLabel("Action : "+KeyEvent.getKeyText(Setting.J1_ACTION)));
	    List<JLabel> P2=Arrays.asList(new JLabel("P2"),new JLabel("Jump : "+KeyEvent.getKeyText(Setting.J2_UP)),new JLabel("Down : "+KeyEvent.getKeyText(Setting.J2_DOWN)),new JLabel("Left : "+KeyEvent.getKeyText(Setting.J2_LEFT)),new JLabel("Right : "+KeyEvent.getKeyText(Setting.J2_RIGHT)),new JLabel("Action : "+KeyEvent.getKeyText(Setting.J2_ACTION)));
	    List<JLabel> P3=Arrays.asList(new JLabel("P3"),new JLabel("Jump : "+KeyEvent.getKeyText(Setting.J3_UP)),new JLabel("Down : "+KeyEvent.getKeyText(Setting.J3_DOWN)),new JLabel("Left : "+KeyEvent.getKeyText(Setting.J3_LEFT)),new JLabel("Right : "+KeyEvent.getKeyText(Setting.J3_RIGHT)),new JLabel("Action : "+KeyEvent.getKeyText(Setting.J3_ACTION)));
	    List<JLabel> P4=Arrays.asList(new JLabel("P4"),new JLabel("Jump : "+KeyEvent.getKeyText(Setting.J4_UP)),new JLabel("Down : "+KeyEvent.getKeyText(Setting.J4_DOWN)),new JLabel("Left : "+KeyEvent.getKeyText(Setting.J4_LEFT)),new JLabel("Right : "+KeyEvent.getKeyText(Setting.J4_RIGHT)),new JLabel("Action : "+KeyEvent.getKeyText(Setting.J4_ACTION)));
	    for (int i=1;i<P1.size();i++){
	    	P1.get(i).setHorizontalAlignment(SwingConstants.CENTER);
	    	P1.get(i).setFont(f);
	    	P2.get(i).setHorizontalAlignment(SwingConstants.CENTER);
	    	P2.get(i).setFont(f);
	    	P3.get(i).setHorizontalAlignment(SwingConstants.CENTER);
	    	P3.get(i).setFont(f);
	    	P4.get(i).setHorizontalAlignment(SwingConstants.CENTER);
	    	P4.get(i).setFont(f);
	    }
	    JPanel labelP1 = new JPanel();	    
	    JPanel labelP2 = new JPanel();
	    JPanel labelP3 = new JPanel();
	    JPanel labelP4 = new JPanel();
	    labelP1.setBackground(Color.BLACK);
	    labelP2.setBackground(Color.BLACK);
	    labelP3.setBackground(Color.BLACK);
	    labelP4.setBackground(Color.BLACK);
	    labelP1.add(P1.get(0));
	    labelP2.add(P2.get(0));
	    labelP3.add(P3.get(0));
	    labelP4.add(P4.get(0));
	    pan1.add(labelP1);
	    pan1.setSize(1200, 160);
	    pan1.setOpaque(false);
	    pan2.add(labelP2);
	    pan2.setSize(1200, 160);
	    pan2.setOpaque(false);
	    pan3.add(labelP3);
	    pan3.setSize(1200, 160);
	    pan3.setOpaque(false);
	    pan4.add(labelP4);
	    pan4.setSize(1200, 160);
	    pan4.setOpaque(false);
	    for (int i=1;i<P1.size();i++){
	    	pan1.add(P1.get(i));
	    	pan2.add(P2.get(i));
	    	pan3.add(P3.get(i));
	    	pan4.add(P4.get(i));
	    }
	    pan2.setLocation(0, 170);
	    pan3.setLocation(0, 340);
	    pan4.setLocation(0, 510);
	    P1.get(0).setForeground(Color.RED);
	    P2.get(0).setForeground(Color.RED);
	    P3.get(0).setForeground(Color.RED);
	    P4.get(0).setForeground(Color.RED);
	    this.add(pan1);
	    this.add(pan2);
	    this.add(pan3);
	    this.add(pan4);
	    JButton butt=new JButton("Back");
	    butt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
					hide();
					opt=true;
			}
	    });
	    butt.setSize(300, 50);
	    butt.setLocation(450, 680);
	    this.add(butt);
	    this.add(panFont);
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
