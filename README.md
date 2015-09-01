MacOSX-Notification-Library-Java-
=================================

Gives you an easy to use library to use notifications on MacOSX

```java

import com.n9mtq4.notification.OSXNotification;

/**
 * Created by Will on 10/1/14.
 */
public class Demo {
	
	public static void main(String[] args) {
		
//		Makes a new Notification assigned to n with a title of title and text as text
		OSANotification n = new OSANotification("Title", "Text");
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
		n = new OSANotification("Title", "With sound");
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

```
