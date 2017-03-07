import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
	public static void main(String[] args) throws IOException{
		  Fenetre fen;
		  fen = new Fenetre();
		  while (true){
			  fen.repaint();
		  }
	}
}
