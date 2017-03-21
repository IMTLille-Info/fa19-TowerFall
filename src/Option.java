import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Option extends JPanel implements KeyListener{

	boolean opt=false;
	boolean binding=false;
    List<JButton> P1=null;
    List<JButton> P2=null;
    List<JButton> P3=null;
    List<JButton> P4=null;
	int selector1=4;
	int selector2=0;
    JButton butt=null;
	Integer keyTemp;
	int iSave=0;
	int pSave=0;
	
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
	    P1=Arrays.asList(new JButton("P1"),new JButton("Jump : "+KeyEvent.getKeyText(Setting.J1_UP)),new JButton("Down : "+KeyEvent.getKeyText(Setting.J1_DOWN)),new JButton("Left : "+KeyEvent.getKeyText(Setting.J1_LEFT)),new JButton("Right : "+KeyEvent.getKeyText(Setting.J1_RIGHT)),new JButton("Action : "+KeyEvent.getKeyText(Setting.J1_ACTION)));
	    P2=Arrays.asList(new JButton("P2"),new JButton("Jump : "+KeyEvent.getKeyText(Setting.J2_UP)),new JButton("Down : "+KeyEvent.getKeyText(Setting.J2_DOWN)),new JButton("Left : "+KeyEvent.getKeyText(Setting.J2_LEFT)),new JButton("Right : "+KeyEvent.getKeyText(Setting.J2_RIGHT)),new JButton("Action : "+KeyEvent.getKeyText(Setting.J2_ACTION)));
	    P3=Arrays.asList(new JButton("P3"),new JButton("Jump : "+KeyEvent.getKeyText(Setting.J3_UP)),new JButton("Down : "+KeyEvent.getKeyText(Setting.J3_DOWN)),new JButton("Left : "+KeyEvent.getKeyText(Setting.J3_LEFT)),new JButton("Right : "+KeyEvent.getKeyText(Setting.J3_RIGHT)),new JButton("Action : "+KeyEvent.getKeyText(Setting.J3_ACTION)));
	    P4=Arrays.asList(new JButton("P4"),new JButton("Jump : "+KeyEvent.getKeyText(Setting.J4_UP)),new JButton("Down : "+KeyEvent.getKeyText(Setting.J4_DOWN)),new JButton("Left : "+KeyEvent.getKeyText(Setting.J4_LEFT)),new JButton("Right : "+KeyEvent.getKeyText(Setting.J4_RIGHT)),new JButton("Action : "+KeyEvent.getKeyText(Setting.J4_ACTION)));
	    butt=new JButton("Back");
	    mouseDeclaration();
	    for (int i=0;i<P1.size();i++){
	    	int ibis=i;
	    	if (i!=0){
	    		P1.get(i).setHorizontalAlignment(SwingConstants.CENTER);
	    		P2.get(i).setHorizontalAlignment(SwingConstants.CENTER);
	    		P3.get(i).setHorizontalAlignment(SwingConstants.CENTER);
	    		P4.get(i).setHorizontalAlignment(SwingConstants.CENTER);
	    		P1.get(i).setFont(f);
	    		P2.get(i).setFont(f);
	    		P3.get(i).setFont(f);
	    		P4.get(i).setFont(f);
		    P1.get(i).addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event) {
					P1.get(ibis).setText("? ? ?");
					iSave=ibis;
					pSave=1;
					setMyBind(ibis,1);
				}
		    });
		    P2.get(i).addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event) {
					P2.get(ibis).setText("? ? ?");
					iSave=ibis;
					pSave=2;
					setMyBind(ibis,2);
				}
		    });
		    P3.get(i).addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event) {
					P3.get(ibis).setText("? ? ?");
					iSave=ibis;
					pSave=3;
					setMyBind(ibis,3);
				}
		    });
		    P4.get(i).addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event) {
					P4.get(ibis).setText("? ? ?");
					iSave=ibis;
					pSave=4;
					setMyBind(ibis,4);
				}
		    });
	    	}
	    	P1.get(i).setBorderPainted(false);
	    	P1.get(i).setContentAreaFilled(false);
	    	P2.get(i).setBorderPainted(false);
	    	P2.get(i).setContentAreaFilled(false);
	    	P3.get(i).setBorderPainted(false);
	    	P3.get(i).setContentAreaFilled(false);
	    	P4.get(i).setBorderPainted(false);
	    	P4.get(i).setContentAreaFilled(false);
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
		    P1.get(i).addKeyListener(this);
		    P2.get(i).addKeyListener(this);
		    P3.get(i).addKeyListener(this);
		    P4.get(i).addKeyListener(this);
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
	    butt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
					opt=true;
			}
	    });
	    butt.setSize(300, 50);
	    butt.setLocation(450, 680);
	    selector();
	    this.butt.addKeyListener(this);
	    this.add(butt);
	    this.add(panFont);
	  //  if (binding==true){
	  //  	setMyBind(iSave,pSave);
	  //  }
	}
	
	public void selector(){
		for (int i=1;i<P1.size();i++){
			P1.get(i).setForeground(Color.BLACK);
			P2.get(i).setForeground(Color.BLACK);
			P3.get(i).setForeground(Color.BLACK);
			P4.get(i).setForeground(Color.BLACK);
		}
		butt.setForeground(Color.BLACK);
		if (selector1==0){
			P1.get(selector2).setForeground(Color.RED);
		}else if(selector1==1){
			P2.get(selector2).setForeground(Color.RED);
		}else if(selector1==2){
			P3.get(selector2).setForeground(Color.RED);
		}else if(selector1==3){
			P4.get(selector2).setForeground(Color.RED);
		}else if(selector1==4){
			butt.setForeground(Color.RED);
		}
	}
	
	public void setMyBind(int bind,int player){
		if (keyTemp!=null && binding==true && keyTemp!=Setting.J1_ACTION && keyTemp!=Setting.J2_ACTION && keyTemp!=Setting.J3_ACTION && keyTemp!=Setting.J4_ACTION){
		switch (player){
		case 1:
			switch (bind){
			case 1:
				Setting.J1_UP=keyTemp;
				P1.get(1).setText("Jump : "+KeyEvent.getKeyText(Setting.J1_UP));
			break;
			case 2:
				Setting.J1_DOWN=keyTemp;
				P1.get(2).setText("Down : "+KeyEvent.getKeyText(Setting.J1_DOWN));
			break;
			case 3:
				Setting.J1_LEFT=keyTemp;
				P1.get(3).setText("Left : "+KeyEvent.getKeyText(Setting.J1_LEFT));
			break;
			case 4:
				Setting.J1_RIGHT=keyTemp;
				P1.get(4).setText("Right : "+KeyEvent.getKeyText(Setting.J1_RIGHT));
			break;
			case 5:
				Setting.J1_ACTION=keyTemp;
				P1.get(5).setText("Action : "+KeyEvent.getKeyText(Setting.J1_ACTION));
			break;
			}
		break;
		case 2:
			switch (bind){
			case 1:
				Setting.J2_UP=keyTemp;
				P2.get(1).setText("Jump : "+KeyEvent.getKeyText(Setting.J2_UP));
			break;
			case 2:
				Setting.J2_DOWN=keyTemp;
				P2.get(2).setText("Down : "+KeyEvent.getKeyText(Setting.J2_DOWN));
			break;
			case 3:
				Setting.J2_LEFT=keyTemp;
				P2.get(3).setText("Left : "+KeyEvent.getKeyText(Setting.J2_LEFT));
			break;
			case 4:
				Setting.J2_RIGHT=keyTemp;
				P2.get(4).setText("Right : "+KeyEvent.getKeyText(Setting.J2_RIGHT));
			break;
			case 5:
				Setting.J2_ACTION=keyTemp;
				P2.get(5).setText("Action : "+KeyEvent.getKeyText(Setting.J2_ACTION));
			break;
			}
		break;
		case 3:
			switch (bind){
			case 1:
				Setting.J3_UP=keyTemp;
				P3.get(1).setText("Jump : "+KeyEvent.getKeyText(Setting.J3_UP));
			break;
			case 2:
				Setting.J3_DOWN=keyTemp;
				P3.get(2).setText("Down : "+KeyEvent.getKeyText(Setting.J3_DOWN));
			break;
			case 3:
				Setting.J3_LEFT=keyTemp;
				P3.get(3).setText("Left : "+KeyEvent.getKeyText(Setting.J3_LEFT));
			break;
			case 4:
				Setting.J3_RIGHT=keyTemp;
				P3.get(4).setText("Right : "+KeyEvent.getKeyText(Setting.J3_RIGHT));
			break;
			case 5:
				Setting.J3_ACTION=keyTemp;
				P3.get(5).setText("Action : "+KeyEvent.getKeyText(Setting.J3_ACTION));
			break;
			}
		break;
		case 4:
			switch (bind){
			case 1:
				Setting.J4_UP=keyTemp;
				P4.get(1).setText("Jump : "+KeyEvent.getKeyText(Setting.J4_UP));
			break;
			case 2:
				Setting.J4_DOWN=keyTemp;
				P4.get(2).setText("Down : "+KeyEvent.getKeyText(Setting.J4_DOWN));
			break;
			case 3:
				Setting.J4_LEFT=keyTemp;
				P4.get(3).setText("Left : "+KeyEvent.getKeyText(Setting.J4_LEFT));
			break;
			case 4:
				Setting.J4_RIGHT=keyTemp;
				P4.get(4).setText("Right : "+KeyEvent.getKeyText(Setting.J4_RIGHT));
			break;
			case 5:
				Setting.J4_ACTION=keyTemp;
				P4.get(5).setText("Action : "+KeyEvent.getKeyText(Setting.J4_ACTION));
			break;
			}
		break;
		}
		keyTemp=null;
		binding=false;
		}else{
			binding=true;
		}
	}
	
	@Override
	public void keyPressed(KeyEvent event) {
		if (binding==true){
			keyTemp=event.getKeyCode();
			setMyBind(iSave, pSave);
		}else{
		int source=event.getKeyCode();
		if (source==Setting.J1_UP || source==Setting.J2_UP || source==Setting.J3_UP || source==Setting.J4_UP){
			if (selector1==4){
				selector2=P1.size()-1;
				selector1--;
			}else{
				if (selector2>0){
					selector2--;
				}
				if (selector2==0){
					if (selector1>0){
						selector1--;
						selector2=P1.size()-1;
					}else{
						selector2++;
						
					}
				}
			}
		}else if(source==Setting.J1_DOWN || source==Setting.J2_DOWN || source==Setting.J3_DOWN || source==Setting.J4_DOWN){
			if (selector2<P1.size()){
				selector2++;
				if (selector2==P1.size()){
					selector1++;
					selector2=1;
				}
			}
		}else if(source==Setting.J1_ACTION || source==Setting.J2_ACTION || source==Setting.J3_ACTION || source==Setting.J4_ACTION){
				if (selector1==0){
					P1.get(selector2).getActionListeners()[0].actionPerformed(null);
				}else if(selector1==1){
					P2.get(selector2).getActionListeners()[0].actionPerformed(null);
				}else if(selector1==2){
					P3.get(selector2).getActionListeners()[0].actionPerformed(null);
				}else if(selector1==3){
					P4.get(selector2).getActionListeners()[0].actionPerformed(null);
				}else if(selector1==4){
					butt.getActionListeners()[0].actionPerformed(null);
				}
		}
		selector();
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void mouseDeclaration(){
		for (int i=0;i<P1.size();i++){
			int ibis=i;
			MouseListener ml=new MouseListener(){
				@Override
				public void mouseClicked(MouseEvent e) {
					if (binding==true){
						setMyBind(iSave, pSave);
					}
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					if (binding==false){
					selector2=ibis;
					if (e.getSource().equals(P1.get(ibis))){
						selector1=0;
					}else if(e.getSource().equals(P2.get(ibis))){
						selector1=1;
					}else if(e.getSource().equals(P3.get(ibis))){
						selector1=2;
					}else if(e.getSource().equals(P4.get(ibis))){
						selector1=3;
					}else{
						selector1=4;
					}
					selector();
					}
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
				
			};
			P1.get(i).addMouseListener(ml);
			P2.get(i).addMouseListener(ml);
			P3.get(i).addMouseListener(ml);
			P4.get(i).addMouseListener(ml);
			butt.addMouseListener(ml);
		}
	}

}
