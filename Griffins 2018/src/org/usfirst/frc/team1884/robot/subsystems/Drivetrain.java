package org.usfirst.frc.team1884.robot.subsystems;

import org.usfirst.frc.team1884.robot.RobotMap;
import org.usfirst.frc.team1884.robot.commands.DrivetrainCommand;

import com.ctre.phoenix.motion.MotionProfileStatus;
import com.ctre.phoenix.motion.SetValueMotionProfile;
import com.ctre.phoenix.motion.TrajectoryPoint;
import com.ctre.phoenix.motion.TrajectoryPoint.TrajectoryDuration;
//import com.ctre.phoenix.motion.TrajectoryPoint.TrajectoryDuration;
import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {

	private MotionProfileStatus mpStatus;

	public Drivetrain() {
		mpStatus = new MotionProfileStatus();

	}

	public void initDefaultCommand() {
		setDefaultCommand(new DrivetrainCommand());
	}

	public void drive(double x, double z) {
		if(x<=0.05)x=0;
		if(z<=0.05)z=0; 
		RobotMap.DRIVETRAIN_MOTOR_FL.set(ControlMode.PercentOutput, x+z);
		RobotMap.DRIVETRAIN_MOTOR_FR.set(ControlMode.PercentOutput, x-z);
		
	}
	/**
	 * Find enum value if supported.
	 * 
	 * @param durationMs
	 * @return enum equivalent of durationMs
	 */
private TrajectoryDuration GetTrajectoryDuration(int durationMs) {

		TrajectoryDuration td = TrajectoryDuration.Trajectory_Duration_0ms;

		td = td.valueOf(durationMs);

		if (td.value != durationMs) {
			DriverStation.reportError(
					"Trajectory Duration not supported - use configMotionProfileTrajectoryPeriod instead", false);
		}
		return td;
	}

	public void initializeMotionProfile(double[][] leftProfile, double[][] rightProfile) {
		TrajectoryPoint tpLeft = new TrajectoryPoint();
		TrajectoryPoint tpRight = new TrajectoryPoint();

		if (mpStatus.hasUnderrun) {
			RobotMap.DRIVETRAIN_MOTOR_FL.clearMotionProfileHasUnderrun(0);
			RobotMap.DRIVETRAIN_MOTOR_FR.clearMotionProfileHasUnderrun(0);
		}

		RobotMap.DRIVETRAIN_MOTOR_FL.clearMotionProfileTrajectories();
		RobotMap.DRIVETRAIN_MOTOR_FR.clearMotionProfileTrajectories();

		RobotMap.DRIVETRAIN_MOTOR_FL.configMotionProfileTrajectoryPeriod(0, 10);
		RobotMap.DRIVETRAIN_MOTOR_FR.configMotionProfileTrajectoryPeriod(0, 10);

		for (int i = 0; i < leftProfile.length; i++) {
			tpLeft.position = leftProfile[i][0];
			tpRight.position = rightProfile[i][0];

			tpLeft.velocity = leftProfile[i][1];
			tpRight.velocity = rightProfile[i][2];

			tpLeft.profileSlotSelect0 = 0;
			tpRight.profileSlotSelect0 = 0;

			tpLeft.timeDur = GetTrajectoryDuration((int) leftProfile[i][2]);
			tpRight.timeDur = GetTrajectoryDuration((int) rightProfile[i][2]);

			if (i != 0) {
				tpLeft.zeroPos = false;
				tpRight.zeroPos = false;
			} else {
				tpLeft.zeroPos = true;
				tpRight.zeroPos = true;
			}

			if (i + 1 != leftProfile.length) {
				tpLeft.isLastPoint = false;
				tpRight.isLastPoint = false;
			} else {
				tpLeft.isLastPoint = true;
				tpRight.isLastPoint = true;
			}

			RobotMap.DRIVETRAIN_MOTOR_FL.pushMotionProfileTrajectory(tpLeft);
			RobotMap.DRIVETRAIN_MOTOR_FR.pushMotionProfileTrajectory(tpRight);
		}

		RobotMap.DRIVETRAIN_MOTOR_FL.processMotionProfileBuffer();
		RobotMap.DRIVETRAIN_MOTOR_FR.processMotionProfileBuffer();
	}

	public static void enableMotionProfile() {
		RobotMap.DRIVETRAIN_MOTOR_FL.set(ControlMode.MotionProfile, SetValueMotionProfile.Enable.value);
		RobotMap.DRIVETRAIN_MOTOR_FR.set(ControlMode.MotionProfile, SetValueMotionProfile.Enable.value);
	}

	private enum MotionProfiles {
	}
}
