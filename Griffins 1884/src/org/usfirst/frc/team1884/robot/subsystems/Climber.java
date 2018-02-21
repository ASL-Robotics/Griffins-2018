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
		RobotMap.CLIMBER_DEPLOY_MOTOR.set(0.25);
	}

	public void reverseDeploy(){
		RobotMap.CLIMBER_DEPLOY_MOTOR.set(-0.25);
	}
	
	
	public void stopDeploy() {
		RobotMap.CLIMBER_DEPLOY_MOTOR.stopMotor();
	}

	public void climb() {
		RobotMap.CLIMBER_CLIMB_MOTOR1.set(1);
		RobotMap.CLIMBER_CLIMB_MOTOR2.set(1);
		RobotMap.CLIMBER_CLIMB_MOTOR3.set(1);
	}

	public void stopClimb() {
		RobotMap.CLIMBER_CLIMB_MOTOR1.stopMotor();
		RobotMap.CLIMBER_CLIMB_MOTOR2.stopMotor();
		RobotMap.CLIMBER_CLIMB_MOTOR3.stopMotor();
	}
}
