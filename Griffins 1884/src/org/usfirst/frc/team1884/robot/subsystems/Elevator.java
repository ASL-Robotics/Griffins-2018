package org.usfirst.frc.team1884.robot.subsystems;

import org.usfirst.frc.team1884.robot.RobotMap;
import org.usfirst.frc.team1884.robot.commands.ElevatorLowCommand;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {

	public void initDefaultCommand() {
		setDefaultCommand(new ElevatorLowCommand());
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

	public static class Height {
		public static final int LOW = 7, MIDDLE = 8, HIGH = 9;
	}
}
