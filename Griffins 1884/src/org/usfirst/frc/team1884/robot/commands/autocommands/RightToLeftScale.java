package org.usfirst.frc.team1884.robot.commands.autocommands;

import org.usfirst.frc.team1884.robot.commands.ElevatorBottomCommand;
import org.usfirst.frc.team1884.robot.commands.ElevatorOuttakeCommand;
import org.usfirst.frc.team1884.robot.commands.ElevatorTopCommand;
import org.usfirst.frc.team1884.robot.commands.scaleprofiles.MotionProfile3LeftScale;
import org.usfirst.frc.team1884.robot.commands.scaleprofiles.MotionProfileScaleBackward;
import org.usfirst.frc.team1884.robot.commands.scaleprofiles.MotionProfileScaleForward;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightToLeftScale extends CommandGroup {

	public RightToLeftScale() {
		// Drive to scale
		addSequential(new MotionProfile3LeftScale());

		// put cube on scale
		addSequential(new ElevatorTopCommand());
		addSequential(new MotionProfileScaleForward());

		// opens claw - releasing cube
		addSequential(new ElevatorOuttakeCommand());
		addSequential(new MotionProfileScaleBackward());
		addSequential(new ElevatorBottomCommand());

	}
}
