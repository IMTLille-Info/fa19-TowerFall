import java.awt.Dimension;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) throws IOException{
		  JFrame fen=new JFrame("Unicorn ISLAND");
		  fen.setPreferredSize(new Dimension(1200,800));
		  fen.setSize(1200,800 );
		  fen.setLocationRelativeTo(null);
		  fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		  fen.setResizable(false);
		  Menu menu = new Menu();
		  Option opt = new Option();
		  fen.add(menu);
		  fen.setVisible(true);
		  while (true){
			  fen.repaint();
			  fen.pack();
			  if(menu.opt==true){
				  menu.opt=false;
				  menu.hide();
				  fen.remove(menu);
				  fen.add(opt);
				  opt.show();
			  }else if(opt.opt==true){
				  opt.opt=false;
				  opt.hide();
				  fen.remove(opt);
				  fen.add(menu);
				  menu.show();
			  }else{
				  menu.repaint();
				  opt.repaint();
			  }
			  
		  }
	}
}
