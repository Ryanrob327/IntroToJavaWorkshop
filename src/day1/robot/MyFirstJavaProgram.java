package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot CHARLIE= new Robot();
		for (int i = 0; i < 8; i++) {
			CHARLIE.setSpeed(8);
			CHARLIE.penDown();
			CHARLIE.move(100);
			CHARLIE.turn(45);

		}
		

	
		
		
	}
}
