package org.usfirst.frc.team1884.robot.subsystems;

import org.usfirst.frc.team1884.robot.Robot;
import org.usfirst.frc.team1884.robot.RobotMap;
import org.usfirst.frc.team1884.robot.commands.ElevatorLowCommand;
<<<<<<< HEAD
<<<<<<< HEAD

import com.ctre.phoenix.motorcontrol.LimitSwitchNormal;
=======
>>>>>>> parent of 12efb38... added methods in the elevator class - to be used in elevator commands
=======
>>>>>>> parent of 12efb38... added methods in the elevator class - to be used in elevator commands

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {
	
	public static class Height {
		public static final int LOW = 7, MIDDLE = 8, HIGH = 9;
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
<<<<<<< HEAD
<<<<<<< HEAD
	public boolean switchHit(){
		return RobotMap.ELEVATOR_SWITCH.get();
	}
=======
>>>>>>> parent of 12efb38... added methods in the elevator class - to be used in elevator commands
=======
>>>>>>> parent of 12efb38... added methods in the elevator class - to be used in elevator commands
}
