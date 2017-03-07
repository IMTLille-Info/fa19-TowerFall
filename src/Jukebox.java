import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

import com.sun.media.sound.JavaSoundAudioClip;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Jukebox extends Thread {
	
		List<String> musics=new ArrayList<String>();
		Player player;
		public static final int RAND = 10;
		Integer choice=null;
		
	public Jukebox(int i) {
		// Menu :
		musics.add("lib/music/Uncharted - Nate's Theme 0.5 (8-Bit Chiptune).mp3");
		// Game-Music :
		musics.add("lib/music/Bee_Gees_-_Stayin_Alive.mp3");
		musics.add("lib/music/dr_dre-the_next_episode.mp3");
		musics.add("lib/music/Drumstep_-_Pegboard_Nerds_-_Pressure_Cooker_Monste.mp3");
		musics.add("lib/music/haddaway-what_is_love.mp3");
		musics.add("lib/music/Los_del_Rio_-_Macarena.mp3");
		musics.add("lib/music/Most awesome 8-bit song ever.mp3");
		choice=i;
	}

	  public void run() {
		  if (choice==(-1)){
		    launchMenu();
		  }else if(choice==RAND){
			  randomLaunch();
		  }else{
			  launch(choice);
		  }
	  }
	  
	  public void run(int i) {
		  if (i==RAND){
		    randomLaunch();
		  }else{
			  launch(i);
		  }
	  }
	  
	public void launchMenu() {
		try {
			FileInputStream fis=new FileInputStream(musics.get(0));
			BufferedInputStream bis=new BufferedInputStream(fis);
				player = new Player(bis);
				player.play();
		} catch (JavaLayerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void randomLaunch() {
		Random rand = new Random();
		try {
			FileInputStream fis=new FileInputStream(musics.get(rand.nextInt(musics.size())));
			BufferedInputStream bis=new BufferedInputStream(fis);
				player = new Player(bis);
				player.play();
		} catch (JavaLayerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void launch(int i) {
		try {
			FileInputStream fis=new FileInputStream(musics.get(i));
			BufferedInputStream bis=new BufferedInputStream(fis);
				player = new Player(bis);
				player.play();
		} catch (JavaLayerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
