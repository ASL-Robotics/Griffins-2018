package org.usfirst.frc.team1884.robot.commands.sequences;

import org.usfirst.frc.team1884.robot.commands.ElevatorSwitchCommand;
import org.usfirst.frc.team1884.robot.commands.IntakeDownCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ElevatorSwitchSequence extends CommandGroup {

    public ElevatorSwitchSequence() {
    	addSequential(new IntakeDownCommand());
        addSequential(new ElevatorSwitchCommand());
    }
}
