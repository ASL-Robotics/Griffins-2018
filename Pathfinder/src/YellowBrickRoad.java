import java.io.File;

import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;
import jaci.pathfinder.Waypoint;
import jaci.pathfinder.modifiers.TankModifier;

public class YellowBrickRoad {

	final static double MAX_VELOCITY = 3.841;
	final static double MAX_ACCELERATION = 114.84;
	final static double MAX_JERK = 11981.157;

	public static void main(String[] args) {

		Trajectory.Config config = new Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC,
				Trajectory.Config.SAMPLES_HIGH, 0.01, MAX_VELOCITY, MAX_ACCELERATION, MAX_JERK);

		Waypoint[] points1A = new Waypoint[] { new Waypoint(0.495, 7.028, 0), new Waypoint(4.267, 7.028, 0) };

		Trajectory trajectory1A = Pathfinder.generate(points1A, config);

		TankModifier modifier1A = new TankModifier(trajectory1A).modify(0.64);
		Trajectory left1A = modifier1A.getLeftTrajectory();
		Trajectory right1A = modifier1A.getRightTrajectory();

		File leftFile1A = new File("leftFile1A.csv");
		Pathfinder.writeToCSV(leftFile1A, left1A);

		File rightFile1A = new File("rightFile1A.csv");
		Pathfinder.writeToCSV(rightFile1A, right1A);

		Waypoint[] points2A = new Waypoint[] { new Waypoint(0.495, 3.980, 0), new Waypoint(4.267, 7.028, 0) };

		Trajectory trajectory2A = Pathfinder.generate(points2A, config);

		TankModifier modifier2A = new TankModifier(trajectory2A).modify(0.64);
		Trajectory left2A = modifier2A.getLeftTrajectory();
		Trajectory right2A = modifier2A.getRightTrajectory();

		File leftFile2A = new File("leftFile2A.csv");
		Pathfinder.writeToCSV(leftFile2A, left2A);

		File rightFile2A = new File("rightFile2A.csv");
		Pathfinder.writeToCSV(rightFile2A, right2A);

		Waypoint[] points2B = new Waypoint[] { new Waypoint(0.495, 3.980, 0), new Waypoint(4.267, 1.186, 0) };

		Trajectory trajectory2B = Pathfinder.generate(points2B, config);

		TankModifier modifier2B = new TankModifier(trajectory2B).modify(0.64);
		Trajectory left2B = modifier2B.getLeftTrajectory();
		Trajectory right2B = modifier2B.getRightTrajectory();

		File leftFile2B = new File("leftFile2B.csv");
		Pathfinder.writeToCSV(leftFile2B, left2B);

		File rightFile2B = new File("rightFile2B.csv");
		Pathfinder.writeToCSV(rightFile2B, right2B);

		Waypoint[] points3B = new Waypoint[] { new Waypoint(0.495, 1.186, 0), new Waypoint(4.267, 1.186, 0) };

		Trajectory trajectory3B = Pathfinder.generate(points3B, config);

		TankModifier modifier3B = new TankModifier(trajectory3B).modify(0.64);
		Trajectory left3B = modifier3B.getLeftTrajectory();
		Trajectory right3B = modifier3B.getRightTrajectory();

		File leftFile3B = new File("leftFile3B.csv");
		Pathfinder.writeToCSV(leftFile3B, left3B);

		File rightFile3B = new File("rightFile3B.csv");
		Pathfinder.writeToCSV(rightFile3B, right3B);

		Waypoint[] pointsAC = new Waypoint[] { new Waypoint(4.267, 7.028, 0), new Waypoint(7.116, 6.226, 0) };

		Trajectory trajectoryAC = Pathfinder.generate(pointsAC, config);

		TankModifier modifierAC = new TankModifier(trajectoryAC).modify(0.64);
		Trajectory leftAC = modifierAC.getLeftTrajectory();
		Trajectory rightAC = modifierAC.getRightTrajectory();

		File leftFileAC = new File("leftFileAC.csv");
		Pathfinder.writeToCSV(leftFileAC, leftAC);

		File rightFileAC = new File("rightFileAC.csv");
		Pathfinder.writeToCSV(rightFileAC, rightAC);

		Waypoint[] pointsAD = new Waypoint[] { new Waypoint(4.267, 7.028, 0), new Waypoint(7.116, 1.988, 0) };

		Trajectory trajectoryAD = Pathfinder.generate(pointsAD, config);

		TankModifier modifierAD = new TankModifier(trajectoryAD).modify(0.64);
		Trajectory leftAD = modifierAD.getLeftTrajectory();
		Trajectory rightAD = modifierAD.getRightTrajectory();

		File leftFileAD = new File("leftFileAD.csv");
		Pathfinder.writeToCSV(leftFileAD, leftAD);

		File rightFileAD = new File("rightFileAD.csv");
		Pathfinder.writeToCSV(rightFileAD, rightAD);

		Waypoint[] pointsBC = new Waypoint[] { new Waypoint(4.267, 1.186, 0), new Waypoint(7.116, 6.226, 0) };

		Trajectory trajectoryBC = Pathfinder.generate(pointsBC, config);

		TankModifier modifierBC = new TankModifier(trajectoryBC).modify(0.64);
		Trajectory leftBC = modifierBC.getLeftTrajectory();
		Trajectory rightBC = modifierBC.getRightTrajectory();

		File leftFileBC = new File("leftFileBC.csv");
		Pathfinder.writeToCSV(leftFileBC, leftBC);

