package com.demo.adapt;

import com.demo.adapt.inter.AdvancePlayer;
import com.demo.adapt.inter.MediaPlayer;

public class MediaAdapter implements MediaPlayer{

	AdvancePlayer advancePlayer;
	
	public MediaAdapter(String format) {
		
		if(format.equalsIgnoreCase("mp4")) {
			advancePlayer = new MP4Player();
		}
		else {
			advancePlayer = new Wav4Player();
		}
	}
	
	@Override
	public void play(String format, String file) {
		// TODO Auto-generated method stub
		
		if(format.equalsIgnoreCase("mp4")) {
			advancePlayer.mp4Player(file);
		}
		else {
			advancePlayer.wav4Player(file);
		}
		
	}

}
