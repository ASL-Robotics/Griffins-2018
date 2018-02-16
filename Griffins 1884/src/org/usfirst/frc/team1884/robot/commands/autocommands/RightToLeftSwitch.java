package org.usfirst.frc.team1884.robot.commands.autocommands;

import org.usfirst.frc.team1884.robot.commands.FlipperLeftCommand;
import org.usfirst.frc.team1884.robot.commands.switchprofiles.MotionProfile3I;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightToLeftSwitch extends CommandGroup {

	public RightToLeftSwitch() {
		addSequential(new MotionProfile3I());
		addSequential(new FlipperRightCommand());
	}
}
