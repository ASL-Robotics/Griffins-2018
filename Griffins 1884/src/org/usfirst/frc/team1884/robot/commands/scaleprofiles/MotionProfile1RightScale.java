package org.usfirst.frc.team1884.robot.commands.scaleprofiles;

import org.usfirst.frc.team1884.robot.Robot;
import org.usfirst.frc.team1884.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.command.Command;

/**
 * drives robot straight from left starting position
 */
public class MotionProfile1RightScale extends Command {

	public MotionProfile1RightScale() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.drivetrain);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		Robot.drivetrain.initializeMotionProfile(Drivetrain.LeftMotionProfilesScale.left1D,
		Drivetrain.RightMotionProfilesScale.right1D);
		Robot.drivetrain.enableMotionProfile();
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return Robot.drivetrain.motionProfileIsDone();
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.drivetrain.disableMotionProfile();
	}
 
	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
