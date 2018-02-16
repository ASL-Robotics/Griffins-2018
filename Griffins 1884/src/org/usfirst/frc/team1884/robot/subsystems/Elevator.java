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
		public static final int LOW = 6, MIDDLE = 7, HIGH = 8;
	}

	public Elevator() {
		// TODO change the kPID values to real ones
		RobotMap.ELEVATOR_MOTOR.config_kP(0, 0, 10);
		RobotMap.ELEVATOR_MOTOR.config_kI(0, 0, 10);
		RobotMap.ELEVATOR_MOTOR.config_kD(0, 0, 10);
	}

	public void initDefaultCommand() {

	}

	public void setHeight(int height) {
		RobotMap.ELEVATOR_MOTOR.set(ControlMode.Position, height);

	}

	public void stopElevator() {
		RobotMap.ELEVATOR_MOTOR.set(ControlMode.PercentOutput, 0);
	}

	public boolean isBottom() {
		return RobotMap.ELEVATOR_SWITCH.get();
	}

	public boolean isHeight(int height) {
		return (RobotMap.ELEVATOR_MOTOR.getSelectedSensorPosition(0) < height - 20)
				&& (RobotMap.ELEVATOR_MOTOR.getSelectedSensorPosition(0) > height - 20);

	}

	public void resetEncoder() {
		RobotMap.ELEVATOR_MOTOR.setSelectedSensorPosition(0,0,10);
	}
	
	public void toggleClaw() {
		if (RobotMap.ELEVATOR_PISTON.get() == DoubleSolenoid.Value.kReverse) {
			RobotMap.ELEVATOR_PISTON.set(DoubleSolenoid.Value.kForward);
		} else {
			RobotMap.ELEVATOR_PISTON.set(DoubleSolenoid.Value.kReverse);
		}
	}

}
