package org.usfirst.frc.team1884.robot.subsystems;

import org.usfirst.frc.team1884.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ElevatorClaw extends Subsystem {

	public ElevatorClaw() {
	}

	public void open(){
		RobotMap.ELEVATOR_PISTON.set(DoubleSolenoid.Value.kForward);
	}
	
	public void close(){
		RobotMap.ELEVATOR_PISTON.set(DoubleSolenoid.Value.kReverse);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
