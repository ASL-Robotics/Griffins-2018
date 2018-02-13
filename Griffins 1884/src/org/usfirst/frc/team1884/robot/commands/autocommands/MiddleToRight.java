package org.usfirst.frc.team1884.robot.commands.autocommands;

import org.usfirst.frc.team1884.robot.commands.ElevatorClawCommand;
import org.usfirst.frc.team1884.robot.commands.ElevatorLowCommand;
import org.usfirst.frc.team1884.robot.commands.ElevatorTopCommand;
import org.usfirst.frc.team1884.robot.commands.IntakeInCommand;
import org.usfirst.frc.team1884.robot.commands.motionprofiles.MotionProfile2B;
import org.usfirst.frc.team1884.robot.commands.motionprofiles.MotionProfileBD;
import org.usfirst.frc.team1884.robot.commands.motionprofiles.MotionProfileDF;
import org.usfirst.frc.team1884.robot.commands.motionprofiles.MotionProfileFD;
import org.usfirst.frc.team1884.robot.commands.motionprofiles.MotionProfileRot180;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class MiddleToRight extends CommandGroup {

    public MiddleToRight() {
    	//Drive to Scale
    	addSequential(new MotionProfile2B());
    	addSequential(new MotionProfileBD());
    	//Put cube on scale
    	addSequential(new ElevatorTopCommand());
    	addSequential(new ElevatorClawCommand());
    	addSequential(new ElevatorLowCommand());
    	//Drive to cube
    	addSequential(new MotionProfileRot180());
    	addSequential(new MotionProfileDF());
    	//Pick up cube
    	addSequential(new IntakeInCommand());
    	addSequential(new ElevatorClawCommand());
    	//Drive to scale
    	addSequential(new MotionProfileRot180());
    	addSequential(new MotionProfileFD());
    	//Put cube on scale
    	addSequential(new ElevatorTopCommand());
    	addSequential(new ElevatorClawCommand());
    }
}
