package org.usfirst.frc.team1884.robot.subsystems;

import org.usfirst.frc.team1884.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ElevatorClaw extends Subsystem {

	public ElevatorClaw() {
	}

	public void intake(){
		RobotMap.ELEVATOR_CLAW_MOTOR_L.set(1);
		RobotMap.ELEVATOR_CLAW_MOTOR_R.set(-1);
	}
	
	public void outtake(){
		RobotMap.ELEVATOR_CLAW_MOTOR_L.set(-1);
		RobotMap.ELEVATOR_CLAW_MOTOR_R.set(1);
	}
	
	public void stop(){
		RobotMap.ELEVATOR_CLAW_MOTOR_L.set(0);
		RobotMap.ELEVATOR_CLAW_MOTOR_R.set(0);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
