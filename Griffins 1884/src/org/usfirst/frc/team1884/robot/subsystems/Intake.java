package org.usfirst.frc.team1884.robot.subsystems;

import org.usfirst.frc.team1884.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {

	// 4 motors 2 pistons - 2 motors in 1 PWM port
	public void initDefaultCommand() {

	}

	public void intake() {
		RobotMap.INTAKE_MOTOR_L.set(1);
		RobotMap.INTAKE_MOTOR_R.set(-1);
	}

	public void toggleIntake() {
		if (RobotMap.INTAKE_PISTON.get() == DoubleSolenoid.Value.kReverse) {
			RobotMap.INTAKE_PISTON.set(DoubleSolenoid.Value.kForward);
		} else {
			RobotMap.INTAKE_PISTON.set(DoubleSolenoid.Value.kReverse);
		}
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
