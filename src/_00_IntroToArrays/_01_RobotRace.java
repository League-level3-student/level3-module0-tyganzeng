package _00_IntroToArrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[8];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		for (int i = 0; i < robots.length; i++) {
			robots[i].setY(500);
			robots[i].setX(100 + 100 * i);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		/*
		 * for (int i = 0; i < robots.length; i++) { Random r = new Random(); int rand =
		 * r.nextInt(50); robots[i].setX(robots[i].getX() + rand); }
		 */
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		boolean gameOver = false;
		while (!gameOver) {
			for (int i = 0; i < robots.length; i++) {
				Random r = new Random();
				int rand = r.nextInt(50);
				robots[i].setY(robots[i].getY() - rand);
				if (robots[i].getY() < 50) {
					gameOver = true;
					System.out.println("Robot " + i + " is the winner!");
				}
			}

		}

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}
}
