package org.usfirst.frc.team1884.robot.commands;

import org.usfirst.frc.team1884.robot.Robot;
import org.usfirst.frc.team1884.robot.subsystems.Elevator;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ElevatorMiddleCommand extends Command {

	public ElevatorMiddleCommand() {
		requires(Robot.elevator);
		
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		Robot.elevator.setHeight(Elevator.Height.MIDDLE);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return Robot.elevator.isHeight(Elevator.Height.MIDDLE);
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
