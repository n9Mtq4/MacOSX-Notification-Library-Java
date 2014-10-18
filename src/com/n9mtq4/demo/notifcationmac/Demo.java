/*
 * NOTE: This is added by intellij IDE. Disregard this message if there is another copyright later in the file.
 * Copyright (C) 2014  Will (n9Mtq4) Bresnahan
 * A library to send notifications to the notification center in OSX
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.n9mtq4.demo.notifcationmac;

/**
 * Created by Will on 10/1/14.
 */
public class Demo {
	
	public static void main(String[] args) {
		
//		Makes a new Notification assigned to n with a title of title and text as text
		Notification n = new Notification("Title", "Text");
//		displays n
		n.display();
		
//		sleeps for 5.1 seconds
		sleep();
		
//		gives n a subtitle
		n.setSubtitle("With subtitles");
//		displays n
		n.display();
		
//		sleeps for 5.1 seconds
		sleep();
		
//		reassigns n with a title of Title and text as With sound
		n = new Notification("Title", "With sound");
//		sets the name of the sound that will be played
		n.setSoundName("default");
//		displays n
		n.display();
		
//		sleeps for 5.1 seconds
		sleep();
		
		//instead of reassigning n we can edit the text directly
		n.setText("and sound");
//		edits the subtitle
		n.setSubtitle("with subtitle");
//		sets the sound name
		n.setSoundName("default");
//		displays n
		n.display();
		
	}
	
	public static void sleep() {
		try {
			Thread.sleep(5100);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
