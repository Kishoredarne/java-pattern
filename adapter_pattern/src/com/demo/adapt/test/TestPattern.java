package com.demo.adapt.test;

import com.demo.adapt.AudioPlayer;

public class TestPattern {

	public static void main(String[] args) {
	     AudioPlayer audioPlayer = new AudioPlayer();
	     audioPlayer.play("mp3", "music1.mp3");
	     audioPlayer.play("wav", "music2.wav");
	     audioPlayer.play("mp4", "music3.mp4");
	     audioPlayer.play("avi", "music4.avi");
	  }
}
