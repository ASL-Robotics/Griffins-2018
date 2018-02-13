import java.io.File;

import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;
import jaci.pathfinder.Waypoint;
import jaci.pathfinder.modifiers.TankModifier;

public class GreyConcreteLane {

	public static void main(String[] args) {
		double MAX_VELOCITY = 3.841;
		double MAX_ACCELERATION = 6.215;
		double MAX_JERK = 10.055;

		Trajectory.Config config = new Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC,
				Trajectory.Config.SAMPLES_HIGH, 0.01, MAX_VELOCITY, MAX_ACCELERATION, MAX_JERK);

		Waypoint[] points1C = new Waypoint[] { new Waypoint(0.495, 7.028, 0), new Waypoint(4.267, 7.028, 0),
				new Waypoint(7.116, 6.226, 0) };

		Trajectory trajectory1C = Pathfinder.generate(points1C, config);

		TankModifier modifier1C = new TankModifier(trajectory1C).modify(0.64);
		Trajectory left1C = modifier1C.getLeftTrajectory();
		Trajectory right1C = modifier1C.getRightTrajectory();

		File leftFile1C = new File("leftFile1C.csv");
		Pathfinder.writeToCSV(leftFile1C, left1C);

		File rightFile1C = new File("rightFile1C.csv");
		Pathfinder.writeToCSV(rightFile1C, right1C);

		Waypoint[] points1D = new Waypoint[] { new Waypoint(0.495, 7.028, 0), new Waypoint(4.267, 7.028, 0),
				new Waypoint(5.810, 4.107, 3 * Math.PI / 2), new Waypoint(7.116, 1.988, 0) };

		Trajectory trajectory1D = Pathfinder.generate(points1D, config);

		TankModifier modifier1D = new TankModifier(trajectory1D).modify(0.64);
		Trajectory left1D = modifier1D.getLeftTrajectory();
		Trajectory right1D = modifier1D.getRightTrajectory();

		File leftFile1D = new File("leftFile1D.csv");
		Pathfinder.writeToCSV(leftFile1D, left1D);

		File rightFile1D = new File("rightFile1D.csv");
		Pathfinder.writeToCSV(rightFile1D, right1D);

		Waypoint[] points2C = new Waypoint[] { new Waypoint(0.495, 3.980, 0), new Waypoint(4.267, 7.028, 0),
				new Waypoint(7.116, 6.226, 0) };

		Trajectory trajectory2C = Pathfinder.generate(points2C, config);

		TankModifier modifier2C = new TankModifier(trajectory2C).modify(0.64);
		Trajectory left2C = modifier2C.getLeftTrajectory();
		Trajectory right2C = modifier2C.getRightTrajectory();

		File leftFile2C = new File("leftFile2C.csv");
		Pathfinder.writeToCSV(leftFile2C, left2C);

		File rightFile2C = new File("rightFile2C.csv");
		Pathfinder.writeToCSV(rightFile2C, right2C);

		Waypoint[] points2D = new Waypoint[] { new Waypoint(0.495, 3.980, 0), new Waypoint(4.267, 1.186, 0),
				new Waypoint(7.116, 1.988, 0) };

		Trajectory trajectory2D = Pathfinder.generate(points2D, config);

		TankModifier modifier2D = new TankModifier(trajectory2D).modify(0.64);
		Trajectory left2D = modifier2D.getLeftTrajectory();
		Trajectory right2D = modifier2D.getRightTrajectory();

		File leftFile2D = new File("leftFile2D.csv");
		Pathfinder.writeToCSV(leftFile2D, left2D);

		File rightFile2D = new File("rightFile2D.csv");
		Pathfinder.writeToCSV(rightFile2D, right2D);

		Waypoint[] points3C = new Waypoint[] { new Waypoint(0.495, 1.186, 0), new Waypoint(4.267, 1.186, 0),
				new Waypoint(5.810, 4.107, Math.PI / 2), new Waypoint(7.116, 6.226, 0) };

		Trajectory trajectory3C = Pathfinder.generate(points3C, config);

		TankModifier modifier3C = new TankModifier(trajectory3C).modify(0.64);
		Trajectory left3C = modifier3C.getLeftTrajectory();
		Trajectory right3C = modifier3C.getRightTrajectory();

		File leftFile3C = new File("leftFile3C.csv");
		Pathfinder.writeToCSV(leftFile3C, left3C);

		File rightFile3C = new File("rightFile3C.csv");
		Pathfinder.writeToCSV(rightFile3C, right3C);

		Waypoint[] points3D = new Waypoint[] { new Waypoint(0.495, 1.186, 0), new Waypoint(4.267, 1.186, 0),
				new Waypoint(7.116, 1.988, 0) };

		Trajectory trajectory3D = Pathfinder.generate(points3D, config);

		TankModifier modifier3D = new TankModifier(trajectory3D).modify(0.64);
		Trajectory left3D = modifier3D.getLeftTrajectory();
		Trajectory right3D = modifier3D.getRightTrajectory();

		File leftFile3D = new File("leftFile3D.csv");
		Pathfinder.writeToCSV(leftFile3D, left3D);

		File rightFile3D = new File("rightFile3D.csv");
		Pathfinder.writeToCSV(rightFile3D, right3D);

	}

}
