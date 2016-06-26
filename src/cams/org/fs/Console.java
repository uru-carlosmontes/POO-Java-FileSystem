package cams.org.fs;

import java.util.Scanner;

public class Console {
	
	private Scanner input = new Scanner (System.in);
	private Commands cmds = new Commands();
	
	public void start () {
		
		while (true) {
			System.out.print("C:> ");
			String CLI = input.nextLine();
			String params [] = CLI.split(" ");
			
			switch (params[0]) {
				case "create":
					if (params.length <= 1) break;
					cmds.create(params[1]);
					break;
				case "echo":
					if (params.length <= 1) break;
					cmds.echo(params[1]);
					break;
				case "dir":
					cmds.dir();
					break;
			}
		}
		
	}
	
}
