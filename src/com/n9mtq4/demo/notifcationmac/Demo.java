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
		
		Notification n = new Notification("Title", "Text");
		n.display();
		
		sleep();
		
		n = new Notification("Title", "Text");
		n.setSubtitle("With subtitles");
		n.display();
		
		sleep();
		
		n = new Notification("Title", "With sound");
		n.setSoundName("default");
		n.display();
		
		sleep();
		
		n = new Notification("Title", "and sound");
		n.setSubtitle("with subtitle");
		n.setSoundName("default");
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
