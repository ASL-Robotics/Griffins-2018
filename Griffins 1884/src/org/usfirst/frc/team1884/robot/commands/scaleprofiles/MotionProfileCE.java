package org.usfirst.frc.team1884.robot.commands.scaleprofiles;

import org.usfirst.frc.team1884.robot.Robot;
import org.usfirst.frc.team1884.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MotionProfileCE extends Command {

    public MotionProfileCE() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
		requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
		Robot.drivetrain.initializeMotionProfile(Drivetrain.LeftMotionProfilesB.leftCE,
		Drivetrain.RightMotionProfilesB.rightCE);
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
