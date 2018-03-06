package org.usfirst.frc.team1884.robot.commands.sequences;

import org.usfirst.frc.team1884.robot.commands.ElevatorBottomCommand;
import org.usfirst.frc.team1884.robot.commands.IntakeDownCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ElevatorBottomSequence extends CommandGroup {

    public ElevatorBottomSequence() {
    	addSequential(new IntakeDownCommand());
        addSequential(new ElevatorBottomCommand());
    }
}
