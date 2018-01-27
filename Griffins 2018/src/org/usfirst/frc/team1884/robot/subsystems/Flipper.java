package org.usfirst.frc.team1884.robot.subsystems;

import org.usfirst.frc.team1884.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Flipper extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	public void toggleLeft() {
		if (RobotMap.FLIPPER_L.get() == DoubleSolenoid.Value.kReverse) {
			RobotMap.FLIPPER_L.set(DoubleSolenoid.Value.kForward);
		} else {
			RobotMap.FLIPPER_R.set(DoubleSolenoid.Value.kReverse);
		}

	}

	public void toggleRight() {
		if (RobotMap.FLIPPER_R.get() == DoubleSolenoid.Value.kReverse) {
			RobotMap.FLIPPER_R.set(DoubleSolenoid.Value.kForward);
		} else {
			RobotMap.FLIPPER_R.set(DoubleSolenoid.Value.kReverse);
		}
	}
}
