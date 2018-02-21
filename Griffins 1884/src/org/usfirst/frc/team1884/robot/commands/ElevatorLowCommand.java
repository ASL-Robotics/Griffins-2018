package org.usfirst.frc.team1884.robot.commands;

import org.usfirst.frc.team1884.robot.Robot;
import org.usfirst.frc.team1884.robot.RobotMap;
import org.usfirst.frc.team1884.robot.subsystems.ElevatorShaft;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ElevatorLowCommand extends Command {

	public ElevatorLowCommand() {
		requires(Robot.elevatorShaft);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		Robot.elevatorShaft.setHeight(ElevatorShaft.Height.LOW);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		System.out.println(RobotMap.ELEVATOR_MOTOR.getClosedLoopError(0));
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		/*return Robot.elevator.isHeight(Elevator.Height.LOW);*/

		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}

}
