package org.usfirst.frc.team1884.robot.subsystems;

import org.usfirst.frc.team1884.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakePiston extends Subsystem {

	// 4 motors 2 pistons - 2 motors in 1 PWM port
	public void initDefaultCommand() {

	}

	public void toggleHorizontal() {
		if (RobotMap.INTAKE_HORIZONTAL_PISTON_LEFT.get() == DoubleSolenoid.Value.kReverse) {
			RobotMap.INTAKE_HORIZONTAL_PISTON_LEFT.set(DoubleSolenoid.Value.kForward);

			RobotMap.INTAKE_HORIZONTAL_PISTON_RIGHT_FORWARD.set(true);
			RobotMap.INTAKE_HORIZONTAL_PISTON_RIGHT_REVERSE.set(false);
		} else {
			RobotMap.INTAKE_HORIZONTAL_PISTON_LEFT.set(DoubleSolenoid.Value.kReverse);
			Timer.delay(0.25);
			RobotMap.INTAKE_HORIZONTAL_PISTON_RIGHT_FORWARD.set(false);
			RobotMap.INTAKE_HORIZONTAL_PISTON_RIGHT_REVERSE.set(true);
			
		}
	}

	public void down(){
		RobotMap.INTAKE_VERTICAL_PISTON.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void up(){
		RobotMap.INTAKE_VERTICAL_PISTON.set(DoubleSolenoid.Value.kForward);
	}
}
