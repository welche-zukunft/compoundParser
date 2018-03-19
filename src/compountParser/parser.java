package compountParser;

import java.awt.event.KeyEvent;


public class parser {

	public static Pipeline pipe = new Pipeline();
	public static String input = "At the beginning of the second decade of the Twenty-First Century, global civilization faces a new breed of cataclysm.";
	
	public static void main(String [] args) {
		
		pipe.doSentenceTest(input);
		
	}
	

	
	
}
