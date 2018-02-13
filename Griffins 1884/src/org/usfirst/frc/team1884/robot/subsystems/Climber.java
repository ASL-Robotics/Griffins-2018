package org.usfirst.frc.team1884.robot.subsystems;

import org.usfirst.frc.team1884.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem {

	public void initDefaultCommand() {

	}

	public void deploy() {
		RobotMap.CLIMBER_DEPLOY_MOTOR.set(1);
	}

	public void stopDeploy() {
		RobotMap.CLIMBER_DEPLOY_MOTOR.stopMotor();;
	}

	public void climb() {
		RobotMap.CLIMBER_CLIMB_MOTOR.set(1);
	}

	public void stopClimb() {
		RobotMap.CLIMBER_CLIMB_MOTOR.stopMotor();
	}
}
