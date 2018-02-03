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

		/*
		 * location 1 to location A
		 */
		Waypoint[] points1A = new Waypoint[] { 
				new Waypoint(0.4503, 7.908, 0), // Waypoint @ x=-2, y=-2, exit angle=0 radians
				new Waypoint(4.2672, 7.908, 0) // Waypoint @ x=0, y=0, exit angle=0 radians
		};

		Trajectory.Config config1A = new Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC,
				Trajectory.Config.SAMPLES_HIGH, 0.01, MAX_VELOCITY, MAX_ACCELERATION, MAX_JERK);

		// Last three things in the constructor above are maximum velocity, max
		// acceleration, jerk (change in acceleration)
		Trajectory trajectory1A = Pathfinder.generate(points1A, config1A);

		// The .modify(0.64) at the end changes it for the distance between the wheels
		TankModifier modifier1A = new TankModifier(trajectory1A).modify(0.64);
		Trajectory left1A = modifier1A.getLeftTrajectory();
		Trajectory right1A = modifier1A.getRightTrajectory();

		// Save Left
		File leftFile1A = new File("leftFile1A.csv");
		Pathfinder.writeToCSV(leftFile1A, left1A);

		// Save Right
		File rightFile1A = new File("rightFile1A.csv");
		Pathfinder.writeToCSV(rightFile1A, right1A);

		/*
		 * location 2 to location A
		 */
		Waypoint[] points2A = new Waypoint[] { 
				new Waypoint(0.4503, 4.288, 0), // Waypoint @ x=-2, y=-2, exit angle=0 radians
				new Waypoint(4.2672, 7.908, 0) // Waypoint @ x=0, y=0, exit angle=0 radians
		};

		Trajectory.Config config2A = new Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC,
				Trajectory.Config.SAMPLES_HIGH, 0.01, MAX_VELOCITY, MAX_ACCELERATION, MAX_JERK);

		// Last three things in the constructor above are maximum velocity, max
		// acceleration, jerk (change in acceleration)
		Trajectory trajectory2A = Pathfinder.generate(points2A, config2A);

		// The .modify(0.64) at the end changes it for the distance between the wheels
		TankModifier modifier2A = new TankModifier(trajectory2A).modify(0.64);
		Trajectory left2A = modifier2A.getLeftTrajectory();
		Trajectory right2A = modifier2A.getRightTrajectory();

		// Save Left
		File leftFile2A = new File("leftFile2A.csv");
		Pathfinder.writeToCSV(leftFile2A, left2A);

		// Save Right
		File rightFile2A = new File("rightFile2A.csv");
		Pathfinder.writeToCSV(rightFile2A, right2A);

		/*
		 * location 3 to location B
		 */
		Waypoint[] points3B = new Waypoint[] { 
				new Waypoint(0.4503, 1.186, 0), // Waypoint @ x=-2, y=-2, exit angle=0 radians
				new Waypoint(4.2672, 1.186, 0) // Waypoint @ x=0, y=0, exit angle=0 radians
		};

		Trajectory.Config config3B = new Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC,
				Trajectory.Config.SAMPLES_HIGH, 0.01, MAX_VELOCITY, MAX_ACCELERATION, MAX_JERK);

		// Last three things in the constructor above are maximum velocity, max
		// acceleration, jerk (change in acceleration)
		Trajectory trajectory3B = Pathfinder.generate(points3B, config3B);

		// The .modify(0.64) at the end changes it for the distance between the wheels
		TankModifier modifier3B = new TankModifier(trajectory3B).modify(0.64);
		Trajectory left3B = modifier3B.getLeftTrajectory();
		Trajectory right3B = modifier3B.getRightTrajectory();

		// Save Left
		File leftFile3B = new File("leftFile3B.csv");
		Pathfinder.writeToCSV(leftFile3B, left3B);

		// Save Right
		File rightFile3B = new File("rightFile3B.csv");
		Pathfinder.writeToCSV(rightFile3B, right3B);

		/*
		 * location A to location C
		 */
		Waypoint[] pointsAC = new Waypoint[] { 
				new Waypoint(4.2672, 7.908, 0), // Waypoint @ x=-2, y=-2, exit angle=0 radians
				new Waypoint(7.1158, 6.2261, 0) // Waypoint @ x=0, y=0, exit angle=0 radians
		};

		Trajectory.Config configAC = new Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC,
				Trajectory.Config.SAMPLES_HIGH, 0.01, MAX_VELOCITY, MAX_ACCELERATION, MAX_JERK);

		// Last three things in the constructor above are maximum velocity, max
		// acceleration, jerk (change in acceleration)
		Trajectory trajectoryAC = Pathfinder.generate(pointsAC, configAC);

		// The .modify(0.64) at the end changes it for the distance between the wheels
		TankModifier modifierAC = new TankModifier(trajectoryAC).modify(0.64);
		Trajectory leftAC = modifierAC.getLeftTrajectory();
		Trajectory rightAC = modifierAC.getRightTrajectory();

		// Save Left
		File leftFileAC = new File("leftFileAC.csv");
		Pathfinder.writeToCSV(leftFileAC, leftAC);

		// Save Right
		File rightFileAC = new File("rightFileAC.csv");
		Pathfinder.writeToCSV(rightFileAC, rightAC);

		/*
		 * location A to location D
		 */
		Waypoint[] pointsAD = new Waypoint[] { 
				new Waypoint(4.2672, 7.908, 0), // Waypoint @ x=-2, y=-2, exit angle=0 radians
				new Waypoint(7.1158, 1.9878, 0) // Waypoint @ x=0, y=0, exit angle=0 radians
		};

		Trajectory.Config configAD = new Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC,
				Trajectory.Config.SAMPLES_HIGH, 0.01, MAX_VELOCITY, MAX_ACCELERATION, MAX_JERK);

		// Last three things in the constructor above are maximum velocity, max
		// acceleration, jerk (change in acceleration)
		Trajectory trajectoryAD = Pathfinder.generate(pointsAD, configAD);

		// The .modify(0.64) at the end changes it for the distance between the wheels
		TankModifier modifierAD = new TankModifier(trajectoryAD).modify(0.64);
		Trajectory leftAD = modifierAD.getLeftTrajectory();
		Trajectory rightAD = modifierAD.getRightTrajectory();

		// Save Left
		File leftFileAD = new File("leftFileAD.csv");
		Pathfinder.writeToCSV(leftFileAD, leftAD);

		// Save Right
		File rightFileAD = new File("rightFileAD.csv");
		Pathfinder.writeToCSV(rightFileAD, rightAD);
		
		/*
		 * location C to location E
		 */
		Waypoint[] pointsCE = new Waypoint[] { 
				new Waypoint(7.1158, 6.2261, 0), // Waypoint @ x=-2, y=-2, exit angle=0 radians
				new Waypoint(5.8039, 5.8834, 0) // Waypoint @ x=0, y=0, exit angle=0 radians
		};

		Trajectory.Config configCE = new Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC,
				Trajectory.Config.SAMPLES_HIGH, 0.01, MAX_VELOCITY, MAX_ACCELERATION, MAX_JERK);

		// Last three things in the constructor above are maximum velocity, max
		// acceleration, jerk (change in acceleration)
		Trajectory trajectoryCE = Pathfinder.generate(pointsCE, configCE);

		// The .modify(0.64) at the end changes it for the distance between the wheels
		TankModifier modifierCE = new TankModifier(trajectoryCE).modify(0.64);
		Trajectory leftCE = modifierCE.getLeftTrajectory();
		Trajectory rightCE = modifierCE.getRightTrajectory();

		// Save Left
		File leftFileCE = new File("leftFileCE.csv");
		Pathfinder.writeToCSV(leftFileCE, leftCE);

		// Save Right
		File rightFileCE = new File("rightFileCE.csv");
		Pathfinder.writeToCSV(rightFileCE, rightCE);
		
		/*
		 * location 2 to location B
		 */
		Waypoint[] points2B = new Waypoint[] { 
				new Waypoint(0.4503, 4.288, 0), // Waypoint @ x=-2, y=-2, exit angle=0 radians
				new Waypoint(4.2672, 1.186, 0) // Waypoint @ x=0, y=0, exit angle=0 radians
		};

		Trajectory.Config config2B = new Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC,
				Trajectory.Config.SAMPLES_HIGH, 0.01, MAX_VELOCITY, MAX_ACCELERATION, MAX_JERK);

		// Last three things in the constructor above are maximum velocity, max
		// acceleration, jerk (change in acceleration)
		Trajectory trajectory2B = Pathfinder.generate(points2B, config2B);

		// The .modify(0.64) at the end changes it for the distance between the wheels
		TankModifier modifier2B = new TankModifier(trajectory2B).modify(0.64);
		Trajectory left2B = modifier2B.getLeftTrajectory();
		Trajectory right2B = modifier2B.getRightTrajectory();

		// Save Left
		File leftFile2B = new File("leftFile2B.csv");
		Pathfinder.writeToCSV(leftFile2B, left2B);

		// Save Right
		File rightFile2B = new File("rightFile2B.csv");
		Pathfinder.writeToCSV(rightFile2B, right2B);
		
		/*
		 * location B to location D
		 */
		Waypoint[] pointsBD = new Waypoint[] { 
				new Waypoint(4.2672, 1.186, 0), // Waypoint @ x=-2, y=-2, exit angle=0 radians
				new Waypoint(7.1158, 1.9878, 0) // Waypoint @ x=0, y=0, exit angle=0 radians
		};

		Trajectory.Config configBD = new Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC,
				Trajectory.Config.SAMPLES_HIGH, 0.01, MAX_VELOCITY, MAX_ACCELERATION, MAX_JERK);

		// Last three things in the constructor above are maximum velocity, max
		// acceleration, jerk (change in acceleration)
		Trajectory trajectoryBD = Pathfinder.generate(pointsBD, configBD);

		// The .modify(0.64) at the end changes it for the distance between the wheels
		TankModifier modifierBD = new TankModifier(trajectoryBD).modify(0.64);
		Trajectory leftBD = modifierBD.getLeftTrajectory();
		Trajectory rightBD = modifierBD.getRightTrajectory();

		// Save Left
		File leftFileBD = new File("leftFileBD.csv");
		Pathfinder.writeToCSV(leftFileBD, leftBD);

		// Save Right
		File rightFileBD = new File("rightFileBD.csv");
		Pathfinder.writeToCSV(rightFileBD, rightBD);
		
		/*
		 * location B to location F
		 */
		Waypoint[] pointsBF= new Waypoint[] { 
				new Waypoint(4.2672, 1.186, 0), // Waypoint @ x=-2, y=-2, exit angle=0 radians
				new Waypoint(5.8039, 2.3305, 0) // Waypoint @ x=0, y=0, exit angle=0 radians
		};

		Trajectory.Config configBF = new Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC,
				Trajectory.Config.SAMPLES_HIGH, 0.01, MAX_VELOCITY, MAX_ACCELERATION, MAX_JERK);

		// Last three things in the constructor above are maximum velocity, max
		// acceleration, jerk (change in acceleration)
		Trajectory trajectoryBF = Pathfinder.generate(pointsBF, configBF);

		// The .modify(0.64) at the end changes it for the distance between the wheels
		TankModifier modifierBF = new TankModifier(trajectoryBF).modify(0.64);
		Trajectory leftBF = modifierBF.getLeftTrajectory();
		Trajectory rightBF = modifierBF.getRightTrajectory();

		// Save Left
		File leftFileBF = new File("leftFileBF.csv");
		Pathfinder.writeToCSV(leftFileBF, leftBF);

		// Save Right
		File rightFileBF = new File("rightFileBF.csv");
		Pathfinder.writeToCSV(rightFileBF, rightBF);
		
		/*
		 * location B to location C
		 */
		Waypoint[] pointsBC= new Waypoint[] { 
				new Waypoint(4.2672, 1.186, 0), // Waypoint @ x=-2, y=-2, exit angle=0 radians
				new Waypoint(7.1158, 6.2261, 0) // Waypoint @ x=0, y=0, exit angle=0 radians
		};

		Trajectory.Config configBC = new Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC,
				Trajectory.Config.SAMPLES_HIGH, 0.01, MAX_VELOCITY, MAX_ACCELERATION, MAX_JERK);

		// Last three things in the constructor above are maximum velocity, max
		// acceleration, jerk (change in acceleration)
		Trajectory trajectoryBC = Pathfinder.generate(pointsBC, configBC);

		// The .modify(0.64) at the end changes it for the distance between the wheels
		TankModifier modifierBC = new TankModifier(trajectoryBC).modify(0.64);
		Trajectory leftBC = modifierBC.getLeftTrajectory();
		Trajectory rightBC = modifierBC.getRightTrajectory();

		// Save Left
		File leftFileBC = new File("leftFileBC.csv");
		Pathfinder.writeToCSV(leftFileBC, leftBC);

		// Save Right
		File rightFileBC = new File("rightFileBC.csv");
		Pathfinder.writeToCSV(rightFileBC, rightBC);
		
		/*
		 * location E to location C
		 */
		Waypoint[] pointsEC= new Waypoint[] { 
				new Waypoint(5.8039, 5.8834, 0), // Waypoint @ x=-2, y=-2, exit angle=0 radians
				new Waypoint(7.1158, 6.2261, 0) // Waypoint @ x=0, y=0, exit angle=0 radians
		};

		Trajectory.Config configEC = new Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC,
				Trajectory.Config.SAMPLES_HIGH, 0.01, MAX_VELOCITY, MAX_ACCELERATION, MAX_JERK);

		// Last three things in the constructor above are maximum velocity, max
		// acceleration, jerk (change in acceleration)
		Trajectory trajectoryEC = Pathfinder.generate(pointsEC, configEC);

		// The .modify(0.64) at the end changes it for the distance between the wheels
		TankModifier modifierEC = new TankModifier(trajectoryEC).modify(0.64);
		Trajectory leftEC = modifierEC.getLeftTrajectory();
		Trajectory rightEC = modifierEC.getRightTrajectory();

		// Save Left
		File leftFileEC = new File("leftFileEC.csv");
		Pathfinder.writeToCSV(leftFileEC, leftEC);

		// Save Right
		File rightFileEC = new File("rightFileEC.csv");
		Pathfinder.writeToCSV(rightFileEC, rightEC);
		
		/*
		 * location 
		 * F to location D
		 */
		Waypoint[] pointsFD= new Waypoint[] { 
				new Waypoint(5.8039, 2.3305, 0), // Waypoint @ x=-2, y=-2, exit angle=0 radians
				new Waypoint(7.1158, 1.9878, 0) // Waypoint @ x=0, y=0, exit angle=0 radians
		};

		Trajectory.Config configFD = new Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC,
				Trajectory.Config.SAMPLES_HIGH, 0.01, MAX_VELOCITY, MAX_ACCELERATION, MAX_JERK);

		// Last three things in the constructor above are maximum velocity, max
		// acceleration, jerk (change in acceleration)
		Trajectory trajectoryFD = Pathfinder.generate(pointsFD, configFD);

		// The .modify(0.64) at the end changes it for the distance between the wheels
		TankModifier modifierFD = new TankModifier(trajectoryFD).modify(0.64);
		Trajectory leftFD = modifierFD.getLeftTrajectory();
		Trajectory rightFD = modifierFD.getRightTrajectory();

		// Save Left
		File leftFileFD = new File("leftFilFDC.csv");
		Pathfinder.writeToCSV(leftFileFD, leftFD);

		// Save Right
		File rightFileFD = new File("rightFileFD.csv");
		Pathfinder.writeToCSV(rightFileFD, rightFD);
		
		/*
		 * location 
		 * Turn 180
		 */
		Waypoint[] pointsRot180L= new Waypoint[] { 
				new Waypoint(0, 0, 0), // Waypoint @ x=-2, y=-2, exit angle=0 radians
				new Waypoint(Math.PI*0.32, Math.PI*0.32, 0) // Waypoint @ x=0, y=0, exit angle=0 radians
		};
		Waypoint[] pointsRot180R= new Waypoint[] { 
				new Waypoint(0, 0, 0), // Waypoint @ x=-2, y=-2, exit angle=0 radians
				new Waypoint(-Math.PI*0.32, -Math.PI*0.32, 0) // Waypoint @ x=0, y=0, exit angle=0 radians
		};

		Trajectory.Config configRot180L = new Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC,
				Trajectory.Config.SAMPLES_HIGH, 0.01, MAX_VELOCITY, MAX_ACCELERATION, MAX_JERK);
		Trajectory.Config configRot180R = new Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC,
				Trajectory.Config.SAMPLES_HIGH, 0.01, MAX_VELOCITY, MAX_ACCELERATION, MAX_JERK);

		// Last three things in the constructor above are maximum velocity, max
		// acceleration, jerk (change in acceleration)
		Trajectory trajectoryRot180L = Pathfinder.generate(pointsRot180L, configRot180L);
		Trajectory trajectoryRot180R = Pathfinder.generate(pointsRot180R, configRot180R);


		// Save Left
		File leftFileRot180L = new File("leftFileRot180L.csv");
		Pathfinder.writeToCSV(leftFileRot180L, trajectoryRot180L);

		// Save Right
		File rightFileRot180R = new File("rightFileRot180R.csv");
		Pathfinder.writeToCSV(rightFileRot180R, trajectoryRot180R);
	}
}
