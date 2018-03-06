import java.io.File;

import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;
import jaci.pathfinder.Waypoint;
import jaci.pathfinder.modifiers.TankModifier;

public class RedVelvetStreet {

	final static double MAX_VELOCITY = 3.841;
	final static double MAX_ACCELERATION = 6.215;
	final static double MAX_JERK = 10.055;

	public static void main(String[] args) {

		Trajectory.Config config = new Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC,
				Trajectory.Config.SAMPLES_HIGH, 0.01, MAX_VELOCITY, MAX_ACCELERATION, MAX_JERK);

		// Path 1L
		Waypoint[] points1L = new Waypoint[] { new Waypoint(0.495, 7.028, 0), new Waypoint(3.556, 7.028, 0),
				new Waypoint(4.267, 6.544, -Math.PI / 2) };

		Trajectory trajectory1L = Pathfinder.generate(points1L, config);

		TankModifier modifier1L = new TankModifier(trajectory1L).modify(0.64);
		Trajectory left1L = modifier1L.getLeftTrajectory();
		Trajectory right1L = modifier1L.getRightTrajectory();

		File leftFile1L = new File("leftFile1L.csv");
		Pathfinder.writeToCSV(leftFile1L, left1L);

		File rightFile1L = new File("rightFile1L.csv");
		Pathfinder.writeToCSV(rightFile1L, right1L);

		// Path 1J

		Waypoint[] points1J = new Waypoint[] { new Waypoint(0.495, 7.028, 0), new Waypoint(4.267, 7.028, 0),
				new Waypoint(5.810, 4.107, 3 * Math.PI / 2), new Waypoint(5.810, 3.352, Math.PI / 2),
				new Waypoint(5.474, 2.597, Math.PI) };

		Trajectory trajectory1J = Pathfinder.generate(points1J, config);

		TankModifier modifier1J = new TankModifier(trajectory1J).modify(0.64);
		Trajectory left1J = modifier1J.getLeftTrajectory();
		Trajectory right1J = modifier1J.getRightTrajectory();

		File leftFile1J = new File("leftFile1J.csv");
		Pathfinder.writeToCSV(leftFile1J, left1J);

		File rightFile1J = new File("rightFile1J.csv");
		Pathfinder.writeToCSV(rightFile1J, right1J);

		// Path 2G

		Waypoint[] points2G = new Waypoint[] { new Waypoint(0.495, 3.980, 0), new Waypoint(3.061, 5.617, 0) };

		Trajectory trajectory2G = Pathfinder.generate(points2G, config);

		TankModifier modifier2G = new TankModifier(trajectory2G).modify(0.64);
		Trajectory left2G = modifier2G.getLeftTrajectory();
		Trajectory right2G = modifier2G.getRightTrajectory();

		File leftFile2G = new File("leftFile2G.csv");
		Pathfinder.writeToCSV(leftFile2G, left2G);

		File rightFile2G = new File("rightFile2G.csv");
		Pathfinder.writeToCSV(rightFile2G, right2G);

		// Path 2H

		Waypoint[] points2H = new Waypoint[] { new Waypoint(0.495, 3.980, 0), new Waypoint(3.061, 2.597, 0) };

		Trajectory trajectory2H = Pathfinder.generate(points2H, config);

		TankModifier modifier2H = new TankModifier(trajectory2H).modify(0.64);
		Trajectory left2H = modifier2H.getLeftTrajectory();
		Trajectory right2H = modifier2H.getRightTrajectory();

		File leftFile2H = new File("leftFile2H.csv");
		Pathfinder.writeToCSV(leftFile2H, left2H);

		File rightFile2H = new File("rightFile2H.csv");
		Pathfinder.writeToCSV(rightFile2H, right2H);

		// Path 3I

		Waypoint[] points3I = new Waypoint[] { new Waypoint(0.495, 1.186, 0), new Waypoint(3.556, 1.186, 0),
				new Waypoint(4.267, 1.670, Math.PI / 2) };

		Trajectory trajectory3I = Pathfinder.generate(points3I, config);

		TankModifier modifier3I = new TankModifier(trajectory3I).modify(0.64);
		Trajectory left3I = modifier3I.getLeftTrajectory();
		Trajectory right3I = modifier3I.getRightTrajectory();

		File leftFile3I = new File("leftFile3I.csv");
		Pathfinder.writeToCSV(leftFile3I, left3I);

		File rightFile3I = new File("rightFile3I.csv");
		Pathfinder.writeToCSV(rightFile3I, right3I);

		// Path 3K

		Waypoint[] points3K = new Waypoint[] { new Waypoint(0.495, 1.186, 0), new Waypoint(4.267, 1.186, 0),
				new Waypoint(5.810, 4.107, Math.PI / 2), new Waypoint(5.810, 4.862, Math.PI / 2),
				new Waypoint(5.401, 5.617, Math.PI) };

		Trajectory trajectory3K = Pathfinder.generate(points3K, config);

		TankModifier modifier3K = new TankModifier(trajectory3K).modify(0.64);
		Trajectory left3K = modifier3K.getLeftTrajectory();
		Trajectory right3K = modifier3K.getRightTrajectory();

		File leftFile3K = new File("leftFile3K.csv");
		Pathfinder.writeToCSV(leftFile3K, left3K);

		File rightFile3K = new File("rightFile3K.csv");
		Pathfinder.writeToCSV(rightFile3K, right3K);

	}
}