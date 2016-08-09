package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot gulp=new Robot();

	
	void go() {
gulp.penDown();
		// 6. Make the robot go as fast as possible
		gulp.setSpeed(10);

		// 4. make a variable to hold the length of the triangle and set it to 50
		int glump=50;

		// 7. Do the following (up to step 10) 60 times
		for (int i = 0; i < 60; i++) {
			
		

			// 9. Change the color of the pen to a random color
	
			// 8. Increase the length of the side by 10 pixels
	glump=glump+10;
			// 5. call your drawTriangle() method using your length variable
		drawTriangle(glump);
	
			// 10. Turn the tortoise 6 degrees to the right
		gulp.turn(1);
		}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
		for (int i = 0; i < 3; i++) {
			gulp.move(length);
			gulp.turn(120);
			
			
		}
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
