package org.usfirst.frc.team1884.robot.commands.autocommands;

import org.usfirst.frc.team1884.robot.commands.ElevatorBottomCommand;
import org.usfirst.frc.team1884.robot.commands.ElevatorOpenClawCommand;
import org.usfirst.frc.team1884.robot.commands.ElevatorTopCommand;
import org.usfirst.frc.team1884.robot.commands.IntakeInCommand;
import org.usfirst.frc.team1884.robot.commands.scaleprofiles.MotionProfile2D;
import org.usfirst.frc.team1884.robot.commands.scaleprofiles.MotionProfileDF;
import org.usfirst.frc.team1884.robot.commands.scaleprofiles.MotionProfileFD;
import org.usfirst.frc.team1884.robot.commands.scaleprofiles.MotionProfileRot180;
import org.usfirst.frc.team1884.robot.commands.scaleprofiles.MotionProfileScaleBackward;
import org.usfirst.frc.team1884.robot.commands.scaleprofiles.MotionProfileScaleForward;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftToRightScale extends CommandGroup {

	public LeftToRightScale() {
		// go to scale
		addSequential(new MotionProfile2D());

		// put cube on scale
		addSequential(new ElevatorTopCommand());
		addSequential(new MotionProfileScaleForward());

		// opens claw - releasing cube
		addSequential(new ElevatorOpenClawCommand());
		addSequential(new MotionProfileScaleBackward());
		addSequential(new ElevatorBottomCommand());

		// go to cubes
		addSequential(new MotionProfileRot180());
		addSequential(new MotionProfileDF());

		// pick up cube
		addSequential(new IntakeInCommand());
		// closes claw
		addSequential(new ElevatorOpenClawCommand());

		// go to scale
		addSequential(new MotionProfileRot180());
		addSequential(new MotionProfileFD());

		// put cube on scale
		addSequential(new ElevatorTopCommand());
		addSequential(new MotionProfileScaleForward());
		addSequential(new ElevatorOpenClawCommand());
	}
}
