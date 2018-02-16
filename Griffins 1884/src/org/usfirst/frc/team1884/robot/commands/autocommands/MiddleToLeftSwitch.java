package org.usfirst.frc.team1884.robot.commands.autocommands;

import org.usfirst.frc.team1884.robot.commands.FlipperLeftCommand;
import org.usfirst.frc.team1884.robot.commands.switchprofiles.MotionProfile2G;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class MiddleToLeftSwitch extends CommandGroup {

	public MiddleToLeftSwitch() {
		addSequential(new MotionProfile2G());
		addSequential(new FlipperLeftCommand());
	}
}
