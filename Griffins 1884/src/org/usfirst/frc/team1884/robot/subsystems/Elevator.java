package org.usfirst.frc.team1884.robot.subsystems;

import org.usfirst.frc.team1884.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {
	
	public static class Height {
		public static final int LOW = 6, MIDDLE_LOW = 7, MIDDLE_HIGH = 8, HIGH = 9;
	}
	
	public Elevator () {
		//TODO change the kPID values to real ones 
		RobotMap.ELEVATOR_MOTOR.config_kP(0, 10, 10);
		RobotMap.ELEVATOR_MOTOR.config_kI(0, 10, 10);
		RobotMap.ELEVATOR_MOTOR.config_kD(0, 10, 10);
	}

	public void initDefaultCommand() {

	}

	public void setHeight(int height) {
		
	}

	public void toggleClaw() {
		if (RobotMap.ELEVATOR_PISTON.get() == DoubleSolenoid.Value.kReverse) {
			RobotMap.ELEVATOR_PISTON.set(DoubleSolenoid.Value.kForward);
		} else {
			RobotMap.ELEVATOR_PISTON.set(DoubleSolenoid.Value.kReverse);
		}
	}
	
	public void stopElevator() {
		RobotMap.ELEVATOR_MOTOR.set(ControlMode.PercentOutput, 0, 0);
	}
	
	public boolean isAtPosition (int position, int variance) {
		if (RobotMap.ELEVATOR_MOTOR.getSelectedSensorPosition(0) >= (position - variance)
				&& (RobotMap.ELEVATOR_MOTOR.getSelectedSensorPosition(0) <= (position + variance))) {
			return true;
		}
		return false;
	}
}