		File rightFileBC = new File("rightFileBC.csv");
		Pathfinder.writeToCSV(rightFileBC, rightBC);

		Waypoint[] pointsBD = new Waypoint[] { new Waypoint(4.267, 1.186, 0), new Waypoint(7.116, 1.988, 0) };

		Trajectory trajectoryBD = Pathfinder.generate(pointsBD, config);

		TankModifier modifierBD = new TankModifier(trajectoryBD).modify(0.64);
		Trajectory leftBD = modifierBD.getLeftTrajectory();
		Trajectory rightBD = modifierBD.getRightTrajectory();

		File leftFileBD = new File("leftFileBD.csv");
		Pathfinder.writeToCSV(leftFileBD, leftBD);

		File rightFileBD = new File("rightFileBD.csv");
		Pathfinder.writeToCSV(rightFileBD, rightBD);

		Waypoint[] pointsCE = new Waypoint[] { new Waypoint(7.116, 6.226, Math.PI),
				new Waypoint(5.803, 5.883, Math.PI) };

		Trajectory trajectoryCE = Pathfinder.generate(pointsCE, config);

		TankModifier modifierCE = new TankModifier(trajectoryCE).modify(0.64);
		Trajectory leftCE = modifierCE.getLeftTrajectory();
		Trajectory rightCE = modifierCE.getRightTrajectory();

		File leftFileCE = new File("leftFileCE.csv");
		Pathfinder.writeToCSV(leftFileCE, leftCE);

		File rightFileCE = new File("rightFileCE.csv");
		Pathfinder.writeToCSV(rightFileCE, rightCE);

		Waypoint[] pointsDF = new Waypoint[] { new Waypoint(7.116, 1.988, Math.PI),
				new Waypoint(5.803, 2.330, Math.PI) };

		Trajectory trajectoryDF = Pathfinder.generate(pointsDF, config);

		TankModifier modifierDF = new TankModifier(trajectoryDF).modify(0.64);
		Trajectory leftDF = modifierDF.getLeftTrajectory();
		Trajectory rightDF = modifierDF.getRightTrajectory();

		File leftFileDF = new File("leftFileDF.csv");
		Pathfinder.writeToCSV(leftFileDF, leftDF);

		File rightFileDF = new File("rightFileDF.csv");
		Pathfinder.writeToCSV(rightFileDF, rightDF);

		Waypoint[] pointsEC = new Waypoint[] { new Waypoint(5.803, 5.883, 0), new Waypoint(7.116, 6.226, 0) };

		Trajectory trajectoryEC = Pathfinder.generate(pointsEC, config);

		TankModifier modifierEC = new TankModifier(trajectoryEC).modify(0.64);
		Trajectory leftEC = modifierEC.getLeftTrajectory();
		Trajectory rightEC = modifierEC.getRightTrajectory();

		File leftFileEC = new File("leftFileEC.csv");
		Pathfinder.writeToCSV(leftFileEC, leftEC);

		File rightFileEC = new File("rightFileEC.csv");
		Pathfinder.writeToCSV(rightFileEC, rightEC);

		Waypoint[] pointsFD = new Waypoint[] { new Waypoint(5.803, 2.330, 0), new Waypoint(7.116, 1.988, 0) };

		Trajectory trajectoryFD = Pathfinder.generate(pointsFD, config);

		TankModifier modifierFD = new TankModifier(trajectoryFD).modify(0.64);
		Trajectory leftFD = modifierFD.getLeftTrajectory();
		Trajectory rightFD = modifierFD.getRightTrajectory();

		File leftFileFD = new File("leftFileFD.csv");
		Pathfinder.writeToCSV(leftFileFD, leftFD);

		File rightFileFD = new File("rightFileFD.csv");
		Pathfinder.writeToCSV(rightFileFD, rightFD);

		Waypoint[] pointsRot180L = new Waypoint[] { new Waypoint(0, 0, 0), new Waypoint(Math.PI * 0.32, 0, 0) };
		Waypoint[] pointsRot180R = new Waypoint[] { new Waypoint(0, 0, 0), new Waypoint(-Math.PI * 0.32, 0, 0) };

		Trajectory trajectoryRot180L = Pathfinder.generate(pointsRot180L, config);
		Trajectory trajectoryRot180R = Pathfinder.generate(pointsRot180R, config);

		File leftFileRot180L = new File("leftFileRot180L.csv");
		Pathfinder.writeToCSV(leftFileRot180L, trajectoryRot180L);

		File rightFileRot180R = new File("rightFileRot180R.csv");
		Pathfinder.writeToCSV(rightFileRot180R, trajectoryRot180R);

		Waypoint[] pointsScaleForward = new Waypoint[] { new Waypoint(0, 0, 0), new Waypoint(0.25, 0, 0) };

		Trajectory trajectoryScaleForward = Pathfinder.generate(pointsScaleForward, config);

		TankModifier modifierScaleForward = new TankModifier(trajectoryScaleForward).modify(0.64);
		Trajectory leftScaleForward = modifierScaleForward.getLeftTrajectory();
		Trajectory rightScaleForward = modifierScaleForward.getRightTrajectory();

		File leftFileScaleForward = new File("leftFileScaleForward.csv");
		Pathfinder.writeToCSV(leftFileScaleForward, leftScaleForward);

		File rightFileScaleForward = new File("rightFileScaleForward.csv");
		Pathfinder.writeToCSV(rightFileScaleForward, rightScaleForward);
	}
}
