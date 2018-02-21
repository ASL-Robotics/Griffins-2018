package org.usfirst.frc.team1884.robot.subsystems;

import org.usfirst.frc.team1884.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakeMotor extends Subsystem {

	// 4 motors 2 pistons - 2 motors in 1 PWM port
	public void initDefaultCommand() {

	}

	public void intake() {
		RobotMap.INTAKE_MOTOR_L.set(1);
		RobotMap.INTAKE_MOTOR_R.set(-0.9);
	}
	
	public void spin(){
		RobotMap.INTAKE_MOTOR_L.set(0.5);
		RobotMap.INTAKE_MOTOR_R.set(0.5);
	}
	
	public void outtake() {
		RobotMap.INTAKE_MOTOR_L.set(-1);
		RobotMap.INTAKE_MOTOR_R.set(1);
	}

	public void off() {
		RobotMap.INTAKE_MOTOR_L.stopMotor();
		RobotMap.INTAKE_MOTOR_R.stopMotor();
	}

}
