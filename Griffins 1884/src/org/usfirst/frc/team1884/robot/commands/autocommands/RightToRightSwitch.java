package org.usfirst.frc.team1884.robot.commands.autocommands;

import org.usfirst.frc.team1884.robot.commands.FlipperLeftCommand;
import org.usfirst.frc.team1884.robot.commands.switchprofiles.MotionProfile3K;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightToRightSwitch extends CommandGroup {

	public RightToRightSwitch() {
		addSequential(new MotionProfile3K());
		addSequential(new FlipperRightCommand());
	}
}
