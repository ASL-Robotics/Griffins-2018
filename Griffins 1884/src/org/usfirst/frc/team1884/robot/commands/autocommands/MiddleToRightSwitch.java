package org.usfirst.frc.team1884.robot.commands.autocommands;

import org.usfirst.frc.team1884.robot.commands.ElevatorOuttakeCommand;
import org.usfirst.frc.team1884.robot.commands.sequences.ElevatorSwitchSequence;
import org.usfirst.frc.team1884.robot.commands.switchprofiles.MotionProfile2H;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class MiddleToRightSwitch extends CommandGroup {

	public MiddleToRightSwitch() {
		addSequential(new MotionProfile2H());
		addSequential(new ElevatorSwitchSequence());
		addSequential(new ElevatorOuttakeCommand());
	}
}
