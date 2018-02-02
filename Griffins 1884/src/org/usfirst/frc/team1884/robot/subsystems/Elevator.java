package org.usfirst.frc.team1884.robot.subsystems;

import org.usfirst.frc.team1884.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {
	
	public void initDefaultCommand() {
		//TODO
	}
	
	public void climbHeight1(){
		//TODO
	}
	
	public void climbHeight2(){
		//TODO
	}
	
	public void descend(){
		//TODO
	}
	
	public void toggleClaw () {
		if (RobotMap.ELEVATOR_PISTON.get() == DoubleSolenoid.Value.kReverse) {
    		RobotMap.ELEVATOR_PISTON.set(DoubleSolenoid.Value.kForward); 
		}
		else {
			RobotMap.ELEVATOR_PISTON.set(DoubleSolenoid.Value.kReverse); 
		}
	}
}
