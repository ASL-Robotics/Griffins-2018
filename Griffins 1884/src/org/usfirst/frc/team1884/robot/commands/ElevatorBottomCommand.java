package org.usfirst.frc.team1884.robot.commands;

import org.usfirst.frc.team1884.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ElevatorBottomCommand extends Command {

	public ElevatorBottomCommand() {
		requires(Robot.elevatorShaft);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		Robot.elevatorShaft.setHeight(0);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return Robot.elevatorShaft.isBottom();
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.elevatorShaft.resetEncoder();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
