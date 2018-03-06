package org.usfirst.frc.team1884.robot.commands.autocommands;

import org.usfirst.frc.team1884.robot.commands.scaleprofiles.MotionProfileAutoRun;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CrossLine extends CommandGroup {

	public CrossLine() {
		addSequential(new MotionProfileAutoRun());
	}
}
