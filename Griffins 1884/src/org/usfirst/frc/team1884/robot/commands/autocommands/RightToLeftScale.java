package org.usfirst.frc.team1884.robot.commands.autocommands;

import org.usfirst.frc.team1884.robot.commands.ElevatorBottomCommand;
import org.usfirst.frc.team1884.robot.commands.ElevatorClawCommand;
import org.usfirst.frc.team1884.robot.commands.ElevatorTopCommand;
import org.usfirst.frc.team1884.robot.commands.IntakeInCommand;
import org.usfirst.frc.team1884.robot.commands.scaleprofiles.MotionProfile3C;
import org.usfirst.frc.team1884.robot.commands.scaleprofiles.MotionProfileCE;
import org.usfirst.frc.team1884.robot.commands.scaleprofiles.MotionProfileEC;
import org.usfirst.frc.team1884.robot.commands.scaleprofiles.MotionProfileRot180;
import org.usfirst.frc.team1884.robot.commands.scaleprofiles.MotionProfileScaleBackward;
import org.usfirst.frc.team1884.robot.commands.scaleprofiles.MotionProfileScaleForward;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightToLeftScale extends CommandGroup {

	public RightToLeftScale() {
		// Drive to scale
		addSequential(new MotionProfile3C());

		// put cube on scale
		addSequential(new ElevatorTopCommand());
		addSequential(new MotionProfileScaleForward());

		// opens claw - releasing cube
		addSequential(new ElevatorClawCommand());
		addSequential(new MotionProfileScaleBackward());
		addSequential(new ElevatorBottomCommand());

		// go to stack of cubes
		addSequential(new MotionProfileRot180());
		addSequential(new MotionProfileCE());

		// pick up cube
		addSequential(new IntakeInCommand());
		// closes claw
		addSequential(new ElevatorClawCommand());

		// go to scale 2nd time
		addSequential(new MotionProfileRot180());
		addSequential(new MotionProfileEC());

		// put cube on scale
		addSequential(new ElevatorTopCommand());
		addSequential(new MotionProfileScaleForward());
		addSequential(new ElevatorClawCommand());
	}
}
