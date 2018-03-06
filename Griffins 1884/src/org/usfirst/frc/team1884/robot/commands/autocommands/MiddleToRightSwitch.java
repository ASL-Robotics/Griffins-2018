package org.usfirst.frc.team1884.robot.commands.autocommands;

import org.usfirst.frc.team1884.robot.commands.switchprofiles.MotionProfile2H;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class MiddleToRightSwitch extends CommandGroup {

	public MiddleToRightSwitch() {
		addSequential(new MotionProfile2H());
	}
}
