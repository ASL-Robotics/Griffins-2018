package org.usfirst.frc.team1884.robot.commands.autocommands;

import org.usfirst.frc.team1884.robot.commands.switchprofiles.MotionProfile1L;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftToRightSwitch extends CommandGroup {

	public LeftToRightSwitch() {
		addSequential(new MotionProfile1L());
	}
}
