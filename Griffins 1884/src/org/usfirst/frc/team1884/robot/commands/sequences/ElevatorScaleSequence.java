package org.usfirst.frc.team1884.robot.commands.sequences;

import org.usfirst.frc.team1884.robot.commands.ElevatorTopCommand;
import org.usfirst.frc.team1884.robot.commands.IntakeDownCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ElevatorScaleSequence extends CommandGroup {

    public ElevatorScaleSequence() {
    	addSequential(new IntakeDownCommand());
        addSequential(new ElevatorTopCommand());
    }
}
