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
