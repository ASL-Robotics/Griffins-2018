package org.usfirst.frc.team1884.robot.commands;

import org.usfirst.frc.team1884.robot.Robot;
import org.usfirst.frc.team1884.robot.RobotMap;
import org.usfirst.frc.team1884.robot.subsystems.Elevator;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ElevatorTopCommand extends Command {

	public ElevatorTopCommand() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.elevator);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		Robot.elevator.setHeight(Elevator.Height.HIGH);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return Robot.elevator.isAtPosition(Elevator.Height.HIGH, 20); 
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.elevator.stopElevator();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
