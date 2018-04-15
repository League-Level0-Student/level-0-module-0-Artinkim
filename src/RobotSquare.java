
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
	public static void main(String[] args) throws Exception {

		Robot bob = new Robot();

		bob.penDown();

		bob.setSpeed(99999);

		// 5. Do everything below here 4 times

		for (int i = 0; i <= 4; i++) {
			bob.move(200);
			bob.turn(90);
		}
		// 2. Move your robot 200 pixels

		// 4. Turn the robot 90 degrees to the right (90 degrees)

	}
}
