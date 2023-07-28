package com.demo.adapt;

import com.demo.adapt.inter.MediaPlayer;

public class AudioPlayer implements MediaPlayer{

	/*
	 * String format; String file;
	 * 
	 * public AudioPlayer(String format, String file) { super(); this.format =
	 * format; this.file = file; }
	 */

	@Override
	public void play(String format, String file) {
		// TODO Auto-generated method stub
		System.out.println("Audio implementing Media");
		MediaAdapter adapter;
		
		if(format.equalsIgnoreCase("mp3")) {
			System.out.println("here we will mp3 player");
		}else if(format.equalsIgnoreCase("mp4") || format.equalsIgnoreCase("wav4")){
			
			adapter = new MediaAdapter(format);
			
		}
	}

}
