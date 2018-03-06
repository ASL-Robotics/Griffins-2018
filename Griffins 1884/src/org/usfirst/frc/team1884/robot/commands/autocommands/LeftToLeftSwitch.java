package org.usfirst.frc.team1884.robot.commands.autocommands;

import org.usfirst.frc.team1884.robot.commands.ElevatorOuttakeCommand;
import org.usfirst.frc.team1884.robot.commands.sequences.ElevatorSwitchSequence;
import org.usfirst.frc.team1884.robot.commands.switchprofiles.MotionProfile1J;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftToLeftSwitch extends CommandGroup {

	public LeftToLeftSwitch() {
		addSequential(new MotionProfile1J());
		addSequential(new ElevatorSwitchSequence());
		addSequential(new ElevatorOuttakeCommand());
	}
}
