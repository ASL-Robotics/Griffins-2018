package org.usfirst.frc.team1884.robot.commands.sequences;

import org.usfirst.frc.team1884.robot.commands.ElevatorIntakeCommand;
import org.usfirst.frc.team1884.robot.commands.IntakeInCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class IntakeSequence extends CommandGroup {

    public IntakeSequence() {
       addParallel(new IntakeInCommand());
       addParallel(new ElevatorIntakeCommand());
    }
}
