package cams.org.fs;

public class Commands {
	
	public void create (String filename) {
		System.out.println("You want create: " + filename);
	}
	
	public void dir () {
		System.out.println("You wanna see some files");
	}
	
	public void echo (String ...params) {
		System.out.println("You wanna write some message");
	}
	
}
