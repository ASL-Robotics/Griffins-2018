package org.usfirst.frc.team1884.robot.commands.autocommands;

import org.usfirst.frc.team1884.robot.commands.ElevatorBottomCommand;
import org.usfirst.frc.team1884.robot.commands.ElevatorOuttakeCommand;
import org.usfirst.frc.team1884.robot.commands.scaleprofiles.MotionProfile1RightScale;
import org.usfirst.frc.team1884.robot.commands.scaleprofiles.MotionProfileScaleBackward;
import org.usfirst.frc.team1884.robot.commands.scaleprofiles.MotionProfileScaleForward;
import org.usfirst.frc.team1884.robot.commands.sequences.ElevatorScaleSequence;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftToRightScale extends CommandGroup {

	public LeftToRightScale() {
		// go to scale
		addSequential(new MotionProfile1RightScale());

		// put cube on scale
		addSequential(new ElevatorScaleSequence());
		addSequential(new MotionProfileScaleForward());

		// opens claw - releasing cube
		addSequential(new ElevatorOuttakeCommand());
		addSequential(new MotionProfileScaleBackward());
		addSequential(new ElevatorBottomCommand());
	}
}
